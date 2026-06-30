package pk2;

/* loaded from: classes3.dex */
public final class b2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f437101d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437102e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f437103f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f437104g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f437105h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.j32 f437106i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.c32 f437107m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, java.lang.String str, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, p3325xe03a0797.p3326xc267989b.y0 y0Var, boolean z17, r45.j32 j32Var, r45.c32 c32Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f437101d = hVar;
        this.f437102e = str;
        this.f437103f = abstractActivityC21394xb3d2c0cf;
        this.f437104g = y0Var;
        this.f437105h = z17;
        this.f437106i = j32Var;
        this.f437107m = c32Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pk2.b2(this.f437101d, interfaceC29045xdcb5ca57, this.f437102e, this.f437103f, this.f437104g, this.f437105h, this.f437106i, this.f437107m);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        pk2.b2 b2Var = (pk2.b2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        b2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf;
        java.lang.String str2;
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.j01 j01Var = (r45.j01) ((xg2.i) this.f437101d).f535926b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createNotice: cgi success, source=");
        java.lang.String str3 = this.f437102e;
        sb6.append(str3);
        sb6.append(", username=");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f437103f;
        sb6.append(xy2.c.e(abstractActivityC21394xb3d2c0cf2));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMoreLiveNoticeOption", sb6.toString());
        ya2.b2 b17 = ya2.h.f542017a.b(xy2.c.e(abstractActivityC21394xb3d2c0cf2));
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (b17 != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa i17 = ya2.d.i(b17);
            i95.m c17 = i95.n0.c(c61.ub.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c61.ub ubVar = (c61.ub) c17;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf3 = this.f437103f;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_IS_FROM_LIVE", true);
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_SELECT_UNSPECIFIC_NOTICE", true);
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_CREATE_SESSION_ID", pk2.l2.f437472n);
            boolean z17 = this.f437105h;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
            pk2.z1 z1Var = new pk2.z1(abstractActivityC21394xb3d2c0cf2, this.f437106i, this.f437107m, z17);
            str = "AnchorMoreLiveNoticeOption";
            abstractActivityC21394xb3d2c0cf = abstractActivityC21394xb3d2c0cf2;
            str2 = ", username=";
            c61.ub.A3(ubVar, abstractActivityC21394xb3d2c0cf3, intent, i17, 0, true, valueOf, null, false, j01Var, z1Var, 192, null);
            f0Var = f0Var2;
        } else {
            str = "AnchorMoreLiveNoticeOption";
            abstractActivityC21394xb3d2c0cf = abstractActivityC21394xb3d2c0cf2;
            str2 = ", username=";
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "createNotice: finder contact is null, source=" + str3 + str2 + xy2.c.e(abstractActivityC21394xb3d2c0cf));
        }
        return f0Var2;
    }
}
