package t21;

/* loaded from: classes12.dex */
public class s1 implements m11.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dn.h f496484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t21.t1 f496485b;

    public s1(t21.t1 t1Var, dn.h hVar) {
        this.f496485b = t1Var;
        this.f496484a = hVar;
    }

    @Override // m11.a0
    public void a(int i17, int i18, long j17, java.lang.String str) {
        t21.t1 t1Var = this.f496485b;
        if (i17 != 4 || i18 != 102) {
            t21.r1 r1Var = t1Var.f496490d;
            dn.h hVar = r1Var.f496468t;
            if (hVar != null) {
                r1Var.K(hVar);
            } else {
                r1Var.K(this.f496484a);
            }
        }
        t1Var.f496490d.f496461m.a(i17, i18, j17, str);
    }
}
