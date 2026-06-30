package c01;

/* loaded from: classes12.dex */
public abstract class ee implements com.p314xaae8f345.mm.sdk.p2603x2137b148.h9 {

    /* renamed from: b, reason: collision with root package name */
    public static final c01.ee f118701b = new c01.xd();

    /* renamed from: a, reason: collision with root package name */
    public java.util.Map f118702a = new java.util.concurrent.ConcurrentHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(android.content.Context context, java.lang.String str, c01.de deVar) {
        java.lang.Throwable th6;
        java.io.InputStream inputStream;
        java.lang.Throwable e17;
        java.io.InputStream inputStream2;
        java.io.StringWriter stringWriter;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.io.InputStream inputStream3 = null;
        try {
            java.io.InputStream open = context.getAssets().open(str);
            try {
                stringWriter = new java.io.StringWriter();
            } catch (java.io.IOException e18) {
                e17 = e18;
            } catch (org.json.JSONException e19) {
                e17 = e19;
            } catch (java.lang.Throwable th7) {
                th6 = th7;
            }
            try {
                char[] cArr = new char[1024];
                try {
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(open, java.nio.charset.StandardCharsets.UTF_8));
                    while (true) {
                        int read = bufferedReader.read(cArr);
                        if (read == -1) {
                            break;
                        } else {
                            stringWriter.write(cArr, 0, read);
                        }
                    }
                    open.close();
                    deVar.a(new org.json.JSONObject(stringWriter.toString()));
                    com.p314xaae8f345.mm.vfs.e8.d(open);
                    inputStream2 = stringWriter;
                } catch (java.lang.Throwable th8) {
                    open.close();
                    throw th8;
                }
            } catch (java.io.IOException e27) {
                e17 = e27;
                inputStream3 = stringWriter;
                java.io.InputStream inputStream4 = inputStream3;
                inputStream3 = open;
                inputStream = inputStream4;
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.XAgreementSettings", e17, "#loadDefTable fail, %s", str);
                    com.p314xaae8f345.mm.vfs.e8.d(inputStream3);
                    inputStream2 = inputStream;
                    com.p314xaae8f345.mm.vfs.e8.d(inputStream2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", "Load default res table path:%s spent %s(ms)", str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                } catch (java.lang.Throwable th9) {
                    th6 = th9;
                    com.p314xaae8f345.mm.vfs.e8.d(inputStream3);
                    com.p314xaae8f345.mm.vfs.e8.d(inputStream);
                    throw th6;
                }
            } catch (org.json.JSONException e28) {
                e17 = e28;
                inputStream3 = stringWriter;
                java.io.InputStream inputStream42 = inputStream3;
                inputStream3 = open;
                inputStream = inputStream42;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.XAgreementSettings", e17, "#loadDefTable fail, %s", str);
                com.p314xaae8f345.mm.vfs.e8.d(inputStream3);
                inputStream2 = inputStream;
                com.p314xaae8f345.mm.vfs.e8.d(inputStream2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", "Load default res table path:%s spent %s(ms)", str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            } catch (java.lang.Throwable th10) {
                th6 = th10;
                inputStream3 = stringWriter;
                java.io.InputStream inputStream5 = inputStream3;
                inputStream3 = open;
                inputStream = inputStream5;
                com.p314xaae8f345.mm.vfs.e8.d(inputStream3);
                com.p314xaae8f345.mm.vfs.e8.d(inputStream);
                throw th6;
            }
        } catch (java.io.IOException e29) {
            e = e29;
            e17 = e;
            inputStream = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.XAgreementSettings", e17, "#loadDefTable fail, %s", str);
            com.p314xaae8f345.mm.vfs.e8.d(inputStream3);
            inputStream2 = inputStream;
            com.p314xaae8f345.mm.vfs.e8.d(inputStream2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", "Load default res table path:%s spent %s(ms)", str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (org.json.JSONException e37) {
            e = e37;
            e17 = e;
            inputStream = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.XAgreementSettings", e17, "#loadDefTable fail, %s", str);
            com.p314xaae8f345.mm.vfs.e8.d(inputStream3);
            inputStream2 = inputStream;
            com.p314xaae8f345.mm.vfs.e8.d(inputStream2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", "Load default res table path:%s spent %s(ms)", str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Throwable th11) {
            th6 = th11;
            inputStream = null;
        }
        com.p314xaae8f345.mm.vfs.e8.d(inputStream2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", "Load default res table path:%s spent %s(ms)", str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(android.content.Context context, int i17, c01.de deVar) {
        java.lang.Throwable th6;
        java.io.InputStream inputStream;
        java.lang.Throwable e17;
        java.io.InputStream inputStream2;
        java.io.StringWriter stringWriter;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.io.InputStream inputStream3 = null;
        try {
            java.io.InputStream openRawResource = context.getResources().openRawResource(i17);
            try {
                stringWriter = new java.io.StringWriter();
            } catch (java.io.IOException e18) {
                e17 = e18;
            } catch (org.json.JSONException e19) {
                e17 = e19;
            } catch (java.lang.Throwable th7) {
                th6 = th7;
            }
            try {
                char[] cArr = new char[1024];
                try {
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(openRawResource, java.nio.charset.StandardCharsets.UTF_8));
                    while (true) {
                        int read = bufferedReader.read(cArr);
                        if (read == -1) {
                            break;
                        } else {
                            stringWriter.write(cArr, 0, read);
                        }
                    }
                    openRawResource.close();
                    deVar.a(new org.json.JSONObject(stringWriter.toString()));
                    com.p314xaae8f345.mm.vfs.e8.d(openRawResource);
                    inputStream2 = stringWriter;
                } catch (java.lang.Throwable th8) {
                    openRawResource.close();
                    throw th8;
                }
            } catch (java.io.IOException e27) {
                e17 = e27;
                inputStream3 = stringWriter;
                java.io.InputStream inputStream4 = inputStream3;
                inputStream3 = openRawResource;
                inputStream = inputStream4;
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.XAgreementSettings", e17, "#loadDefTable fail, %s", java.lang.Integer.valueOf(i17));
                    com.p314xaae8f345.mm.vfs.e8.d(inputStream3);
                    inputStream2 = inputStream;
                    com.p314xaae8f345.mm.vfs.e8.d(inputStream2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", "Load default res table %s spent %s(ms)", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                } catch (java.lang.Throwable th9) {
                    th6 = th9;
                    com.p314xaae8f345.mm.vfs.e8.d(inputStream3);
                    com.p314xaae8f345.mm.vfs.e8.d(inputStream);
                    throw th6;
                }
            } catch (org.json.JSONException e28) {
                e17 = e28;
                inputStream3 = stringWriter;
                java.io.InputStream inputStream42 = inputStream3;
                inputStream3 = openRawResource;
                inputStream = inputStream42;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.XAgreementSettings", e17, "#loadDefTable fail, %s", java.lang.Integer.valueOf(i17));
                com.p314xaae8f345.mm.vfs.e8.d(inputStream3);
                inputStream2 = inputStream;
                com.p314xaae8f345.mm.vfs.e8.d(inputStream2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", "Load default res table %s spent %s(ms)", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            } catch (java.lang.Throwable th10) {
                th6 = th10;
                inputStream3 = stringWriter;
                java.io.InputStream inputStream5 = inputStream3;
                inputStream3 = openRawResource;
                inputStream = inputStream5;
                com.p314xaae8f345.mm.vfs.e8.d(inputStream3);
                com.p314xaae8f345.mm.vfs.e8.d(inputStream);
                throw th6;
            }
        } catch (java.io.IOException e29) {
            e = e29;
            e17 = e;
            inputStream = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.XAgreementSettings", e17, "#loadDefTable fail, %s", java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.vfs.e8.d(inputStream3);
            inputStream2 = inputStream;
            com.p314xaae8f345.mm.vfs.e8.d(inputStream2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", "Load default res table %s spent %s(ms)", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (org.json.JSONException e37) {
            e = e37;
            e17 = e;
            inputStream = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.XAgreementSettings", e17, "#loadDefTable fail, %s", java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.vfs.e8.d(inputStream3);
            inputStream2 = inputStream;
            com.p314xaae8f345.mm.vfs.e8.d(inputStream2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", "Load default res table %s spent %s(ms)", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Throwable th11) {
            th6 = th11;
            inputStream = null;
        }
        com.p314xaae8f345.mm.vfs.e8.d(inputStream2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", "Load default res table %s spent %s(ms)", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.h9
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public abstract java.lang.String a(java.lang.String str, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f);
}
