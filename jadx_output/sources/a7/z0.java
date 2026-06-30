package a7;

/* loaded from: classes13.dex */
public class z0 {

    /* renamed from: e, reason: collision with root package name */
    public static final a7.y0 f1880e = new a7.y0();

    /* renamed from: f, reason: collision with root package name */
    public static final a7.p0 f1881f = new a7.w0();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f1882a;

    /* renamed from: b, reason: collision with root package name */
    public final a7.y0 f1883b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f1884c;

    /* renamed from: d, reason: collision with root package name */
    public final m3.e f1885d;

    public z0(m3.e eVar) {
        a7.y0 y0Var = f1880e;
        this.f1882a = new java.util.ArrayList();
        this.f1884c = new java.util.HashSet();
        this.f1885d = eVar;
        this.f1883b = y0Var;
    }

    public final a7.p0 a(a7.x0 x0Var) {
        a7.p0 b17 = x0Var.f1879c.b(this);
        q7.n.b(b17);
        return b17;
    }

    public synchronized a7.p0 b(java.lang.Class cls, java.lang.Class cls2) {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) this.f1882a).iterator();
            boolean z17 = false;
            while (true) {
                boolean z18 = true;
                if (!it.hasNext()) {
                    break;
                }
                a7.x0 x0Var = (a7.x0) it.next();
                if (((java.util.HashSet) this.f1884c).contains(x0Var)) {
                    z17 = true;
                } else {
                    if (!x0Var.f1877a.isAssignableFrom(cls) || !x0Var.f1878b.isAssignableFrom(cls2)) {
                        z18 = false;
                    }
                    if (z18) {
                        ((java.util.HashSet) this.f1884c).add(x0Var);
                        arrayList.add(a(x0Var));
                        ((java.util.HashSet) this.f1884c).remove(x0Var);
                    }
                }
            }
            if (arrayList.size() > 1) {
                a7.y0 y0Var = this.f1883b;
                m3.e eVar = this.f1885d;
                y0Var.getClass();
                return new a7.v0(arrayList, eVar);
            }
            if (arrayList.size() == 1) {
                return (a7.p0) arrayList.get(0);
            }
            if (!z17) {
                throw new com.bumptech.glide.j(cls, cls2);
            }
            return f1881f;
        } catch (java.lang.Throwable th6) {
            ((java.util.HashSet) this.f1884c).clear();
            throw th6;
        }
    }

    public synchronized java.util.List c(java.lang.Class cls) {
        java.util.ArrayList arrayList;
        try {
            arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) this.f1882a).iterator();
            while (it.hasNext()) {
                a7.x0 x0Var = (a7.x0) it.next();
                if (!((java.util.HashSet) this.f1884c).contains(x0Var) && x0Var.f1877a.isAssignableFrom(cls)) {
                    ((java.util.HashSet) this.f1884c).add(x0Var);
                    arrayList.add(a(x0Var));
                    ((java.util.HashSet) this.f1884c).remove(x0Var);
                }
            }
        } catch (java.lang.Throwable th6) {
            ((java.util.HashSet) this.f1884c).clear();
            throw th6;
        }
        return arrayList;
    }

    public synchronized java.util.List d(java.lang.Class cls) {
        java.util.ArrayList arrayList;
        arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) this.f1882a).iterator();
        while (it.hasNext()) {
            a7.x0 x0Var = (a7.x0) it.next();
            if (!arrayList.contains(x0Var.f1878b) && x0Var.f1877a.isAssignableFrom(cls)) {
                arrayList.add(x0Var.f1878b);
            }
        }
        return arrayList;
    }
}
