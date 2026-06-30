package oj;

/* loaded from: classes12.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final oj.f0 f427233d = new oj.f0();

    public f0() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.util.List f07 = r26.n0.f0(it, new java.lang.String[]{":"}, false, 0, 6, null);
        if (f07.size() == 2) {
            return kz5.z.C(new jz5.l[]{new jz5.l(f07.get(0), f07.get(1))});
        }
        oj.j.b("Matrix.MemoryInfoFactory", "ERROR : ".concat(it), new java.lang.Object[0]);
        return q26.g.f441373a;
    }
}
