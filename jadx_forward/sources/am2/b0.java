package am2;

/* loaded from: classes10.dex */
public final class b0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.s0 f90164d;

    public b0(am2.s0 s0Var) {
        this.f90164d = s0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int i18;
        df2.wy wyVar;
        int i19;
        r45.r22 r22Var;
        int i27;
        int itemId = menuItem.getItemId();
        am2.s0 s0Var = this.f90164d;
        if (itemId == 1005) {
            ((mm2.o4) s0Var.f90275b.a(mm2.o4.class)).Z = new dk2.u4(null, 0L, 0, 1, 2, null, 0, 0, null, null, null, null, 0, 0, 0, 32743, null);
            s0Var.f90276c.j(qo0.b.f446954u4, null);
            pm0.v.V(5000L, new am2.y(s0Var));
            return;
        }
        if (menuItem.getItemId() == 1006) {
            ((mm2.o4) s0Var.f90275b.a(mm2.o4.class)).Z = new dk2.u4(null, 0L, 0, 2, 2, null, 0, 0, null, null, null, null, 0, 0, 0, 32743, null);
            s0Var.f90276c.j(qo0.b.f446954u4, null);
            pm0.v.V(5000L, new am2.x(s0Var));
            return;
        }
        if (menuItem.getItemId() == 1007) {
            ((mm2.o4) s0Var.f90275b.a(mm2.o4.class)).Z = new dk2.u4(null, 0L, 0, 3, 2, null, 0, 0, null, null, null, null, 0, 0, 0, 32743, null);
            s0Var.f90276c.j(qo0.b.f446954u4, null);
            pm0.v.V(5000L, new am2.w(s0Var));
            return;
        }
        java.lang.Class<mm2.y2> cls = mm2.y2.class;
        int i28 = 0;
        int i29 = 1;
        if (menuItem.getItemId() == 1023) {
            s0Var.getClass();
            am2.s0.f90273e = true;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            r45.r22 r22Var2 = new r45.r22();
            r22Var2.set(1, 666666666L);
            r22Var2.set(3, java.lang.Long.valueOf(r22Var2.m75942xfb822ef2(1)));
            r22Var2.set(2, 1);
            arrayList2.add(r22Var2);
            r45.r22 r22Var3 = new r45.r22();
            r22Var3.set(1, 7777777L);
            r22Var3.set(3, java.lang.Long.valueOf(r22Var3.m75942xfb822ef2(1)));
            arrayList2.add(r22Var3);
            gk2.e eVar = s0Var.f90275b;
            java.util.List list = ((mm2.o4) eVar.a(mm2.o4.class)).f410860v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
            int i37 = 0;
            for (java.lang.Object obj : list) {
                int i38 = i37 + 1;
                if (i37 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                km2.q qVar = (km2.q) obj;
                if (((mm2.y2) eVar.a(cls)).b7(qVar.f390725w)) {
                    java.util.LinkedList m75941xfb821914 = r22Var2.m75941xfb821914(i28);
                    r45.wk6 wk6Var = new r45.wk6();
                    wk6Var.set(i29, qVar.f390703a);
                    wk6Var.set(0, qVar.f390705c);
                    m75941xfb821914.add(wk6Var);
                } else {
                    java.util.LinkedList m75941xfb8219142 = r22Var3.m75941xfb821914(i28);
                    r45.wk6 wk6Var2 = new r45.wk6();
                    wk6Var2.set(1, qVar.f390703a);
                    wk6Var2.set(0, qVar.f390705c);
                    m75941xfb8219142.add(wk6Var2);
                }
                java.lang.String str = qVar.f390705c;
                java.lang.String str2 = qVar.f390703a;
                java.lang.String str3 = str2 == null ? "" : str2;
                r45.r22 r22Var4 = r22Var3;
                e06.n nVar = new e06.n(0L, 10000000L);
                c06.d dVar = c06.e.f119249d;
                arrayList.add(new km2.k(str, str3, e06.p.k(nVar, dVar), e06.p.j(new e06.k(0, 10), dVar), false, null, 0L, false, e06.p.k(new e06.n(0L, 10000000L), dVar), null, 0, 1776, null));
                r22Var3 = r22Var4;
                cls = cls;
                i37 = i38;
                i28 = 0;
                i29 = 1;
            }
            ((mm2.o4) eVar.a(mm2.o4.class)).Z = new dk2.u4(null, 0L, 0, 1, 2, arrayList, 2, 0, null, arrayList2, null, null, 2, 0, 0, 28039, null);
            s0Var.f90276c.j(qo0.b.f446954u4, null);
            pm0.v.V(5000L, new am2.q0(s0Var));
            pm0.v.V(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d, am2.r0.f90269d);
            return;
        }
        java.lang.Class<mm2.y2> cls2 = cls;
        if (menuItem.getItemId() == 1024) {
            s0Var.getClass();
            am2.s0.f90273e = true;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            long k17 = e06.p.k(new e06.n(0L, 100000L), c06.e.f119249d);
            r45.r22 r22Var5 = new r45.r22();
            r22Var5.set(1, java.lang.Long.valueOf(k17));
            r22Var5.set(3, java.lang.Long.valueOf(r22Var5.m75942xfb822ef2(1)));
            r22Var5.set(2, 3);
            arrayList4.add(r22Var5);
            r45.r22 r22Var6 = new r45.r22();
            r22Var6.set(1, java.lang.Long.valueOf(k17));
            r22Var6.set(3, java.lang.Long.valueOf(r22Var6.m75942xfb822ef2(1)));
            r22Var6.set(2, 3);
            arrayList4.add(r22Var6);
            gk2.e eVar2 = s0Var.f90275b;
            java.util.List list2 = ((mm2.o4) eVar2.a(mm2.o4.class)).f410860v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-audienceLinkMicUserList>(...)");
            int i39 = 0;
            for (java.lang.Object obj2 : list2) {
                int i47 = i39 + 1;
                if (i39 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                km2.q qVar2 = (km2.q) obj2;
                java.lang.Class<mm2.y2> cls3 = cls2;
                if (((mm2.y2) eVar2.a(cls3)).b7(qVar2.f390725w)) {
                    java.util.LinkedList m75941xfb8219143 = r22Var5.m75941xfb821914(0);
                    r45.wk6 wk6Var3 = new r45.wk6();
                    r22Var = r22Var5;
                    wk6Var3.set(1, qVar2.f390703a);
                    wk6Var3.set(0, qVar2.f390705c);
                    m75941xfb8219143.add(wk6Var3);
                    i27 = 0;
                } else {
                    r22Var = r22Var5;
                    java.util.LinkedList m75941xfb8219144 = r22Var6.m75941xfb821914(0);
                    r45.wk6 wk6Var4 = new r45.wk6();
                    wk6Var4.set(1, qVar2.f390703a);
                    i27 = 0;
                    wk6Var4.set(0, qVar2.f390705c);
                    m75941xfb8219144.add(wk6Var4);
                }
                java.lang.String str4 = qVar2.f390705c;
                java.lang.String str5 = qVar2.f390703a;
                arrayList3.add(new km2.k(str4, str5 == null ? "" : str5, k17, e06.p.j(new e06.k(i27, 10), c06.e.f119249d), false, null, 0L, false, k17, null, 0, 1776, null));
                r22Var5 = r22Var;
                cls2 = cls3;
                i39 = i47;
            }
            ((mm2.o4) eVar2.a(mm2.o4.class)).Z = new dk2.u4(null, 0L, 0, 3, 2, arrayList3, 2, 0, null, arrayList4, null, null, 2, 0, 0, 28039, null);
            s0Var.f90276c.j(qo0.b.f446954u4, null);
            pm0.v.V(5000L, new am2.o0(s0Var));
            pm0.v.V(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d, am2.p0.f90261d);
            return;
        }
        if (menuItem.getItemId() == 1025) {
            s0Var.getClass();
            am2.s0.f90273e = true;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            r45.r22 r22Var7 = new r45.r22();
            r22Var7.set(1, 666666666L);
            r22Var7.set(3, java.lang.Long.valueOf(r22Var7.m75942xfb822ef2(1)));
            java.util.LinkedList m75941xfb8219145 = r22Var7.m75941xfb821914(0);
            r45.wk6 wk6Var5 = new r45.wk6();
            gk2.e eVar3 = s0Var.f90275b;
            wk6Var5.set(1, ((mm2.e1) eVar3.a(mm2.e1.class)).f410520q.f461834n);
            wk6Var5.set(0, ((mm2.c1) eVar3.a(mm2.c1.class)).f410385o);
            m75941xfb8219145.add(wk6Var5);
            r22Var7.set(2, 1);
            arrayList6.add(r22Var7);
            arrayList5.add(new km2.k(((mm2.c1) eVar3.a(mm2.c1.class)).f410385o, ((mm2.e1) eVar3.a(mm2.e1.class)).f410520q.f461834n, 9900000000L, e06.p.j(new e06.k(0, 10), c06.e.f119249d), false, null, 0L, false, 9900000000L, null, 0, 1776, null));
            java.util.List list3 = ((mm2.o4) eVar3.a(mm2.o4.class)).f410860v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list3, "<get-audienceLinkMicUserList>(...)");
            int i48 = 0;
            for (java.lang.Object obj3 : list3) {
                int i49 = i48 + 1;
                if (i48 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                km2.q qVar3 = (km2.q) obj3;
                r45.r22 r22Var8 = new r45.r22();
                r22Var8.set(1, 7777777L);
                r22Var8.set(3, java.lang.Long.valueOf(r22Var8.m75942xfb822ef2(1)));
                java.util.LinkedList m75941xfb8219146 = r22Var8.m75941xfb821914(0);
                r45.wk6 wk6Var6 = new r45.wk6();
                wk6Var6.set(1, qVar3.f390703a);
                wk6Var6.set(0, qVar3.f390705c);
                m75941xfb8219146.add(wk6Var6);
                arrayList6.add(r22Var8);
                java.lang.String str6 = qVar3.f390705c;
                java.lang.String str7 = qVar3.f390703a;
                java.lang.String str8 = str7 == null ? "" : str7;
                e06.n nVar2 = new e06.n(0L, 10000000L);
                c06.d dVar2 = c06.e.f119249d;
                arrayList5.add(new km2.k(str6, str8, e06.p.k(nVar2, dVar2), e06.p.j(new e06.k(0, 10), dVar2), false, null, 0L, false, e06.p.k(new e06.n(0L, 10000000L), dVar2), null, 0, 1776, null));
                i48 = i49;
            }
            ((mm2.o4) eVar3.a(mm2.o4.class)).Z = new dk2.u4(null, 0L, 0, 1, 2, arrayList5, 1, 0, null, arrayList6, null, null, 1, 0, 0, 28039, null);
            s0Var.f90276c.j(qo0.b.f446954u4, null);
            pm0.v.V(5000L, new am2.i0(s0Var));
            pm0.v.V(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d, am2.j0.f90232d);
            return;
        }
        if (menuItem.getItemId() == 1026) {
            s0Var.getClass();
            am2.s0.f90273e = true;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            e06.n nVar3 = new e06.n(0L, 100000L);
            c06.d dVar3 = c06.e.f119249d;
            long k18 = e06.p.k(nVar3, dVar3);
            r45.r22 r22Var9 = new r45.r22();
            r22Var9.set(1, java.lang.Long.valueOf(k18));
            r22Var9.set(3, java.lang.Long.valueOf(r22Var9.m75942xfb822ef2(1)));
            java.util.LinkedList m75941xfb8219147 = r22Var9.m75941xfb821914(0);
            r45.wk6 wk6Var7 = new r45.wk6();
            gk2.e eVar4 = s0Var.f90275b;
            wk6Var7.set(1, ((mm2.e1) eVar4.a(mm2.e1.class)).f410520q.f461834n);
            wk6Var7.set(0, ((mm2.c1) eVar4.a(mm2.c1.class)).f410385o);
            m75941xfb8219147.add(wk6Var7);
            r22Var9.set(2, 3);
            arrayList8.add(r22Var9);
            arrayList7.add(new km2.k(((mm2.c1) eVar4.a(mm2.c1.class)).f410385o, ((mm2.e1) eVar4.a(mm2.e1.class)).f410520q.f461834n, k18, e06.p.j(new e06.k(0, 10), dVar3), false, null, 0L, false, k18, null, 0, 1776, null));
            java.util.List list4 = ((mm2.o4) eVar4.a(mm2.o4.class)).f410860v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list4, "<get-audienceLinkMicUserList>(...)");
            int i57 = 0;
            for (java.lang.Object obj4 : list4) {
                int i58 = i57 + 1;
                if (i57 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                km2.q qVar4 = (km2.q) obj4;
                r45.r22 r22Var10 = new r45.r22();
                r22Var10.set(1, java.lang.Long.valueOf(k18));
                r22Var10.set(3, java.lang.Long.valueOf(r22Var10.m75942xfb822ef2(1)));
                java.util.LinkedList m75941xfb8219148 = r22Var10.m75941xfb821914(0);
                r45.wk6 wk6Var8 = new r45.wk6();
                wk6Var8.set(1, qVar4.f390703a);
                wk6Var8.set(0, qVar4.f390705c);
                m75941xfb8219148.add(wk6Var8);
                arrayList8.add(r22Var10);
                arrayList7.add(new km2.k(qVar4.f390705c, ((mm2.e1) eVar4.a(mm2.e1.class)).f410520q.f461834n, k18, e06.p.j(new e06.k(0, 10), c06.e.f119249d), false, null, 0L, false, k18, null, 0, 1776, null));
                i57 = i58;
            }
            ((mm2.o4) eVar4.a(mm2.o4.class)).Z = new dk2.u4(null, 0L, 0, 3, 2, arrayList7, 1, 0, null, arrayList8, null, null, 2, 0, 0, 28039, null);
            s0Var.f90276c.j(qo0.b.f446954u4, null);
            pm0.v.V(5000L, new am2.g0(s0Var));
            pm0.v.V(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d, am2.h0.f90211d);
            return;
        }
        if (menuItem.getItemId() == 1016) {
            s0Var.getClass();
            am2.s0.f90273e = true;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            r45.r22 r22Var11 = new r45.r22();
            r22Var11.set(1, 666666666L);
            r22Var11.set(3, java.lang.Long.valueOf(r22Var11.m75942xfb822ef2(1)));
            java.util.LinkedList m75941xfb8219149 = r22Var11.m75941xfb821914(0);
            r45.wk6 wk6Var9 = new r45.wk6();
            gk2.e eVar5 = s0Var.f90275b;
            wk6Var9.set(1, ((mm2.e1) eVar5.a(mm2.e1.class)).f410520q.f461834n);
            wk6Var9.set(0, ((mm2.c1) eVar5.a(mm2.c1.class)).f410385o);
            m75941xfb8219149.add(wk6Var9);
            r22Var11.set(2, 1);
            arrayList10.add(r22Var11);
            r45.r22 r22Var12 = new r45.r22();
            r22Var12.set(1, 7777777L);
            r22Var12.set(3, java.lang.Long.valueOf(r22Var12.m75942xfb822ef2(1)));
            arrayList10.add(r22Var12);
            arrayList9.add(new km2.k(((mm2.c1) eVar5.a(mm2.c1.class)).f410385o, ((mm2.e1) eVar5.a(mm2.e1.class)).f410520q.f461834n, 99000000L, e06.p.j(new e06.k(0, 10), c06.e.f119249d), false, null, 0L, false, 99000000L, null, 0, 1776, null));
            java.util.List list5 = ((mm2.o4) eVar5.a(mm2.o4.class)).f410857s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list5, "<get-anchorPkMicUserList>(...)");
            int i59 = 0;
            for (java.lang.Object obj5 : list5) {
                int i66 = i59 + 1;
                if (i59 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                km2.q qVar5 = (km2.q) obj5;
                if (i59 == 0) {
                    java.util.LinkedList m75941xfb82191410 = r22Var11.m75941xfb821914(0);
                    r45.wk6 wk6Var10 = new r45.wk6();
                    wk6Var10.set(1, qVar5.f390703a);
                    wk6Var10.set(0, qVar5.f390705c);
                    m75941xfb82191410.add(wk6Var10);
                } else {
                    java.util.LinkedList m75941xfb82191411 = r22Var12.m75941xfb821914(0);
                    r45.wk6 wk6Var11 = new r45.wk6();
                    wk6Var11.set(1, qVar5.f390703a);
                    wk6Var11.set(0, qVar5.f390705c);
                    m75941xfb82191411.add(wk6Var11);
                }
                java.lang.String str9 = qVar5.f390705c;
                java.lang.String str10 = qVar5.f390703a;
                java.lang.String str11 = str10 == null ? "" : str10;
                e06.n nVar4 = new e06.n(0L, 10000000L);
                c06.d dVar4 = c06.e.f119249d;
                arrayList9.add(new km2.k(str9, str11, e06.p.k(nVar4, dVar4), e06.p.j(new e06.k(0, 10), dVar4), false, null, 0L, false, e06.p.k(new e06.n(0L, 10000000L), dVar4), null, 0, 1776, null));
                r22Var11 = r22Var11;
                i59 = i66;
                r22Var12 = r22Var12;
            }
            ((mm2.o4) eVar5.a(mm2.o4.class)).Z = new dk2.u4(null, 0L, 0, 1, 2, arrayList9, 2, 0, null, arrayList10, null, null, 0, 0, 0, 32135, null);
            s0Var.f90276c.j(qo0.b.f446954u4, null);
            pm0.v.V(5000L, new am2.m0(s0Var));
            pm0.v.V(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d, am2.n0.f90251d);
            return;
        }
        if (menuItem.getItemId() == 1017) {
            s0Var.getClass();
            am2.s0.f90273e = true;
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            e06.n nVar5 = new e06.n(0L, 100000L);
            c06.d dVar5 = c06.e.f119249d;
            long k19 = e06.p.k(nVar5, dVar5);
            r45.r22 r22Var13 = new r45.r22();
            r22Var13.set(1, java.lang.Long.valueOf(k19));
            r22Var13.set(3, java.lang.Long.valueOf(r22Var13.m75942xfb822ef2(1)));
            java.util.LinkedList m75941xfb82191412 = r22Var13.m75941xfb821914(0);
            r45.wk6 wk6Var12 = new r45.wk6();
            gk2.e eVar6 = s0Var.f90275b;
            wk6Var12.set(1, ((mm2.e1) eVar6.a(mm2.e1.class)).f410520q.f461834n);
            wk6Var12.set(0, ((mm2.c1) eVar6.a(mm2.c1.class)).f410385o);
            m75941xfb82191412.add(wk6Var12);
            r22Var13.set(2, 3);
            arrayList12.add(r22Var13);
            r45.r22 r22Var14 = new r45.r22();
            r22Var14.set(1, java.lang.Long.valueOf(k19));
            r22Var14.set(3, java.lang.Long.valueOf(r22Var14.m75942xfb822ef2(1)));
            arrayList12.add(r22Var14);
            arrayList11.add(new km2.k(((mm2.c1) eVar6.a(mm2.c1.class)).f410385o, ((mm2.e1) eVar6.a(mm2.e1.class)).f410520q.f461834n, k19, e06.p.j(new e06.k(0, 10), dVar5), false, null, 0L, false, k19, null, 0, 1776, null));
            java.util.List list6 = ((mm2.o4) eVar6.a(mm2.o4.class)).f410857s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list6, "<get-anchorPkMicUserList>(...)");
            int i67 = 0;
            for (java.lang.Object obj6 : list6) {
                int i68 = i67 + 1;
                if (i67 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                km2.q qVar6 = (km2.q) obj6;
                if (i67 == 0) {
                    java.util.LinkedList m75941xfb82191413 = r22Var13.m75941xfb821914(0);
                    r45.wk6 wk6Var13 = new r45.wk6();
                    wk6Var13.set(1, qVar6.f390703a);
                    wk6Var13.set(0, qVar6.f390705c);
                    m75941xfb82191413.add(wk6Var13);
                    i19 = 0;
                } else {
                    java.util.LinkedList m75941xfb82191414 = r22Var14.m75941xfb821914(0);
                    r45.wk6 wk6Var14 = new r45.wk6();
                    wk6Var14.set(1, qVar6.f390703a);
                    i19 = 0;
                    wk6Var14.set(0, qVar6.f390705c);
                    m75941xfb82191414.add(wk6Var14);
                }
                java.lang.String str12 = qVar6.f390705c;
                java.lang.String str13 = qVar6.f390703a;
                arrayList11.add(new km2.k(str12, str13 == null ? "" : str13, k19, e06.p.j(new e06.k(i19, 10), c06.e.f119249d), false, null, 0L, false, k19, null, 0, 1776, null));
                i67 = i68;
            }
            ((mm2.o4) eVar6.a(mm2.o4.class)).Z = new dk2.u4(null, 0L, 0, 3, 2, arrayList11, 2, 0, null, arrayList12, null, null, 0, 0, 0, 32135, null);
            s0Var.f90276c.j(qo0.b.f446954u4, null);
            pm0.v.V(5000L, new am2.k0(s0Var));
            pm0.v.V(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d, am2.l0.f90243d);
            return;
        }
        if (menuItem.getItemId() == 1018) {
            s0Var.getClass();
            am2.s0.f90273e = true;
            java.util.ArrayList arrayList13 = new java.util.ArrayList();
            java.util.ArrayList arrayList14 = new java.util.ArrayList();
            r45.r22 r22Var15 = new r45.r22();
            r22Var15.set(1, 666666666L);
            r22Var15.set(3, java.lang.Long.valueOf(r22Var15.m75942xfb822ef2(1)));
            java.util.LinkedList m75941xfb82191415 = r22Var15.m75941xfb821914(0);
            r45.wk6 wk6Var15 = new r45.wk6();
            gk2.e eVar7 = s0Var.f90275b;
            wk6Var15.set(1, ((mm2.e1) eVar7.a(mm2.e1.class)).f410520q.f461834n);
            wk6Var15.set(0, ((mm2.c1) eVar7.a(mm2.c1.class)).f410385o);
            m75941xfb82191415.add(wk6Var15);
            r22Var15.set(2, 1);
            arrayList14.add(r22Var15);
            arrayList13.add(new km2.k(((mm2.c1) eVar7.a(mm2.c1.class)).f410385o, ((mm2.e1) eVar7.a(mm2.e1.class)).f410520q.f461834n, 9900000000L, e06.p.j(new e06.k(0, 10), c06.e.f119249d), false, null, 0L, false, 9900000000L, null, 0, 1776, null));
            java.util.List list7 = ((mm2.o4) eVar7.a(mm2.o4.class)).f410857s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list7, "<get-anchorPkMicUserList>(...)");
            int i69 = 0;
            for (java.lang.Object obj7 : list7) {
                int i76 = i69 + 1;
                if (i69 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                km2.q qVar7 = (km2.q) obj7;
                r45.r22 r22Var16 = new r45.r22();
                r22Var16.set(1, 7777777L);
                r22Var16.set(3, java.lang.Long.valueOf(r22Var16.m75942xfb822ef2(1)));
                java.util.LinkedList m75941xfb82191416 = r22Var16.m75941xfb821914(0);
                r45.wk6 wk6Var16 = new r45.wk6();
                wk6Var16.set(1, qVar7.f390703a);
                wk6Var16.set(0, qVar7.f390705c);
                m75941xfb82191416.add(wk6Var16);
                arrayList14.add(r22Var16);
                java.lang.String str14 = qVar7.f390705c;
                java.lang.String str15 = ((mm2.e1) eVar7.a(mm2.e1.class)).f410520q.f461834n;
                e06.n nVar6 = new e06.n(0L, 10000000L);
                c06.d dVar6 = c06.e.f119249d;
                arrayList13.add(new km2.k(str14, str15, e06.p.k(nVar6, dVar6), e06.p.j(new e06.k(0, 10), dVar6), false, null, 0L, false, e06.p.k(new e06.n(0L, 10000000L), dVar6), null, 0, 1776, null));
                i69 = i76;
            }
            ((mm2.o4) eVar7.a(mm2.o4.class)).Z = new dk2.u4(null, 0L, 0, 1, 2, arrayList13, 1, 0, null, arrayList14, null, null, 0, 0, 0, 32135, null);
            s0Var.f90276c.j(qo0.b.f446954u4, null);
            pm0.v.V(5000L, new am2.e0(s0Var));
            pm0.v.V(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d, am2.f0.f90199d);
            return;
        }
        if (menuItem.getItemId() != 1019) {
            if (menuItem.getItemId() == 1020 || menuItem.getItemId() == 1021 || menuItem.getItemId() == 1022) {
                switch (menuItem.getItemId()) {
                    case com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46407x44d8fa6c /* 1020 */:
                    default:
                        i18 = 1;
                        break;
                    case com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46405xe4de6fbf /* 1021 */:
                        i18 = 2;
                        break;
                    case com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46404xa5f7fd74 /* 1022 */:
                        i18 = 3;
                        break;
                }
                s0Var.b(i18);
                dk2.ef efVar = dk2.ef.f314905a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
                if (c14197x319b1b9e == null || (wyVar = (df2.wy) c14197x319b1b9e.m56798x25fe639c(df2.wy.class)) == null) {
                    return;
                }
                wyVar.f313277u = true;
                p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new am2.a0(s0Var, wyVar.f313274r, wyVar, null), 2, null);
                return;
            }
            return;
        }
        s0Var.getClass();
        am2.s0.f90273e = true;
        java.util.ArrayList arrayList15 = new java.util.ArrayList();
        java.util.ArrayList arrayList16 = new java.util.ArrayList();
        e06.n nVar7 = new e06.n(0L, 100000L);
        c06.d dVar7 = c06.e.f119249d;
        long k27 = e06.p.k(nVar7, dVar7);
        r45.r22 r22Var17 = new r45.r22();
        r22Var17.set(1, java.lang.Long.valueOf(k27));
        r22Var17.set(3, java.lang.Long.valueOf(r22Var17.m75942xfb822ef2(1)));
        java.util.LinkedList m75941xfb82191417 = r22Var17.m75941xfb821914(0);
        r45.wk6 wk6Var17 = new r45.wk6();
        gk2.e eVar8 = s0Var.f90275b;
        wk6Var17.set(1, ((mm2.e1) eVar8.a(mm2.e1.class)).f410520q.f461834n);
        wk6Var17.set(0, ((mm2.c1) eVar8.a(mm2.c1.class)).f410385o);
        m75941xfb82191417.add(wk6Var17);
        r22Var17.set(2, 3);
        arrayList16.add(r22Var17);
        arrayList15.add(new km2.k(((mm2.c1) eVar8.a(mm2.c1.class)).f410385o, ((mm2.e1) eVar8.a(mm2.e1.class)).f410520q.f461834n, k27, e06.p.j(new e06.k(0, 10), dVar7), false, null, 0L, false, k27, null, 0, 1776, null));
        java.util.List list8 = ((mm2.o4) eVar8.a(mm2.o4.class)).f410857s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list8, "<get-anchorPkMicUserList>(...)");
        int i77 = 0;
        for (java.lang.Object obj8 : list8) {
            int i78 = i77 + 1;
            if (i77 < 0) {
                kz5.c0.p();
                throw null;
            }
            km2.q qVar8 = (km2.q) obj8;
            r45.r22 r22Var18 = new r45.r22();
            r22Var18.set(1, java.lang.Long.valueOf(k27));
            r22Var18.set(3, java.lang.Long.valueOf(r22Var18.m75942xfb822ef2(1)));
            java.util.LinkedList m75941xfb82191418 = r22Var18.m75941xfb821914(0);
            r45.wk6 wk6Var18 = new r45.wk6();
            wk6Var18.set(1, qVar8.f390703a);
            wk6Var18.set(0, qVar8.f390705c);
            m75941xfb82191418.add(wk6Var18);
            arrayList16.add(r22Var18);
            java.lang.String str16 = qVar8.f390705c;
            java.lang.String str17 = qVar8.f390703a;
            arrayList15.add(new km2.k(str16, str17 == null ? "" : str17, k27, e06.p.j(new e06.k(0, 10), c06.e.f119249d), false, null, 0L, false, k27, null, 0, 1776, null));
            i77 = i78;
        }
        ((mm2.o4) eVar8.a(mm2.o4.class)).Z = new dk2.u4(null, 0L, 0, 3, 2, arrayList15, 1, 0, null, arrayList16, null, null, 0, 0, 0, 32135, null);
        s0Var.f90276c.j(qo0.b.f446954u4, null);
        pm0.v.V(5000L, new am2.c0(s0Var));
        pm0.v.V(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d, am2.d0.f90183d);
    }
}
