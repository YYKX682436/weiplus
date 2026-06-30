package p61;

/* loaded from: classes8.dex */
public class v3 extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f433928a;

    /* renamed from: b, reason: collision with root package name */
    public p61.u3 f433929b = p61.u3.OTHER;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11369x8a612b2b f433930c;

    public v3(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11369x8a612b2b activityC11369x8a612b2b, android.content.Context context, java.lang.String str, p61.p3 p3Var) {
        this.f433930c = activityC11369x8a612b2b;
        this.f433928a = str;
    }

    public final java.lang.String a(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3) {
        java.net.URL url = new java.net.URL("https://www.google.com/m8/feeds/contacts/default/property-email?alt=" + str2 + "&max-results=" + i17 + "&start-index=" + i18 + "&access_token=" + str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "requestURL:%s", url.toString());
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setConnectTimeout(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059);
        int responseCode = httpURLConnection.getResponseCode();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "responseCode:%d", java.lang.Integer.valueOf(responseCode));
        if (responseCode != 200) {
            if (responseCode == 401) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "Server OAuth Error,Please Try Again.");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "Unknow Error.");
            }
            try {
                httpURLConnection.getInputStream().close();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GoogleContact.GoogleAPIAsyncTask", e17.getMessage());
            }
            httpURLConnection.disconnect();
            return null;
        }
        java.io.InputStream inputStream = httpURLConnection.getInputStream();
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr = new byte[20480];
        while (true) {
            int read = inputStream.read(bArr, 0, 20480);
            if (read == -1) {
                java.lang.String str4 = new java.lang.String(byteArrayOutputStream.toByteArray(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                inputStream.close();
                return str4;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public final void b(java.lang.String str) {
        java.lang.String string;
        int lastIndexOf;
        org.json.JSONArray jSONArray = new org.json.JSONObject(str).getJSONObject("feed").getJSONArray("entry");
        if (jSONArray != null) {
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                org.json.JSONObject optJSONObject = jSONArray.getJSONObject(i17).optJSONObject(dm.i4.f66865x76d1ec5a);
                org.json.JSONObject optJSONObject2 = jSONArray.getJSONObject(i17).optJSONObject(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                org.json.JSONArray optJSONArray = jSONArray.getJSONObject(i17).optJSONArray("gd$email");
                org.json.JSONArray optJSONArray2 = jSONArray.getJSONObject(i17).optJSONArray("link");
                java.lang.String str2 = "";
                java.lang.String substring = (optJSONObject == null || (lastIndexOf = (string = optJSONObject.getString("$t")).lastIndexOf("/")) <= 0) ? "" : string.substring(lastIndexOf + 1);
                java.lang.String string2 = optJSONObject2 != null ? optJSONObject2.getString("$t") : "";
                if (optJSONArray2 != null) {
                    for (int i18 = 0; i18 < optJSONArray2.length(); i18++) {
                        java.lang.String string3 = optJSONArray2.getJSONObject(i18).getString("rel");
                        int lastIndexOf2 = string3.lastIndexOf("#");
                        if (lastIndexOf2 > 0) {
                            java.lang.String substring2 = string3.substring(lastIndexOf2 + 1);
                            if (!android.text.TextUtils.isEmpty(substring2) && "photo".equals(substring2)) {
                                str2 = optJSONArray2.getJSONObject(i18).getString("href");
                            }
                        }
                    }
                }
                if (optJSONArray != null) {
                    for (int i19 = 0; i19 < optJSONArray.length(); i19++) {
                        java.lang.String string4 = optJSONArray.getJSONObject(i19).getString("address");
                        if (!android.text.TextUtils.isEmpty(string4) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Y0(string4)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11369x8a612b2b activityC11369x8a612b2b = this.f433930c;
                            if (!string4.equals(activityC11369x8a612b2b.f154606i)) {
                                r61.s0 s0Var = new r61.s0();
                                s0Var.f65888x9c77cab9 = substring;
                                s0Var.f65889xb2c2ce0c = substring + string4;
                                s0Var.f65890x5db248a9 = string2;
                                s0Var.f65892x7b1b111b = str2;
                                s0Var.f65887x58397040 = string4;
                                if (!activityC11369x8a612b2b.f154613s.containsKey(string4)) {
                                    activityC11369x8a612b2b.f154612r.add(s0Var);
                                    activityC11369x8a612b2b.f154613s.put(string4, s0Var);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final int c(java.lang.String str) {
        return new org.json.JSONObject(str).getJSONObject("feed").getJSONObject("openSearch$totalResults").getInt("$t");
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "doInBackground");
        int i17 = 0;
        int i18 = 1;
        while (true) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "startInde:%d, totalCount:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
                java.lang.String a17 = a("https://www.google.com/m8/feeds/contacts/default/full", "json", 100, i18, this.f433928a);
                int c17 = c(a17);
                if (c17 > 0) {
                    b(a17);
                }
                if (c17 - i18 > 100) {
                    i18 += 100;
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (!z17 || this.f433930c.f154609o) {
                    break;
                }
                i17 = c17;
            } catch (java.io.IOException e17) {
                this.f433929b = p61.u3.ACCESS_DEDY;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "IOException" + e17.getMessage());
                return null;
            } catch (org.json.JSONException e18) {
                this.f433929b = p61.u3.OTHER;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "JSONException" + e18.getMessage());
                return null;
            }
        }
        this.f433929b = p61.u3.SUCCESS;
        return null;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        super.onPostExecute((java.lang.Void) obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "onPostExecute");
        p61.u3 u3Var = this.f433929b;
        p61.u3 u3Var2 = p61.u3.SUCCESS;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11369x8a612b2b activityC11369x8a612b2b = this.f433930c;
        if (u3Var != u3Var2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11369x8a612b2b.T6(activityC11369x8a612b2b, u3Var, null);
            return;
        }
        java.util.ArrayList arrayList = activityC11369x8a612b2b.f154612r;
        if (arrayList == null || arrayList.size() <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11369x8a612b2b.T6(activityC11369x8a612b2b, p61.u3.NO_CONTACT, null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11369x8a612b2b.T6(activityC11369x8a612b2b, u3Var2, activityC11369x8a612b2b.f154612r);
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        super.onPreExecute();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "onPreExecute");
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11369x8a612b2b activityC11369x8a612b2b = this.f433930c;
        activityC11369x8a612b2b.f154612r.clear();
        activityC11369x8a612b2b.f154613s.clear();
    }
}
