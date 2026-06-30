package x44;

/* loaded from: classes4.dex */
public final class h2 extends k64.s {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f533367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f533368f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(yz5.q qVar, int i17) {
        super(5159);
        this.f533367e = qVar;
        this.f533368f = i17;
    }

    @Override // k64.s
    public void b(int i17, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment$makeAppointment$1");
        int i18 = this.f533368f;
        yz5.q qVar = this.f533367e;
        if (i17 == 0 && (m1Var instanceof k64.o)) {
            java.lang.Object obj = null;
            try {
                java.lang.Object a17 = k64.t.a(m1Var);
                if (a17 instanceof r45.k0) {
                    obj = a17;
                }
            } catch (java.lang.Throwable unused) {
            }
            r45.k0 k0Var = (r45.k0) obj;
            qVar.mo147xb9724478(0, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(k0Var != null ? k0Var.f459780d : -1));
        } else {
            qVar.mo147xb9724478(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), -1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment$makeAppointment$1");
    }
}
