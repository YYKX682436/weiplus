package t70;

/* loaded from: classes12.dex */
public class f implements gm0.e2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f497563d = new java.util.HashMap();

    public f() {
        java.util.Iterator it = m11.k0.f404259a.iterator();
        while (it.hasNext()) {
            m11.j0 j0Var = (m11.j0) it.next();
            this.f497563d.put(java.lang.Integer.valueOf(j0Var.f404252a.hashCode()), new t70.e(this, j0Var));
        }
    }

    @Override // gm0.e2
    public java.util.HashMap U5() {
        return this.f497563d;
    }
}
