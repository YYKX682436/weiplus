package zp2;

/* loaded from: classes2.dex */
public abstract class b {
    public final java.util.ArrayList a(int i17, int i18, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf) {
        r45.d94 d94Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (i17 <= i18) {
            while (true) {
                in5.c cVar = (in5.c) kz5.n0.a0(c22848x6ddd90cf.m82898xfb7e5820(), i17);
                if (cVar != null) {
                    boolean z17 = false;
                    if (cVar instanceof wp2.b) {
                        wp2.b bVar = (wp2.b) cVar;
                        d94Var = bVar.f529921t;
                        r45.d94 d94Var2 = new r45.d94();
                        d94Var2.set(0, java.lang.Long.valueOf(bVar.getFeedObject().getFeedObject().m76784x5db1b11()));
                        bVar.f529921t = d94Var2;
                    } else {
                        d94Var = null;
                    }
                    if (d94Var != null) {
                        arrayList.add(d94Var);
                        z17 = true;
                    }
                    if (!z17) {
                        java.lang.Object w07 = c22848x6ddd90cf.w0(cVar.h());
                        zp2.a aVar = w07 instanceof zp2.a ? (zp2.a) w07 : null;
                        if (aVar != null) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 b17 = aVar.b();
                            if (b17 != null) {
                                arrayList2 = b(b17);
                            }
                            if (arrayList2.size() > 0) {
                                arrayList.addAll(arrayList2);
                            }
                        }
                    }
                }
                if (i17 == i18) {
                    break;
                }
                i17++;
            }
        }
        return arrayList;
    }

    public final java.util.ArrayList b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = recyclerView.mo7946xf939df19();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
        if (c22848x6ddd90cf != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager mo7951xfd37656d = recyclerView.mo7951xfd37656d();
            if (mo7951xfd37656d instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) mo7951xfd37656d;
                arrayList.addAll(a(c1162x665295de.w(), c1162x665295de.y(), recyclerView, c22848x6ddd90cf));
            } else if (mo7951xfd37656d instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) mo7951xfd37656d;
                arrayList.addAll(a(c1164x587b7ff1.u(new int[c1164x587b7ff1.f93453d])[0], c1164x587b7ff1.v(new int[c1164x587b7ff1.f93453d])[c1164x587b7ff1.f93453d - 1], recyclerView, c22848x6ddd90cf));
            }
        }
        return arrayList;
    }
}
