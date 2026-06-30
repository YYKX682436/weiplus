package nu0;

/* loaded from: classes5.dex */
public final class k2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f421530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f421531e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f421532f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f421533g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f421534h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(nu0.b4 b4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624, java.util.List list, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f421531e = b4Var;
        this.f421532f = c16993xacc19624;
        this.f421533g = list;
        this.f421534h = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nu0.k2(this.f421531e, this.f421532f, this.f421533g, this.f421534h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nu0.k2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object Y6;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f421530d;
        nu0.b4 b4Var = this.f421531e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f421530d = 1;
            Y6 = nu0.b4.Y6(b4Var, this);
            if (Y6 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            Y6 = obj;
        }
        boolean booleanValue = ((java.lang.Boolean) Y6).booleanValue();
        xt0.b bVar = b4Var.Z;
        android.app.Activity context = b4Var.m80379x76847179();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(booleanValue);
        bVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider = this.f421532f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        java.util.List imagePathList = this.f421533g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imagePathList, "imagePathList");
        bVar.b(configProvider);
        ut3.f fVar = ut3.f.f512709c;
        android.os.Bundle bundle = fVar.f512711b;
        bundle.putBoolean("KEY_DELAY_ENTER_POST_UI", this.f421534h);
        bundle.putByteArray("KEY_POST_ASSET_INFO", null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd c16995x8ab634cd = configProvider.I;
        bundle.putInt("key_ref_enter_scene", c16995x8ab634cd != null ? c16995x8ab634cd.f237229m : 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd c16995x8ab634cd2 = configProvider.I;
        bundle.putLong("key_ref_feed_id", c16995x8ab634cd2 != null ? c16995x8ab634cd2.f237227h : 0L);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd c16995x8ab634cd3 = configProvider.I;
        bundle.putString("key_ref_feed_dup_flag", c16995x8ab634cd3 != null ? c16995x8ab634cd3.f237228i : null);
        if (valueOf != null) {
            bundle.putBoolean("KEY_POST_ASSETS_IS_REAL_SHOOT", valueOf.booleanValue());
        }
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        nu3.i iVar = nu3.i.f421751a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046 = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046(bool, "", "", 0L, bool2, iVar.l());
        c16991x15ced046.f237199m.addAll(imagePathList);
        fVar.a(context, c16991x15ced046);
        fVar.d(true, iVar.l());
        return jz5.f0.f384359a;
    }
}
