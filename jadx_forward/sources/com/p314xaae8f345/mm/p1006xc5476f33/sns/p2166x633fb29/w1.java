package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f246259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f246260e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f246261f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f246262g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 f246263h;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 i1Var, r45.jj4 jj4Var, int i17, java.lang.String str, java.lang.String str2) {
        this.f246263h = i1Var;
        this.f246259d = jj4Var;
        this.f246260e = i17;
        this.f246261f = str;
        this.f246262g = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Set set;
        r45.jj4 jj4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$7");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 i1Var = this.f246263h;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.d(i1Var).size() >= 60) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "pushToImageLoaderImpl loaderlist.size:%d exceed, trim to MAX_DECODE_SIZE:%d", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.d(i1Var).size()), 60);
        }
        while (true) {
            int size = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.d(i1Var).size();
            set = i1Var.f245807w;
            jj4Var = this.f246259d;
            if (size < 60) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.a2 a2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.a2) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.d(i1Var).removeFirst();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LazyerImageLoader2", "[%s][media:%s] start pushToImageLoaderImpl too many,remove key:%s media:%s", "[image-flow]", jj4Var.f459388d, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.a2.e(a2Var), a2Var.g());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
            ((java.util.HashSet) set).remove(a2Var.f245598c);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.a2 a2Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.a2(this.f246263h, ca4.z0.x(this.f246260e, jj4Var.f459388d), this.f246261f + this.f246262g, this.f246261f, this.f246259d, this.f246260e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "[%s][media:%s] start pushToImageLoaderImpl ImageLoader key:%s", "[image-flow]", jj4Var.f459388d, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.a2.e(a2Var2));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$800", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$800", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
        jt0.i iVar = i1Var.f245787c;
        java.lang.String str = a2Var2.f245598c;
        if (iVar.k(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
            ((java.util.HashSet) set).remove(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LazyerImageLoader2", "[%s][media:%s] end pushToImageLoaderImpl ImageLoader key:%s for mMemoryCache already contains", "[image-flow]", jj4Var.f459388d, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.a2.e(a2Var2));
        } else {
            if (!((java.util.HashSet) set).contains(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.a2.e(a2Var2))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "[%s][media:%s] end pushToImageLoaderImpl add ImageLoader key:%s ", "[image-flow]", jj4Var.f459388d, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.a2.e(a2Var2));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.d(i1Var).add(a2Var2);
                ((java.util.HashSet) set).add(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.a2.e(a2Var2));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "add loaderlist size:%d", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.d(i1Var).size()));
        java.lang.String mediaId = jj4Var.f459388d;
        int size2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.d(i1Var).size();
        ta4.u0 u0Var = ta4.u0.f498371a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startImageLoader", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        pm0.v.O("SnsImageLoadReporter", new ta4.r0(mediaId, size2));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startImageLoader", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$900", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        i1Var.o0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$900", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$7");
    }
}
