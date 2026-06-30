package k84;

/* loaded from: classes4.dex */
public final class f2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f386564d;

    /* renamed from: e, reason: collision with root package name */
    public int f386565e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mb4.r f386566f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f386567g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f386568h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(mb4.r rVar, android.content.Context context, k84.d4 d4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f386566f = rVar;
        this.f386567g = context;
        this.f386568h = d4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6$1$1$1");
        k84.f2 f2Var = new k84.f2(this.f386566f, this.f386567g, this.f386568h, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6$1$1$1");
        return f2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6$1$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6$1$1$1");
        java.lang.Object mo150x989b7ca4 = ((k84.f2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6$1$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6$1$1$1");
        return mo150x989b7ca4;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        long j17;
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6$1$1$1");
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f386565e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            mb4.r rVar = this.f386566f;
            rVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVibrateDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
            int i18 = rVar.f406996j;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVibrateDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
            long j18 = i18;
            this.f386564d = j18;
            this.f386565e = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(j18, this) == aVar) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6$1$1$1");
                return aVar;
            }
            j17 = j18;
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6$1$1$1");
                throw illegalStateException;
            }
            j17 = this.f386564d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.Object obj2 = this.f386567g;
        p012xc85e97e9.p093xedfae76a.n nVar = null;
        p012xc85e97e9.p093xedfae76a.y yVar = obj2 instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) obj2 : null;
        if (yVar != null && (mo273xed6858b4 = yVar.mo273xed6858b4()) != null) {
            nVar = mo273xed6858b4.b();
        }
        boolean z17 = nVar != p012xc85e97e9.p093xedfae76a.n.RESUMED;
        if (!z17) {
            ca4.z0.I0(new long[]{0, 100});
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f386568h.j(), "vibrateJob delay " + j17 + ' ' + z17);
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6$1$1$1");
        return f0Var;
    }
}
