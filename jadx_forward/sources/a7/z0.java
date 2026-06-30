package a7;

/* loaded from: classes13.dex */
public class z0 {

    /* renamed from: e, reason: collision with root package name */
    public static final a7.y0 f83413e = new a7.y0();

    /* renamed from: f, reason: collision with root package name */
    public static final a7.p0 f83414f = new a7.w0();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f83415a;

    /* renamed from: b, reason: collision with root package name */
    public final a7.y0 f83416b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f83417c;

    /* renamed from: d, reason: collision with root package name */
    public final m3.e f83418d;

    public z0(m3.e eVar) {
        a7.y0 y0Var = f83413e;
        this.f83415a = new java.util.ArrayList();
        this.f83417c = new java.util.HashSet();
        this.f83418d = eVar;
        this.f83416b = y0Var;
    }

    public final a7.p0 a(a7.x0 x0Var) {
        a7.p0 b17 = x0Var.f83412c.b(this);
        q7.n.b(b17);
        return b17;
    }

    public synchronized a7.p0 b(java.lang.Class cls, java.lang.Class cls2) {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) this.f83415a).iterator();
            boolean z17 = false;
            while (true) {
                boolean z18 = true;
                if (!it.hasNext()) {
                    break;
                }
                a7.x0 x0Var = (a7.x0) it.next();
                if (((java.util.HashSet) this.f83417c).contains(x0Var)) {
                    z17 = true;
                } else {
                    if (!x0Var.f83410a.isAssignableFrom(cls) || !x0Var.f83411b.isAssignableFrom(cls2)) {
                        z18 = false;
                    }
                    if (z18) {
                        ((java.util.HashSet) this.f83417c).add(x0Var);
                        arrayList.add(a(x0Var));
                        ((java.util.HashSet) this.f83417c).remove(x0Var);
                    }
                }
            }
            if (arrayList.size() > 1) {
                a7.y0 y0Var = this.f83416b;
                m3.e eVar = this.f83418d;
                y0Var.getClass();
                return new a7.v0(arrayList, eVar);
            }
            if (arrayList.size() == 1) {
                return (a7.p0) arrayList.get(0);
            }
            if (!z17) {
                throw new com.p147xb1cd08cc.p148x5de23a5.j(cls, cls2);
            }
            return f83414f;
        } catch (java.lang.Throwable th6) {
            ((java.util.HashSet) this.f83417c).clear();
            throw th6;
        }
    }

    public synchronized java.util.List c(java.lang.Class cls) {
        java.util.ArrayList arrayList;
        try {
            arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) this.f83415a).iterator();
            while (it.hasNext()) {
                a7.x0 x0Var = (a7.x0) it.next();
                if (!((java.util.HashSet) this.f83417c).contains(x0Var) && x0Var.f83410a.isAssignableFrom(cls)) {
                    ((java.util.HashSet) this.f83417c).add(x0Var);
                    arrayList.add(a(x0Var));
                    ((java.util.HashSet) this.f83417c).remove(x0Var);
                }
            }
        } catch (java.lang.Throwable th6) {
            ((java.util.HashSet) this.f83417c).clear();
            throw th6;
        }
        return arrayList;
    }

    public synchronized java.util.List d(java.lang.Class cls) {
        java.util.ArrayList arrayList;
        arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) this.f83415a).iterator();
        while (it.hasNext()) {
            a7.x0 x0Var = (a7.x0) it.next();
            if (!arrayList.contains(x0Var.f83411b) && x0Var.f83410a.isAssignableFrom(cls)) {
                arrayList.add(x0Var.f83411b);
            }
        }
        return arrayList;
    }
}
