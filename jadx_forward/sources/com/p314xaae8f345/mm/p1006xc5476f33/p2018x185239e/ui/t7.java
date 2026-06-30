package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes5.dex */
public final class t7 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f239489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f239490e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f239491f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f239492g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.C17147x9fa5370e f239493h;

    public t7(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.C17147x9fa5370e c17147x9fa5370e) {
        this.f239489d = c22621x7603e017;
        this.f239490e = c0Var;
        this.f239491f = h0Var;
        this.f239492g = arrayList;
        this.f239493h = c17147x9fa5370e;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i17 == 123) {
            if (i18 == -1) {
                java.lang.String stringExtra = intent.getStringExtra("userName");
                java.lang.String stringExtra2 = intent.getStringExtra("telNumber");
                java.lang.String stringExtra3 = intent.getStringExtra("proviceFirstStageName");
                java.lang.String stringExtra4 = intent.getStringExtra("addressCitySecondStageName");
                java.lang.String stringExtra5 = intent.getStringExtra("addressCountiesThirdStageName");
                java.lang.String stringExtra6 = intent.getStringExtra("addressDetailInfo");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                if (!(stringExtra == null || stringExtra.length() == 0)) {
                    sb6.append(stringExtra);
                }
                if (!(stringExtra2 == null || stringExtra2.length() == 0)) {
                    sb6.append(stringExtra2);
                }
                if (!(sb6.length() == 0)) {
                    sb6.append(" ");
                }
                if (!(stringExtra3 == null || stringExtra3.length() == 0)) {
                    sb6.append(stringExtra3);
                }
                if (!(stringExtra4 == null || stringExtra4.length() == 0)) {
                    sb6.append(stringExtra4);
                }
                if (!(stringExtra5 == null || stringExtra5.length() == 0)) {
                    sb6.append(stringExtra5);
                }
                if (!(stringExtra6 == null || stringExtra6.length() == 0)) {
                    sb6.append(stringExtra6);
                }
                java.lang.String sb7 = sb6.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
                java.lang.String obj = this.f239489d.getText().toString();
                if (!(obj == null || obj.length() == 0) && !r26.i0.o(obj, ";", false, 2, null)) {
                    this.f239489d.getText().append((java.lang.CharSequence) ";");
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f239489d;
                    c22621x7603e017.mo81549xf579a34a(c22621x7603e017.getText().length());
                }
                this.f239490e.f391645d = true;
                this.f239489d.n(sb7.concat(";"));
                this.f239491f.f391656d = ((java.lang.String) this.f239491f.f391656d) + sb7;
                if (this.f239492g.isEmpty() || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kz5.n0.i0(this.f239492g), "2")) {
                    this.f239492g.add("2");
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceRemarkInputHalfPage", "cancel select address");
            }
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.s7 s7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.s7(this.f239493h);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(s7Var, 100L, false);
        }
    }
}
