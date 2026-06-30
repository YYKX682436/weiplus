package p61;

/* loaded from: classes8.dex */
public class p extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f433874a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f433875b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f433876c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11358x5a6f125e f433877d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11358x5a6f125e activityC11358x5a6f125e, java.lang.String str) {
        this.f433877d = activityC11358x5a6f125e;
        this.f433874a = str;
    }

    public final java.lang.String a(java.lang.String str) {
        return new org.json.JSONObject(str).optString(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5852x3f0537c);
    }

    public final java.lang.String b(java.lang.String str) {
        java.lang.String str2;
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL("https://www.googleapis.com/oauth2/v1/userinfo?access_token=" + str).openConnection();
        httpURLConnection.setRequestProperty("Charset", com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setConnectTimeout(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059);
        httpURLConnection.setReadTimeout(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "get EmailAccount respone:%s", str2);
        } else {
            str2 = "";
        }
        try {
            httpURLConnection.getInputStream().close();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GoogleContact.BindGoogleContactUI", e17.getMessage());
        }
        httpURLConnection.disconnect();
        return str2;
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "doInBackground");
        try {
            java.lang.String a17 = a(b(this.f433874a));
            this.f433875b = a17;
            if (android.text.TextUtils.isEmpty(a17)) {
                return null;
            }
            this.f433876c = true;
            return null;
        } catch (java.io.UnsupportedEncodingException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GoogleContact.BindGoogleContactUI", "UnsupportedEncodingException:%s", e17.getMessage());
            return null;
        } catch (java.net.MalformedURLException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GoogleContact.BindGoogleContactUI", "MalformedURLException:%s", e18.getMessage());
            return null;
        } catch (java.net.ProtocolException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GoogleContact.BindGoogleContactUI", "ProtocolException:%s", e19.getMessage());
            return null;
        } catch (java.io.IOException e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GoogleContact.BindGoogleContactUI", "IOException:%s", e27.getMessage());
            return null;
        } catch (org.json.JSONException e28) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GoogleContact.BindGoogleContactUI", e28, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        super.onPostExecute((java.lang.Void) obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "onPostExecute");
        boolean z17 = this.f433876c;
        java.lang.String str = this.f433875b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11358x5a6f125e activityC11358x5a6f125e = this.f433877d;
        if (z17) {
            activityC11358x5a6f125e.getClass();
            if (!android.text.TextUtils.isEmpty(str)) {
                if (android.text.TextUtils.isEmpty(activityC11358x5a6f125e.f154465g) || android.text.TextUtils.isEmpty(str) || activityC11358x5a6f125e.f154465g.equalsIgnoreCase(str)) {
                    activityC11358x5a6f125e.f154465g = str;
                    activityC11358x5a6f125e.T6(0);
                    return;
                } else {
                    activityC11358x5a6f125e.U6();
                    db5.e1.u(activityC11358x5a6f125e, activityC11358x5a6f125e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fqv), "", new p61.k(activityC11358x5a6f125e, str), new p61.l(activityC11358x5a6f125e));
                    return;
                }
            }
        }
        activityC11358x5a6f125e.U6();
        activityC11358x5a6f125e.W6();
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        super.onPreExecute();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "onPreExecute");
        this.f433876c = false;
    }
}
