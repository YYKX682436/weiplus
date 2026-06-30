package u21;

/* loaded from: classes12.dex */
public class k implements gm0.e2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f505498d = new java.util.HashMap();

    public k() {
        java.util.Iterator it = t21.b3.f496239a.iterator();
        while (it.hasNext()) {
            t21.a3 a3Var = (t21.a3) it.next();
            this.f505498d.put(java.lang.Integer.valueOf(a3Var.f496234a.hashCode()), new u21.i(this, a3Var));
        }
        this.f505498d.put(-1315830156, new u21.j(this));
    }

    @Override // gm0.e2
    public java.util.HashMap U5() {
        return this.f505498d;
    }
}
