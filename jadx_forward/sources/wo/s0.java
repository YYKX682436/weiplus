package wo;

/* loaded from: classes12.dex */
public class s0 extends wo.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final wo.p f529330d;

    /* renamed from: e, reason: collision with root package name */
    public final int f529331e;

    public s0(int i17) {
        super(null);
        this.f529330d = wo.p.a();
        this.f529331e = i17;
    }

    @Override // wo.q0
    public java.lang.String b() {
        wo.p pVar = this.f529330d;
        java.util.Map map = pVar.f529305a;
        int i17 = this.f529331e;
        java.lang.String str = (java.lang.String) map.get(java.lang.Integer.valueOf(i17));
        if (str == null && !pVar.f529307c) {
            if (i17 == 256) {
                wo.x0.a(1064, 27, 1, true);
            } else if (i17 == 258) {
                wo.x0.a(1064, 25, 1, true);
            } else if (i17 == 259) {
                wo.x0.a(1064, 26, 1, true);
            }
        }
        return str;
    }

    @Override // wo.q0
    public void c(java.lang.String str) {
        this.f529330d.b(this.f529331e, str);
    }
}
