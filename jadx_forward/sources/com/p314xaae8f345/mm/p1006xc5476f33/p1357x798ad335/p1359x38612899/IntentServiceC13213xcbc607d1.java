package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1359x38612899;

/* renamed from: com.tencent.mm.plugin.downloader.intentservice.DownloadFileService */
/* loaded from: classes7.dex */
public class IntentServiceC13213xcbc607d1 extends android.app.IntentService {

    /* renamed from: d, reason: collision with root package name */
    public android.os.ResultReceiver f178445d;

    /* renamed from: e, reason: collision with root package name */
    public int f178446e;

    /* renamed from: f, reason: collision with root package name */
    public int f178447f;

    public IntentServiceC13213xcbc607d1() {
        super("com.tencent.mm.plugin.downloader.intentservice.DownloadFileService");
    }

    public final void a(int i17) {
        android.os.Bundle bundle = new android.os.Bundle();
        int i18 = (int) ((this.f178446e * 100) / i17);
        if (i18 > this.f178447f) {
            bundle.putInt("progress", i18);
            this.f178445d.send(4657, bundle);
            this.f178447f = i18;
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        z2.k0 k0Var = new z2.k0(this, "reminder_channel_id");
        k0Var.f("Something Download");
        k0Var.e("Download in progress");
        k0Var.D.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.f78060x313c79;
        startForeground(4657, k0Var.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // android.app.IntentService
    public void onHandleIntent(android.content.Intent intent) {
        ?? r57;
        java.lang.Throwable th6;
        ?? r132;
        java.io.OutputStream I;
        java.io.IOException e17;
        java.net.HttpURLConnection httpURLConnection;
        java.net.ProtocolException e18;
        java.net.MalformedURLException e19;
        java.lang.String string = intent.getExtras().getString("url");
        this.f178445d = (android.os.ResultReceiver) intent.getParcelableExtra("receiver");
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(android.os.Environment.getExternalStorageDirectory().getAbsolutePath() + "/Download");
        java.lang.String str = a17.f294812f;
        com.p314xaae8f345.mm.vfs.z7 z7Var = a17;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            z7Var = a17;
            if (!str.equals(l17)) {
                z7Var = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        java.io.InputStream inputStream = null;
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var, m17);
            if (m18.a()) {
                m18.f294799a.r(m18.f294800b);
            }
        }
        java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l("file11.apk", false, true);
        com.p314xaae8f345.mm.vfs.z7 z7Var2 = z7Var;
        if (l18 != null) {
            z7Var2 = z7Var;
            if (!l18.isEmpty()) {
                z7Var2 = new com.p314xaae8f345.mm.vfs.z7(z7Var.f294810d, z7Var.f294811e, z7Var.f294812f + '/' + l18, z7Var.f294813g, z7Var.f294814h);
            }
        }
        try {
            try {
                I = com.p314xaae8f345.mm.vfs.w6.I(z7Var2, com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var2, null), false);
            } catch (java.lang.Throwable th7) {
                r57 = string;
                th6 = th7;
                r132 = z7Var2;
            }
            try {
                httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(string).openConnection();
                try {
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setReadTimeout(10000);
                    httpURLConnection.setConnectTimeout(3000);
                    int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(httpURLConnection.getHeaderField("Content-Length"), 0);
                    java.io.InputStream inputStream2 = httpURLConnection.getInputStream();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int read = inputStream2.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            I.write(bArr, 0, read);
                            this.f178446e += read;
                            a(P);
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DownloadFileService", "Server return code:" + responseCode);
                    }
                    if (I != null) {
                        try {
                            I.close();
                        } catch (java.io.IOException e27) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("DownloadFileService", e27, "", new java.lang.Object[0]);
                        }
                    }
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                } catch (java.net.MalformedURLException e28) {
                    e19 = e28;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("DownloadFileService", e19, "", new java.lang.Object[0]);
                    if (I != null) {
                        try {
                            I.close();
                        } catch (java.io.IOException e29) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("DownloadFileService", e29, "", new java.lang.Object[0]);
                        }
                    }
                    if (0 != 0) {
                        inputStream.close();
                    }
                    httpURLConnection.disconnect();
                } catch (java.net.ProtocolException e37) {
                    e18 = e37;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("DownloadFileService", e18, "", new java.lang.Object[0]);
                    if (I != null) {
                        try {
                            I.close();
                        } catch (java.io.IOException e38) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("DownloadFileService", e38, "", new java.lang.Object[0]);
                        }
                    }
                    if (0 != 0) {
                        inputStream.close();
                    }
                    httpURLConnection.disconnect();
                } catch (java.io.IOException e39) {
                    e17 = e39;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("DownloadFileService", e17, "", new java.lang.Object[0]);
                    if (I != null) {
                        try {
                            I.close();
                        } catch (java.io.IOException e47) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("DownloadFileService", e47, "", new java.lang.Object[0]);
                        }
                    }
                    if (0 != 0) {
                        inputStream.close();
                    }
                    httpURLConnection.disconnect();
                }
            } catch (java.net.MalformedURLException e48) {
                e19 = e48;
                httpURLConnection = null;
            } catch (java.net.ProtocolException e49) {
                e18 = e49;
                httpURLConnection = null;
            } catch (java.io.IOException e57) {
                e17 = e57;
                httpURLConnection = null;
            } catch (java.lang.Throwable th8) {
                th6 = th8;
                r57 = 0;
                r132 = I;
                if (r132 != 0) {
                    try {
                        r132.close();
                    } catch (java.io.IOException e58) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("DownloadFileService", e58, "", new java.lang.Object[0]);
                        r57.disconnect();
                        throw th6;
                    }
                }
                if (0 != 0) {
                    inputStream.close();
                }
                r57.disconnect();
                throw th6;
            }
            httpURLConnection.disconnect();
        } catch (java.io.FileNotFoundException e59) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DownloadFileService", "can not fond output folder");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("DownloadFileService", e59, "", new java.lang.Object[0]);
        }
    }
}
