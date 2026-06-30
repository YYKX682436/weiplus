package tj1;

/* loaded from: classes7.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f501245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tj1.u f501246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f501247f;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, tj1.u uVar, int i17) {
        this.f501245d = e9Var;
        this.f501246e = uVar;
        this.f501247f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f501245d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = e9Var.t3();
        mi1.v vVar = t37 != null ? t37.f156354z : null;
        tj1.u uVar = this.f501246e;
        if (uVar.f501251g == null) {
            uVar.f501251g = new tj1.q(e9Var, vVar);
            if (vVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12763x195d5f32 e17 = vVar.e();
                al1.z zVar = uVar.f501251g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(zVar);
                e17.m53345x430fc028(zVar);
            }
        }
        if (uVar.f501252h == null) {
            uVar.f501252h = new tj1.r(vVar, e9Var);
            if (vVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12763x195d5f32 e18 = vVar.e();
                al1.b0 b0Var = uVar.f501252h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b0Var);
                e18.m53347x45f5bb56(b0Var);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t38 = e9Var.t3();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t38, "getRuntime(...)");
        int i17 = this.f501247f;
        if (mi1.o0.f408186b) {
            t38.f156354z.f408239e.c(new mi1.j0(2, i17, 3, 0L, -1, 0L, null, 0, 0L, null, 1000, null));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.CapsuleAnimatorEventHelper", "showTranslate: isEnable = false");
        }
    }
}
