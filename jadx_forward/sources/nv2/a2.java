package nv2;

/* loaded from: classes10.dex */
public final class a2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nv2.o1 f421985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nv2.b2 f421986b;

    public a2(nv2.o1 o1Var, nv2.b2 b2Var) {
        this.f421985a = o1Var;
        this.f421986b = b2Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ThankActionTask", "ThankAction callback " + fVar.f152148a + ' ' + fVar.f152149b + ' ' + fVar.f152150c);
        int i17 = fVar.f152148a;
        nv2.o1 o1Var = this.f421985a;
        if (i17 == 0 && fVar.f152149b == 0) {
            o1Var.a(fp0.u.f346823f, false);
        } else if (i17 == 4) {
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 d17 = this.f421986b.d(false);
            if (d17 != null) {
                d17.e();
            }
            o1Var.a(fp0.u.f346824g, false);
        } else {
            o1Var.a(fp0.u.f346824g, true);
        }
        return jz5.f0.f384359a;
    }
}
