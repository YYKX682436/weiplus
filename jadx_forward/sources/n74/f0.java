package n74;

/* loaded from: classes4.dex */
public final class f0 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f416885d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f416886e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416887f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f416887f = str;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getThumbDownloadFlow$flow$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getThumbDownloadFlow$flow$1");
        n74.f0 f0Var = new n74.f0(this.f416887f, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        f0Var.f416886e = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) obj;
        java.lang.Object mo150x989b7ca4 = f0Var.mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getThumbDownloadFlow$flow$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getThumbDownloadFlow$flow$1");
        return mo150x989b7ca4;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getThumbDownloadFlow$flow$1");
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f416885d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) this.f416886e;
            java.lang.String cacheName = this.f416887f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cacheName, "$cacheName");
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 b17 = n74.h0.b(cacheName);
            this.f416885d = 1;
            if (kVar instanceof p3325xe03a0797.p3326xc267989b.p3328x30012e.k3) {
                throw ((p3325xe03a0797.p3326xc267989b.p3328x30012e.k3) kVar).f391844d;
            }
            java.lang.Object a17 = ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) b17).a(new p3325xe03a0797.p3326xc267989b.p3328x30012e.u1(kVar), this);
            if (a17 != aVar) {
                a17 = f0Var;
            }
            if (a17 != aVar) {
                a17 = f0Var;
            }
            if (a17 == aVar) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getThumbDownloadFlow$flow$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getThumbDownloadFlow$flow$1");
                throw illegalStateException;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getThumbDownloadFlow$flow$1");
        return f0Var;
    }
}
