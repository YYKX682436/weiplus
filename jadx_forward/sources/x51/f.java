package x51;

/* loaded from: classes11.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public x51.r f533528a;

    /* renamed from: b, reason: collision with root package name */
    public x51.s f533529b;

    /* renamed from: c, reason: collision with root package name */
    public x51.t f533530c;

    /* renamed from: d, reason: collision with root package name */
    public x51.o f533531d;

    /* renamed from: e, reason: collision with root package name */
    public x51.p f533532e;

    /* renamed from: f, reason: collision with root package name */
    public x51.l f533533f;

    public void a() {
        b(this.f533528a);
        b(this.f533529b);
        b(this.f533530c);
        b(this.f533531d);
        b(this.f533532e);
        b(this.f533533f);
    }

    public final void b(x51.g gVar) {
        if (gVar != null) {
            java.util.Iterator it = ((java.util.HashSet) gVar.f533539d).iterator();
            while (it.hasNext()) {
                gm0.j1.d().q(((java.lang.Integer) it.next()).intValue(), gVar);
            }
            gVar.f533540e = null;
        }
    }

    public boolean c(android.app.Activity activity, x51.r1 r1Var) {
        int i17 = r1Var.f533610a;
        if (i17 == 0 || r1Var.f533611b == 0) {
            return false;
        }
        switch (i17) {
            case 1:
                if (this.f533528a == null) {
                    this.f533528a = new x51.r(activity);
                }
                this.f533528a.f(r1Var);
                return true;
            case 2:
                if (this.f533529b == null) {
                    this.f533529b = new x51.s(activity);
                }
                this.f533529b.f(r1Var);
                return true;
            case 3:
                if (this.f533530c == null) {
                    this.f533530c = new x51.t(activity);
                }
                this.f533530c.f(r1Var);
                return true;
            case 4:
                if (this.f533531d == null) {
                    this.f533531d = new x51.o(activity);
                }
                this.f533531d.f(r1Var);
                return true;
            case 5:
                if (this.f533532e == null) {
                    this.f533532e = new x51.p(activity);
                }
                this.f533532e.f(r1Var);
                return true;
            case 6:
                if (this.f533533f == null) {
                    this.f533533f = new x51.l(activity);
                }
                this.f533533f.f(r1Var);
                return true;
            default:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseErrorHelper", "Unkown error type");
                return false;
        }
    }
}
