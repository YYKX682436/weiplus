package cn2;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final cn2.l f125101a = new cn2.l();

    /* renamed from: b, reason: collision with root package name */
    public static final int f125102b;

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f125103c;

    static {
        ae2.in inVar = ae2.in.f85221a;
        f125102b = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85367o5).mo141623x754a37bb()).r()).intValue();
        f125103c = new int[]{14, 17, 15, 16, 20};
    }

    public final java.util.LinkedList a(dk2.zf liveMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveMsg, "liveMsg");
        int i17 = f125102b;
        if (i17 == -1) {
            r45.xn1 r17 = liveMsg.r();
            java.util.LinkedList m75941xfb821914 = r17 != null ? r17.m75941xfb821914(11) : null;
            return m75941xfb821914 == null ? new java.util.LinkedList() : m75941xfb821914;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (i17 == -2) {
            r45.yl1 yl1Var = new r45.yl1();
            yl1Var.set(0, 8);
            yl1Var.set(4, "隐身");
            linkedList.add(yl1Var);
            return linkedList;
        }
        if (i17 != -3) {
            r45.yl1 yl1Var2 = new r45.yl1();
            yl1Var2.set(2, java.lang.Integer.valueOf(i17));
            yl1Var2.set(0, 2);
            linkedList.add(yl1Var2);
            return linkedList;
        }
        r45.yl1 yl1Var3 = new r45.yl1();
        yl1Var3.set(0, 8);
        yl1Var3.set(4, "隐身");
        linkedList.add(yl1Var3);
        r45.yl1 yl1Var4 = new r45.yl1();
        yl1Var4.set(2, java.lang.Integer.valueOf(i17));
        yl1Var4.set(0, 2);
        linkedList.add(yl1Var4);
        return linkedList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final jz5.l b(dk2.zf liveMsg) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveMsg, "liveMsg");
        if (liveMsg.mo124533xfb85f7b0() != 10005) {
            if (liveMsg.mo124533xfb85f7b0() != 20031) {
                return new jz5.l(java.lang.Boolean.FALSE, -1);
            }
            java.lang.Object D = liveMsg.D();
            r3 = D instanceof r45.qi1 ? (r45.qi1) D : null;
            return new jz5.l(java.lang.Boolean.TRUE, java.lang.Integer.valueOf(r3 != null ? r3.m75939xb282bd08(2) : 0));
        }
        java.util.LinkedList a17 = a(liveMsg);
        java.util.Iterator it = a17.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.yl1) obj).m75939xb282bd08(0) == 8) {
                break;
            }
        }
        boolean z17 = obj != null;
        java.util.Iterator it6 = a17.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            if (kz5.z.F(f125103c, ((r45.yl1) next).m75939xb282bd08(0))) {
                r3 = next;
                break;
            }
        }
        int i17 = r3 != null ? 1 : 0;
        if (z17 || i17 != 0) {
            return new jz5.l(java.lang.Boolean.FALSE, -1);
        }
        return new jz5.l(java.lang.Boolean.TRUE, java.lang.Integer.valueOf(zl2.r4.f555483a.r0(a17)));
    }

    public final void c(int i17, boolean z17) {
        if (zl2.r4.f555483a.w1()) {
            cl0.g gVar = new cl0.g();
            gVar.o("type", i17);
            gVar.o("notice_type", z17 ? 2 : 1);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f409928z1, gVar.toString(), null, 4, null);
        }
    }
}
