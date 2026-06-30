package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae;

/* loaded from: classes.dex */
public class k0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e f265073d;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e serviceC19302xd3c5b06e) {
        this.f265073d = serviceC19302xd3c5b06e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void b(long j17, int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskFailed, downloadId = " + j17);
        try {
            java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.s3.f264637a.a(j17);
            if (a17 != null) {
                ((ee0.c) ((fe0.k3) i95.n0.c(fe0.k3.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAddDownloadTaskStraightFail", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
                l44.z.b(4001006, a17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAddDownloadTaskStraightFail", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
            }
            java.util.Iterator it = ((java.util.ArrayList) this.f265073d.f265019i).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547 c19336x1603547 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547) it.next();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putLong("download_manager_downloadid", j17);
                ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
                bundle.putCharSequence("download_manager_appid", c17 != null ? c17.f68404x28d45f97 : "");
                bundle.putInt("download_manager_errcode", i17);
                c19336x1603547.f265328d.mo70207xf5bc2045(1003, bundle);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskFailed, ex = " + e17.getMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void c(long j17, java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskFinished, downloadId = " + j17);
        try {
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.s3.f264637a.c(j17, c17.f68406x8d834527);
            java.util.Iterator it = ((java.util.ArrayList) this.f265073d.f265019i).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547 c19336x1603547 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547) it.next();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putLong("download_manager_downloadid", j17);
                bundle.putCharSequence("download_manager_appid", c17.f68404x28d45f97);
                c19336x1603547.f265328d.mo70207xf5bc2045(1002, bundle);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskFinished, ex = " + e17.getMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void f(long j17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void h(long j17, java.lang.String str, long j18, long j19) {
        try {
            java.util.Iterator it = ((java.util.ArrayList) this.f265073d.f265019i).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547 c19336x1603547 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547) it.next();
                ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
                if (c17 != null) {
                    long j27 = c17.f68443x78351860;
                    if (j27 != 0) {
                        long j28 = c17.f68413xf432b5ad;
                        int i17 = (int) ((j28 / j27) * 100.0d);
                        float f17 = (((float) j28) * 100.0f) / ((float) j27);
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putLong("download_manager_downloadid", j17);
                        bundle.putInt("download_manager_progress", i17);
                        bundle.putFloat("download_manager_progress_float", f17);
                        bundle.putString("download_manager_appid", c17.f68404x28d45f97);
                        c19336x1603547.f265328d.mo70207xf5bc2045(1007, bundle);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewUI.IFileDownloadCallback", "loadDownloadProgress failed, downloadId = " + j17);
                return;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskProgressChanged, ex = " + e17.getMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void i(long j17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskResumed, downloadId = " + j17);
        try {
            java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.s3.f264637a.a(j17);
            if (a17 != null) {
                ((ee0.c) ((fe0.k3) i95.n0.c(fe0.k3.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAddDownloadTaskStraightResume", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
                l44.z.b(4001005, a17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAddDownloadTaskStraightResume", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
            }
            java.util.Iterator it = ((java.util.ArrayList) this.f265073d.f265019i).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547 c19336x1603547 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547) it.next();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putLong("download_manager_downloadid", j17);
                ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
                bundle.putCharSequence("download_manager_appid", c17 != null ? c17.f68404x28d45f97 : "");
                c19336x1603547.f265328d.mo70207xf5bc2045(1011, bundle);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskRemoved, ex = " + e17.getMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void k(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskPaused, downloadId = " + j17);
        try {
            java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.s3.f264637a.a(j17);
            if (a17 != null) {
                ((ee0.c) ((fe0.k3) i95.n0.c(fe0.k3.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAddDownloadTaskStraightPause", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
                l44.z.b(4001004, a17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAddDownloadTaskStraightPause", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
            }
            java.util.Iterator it = ((java.util.ArrayList) this.f265073d.f265019i).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547 c19336x1603547 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547) it.next();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putLong("download_manager_downloadid", j17);
                ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
                bundle.putCharSequence("download_manager_appid", c17 != null ? c17.f68404x28d45f97 : "");
                c19336x1603547.f265328d.mo70207xf5bc2045(1010, bundle);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskRemoved, ex = " + e17.getMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void l(long j17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskResumed, downloadId = " + j17);
        try {
            java.util.Iterator it = ((java.util.ArrayList) this.f265073d.f265019i).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547 c19336x1603547 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547) it.next();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putLong("download_manager_downloadid", j17);
                ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
                bundle.putCharSequence("download_manager_appid", c17 != null ? c17.f68404x28d45f97 : "");
                c19336x1603547.f265328d.mo70207xf5bc2045(1012, bundle);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskRemoved, ex = " + e17.getMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void m(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskRemoved, downloadId = " + j17);
        try {
            java.util.Iterator it = ((java.util.ArrayList) this.f265073d.f265019i).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547 c19336x1603547 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547) it.next();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putLong("download_manager_downloadid", j17);
                ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
                bundle.putCharSequence("download_manager_appid", c17 != null ? c17.f68404x28d45f97 : "");
                c19336x1603547.f265328d.mo70207xf5bc2045(1008, bundle);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskRemoved, ex = " + e17.getMessage());
        }
    }
}
