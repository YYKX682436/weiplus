package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes5.dex */
public final class x7 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.m7 f239568a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f239569b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f239570c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.C17147x9fa5370e f239571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f239572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f239573f;

    public x7(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.m7 m7Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.C17147x9fa5370e c17147x9fa5370e, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, java.util.ArrayList arrayList) {
        this.f239568a = m7Var;
        this.f239569b = c22621x7603e017;
        this.f239570c = h0Var;
        this.f239571d = c17147x9fa5370e;
        this.f239572e = z2Var;
        this.f239573f = arrayList;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public final void a() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f239569b;
        int i17 = 0;
        this.f239568a.mo68430x57429edc(false, c22621x7603e017.getText().toString(), (java.lang.String) this.f239570c.f391656d);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.C17147x9fa5370e c17147x9fa5370e = this.f239571d;
        c17147x9fa5370e.f239094d.mo53060x36654fab(c22621x7603e017);
        this.f239572e.B();
        c17147x9fa5370e.getClass();
        java.util.ArrayList arrayList = this.f239573f;
        if (!arrayList.isEmpty()) {
            java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ",");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceRemarkInputHalfPage", "action flow: %s", c17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
            if (r26.i0.y(c17, "1,2,1", false) || r26.i0.y(c17, "2,1", false)) {
                i17 = 5;
            } else if (r26.i0.y(c17, "1,2", false)) {
                i17 = 3;
            } else if (r26.i0.y(c17, "1", false)) {
                i17 = 2;
            } else if (r26.i0.y(c17, "2", false)) {
                i17 = 4;
            }
        }
        if (i17 == 0 || c17147x9fa5370e.f239097g != com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.l7.f239340d) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(22750, java.lang.Integer.valueOf(i17), c17147x9fa5370e.f239096f);
    }
}
