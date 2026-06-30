package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class v30 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f201565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c40 f201566e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f201567f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v30(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c40 c40Var, boolean z17) {
        super(2, interfaceC29045xdcb5ca57);
        this.f201565d = hVar;
        this.f201566e = c40Var;
        this.f201567f = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v30(this.f201565d, interfaceC29045xdcb5ca57, this.f201566e, this.f201567f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v30 v30Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v30) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        v30Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.jt1 jt1Var = (r45.jt1) ((xg2.i) this.f201565d).f535926b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c40 c40Var = this.f201566e;
        dk2.na B = c40Var.B(jt1Var);
        java.lang.String A = c40Var.A();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestMicReplayStatus success,status = ");
        sb6.append(B);
        sb6.append(",isFirstRequest = ");
        boolean z17 = this.f201567f;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(A, sb6.toString());
        if (z17 && B == dk2.na.f315341g) {
            c40Var.J(dk2.na.f315340f);
            android.content.Context context = c40Var.f199914d;
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.f293309c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ov_);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f80097x8eab27b0);
            e4Var.c();
        } else {
            c40Var.J(B);
            if (z17 && (B == dk2.na.f315342h || B == dk2.na.f315343i)) {
                android.content.Context context2 = c40Var.f199914d;
                int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context2);
                e4Var2.f293309c = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ov7);
                e4Var2.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
                e4Var2.c();
            }
            if (B == dk2.na.f315342h) {
                c40Var.F(jt1Var.m75939xb282bd08(2) * 1000);
            } else if (B == dk2.na.f315341g || B == dk2.na.f315344m) {
                android.content.Context context3 = c40Var.f199914d;
                int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context3);
                e4Var3.f293309c = context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ov6);
                e4Var3.b(com.p314xaae8f345.mm.R.raw.f80097x8eab27b0);
                e4Var3.c();
            }
        }
        return jz5.f0.f384359a;
    }
}
