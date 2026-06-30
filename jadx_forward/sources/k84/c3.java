package k84;

/* loaded from: classes4.dex */
public final class c3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f386502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f386503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f386504f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f386505g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, k84.d4 d4Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f386503e = h0Var;
        this.f386504f = d4Var;
        this.f386505g = h0Var2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$setLikedAttitudeView$2");
        k84.c3 c3Var = new k84.c3(this.f386503e, this.f386504f, this.f386505g, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$setLikedAttitudeView$2");
        return c3Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$setLikedAttitudeView$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$setLikedAttitudeView$2");
        java.lang.Object mo150x989b7ca4 = ((k84.c3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$setLikedAttitudeView$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$setLikedAttitudeView$2");
        return mo150x989b7ca4;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$setLikedAttitudeView$2");
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f386502d;
        k84.d4 d4Var = this.f386504f;
        n74.r rVar = n74.r.f416954a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.String str = (java.lang.String) this.f386503e.f391656d;
            android.widget.ImageView G = d4Var.G();
            this.f386502d = 1;
            if (rVar.e(str, G, this) == aVar) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$setLikedAttitudeView$2");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$setLikedAttitudeView$2");
                    throw illegalStateException;
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                jz5.f0 f0Var = jz5.f0.f384359a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$setLikedAttitudeView$2");
                return f0Var;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.String str2 = (java.lang.String) this.f386505g.f391656d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 O = d4Var.O();
        this.f386502d = 2;
        if (rVar.e(str2, O, this) == aVar) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$setLikedAttitudeView$2");
            return aVar;
        }
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$setLikedAttitudeView$2");
        return f0Var2;
    }
}
