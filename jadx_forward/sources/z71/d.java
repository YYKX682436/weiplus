package z71;

/* loaded from: classes8.dex */
public class d extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6261x1674b3 f552048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z71.f f552049e;

    public d(z71.f fVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6261x1674b3 c6261x1674b3) {
        this.f552049e = fVar;
        this.f552048d = c6261x1674b3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6261x1674b3 c6261x1674b3 = this.f552048d;
        int i17 = c6261x1674b3.f136512g.f88264a;
        boolean z17 = c6261x1674b3.f136512g.f88265b;
        int i18 = c6261x1674b3.f136512g.f88266c;
        z71.f fVar = this.f552049e;
        if (fVar.f552054f.containsKey(java.lang.Integer.valueOf(c6261x1674b3.f136512g.f88264a))) {
            am.g20 g20Var = (am.g20) fVar.f552054f.get(java.lang.Integer.valueOf(c6261x1674b3.f136512g.f88264a));
            am.g20 g20Var2 = c6261x1674b3.f136512g;
            fVar.getClass();
            if (g20Var.f88264a == g20Var2.f88264a && (g20Var.f88265b != g20Var2.f88265b || g20Var.f88266c != g20Var2.f88266c)) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6151x2c44bbd c6151x2c44bbd = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6151x2c44bbd();
                c6151x2c44bbd.f136413g.getClass();
                c6151x2c44bbd.e();
            }
        }
        fVar.f552054f.put(java.lang.Integer.valueOf(c6261x1674b3.f136512g.f88264a), c6261x1674b3.f136512g);
    }
}
