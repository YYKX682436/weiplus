package ix3;

/* loaded from: classes.dex */
public final class y0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Set f377144d = kz5.z.D0(new java.lang.String[]{"Int", "Long", "Float", "String"});

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f377145e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f377146f = jz5.h.b(ix3.r0.f377075d);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final java.lang.String T6(r45.dp5 dp5Var) {
        java.lang.String str = "";
        if (dp5Var.m75939xb282bd08(2) == 3) {
            java.lang.String valueOf = java.lang.String.valueOf(dp5Var.m75945x2fec8307(0));
            java.util.List f07 = r26.n0.f0(valueOf, new java.lang.String[]{"_"}, false, 0, 6, null);
            if (f07.size() >= 3 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f07.get(0), "RepairerConfig")) {
                return !f377144d.contains(f07.get(f07.size() - 1)) ? valueOf : "";
            }
            return valueOf;
        }
        if (dp5Var.m75939xb282bd08(2) == 2) {
            java.lang.String valueOf2 = java.lang.String.valueOf(dp5Var.m75945x2fec8307(0));
            return !r26.i0.y(valueOf2, "RepairerActivity_", false) ? valueOf2 : "";
        }
        if (dp5Var.m75939xb282bd08(2) == 1) {
            java.lang.String valueOf3 = java.lang.String.valueOf(dp5Var.m75945x2fec8307(0));
            if (!r26.i0.y(valueOf3, "RepairerGroup_", false)) {
                return valueOf3;
            }
            java.util.LinkedList<r45.dp5> m75941xfb821914 = dp5Var.m75941xfb821914(5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getSubItemList(...)");
            for (r45.dp5 dp5Var2 : m75941xfb821914) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dp5Var2);
                str = T6(dp5Var2);
                if (!r26.n0.N(str)) {
                    break;
                }
            }
        }
        return str;
    }

    public final boolean U6(r45.dp5 dp5Var) {
        java.util.Iterator it = dp5Var.m75941xfb821914(5).iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        boolean z17 = true;
        while (it.hasNext()) {
            r45.dp5 dp5Var2 = (r45.dp5) it.next();
            if (dp5Var2.m75939xb282bd08(2) == 1) {
                if (U6(dp5Var2)) {
                    it.remove();
                } else {
                    z17 = false;
                }
            } else if (dp5Var2.m75939xb282bd08(7) == 1) {
                z17 = false;
            } else {
                it.remove();
            }
        }
        return z17;
    }

    public final void V6(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.dp5 dp5Var = (r45.dp5) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(dp5Var.m75941xfb821914(5), "getSubItemList(...)");
            if (!r3.isEmpty()) {
                java.util.LinkedList m75941xfb821914 = dp5Var.m75941xfb821914(5);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getSubItemList(...)");
                V6(m75941xfb821914);
            }
        }
        java.util.Collections.sort(list, new ix3.x0());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = O6();
        if (O6 != null) {
            v65.i.b(O6, null, new ix3.v0(this, null), 1, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.z3(m158354x19263085(), ix3.w0.f377125d);
    }
}
