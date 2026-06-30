package k84;

/* loaded from: classes4.dex */
public final class s4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f386776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f386777e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f386778f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k84.c6 f386779g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(long j17, android.content.Context context, k84.c6 c6Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f386777e = j17;
        this.f386778f = context;
        this.f386779g = c6Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$doFullScreenVibrateDelay$1");
        k84.s4 s4Var = new k84.s4(this.f386777e, this.f386778f, this.f386779g, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$doFullScreenVibrateDelay$1");
        return s4Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$doFullScreenVibrateDelay$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$doFullScreenVibrateDelay$1");
        java.lang.Object mo150x989b7ca4 = ((k84.s4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$doFullScreenVibrateDelay$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$doFullScreenVibrateDelay$1");
        return mo150x989b7ca4;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$doFullScreenVibrateDelay$1");
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f386776d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f386776d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(this.f386777e, this) == aVar) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$doFullScreenVibrateDelay$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$doFullScreenVibrateDelay$1");
                throw illegalStateException;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.Object obj2 = this.f386778f;
        p012xc85e97e9.p093xedfae76a.n nVar = null;
        p012xc85e97e9.p093xedfae76a.y yVar = obj2 instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) obj2 : null;
        if (yVar != null && (mo273xed6858b4 = yVar.mo273xed6858b4()) != null) {
            nVar = mo273xed6858b4.b();
        }
        boolean z17 = nVar != p012xc85e97e9.p093xedfae76a.n.RESUMED;
        if (!z17) {
            ca4.z0.I0(new long[]{0, 100});
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f386779g.j(), "doFullScreenVibrateDelay isNotResumed is " + z17);
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$doFullScreenVibrateDelay$1");
        return f0Var;
    }
}
