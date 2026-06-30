package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class b5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f198459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5 f198460e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.d5 f198461f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f198462g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c6 f198463h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5 r5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.d5 d5Var, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c6 c6Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f198460e = r5Var;
        this.f198461f = d5Var;
        this.f198462g = view;
        this.f198463h = c6Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b5 b5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b5(this.f198460e, this.f198461f, this.f198462g, this.f198463h, interfaceC29045xdcb5ca57);
        b5Var.f198459d = obj;
        return b5Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f198459d;
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_TEST_MODE_GUIDE_COUNT_INT_SYNC, 0);
        boolean booleanValue = ((java.lang.Boolean) ae2.in.f85308i6.r()).booleanValue();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!booleanValue) {
            int r18 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ACCOUNT_LIVE_TEST_LIVE_GUIDE_LIMIT_INT_SYNC, 0);
            if (r18 <= 0 || r17 >= r18) {
                return f0Var;
            }
            long t17 = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_TEST_MODE_GUIDE_TIMESTAMP_LONG_SYNC, 0L);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (t17 > 0 && currentTimeMillis - t17 < 86400000) {
                return f0Var;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5 r5Var = this.f198460e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl slVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl(r5Var.O6());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.d5 d5Var = this.f198461f;
        java.lang.String string = d5Var.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oup);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        slVar.c(string);
        android.view.View view = this.f198462g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        slVar.f201333d = view;
        slVar.f201332c = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d;
        int S = pm0.v.S(224);
        android.widget.TextView textView = slVar.f201331b;
        textView.setMaxWidth(S);
        slVar.f201341l = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.kl.f200377d;
        slVar.f201342m = 130;
        slVar.f201343n = 16;
        slVar.f201340k = -855638017;
        slVar.f201339j = -12566464;
        textView.setGravity(8388627);
        slVar.f201335f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.y4(d5Var, r17);
        slVar.setOnDismissListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.z4(d5Var, r5Var));
        slVar.f201337h = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a5(r5Var, this.f198463h);
        slVar.b();
        slVar.d(y0Var);
        r5Var.f198896r = slVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5Var.f198891m, "show test live guide");
        return f0Var;
    }
}
