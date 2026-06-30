package f16;

/* loaded from: classes15.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f340320a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f340321b;

    /* renamed from: c, reason: collision with root package name */
    public jz5.l f340322c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f16.a1 f340323d;

    public z0(f16.a1 a1Var, java.lang.String functionName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(functionName, "functionName");
        this.f340323d = a1Var;
        this.f340320a = functionName;
        this.f340321b = new java.util.ArrayList();
        this.f340322c = new jz5.l(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2967xc3bba14a, null);
    }

    public final void a(java.lang.String type, f16.k... qualifiers) {
        f16.e1 e1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qualifiers, "qualifiers");
        java.util.List list = this.f340321b;
        if (qualifiers.length == 0) {
            e1Var = null;
        } else {
            kz5.v0 v0Var = new kz5.v0(new kz5.y(qualifiers));
            int d17 = kz5.b1.d(kz5.d0.q(v0Var, 10));
            if (d17 < 16) {
                d17 = 16;
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
            java.util.Iterator it = v0Var.iterator();
            while (true) {
                kz5.w0 w0Var = (kz5.w0) it;
                if (!w0Var.hasNext()) {
                    break;
                }
                kz5.u0 u0Var = (kz5.u0) w0Var.next();
                linkedHashMap.put(java.lang.Integer.valueOf(u0Var.f395548a), (f16.k) u0Var.f395549b);
            }
            e1Var = new f16.e1(linkedHashMap);
        }
        ((java.util.ArrayList) list).add(new jz5.l(type, e1Var));
    }

    public final void b(java.lang.String type, f16.k... qualifiers) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qualifiers, "qualifiers");
        kz5.v0 v0Var = new kz5.v0(new kz5.y(qualifiers));
        int d17 = kz5.b1.d(kz5.d0.q(v0Var, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        java.util.Iterator it = v0Var.iterator();
        while (true) {
            kz5.w0 w0Var = (kz5.w0) it;
            if (!w0Var.hasNext()) {
                this.f340322c = new jz5.l(type, new f16.e1(linkedHashMap));
                return;
            } else {
                kz5.u0 u0Var = (kz5.u0) w0Var.next();
                linkedHashMap.put(java.lang.Integer.valueOf(u0Var.f395548a), (f16.k) u0Var.f395549b);
            }
        }
    }

    public final void c(w16.e type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        java.lang.String h17 = type.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getDesc(...)");
        this.f340322c = new jz5.l(h17, null);
    }
}
