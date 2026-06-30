package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class x1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f196544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f196545e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f196546f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 f196547g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, java.lang.String str, p3325xe03a0797.p3326xc267989b.y0 y0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f196544d = hVar;
        this.f196545e = str;
        this.f196546f = y0Var;
        this.f196547g = v3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x1(this.f196544d, interfaceC29045xdcb5ca57, this.f196545e, this.f196546f, this.f196547g);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x1 x1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        x1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var;
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.j01 j01Var = (r45.j01) ((xg2.i) this.f196544d).f535926b;
        ya2.g gVar = ya2.h.f542017a;
        java.lang.String str = this.f196545e;
        ya2.b2 b17 = gVar.b(str);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var2 = this.f196547g;
        if (b17 != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa i17 = ya2.d.i(b17);
            java.lang.String valueOf = java.lang.String.valueOf(c01.id.c());
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f409116i;
            ml2.l1 l1Var = ml2.l1.f409220n;
            y4Var.getClass();
            y4Var.f409828e0 = l1Var;
            ((ml2.j0) i95.n0.c(ml2.j0.class)).Ij(ml2.y2.f409786f, "", "", valueOf);
            i95.m c17 = i95.n0.c(c61.ub.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            android.content.Context context = v3Var2.f446856d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_IS_FROM_LIVE", true);
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_SELECT_UNSPECIFIC_NOTICE", true);
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_CREATE_SESSION_ID", valueOf);
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_CREATE_ENTER_QR_CODE_BACK_PROFILE", true);
            v3Var = v3Var2;
            c61.ub.A3((c61.ub) c17, (android.app.Activity) context, intent, i17, 1012, true, null, null, false, j01Var, null, ag1.b.f37x366c91de, null);
            f0Var = f0Var2;
        } else {
            v3Var = v3Var2;
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.LiveAnchorAfterPlugin", "createNotice: finder contact is null, isInvitee=" + ((mm2.n0) v3Var.P0(mm2.n0.class)).f410806r + ", createNoticeAnchorUsername=" + str + ", anchorUsername=" + ((mm2.c1) v3Var.S0().a(mm2.c1.class)).f410385o);
        }
        return f0Var2;
    }
}
