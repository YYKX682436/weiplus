package yi2;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f544024a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f544025b;

    /* renamed from: c, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f544026c;

    public b(android.view.View root, gk2.e liveData, p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 p2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        this.f544024a = liveData;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f544025b = arrayList;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) root.findViewById(com.p314xaae8f345.mm.R.id.r6_);
        this.f544026c = c1163xf1deaba4;
        c1163xf1deaba4.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.pk.p1510xd1075a44.C14242xa7b26a80(root.getContext()));
        c1163xf1deaba4.mo7960x6cab2c8d(new yi2.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.pk.p1509xbeeb310a.C14238xf227e879(liveData, null, 2, null), arrayList));
        if (p2Var != null) {
            c1163xf1deaba4.N(p2Var);
        }
    }

    public final void a() {
        java.util.ArrayList arrayList;
        java.util.List list;
        java.util.List list2;
        java.lang.Object obj;
        java.lang.Object obj2;
        dk2.u4 u4Var = ((mm2.o4) this.f544024a.a(mm2.o4.class)).Z;
        if (u4Var != null && u4Var.f315693g == 2) {
            dk2.u4 u4Var2 = ((mm2.o4) this.f544024a.a(mm2.o4.class)).Z;
            if (u4Var2 != null && u4Var2.f()) {
                this.f544025b.clear();
                dk2.u4 u4Var3 = ((mm2.o4) this.f544024a.a(mm2.o4.class)).Z;
                if (u4Var3 != null && (list2 = u4Var3.f315696j) != null) {
                    this.f544025b.add(new vi2.c(fj2.k.f344708d));
                    r45.r22 r22Var = (r45.r22) kz5.n0.a0(list2, 0);
                    if (r22Var != null) {
                        java.util.LinkedList<r45.wk6> m75941xfb821914 = r22Var.m75941xfb821914(0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getMembers(...)");
                        for (r45.wk6 wk6Var : m75941xfb821914) {
                            km2.q a76 = ((mm2.o4) this.f544024a.a(mm2.o4.class)).a7();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a76 != null ? a76.f390703a : null, wk6Var.m75945x2fec8307(1))) {
                                java.util.ArrayList arrayList2 = this.f544025b;
                                km2.q a77 = ((mm2.o4) this.f544024a.a(mm2.o4.class)).a7();
                                arrayList2.add(new vi2.e(a77 != null ? a77.f390720r : null));
                            } else {
                                java.util.List list3 = ((mm2.o4) this.f544024a.a(mm2.o4.class)).f410857s;
                                if (list3 != null) {
                                    synchronized (list3) {
                                        java.util.Iterator it = list3.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                obj2 = it.next();
                                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj2).f390703a, wk6Var.m75945x2fec8307(1))) {
                                                    break;
                                                }
                                            } else {
                                                obj2 = null;
                                                break;
                                            }
                                        }
                                    }
                                    km2.q qVar = (km2.q) obj2;
                                    if (qVar != null) {
                                        this.f544025b.add(new vi2.e(qVar.f390720r));
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                    this.f544025b.add(new vi2.c(fj2.k.f344709e));
                    r45.r22 r22Var2 = (r45.r22) kz5.n0.a0(list2, 1);
                    if (r22Var2 != null) {
                        java.util.LinkedList<r45.wk6> m75941xfb8219142 = r22Var2.m75941xfb821914(0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getMembers(...)");
                        for (r45.wk6 wk6Var2 : m75941xfb8219142) {
                            km2.q a78 = ((mm2.o4) this.f544024a.a(mm2.o4.class)).a7();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a78 != null ? a78.f390703a : null, wk6Var2.m75945x2fec8307(1))) {
                                java.util.ArrayList arrayList3 = this.f544025b;
                                km2.q a79 = ((mm2.o4) this.f544024a.a(mm2.o4.class)).a7();
                                arrayList3.add(new vi2.e(a79 != null ? a79.f390720r : null));
                            } else {
                                java.util.List list4 = ((mm2.o4) this.f544024a.a(mm2.o4.class)).f410857s;
                                if (list4 != null) {
                                    synchronized (list4) {
                                        java.util.Iterator it6 = list4.iterator();
                                        while (true) {
                                            if (it6.hasNext()) {
                                                obj = it6.next();
                                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj).f390703a, wk6Var2.m75945x2fec8307(1))) {
                                                    break;
                                                }
                                            } else {
                                                obj = null;
                                                break;
                                            }
                                        }
                                    }
                                    km2.q qVar2 = (km2.q) obj;
                                    if (qVar2 != null) {
                                        this.f544025b.add(new vi2.e(qVar2.f390720r));
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = this.f544026c.mo7946xf939df19();
                if (mo7946xf939df19 != null) {
                    mo7946xf939df19.m8146xced61ae5();
                    return;
                }
                return;
            }
        }
        this.f544025b.clear();
        gk2.e eVar = this.f544024a;
        if (eVar == null || (list = ((mm2.o4) eVar.a(mm2.o4.class)).f410857s) == null) {
            arrayList = null;
        } else {
            synchronized (list) {
                arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it7 = list.iterator();
                while (it7.hasNext()) {
                    arrayList.add(new vi2.e(((km2.q) it7.next()).f390720r));
                }
            }
        }
        java.util.ArrayList arrayList4 = arrayList instanceof java.util.ArrayList ? arrayList : null;
        if (arrayList4 != null) {
            this.f544025b.addAll(arrayList4);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = this.f544026c.mo7946xf939df19();
        if (mo7946xf939df192 != null) {
            mo7946xf939df192.m8146xced61ae5();
        }
    }
}
