package d04;

/* loaded from: classes8.dex */
public final class x2 implements d04.j3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d04.y2 f307086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d04.j3 f307087b;

    public x2(d04.y2 y2Var, d04.j3 j3Var) {
        this.f307086a = y2Var;
        this.f307087b = j3Var;
    }

    @Override // d04.j3
    public void a(int i17, int i18) {
        d04.y2 y2Var = this.f307086a;
        java.lang.Integer num = (java.lang.Integer) y2Var.f307100f.get(java.lang.Integer.valueOf(i17));
        if (num != null) {
            y2Var.f307098d = num.intValue();
        }
        this.f307087b.a(i17, i18);
    }

    @Override // d04.j3
    public void b(int i17) {
        this.f307087b.b(i17);
    }
}
