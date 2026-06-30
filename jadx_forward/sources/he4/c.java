package he4;

/* loaded from: classes4.dex */
public abstract class c implements he4.d {

    /* renamed from: a, reason: collision with root package name */
    public he4.d f362448a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f362449b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f362450c = b();

    /* JADX WARN: Removed duplicated region for block: B:13:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object h(he4.c r17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18437xfbc5d82 r18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r19) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: he4.c.h(he4.c, com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public abstract java.lang.Object a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18437xfbc5d82 c18437xfbc5d82, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57);

    public abstract java.lang.String b();

    public abstract long c();

    public final void d(java.lang.String msg) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("logE", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.AbsSnsPublishLivePhotoDealChain");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f362450c, hashCode() + ' ' + msg);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("logE", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.AbsSnsPublishLivePhotoDealChain");
    }

    public final void e(java.lang.String msg) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("logI", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.AbsSnsPublishLivePhotoDealChain");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f362450c, hashCode() + ' ' + msg);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("logI", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.AbsSnsPublishLivePhotoDealChain");
    }

    public he4.d f(he4.d chain) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setNextChain", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.AbsSnsPublishLivePhotoDealChain");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chain, "chain");
        he4.d dVar = this.f362448a;
        if (dVar == null || ((he4.c) dVar).f(chain) == null) {
            this.f362448a = chain;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setNextChain", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.AbsSnsPublishLivePhotoDealChain");
        return this;
    }

    public java.lang.Object g(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18437xfbc5d82 c18437xfbc5d82, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startWork", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.AbsSnsPublishLivePhotoDealChain");
        java.lang.Object h17 = h(this, c18437xfbc5d82, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startWork", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.AbsSnsPublishLivePhotoDealChain");
        return h17;
    }
}
