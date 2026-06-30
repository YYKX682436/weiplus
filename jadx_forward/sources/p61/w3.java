package p61;

/* loaded from: classes8.dex */
public class w3 extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f433934a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f433935b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f433936c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11369x8a612b2b f433937d;

    public w3(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11369x8a612b2b activityC11369x8a612b2b, java.lang.String str) {
        this.f433937d = activityC11369x8a612b2b;
        this.f433934a = str;
    }

    public final java.lang.String a(java.lang.String str) {
        return new org.json.JSONObject(str).optString("access_token");
    }

    public final java.lang.String b() {
        java.lang.String str;
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL("https://accounts.google.com/o/oauth2/token").openConnection();
        httpURLConnection.setRequestProperty("Charset", com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setConnectTimeout(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059);
        httpURLConnection.setReadTimeout(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new org.apache.http.message.BasicNameValuePair("refresh_token", this.f433934a));
        arrayList.add(new org.apache.http.message.BasicNameValuePair("client_id", "369820936870.apps.googleusercontent.com"));
        arrayList.add(new org.apache.http.message.BasicNameValuePair("client_secret", "wcFhvo-s7wNcmQ9Zjr00H06u"));
        arrayList.add(new org.apache.http.message.BasicNameValuePair("grant_type", "refresh_token"));
        java.lang.String a17 = r61.r0.a(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "QueryString:%s" + a17);
        java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(httpURLConnection.getOutputStream(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
        bufferedWriter.write(a17);
        bufferedWriter.flush();
        bufferedWriter.close();
        int responseCode = httpURLConnection.getResponseCode();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GoogleContact.GoogleFriendUI", "responseCode:" + responseCode);
        if (200 == responseCode) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(httpURLConnection.getInputStream(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            bufferedReader.close();
            str = stringBuffer.toString();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "exchange token respone:%s" + str);
        } else {
            str = "";
        }
        try {
            httpURLConnection.getInputStream().close();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GoogleContact.GoogleFriendUI", e17.getMessage());
        }
        httpURLConnection.disconnect();
        return str;
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "doInBackground");
        try {
            java.lang.String b17 = b();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "refresh response:%s", b17);
            this.f433935b = a(b17);
            this.f433936c = true;
            return null;
        } catch (java.net.MalformedURLException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GoogleContact.GoogleFriendUI", "MalformedURLException:%s", e17.getMessage());
            return null;
        } catch (java.net.ProtocolException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GoogleContact.GoogleFriendUI", "ProtocolException:%s", e18.getMessage());
            return null;
        } catch (java.io.IOException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GoogleContact.GoogleFriendUI", "IOException:%s", e19.getMessage());
            return null;
        } catch (org.json.JSONException e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GoogleContact.GoogleFriendUI", "JSONException:%s", e27.getMessage());
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        super.onPostExecute((java.lang.Void) obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "onPostExecute");
        boolean z17 = this.f433936c;
        java.lang.String str = this.f433935b;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11369x8a612b2b.f154600u;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11369x8a612b2b activityC11369x8a612b2b = this.f433937d;
        if (z17) {
            activityC11369x8a612b2b.getClass();
            if (!android.text.TextUtils.isEmpty(str)) {
                activityC11369x8a612b2b.f154607m = str;
                gm0.j1.u().c().w(208902, str);
                activityC11369x8a612b2b.f154609o = false;
                activityC11369x8a612b2b.X6();
                new p61.v3(activityC11369x8a612b2b, activityC11369x8a612b2b, activityC11369x8a612b2b.f154607m, null).execute(new java.lang.Void[0]);
                return;
            }
        }
        activityC11369x8a612b2b.V6();
        activityC11369x8a612b2b.W6(false);
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        super.onPreExecute();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "onPreExecute");
        this.f433936c = false;
    }
}
