package a44;

/* loaded from: classes4.dex */
public final class o implements za4.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f82832a;

    /* renamed from: b, reason: collision with root package name */
    public final int f82833b;

    public o(java.lang.ref.WeakReference weakReference, int i17) {
        this.f82832a = weakReference;
        this.f82833b = i17;
    }

    @Override // za4.f
    public void a(long j17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopped", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
        a44.m.a(this.f82833b, 103);
        java.lang.ref.WeakReference weakReference = this.f82832a;
        if (weakReference == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopped", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17706xd71a0a76 c17706xd71a0a76 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17706xd71a0a76) weakReference.get();
        if (c17706xd71a0a76 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("DownloadCallback", "download stopped but downloadHelper is null, id is " + j17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopped", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopped", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.TAG, "id is " + j17 + ", download stopped");
        h44.b bVar = c17706xd71a0a76.f244174e;
        if (bVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.b())) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopped", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        } else {
            java.util.concurrent.ConcurrentHashMap callbackIds = za4.k.g().f552673g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(callbackIds, "callbackIds");
            java.lang.Long l17 = (java.lang.Long) callbackIds.get(bVar.b());
            if (l17 != null && l17.longValue() == j17) {
                j44.j.p(c17706xd71a0a76.h(), 0, null, 2, null);
                c17706xd71a0a76.m();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = c17706xd71a0a76.f244186t;
                if (u3Var2 != null) {
                    if ((u3Var2.isShowing()) && (u3Var = c17706xd71a0a76.f244186t) != null) {
                        u3Var.dismiss();
                    }
                }
                android.content.Context context = c17706xd71a0a76.f244173d;
                if (context != null) {
                    db5.t7.h(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574702lo2));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopped", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopped", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopped", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
    }

    @Override // za4.f
    public void b(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61558xbb80ca22, "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
        a44.m.a(this.f82833b, 104);
        java.lang.ref.WeakReference weakReference = this.f82832a;
        if (weakReference == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61558xbb80ca22, "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17706xd71a0a76 c17706xd71a0a76 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17706xd71a0a76) weakReference.get();
        if (c17706xd71a0a76 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("DownloadCallback", "download succeed but downloadHelper is null, id is " + j17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61558xbb80ca22, "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61558xbb80ca22, "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.TAG, "id is " + j17 + ", download succeed");
        h44.b bVar = c17706xd71a0a76.f244174e;
        if (bVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.b())) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61558xbb80ca22, "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        } else {
            java.util.concurrent.ConcurrentHashMap callbackIds = za4.k.g().f552673g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(callbackIds, "callbackIds");
            java.lang.Long l17 = (java.lang.Long) callbackIds.get(bVar.b());
            if (l17 != null && l17.longValue() == j17) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = c17706xd71a0a76.f244182p;
                if (u3Var != null) {
                    u3Var.dismiss();
                }
                j44.j.p(c17706xd71a0a76.h(), 3, null, 2, null);
                c17706xd71a0a76.m();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61558xbb80ca22, "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61558xbb80ca22, "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61558xbb80ca22, "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
    }

    @Override // za4.f
    public void c(long j17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("progress", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
        java.lang.ref.WeakReference weakReference = this.f82832a;
        if (weakReference == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("progress", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17706xd71a0a76 c17706xd71a0a76 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17706xd71a0a76) weakReference.get();
        if (c17706xd71a0a76 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("DownloadCallback", "download get progress but downloadHelper is null, id is " + j17 + ", progress is " + i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("progress", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("progress", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.TAG, "id is " + j17 + ", download progress is " + i17);
        h44.b bVar = c17706xd71a0a76.f244174e;
        if (bVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.b())) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("progress", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        } else {
            java.util.concurrent.ConcurrentHashMap callbackIds = za4.k.g().f552673g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(callbackIds, "callbackIds");
            java.lang.Long l17 = (java.lang.Long) callbackIds.get(bVar.b());
            if (l17 != null && l17.longValue() == j17) {
                j44.j h17 = c17706xd71a0a76.h();
                h17.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setProgress", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d.C22713x95c5cea1 c22713x95c5cea1 = h17.f379219d;
                if (c22713x95c5cea1 != null) {
                    c22713x95c5cea1.m82113x3ae760af(i17);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setProgress", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
                if (i17 > 0 && !c17706xd71a0a76.f244183q) {
                    c17706xd71a0a76.f244183q = true;
                    ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) c17706xd71a0a76.f244185s).e(java.lang.Boolean.TRUE);
                    c17706xd71a0a76.m();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("progress", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("progress", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("progress", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
    }

    @Override // za4.f
    public void d(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resumed", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
        a44.m.a(this.f82833b, 102);
        java.lang.ref.WeakReference weakReference = this.f82832a;
        if (weakReference == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumed", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17706xd71a0a76 c17706xd71a0a76 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17706xd71a0a76) weakReference.get();
        if (c17706xd71a0a76 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("DownloadCallback", "download resumed but downloadHelper is null, id is " + j17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumed", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resumed", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.TAG, "id is " + j17 + ", download resumed");
        h44.b bVar = c17706xd71a0a76.f244174e;
        if (bVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.b())) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumed", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        } else {
            java.util.concurrent.ConcurrentHashMap callbackIds = za4.k.g().f552673g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(callbackIds, "callbackIds");
            java.lang.Long l17 = (java.lang.Long) callbackIds.get(bVar.b());
            if (l17 != null && l17.longValue() == j17) {
                j44.j.p(c17706xd71a0a76.h(), 1, null, 2, null);
                c17706xd71a0a76.m();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumed", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumed", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumed", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
    }

    @Override // za4.f
    public void e(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d, "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
        a44.m.a(this.f82833b, 105);
        java.lang.ref.WeakReference weakReference = this.f82832a;
        if (weakReference == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d, "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17706xd71a0a76 c17706xd71a0a76 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17706xd71a0a76) weakReference.get();
        if (c17706xd71a0a76 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("DownloadCallback", "download failed but downloadHelper is null, id is " + j17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d, "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d, "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.TAG, "id is " + j17 + ", download failed");
        h44.b bVar = c17706xd71a0a76.f244174e;
        if (bVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.b())) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d, "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        } else {
            java.util.concurrent.ConcurrentHashMap callbackIds = za4.k.g().f552673g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(callbackIds, "callbackIds");
            java.lang.Long l17 = (java.lang.Long) callbackIds.get(c17706xd71a0a76.f244174e.b());
            if (l17 != null && l17.longValue() == j17) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = c17706xd71a0a76.f244182p;
                if (u3Var != null) {
                    u3Var.dismiss();
                }
                c17706xd71a0a76.h().l();
                android.content.Context context = c17706xd71a0a76.f244173d;
                if (context != null) {
                    java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j6z);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showToast", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
                    ((ku5.t0) ku5.t0.f394148d).B(new a44.c0(c17706xd71a0a76, string));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showToast", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
                }
                j44.j.p(c17706xd71a0a76.h(), 0, null, 2, null);
                c17706xd71a0a76.m();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d, "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d, "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d, "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
    }

    @Override // za4.f
    public void f(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("paused", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
        a44.m.a(this.f82833b, 101);
        java.lang.ref.WeakReference weakReference = this.f82832a;
        if (weakReference == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("paused", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17706xd71a0a76 c17706xd71a0a76 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17706xd71a0a76) weakReference.get();
        if (c17706xd71a0a76 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("DownloadCallback", "download paused but downloadHelper is null, id is " + j17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("paused", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("paused", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.TAG, "id is " + j17 + ", download paused");
        h44.b bVar = c17706xd71a0a76.f244174e;
        if (bVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.b())) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("paused", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        } else {
            java.util.concurrent.ConcurrentHashMap callbackIds = za4.k.g().f552673g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(callbackIds, "callbackIds");
            java.lang.Long l17 = (java.lang.Long) callbackIds.get(bVar.b());
            if (l17 != null && l17.longValue() == j17) {
                j44.j.p(c17706xd71a0a76.h(), 2, null, 2, null);
                c17706xd71a0a76.m();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("paused", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("paused", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("paused", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
    }

    @Override // za4.f
    public void n(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("start", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
        a44.m.a(this.f82833b, 100);
        java.lang.ref.WeakReference weakReference = this.f82832a;
        if (weakReference == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17706xd71a0a76 c17706xd71a0a76 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17706xd71a0a76) weakReference.get();
        if (c17706xd71a0a76 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("DownloadCallback", "download start but downloadHelper is null, id is " + j17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("start", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.TAG, "id is " + j17 + ", download start");
        h44.b bVar = c17706xd71a0a76.f244174e;
        if (bVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.b())) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        } else {
            java.util.concurrent.ConcurrentHashMap callbackIds = za4.k.g().f552673g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(callbackIds, "callbackIds");
            java.lang.Long l17 = (java.lang.Long) callbackIds.get(bVar.b());
            if (l17 != null && l17.longValue() == j17) {
                j44.j.p(c17706xd71a0a76.h(), 1, null, 2, null);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
    }
}
