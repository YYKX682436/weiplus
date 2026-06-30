package bp4;

/* loaded from: classes10.dex */
public final class h0 implements ml5.i {

    /* renamed from: a, reason: collision with root package name */
    public float f104715a = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 f104716b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ym5.x2 f104717c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.k0 f104718d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var, ym5.x2 x2Var, bp4.k0 k0Var) {
        this.f104716b = i1Var;
        this.f104717c = x2Var;
        this.f104718d = k0Var;
    }

    @Override // ml5.i
    public void a() {
        this.f104715a = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.q0.a(this.f104716b.f257157i.f257317a);
    }

    @Override // ml5.i
    public void b() {
        float f17 = this.f104715a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = this.f104716b;
        boolean z17 = f17 == com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.q0.a(i1Var.f257157i.f257317a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16992x127e9e90.EditItem editItem = i1Var.f257159k;
        if (z17) {
            editItem.f37763xebe5543b++;
        } else {
            editItem.f37768x712595e5++;
        }
    }

    @Override // ml5.h
    /* renamed from: onChange */
    public void mo10990x3dcbea6f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = this.f104716b;
        float[] fArr = new float[9];
        i1Var.f257157i.f257317a.getValues(fArr);
        float f17 = fArr[0];
        double d17 = fArr[3];
        float sqrt = (float) java.lang.Math.sqrt((f17 * f17) + (d17 * d17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.y yVar = i1Var.f257157i;
        if (sqrt > 0.0f) {
            l45.q m177317xc879b3f2 = this.f104717c.m177317xc879b3f2();
            float[] fArr2 = new float[9];
            yVar.f257317a.getValues(fArr2);
            float f18 = fArr2[0];
            double d18 = f18 * f18;
            double d19 = fArr2[3];
            ((l45.n) m177317xc879b3f2).f397993a.m177310x5143ab24().m10952x4bb48fd8(1 / ((float) java.lang.Math.sqrt(d18 + (d19 * d19))));
        }
        bp4.k0 k0Var = this.f104718d;
        if (k0Var.A) {
            return;
        }
        yVar.f257320d.set(k0Var.f104743f.getContentRect());
    }
}
