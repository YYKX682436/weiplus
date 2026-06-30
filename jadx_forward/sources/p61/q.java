package p61;

/* loaded from: classes8.dex */
public class q extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f433883a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f433884b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f433885c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f433886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11358x5a6f125e f433887e;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11358x5a6f125e activityC11358x5a6f125e, java.lang.String str) {
        this.f433887e = activityC11358x5a6f125e;
        this.f433883a = str;
    }

    public final java.lang.String a(java.lang.String str) {
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL("https://accounts.google.com/o/oauth2/token").openConnection();
        httpURLConnection.setRequestProperty("Charset", com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setConnectTimeout(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059);
        httpURLConnection.setReadTimeout(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new org.apache.http.message.BasicNameValuePair("code", str));
        arrayList.add(new org.apache.http.message.BasicNameValuePair("client_id", "369820936870.apps.googleusercontent.com"));
        arrayList.add(new org.apache.http.message.BasicNameValuePair("client_secret", "wcFhvo-s7wNcmQ9Zjr00H06u"));
        arrayList.add(new org.apache.http.message.BasicNameValuePair("redirect_uri", "urn:ietf:wg:oauth:2.0:oob"));
        arrayList.add(new org.apache.http.message.BasicNameValuePair("grant_type", "authorization_code"));
        java.lang.String a17 = r61.r0.a(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "QueryString:%s", a17);
        int length = a17.getBytes().length;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(length);
        java.lang.String str2 = "";
        sb6.append("");
        httpURLConnection.setRequestProperty("Content-length", sb6.toString());
        java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(httpURLConnection.getOutputStream(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
        bufferedWriter.write(a17);
        bufferedWriter.flush();
        bufferedWriter.close();
        int responseCode = httpURLConnection.getResponseCode();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GoogleContact.BindGoogleContactUI", "responseCode:" + responseCode);
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
            str2 = stringBuffer.toString();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "exchange token respone:%s", str2);
        }
        try {
            httpURLConnection.getInputStream().close();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GoogleContact.BindGoogleContactUI", e17.getMessage());
        }
        httpURLConnection.disconnect();
        return str2;
    }

    public final java.lang.String b(java.lang.String str) {
        return new org.json.JSONObject(str).optString("access_token");
    }

    public final java.lang.String c(java.lang.String str) {
        return new org.json.JSONObject(str).optString("refresh_token");
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        try {
            java.lang.String a17 = a(this.f433883a);
            this.f433884b = b(a17);
            this.f433885c = c(a17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "response:%s", a17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "mAccessToken:%s", this.f433884b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "mRefreshToken:%s", this.f433885c);
            this.f433886d = true;
            return null;
        } catch (java.net.MalformedURLException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GoogleContact.BindGoogleContactUI", "MalformedURLException:%s" + e17.getMessage());
            return null;
        } catch (java.net.ProtocolException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GoogleContact.BindGoogleContactUI", "ProtocolException:%s" + e18.getMessage());
            return null;
        } catch (java.io.IOException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GoogleContact.BindGoogleContactUI", "IOException:%s" + e19.getMessage());
            return null;
        } catch (org.json.JSONException e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GoogleContact.BindGoogleContactUI", "JSONException:%s" + e27.getMessage());
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        super.onPostExecute((java.lang.Void) obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "onPostExecute");
        boolean z17 = this.f433886d;
        java.lang.String str = this.f433884b;
        java.lang.String str2 = this.f433885c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11358x5a6f125e activityC11358x5a6f125e = this.f433887e;
        if (z17) {
            activityC11358x5a6f125e.getClass();
            if (!android.text.TextUtils.isEmpty(str)) {
                activityC11358x5a6f125e.f154467i = str;
                activityC11358x5a6f125e.f154468m = str2;
                new p61.p(activityC11358x5a6f125e, str).execute(new java.lang.Void[0]);
                return;
            }
        }
        activityC11358x5a6f125e.U6();
        activityC11358x5a6f125e.W6();
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        super.onPreExecute();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "onPreExecute");
        this.f433884b = "";
        this.f433885c = "";
        this.f433886d = false;
    }
}
