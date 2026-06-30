package am2;

/* loaded from: classes10.dex */
public final class b0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.s0 f8631d;

    public b0(am2.s0 s0Var) {
        this.f8631d = s0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int i18;
        df2.wy wyVar;
        int i19;
        r45.r22 r22Var;
        int i27;
        int itemId = menuItem.getItemId();
        am2.s0 s0Var = this.f8631d;
        if (itemId == 1005) {
            ((mm2.o4) s0Var.f8742b.a(mm2.o4.class)).Z = new dk2.u4(null, 0L, 0, 1, 2, null, 0, 0, null, null, null, null, 0, 0, 0, 32743, null);
            s0Var.f8743c.j(qo0.b.f365421u4, null);
            pm0.v.V(5000L, new am2.y(s0Var));
            return;
        }
        if (menuItem.getItemId() == 1006) {
            ((mm2.o4) s0Var.f8742b.a(mm2.o4.class)).Z = new dk2.u4(null, 0L, 0, 2, 2, null, 0, 0, null, null, null, null, 0, 0, 0, 32743, null);
            s0Var.f8743c.j(qo0.b.f365421u4, null);
            pm0.v.V(5000L, new am2.x(s0Var));
            return;
        }
        if (menuItem.getItemId() == 1007) {
            ((mm2.o4) s0Var.f8742b.a(mm2.o4.class)).Z = new dk2.u4(null, 0L, 0, 3, 2, null, 0, 0, null, null, null, null, 0, 0, 0, 32743, null);
            s0Var.f8743c.j(qo0.b.f365421u4, null);
            pm0.v.V(5000L, new am2.w(s0Var));
            return;
        }
        java.lang.Class<mm2.y2> cls = mm2.y2.class;
        int i28 = 0;
        int i29 = 1;
        if (menuItem.getItemId() == 1023) {
            s0Var.getClass();
            am2.s0.f8740e = true;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            r45.r22 r22Var2 = new r45.r22();
            r22Var2.set(1, 666666666L);
            r22Var2.set(3, java.lang.Long.valueOf(r22Var2.getLong(1)));
            r22Var2.set(2, 1);
            arrayList2.add(r22Var2);
            r45.r22 r22Var3 = new r45.r22();
            r22Var3.set(1, 7777777L);
            r22Var3.set(3, java.lang.Long.valueOf(r22Var3.getLong(1)));
            arrayList2.add(r22Var3);
            gk2.e eVar = s0Var.f8742b;
            java.util.List list = ((mm2.o4) eVar.a(mm2.o4.class)).f329327v;
            kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
            int i37 = 0;
            for (java.lang.Object obj : list) {
                int i38 = i37 + 1;
                if (i37 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                km2.q qVar = (km2.q) obj;
                if (((mm2.y2) eVar.a(cls)).b7(qVar.f309192w)) {
                    java.util.LinkedList list2 = r22Var2.getList(i28);
                    r45.wk6 wk6Var = new r45.wk6();
                    wk6Var.set(i29, qVar.f309170a);
                    wk6Var.set(0, qVar.f309172c);
                    list2.add(wk6Var);
                } else {
                    java.util.LinkedList list3 = r22Var3.getList(i28);
                    r45.wk6 wk6Var2 = new r45.wk6();
                    wk6Var2.set(1, qVar.f309170a);
                    wk6Var2.set(0, qVar.f309172c);
                    list3.add(wk6Var2);
                }
                java.lang.String str = qVar.f309172c;
                java.lang.String str2 = qVar.f309170a;
                java.lang.String str3 = str2 == null ? "" : str2;
                r45.r22 r22Var4 = r22Var3;
                e06.n nVar = new e06.n(0L, 10000000L);
                c06.d dVar = c06.e.f37716d;
                arrayList.add(new km2.k(str, str3, e06.p.k(nVar, dVar), e06.p.j(new e06.k(0, 10), dVar), false, null, 0L, false, e06.p.k(new e06.n(0L, 10000000L), dVar), null, 0, 1776, null));
                r22Var3 = r22Var4;
                cls = cls;
                i37 = i38;
                i28 = 0;
                i29 = 1;
            }
            ((mm2.o4) eVar.a(mm2.o4.class)).Z = new dk2.u4(null, 0L, 0, 1, 2, arrayList, 2, 0, null, arrayList2, null, null, 2, 0, 0, 28039, null);
            s0Var.f8743c.j(qo0.b.f365421u4, null);
            pm0.v.V(5000L, new am2.q0(s0Var));
            pm0.v.V(androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS, am2.r0.f8736d);
            return;
        }
        java.lang.Class<mm2.y2> cls2 = cls;
        if (menuItem.getItemId() == 1024) {
            s0Var.getClass();
            am2.s0.f8740e = true;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            long k17 = e06.p.k(new e06.n(0L, 100000L), c06.e.f37716d);
            r45.r22 r22Var5 = new r45.r22();
            r22Var5.set(1, java.lang.Long.valueOf(k17));
            r22Var5.set(3, java.lang.Long.valueOf(r22Var5.getLong(1)));
            r22Var5.set(2, 3);
            arrayList4.add(r22Var5);
            r45.r22 r22Var6 = new r45.r22();
            r22Var6.set(1, java.lang.Long.valueOf(k17));
            r22Var6.set(3, java.lang.Long.valueOf(r22Var6.getLong(1)));
            r22Var6.set(2, 3);
            arrayList4.add(r22Var6);
            gk2.e eVar2 = s0Var.f8742b;
            java.util.List list4 = ((mm2.o4) eVar2.a(mm2.o4.class)).f329327v;
            kotlin.jvm.internal.o.f(list4, "<get-audienceLinkMicUserList>(...)");
            int i39 = 0;
            for (java.lang.Object obj2 : list4) {
                int i47 = i39 + 1;
                if (i39 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                km2.q qVar2 = (km2.q) obj2;
                java.lang.Class<mm2.y2> cls3 = cls2;
                if (((mm2.y2) eVar2.a(cls3)).b7(qVar2.f309192w)) {
                    java.util.LinkedList list5 = r22Var5.getList(0);
                    r45.wk6 wk6Var3 = new r45.wk6();
                    r22Var = r22Var5;
                    wk6Var3.set(1, qVar2.f309170a);
                    wk6Var3.set(0, qVar2.f309172c);
                    list5.add(wk6Var3);
                    i27 = 0;
                } else {
                    r22Var = r22Var5;
                    java.util.LinkedList list6 = r22Var6.getList(0);
                    r45.wk6 wk6Var4 = new r45.wk6();
                    wk6Var4.set(1, qVar2.f309170a);
                    i27 = 0;
                    wk6Var4.set(0, qVar2.f309172c);
                    list6.add(wk6Var4);
                }
                java.lang.String str4 = qVar2.f309172c;
                java.lang.String str5 = qVar2.f309170a;
                arrayList3.add(new km2.k(str4, str5 == null ? "" : str5, k17, e06.p.j(new e06.k(i27, 10), c06.e.f37716d), false, null, 0L, false, k17, null, 0, 1776, null));
                r22Var5 = r22Var;
                cls2 = cls3;
                i39 = i47;
            }
            ((mm2.o4) eVar2.a(mm2.o4.class)).Z = new dk2.u4(null, 0L, 0, 3, 2, arrayList3, 2, 0, null, arrayList4, null, null, 2, 0, 0, 28039, null);
            s0Var.f8743c.j(qo0.b.f365421u4, null);
            pm0.v.V(5000L, new am2.o0(s0Var));
            pm0.v.V(androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS, am2.p0.f8728d);
            return;
        }
        if (menuItem.getItemId() == 1025) {
            s0Var.getClass();
            am2.s0.f8740e = true;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            r45.r22 r22Var7 = new r45.r22();
            r22Var7.set(1, 666666666L);
            r22Var7.set(3, java.lang.Long.valueOf(r22Var7.getLong(1)));
            java.util.LinkedList list7 = r22Var7.getList(0);
            r45.wk6 wk6Var5 = new r45.wk6();
            gk2.e eVar3 = s0Var.f8742b;
            wk6Var5.set(1, ((mm2.e1) eVar3.a(mm2.e1.class)).f328987q.f380301n);
            wk6Var5.set(0, ((mm2.c1) eVar3.a(mm2.c1.class)).f328852o);
            list7.add(wk6Var5);
            r22Var7.set(2, 1);
            arrayList6.add(r22Var7);
            arrayList5.add(new km2.k(((mm2.c1) eVar3.a(mm2.c1.class)).f328852o, ((mm2.e1) eVar3.a(mm2.e1.class)).f328987q.f380301n, 9900000000L, e06.p.j(new e06.k(0, 10), c06.e.f37716d), false, null, 0L, false, 9900000000L, null, 0, 1776, null));
            java.util.List list8 = ((mm2.o4) eVar3.a(mm2.o4.class)).f329327v;
            kotlin.jvm.internal.o.f(list8, "<get-audienceLinkMicUserList>(...)");
            int i48 = 0;
            for (java.lang.Object obj3 : list8) {
                int i49 = i48 + 1;
                if (i48 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                km2.q qVar3 = (km2.q) obj3;
                r45.r22 r22Var8 = new r45.r22();
                r22Var8.set(1, 7777777L);
                r22Var8.set(3, java.lang.Long.valueOf(r22Var8.getLong(1)));
                java.util.LinkedList list9 = r22Var8.getList(0);
                r45.wk6 wk6Var6 = new r45.wk6();
                wk6Var6.set(1, qVar3.f309170a);
                wk6Var6.set(0, qVar3.f309172c);
                list9.add(wk6Var6);
                arrayList6.add(r22Var8);
                java.lang.String str6 = qVar3.f309172c;
                java.lang.String str7 = qVar3.f309170a;
                java.lang.String str8 = str7 == null ? "" : str7;
                e06.n nVar2 = new e06.n(0L, 10000000L);
                c06.d dVar2 = c06.e.f37716d;
                arrayList5.add(new km2.k(str6, str8, e06.p.k(nVar2, dVar2), e06.p.j(new e06.k(0, 10), dVar2), false, null, 0L, false, e06.p.k(new e06.n(0L, 10000000L), dVar2), null, 0, 1776, null));
                i48 = i49;
            }
            ((mm2.o4) eVar3.a(mm2.o4.class)).Z = new dk2.u4(null, 0L, 0, 1, 2, arrayList5, 1, 0, null, arrayList6, null, null, 1, 0, 0, 28039, null);
            s0Var.f8743c.j(qo0.b.f365421u4, null);
            pm0.v.V(5000L, new am2.i0(s0Var));
            pm0.v.V(androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS, am2.j0.f8699d);
            return;
        }
        if (menuItem.getItemId() == 1026) {
            s0Var.getClass();
            am2.s0.f8740e = true;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            e06.n nVar3 = new e06.n(0L, 100000L);
            c06.d dVar3 = c06.e.f37716d;
            long k18 = e06.p.k(nVar3, dVar3);
            r45.r22 r22Var9 = new r45.r22();
            r22Var9.set(1, java.lang.Long.valueOf(k18));
            r22Var9.set(3, java.lang.Long.valueOf(r22Var9.getLong(1)));
            java.util.LinkedList list10 = r22Var9.getList(0);
            r45.wk6 wk6Var7 = new r45.wk6();
            gk2.e eVar4 = s0Var.f8742b;
            wk6Var7.set(1, ((mm2.e1) eVar4.a(mm2.e1.class)).f328987q.f380301n);
            wk6Var7.set(0, ((mm2.c1) eVar4.a(mm2.c1.class)).f328852o);
            list10.add(wk6Var7);
            r22Var9.set(2, 3);
            arrayList8.add(r22Var9);
            arrayList7.add(new km2.k(((mm2.c1) eVar4.a(mm2.c1.class)).f328852o, ((mm2.e1) eVar4.a(mm2.e1.class)).f328987q.f380301n, k18, e06.p.j(new e06.k(0, 10), dVar3), false, null, 0L, false, k18, null, 0, 1776, null));
            java.util.List list11 = ((mm2.o4) eVar4.a(mm2.o4.class)).f329327v;
            kotlin.jvm.internal.o.f(list11, "<get-audienceLinkMicUserList>(...)");
            int i57 = 0;
            for (java.lang.Object obj4 : list11) {
                int i58 = i57 + 1;
                if (i57 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                km2.q qVar4 = (km2.q) obj4;
                r45.r22 r22Var10 = new r45.r22();
                r22Var10.set(1, java.lang.Long.valueOf(k18));
                r22Var10.set(3, java.lang.Long.valueOf(r22Var10.getLong(1)));
                java.util.LinkedList list12 = r22Var10.getList(0);
                r45.wk6 wk6Var8 = new r45.wk6();
                wk6Var8.set(1, qVar4.f309170a);
                wk6Var8.set(0, qVar4.f309172c);
                list12.add(wk6Var8);
                arrayList8.add(r22Var10);
                arrayList7.add(new km2.k(qVar4.f309172c, ((mm2.e1) eVar4.a(mm2.e1.class)).f328987q.f380301n, k18, e06.p.j(new e06.k(0, 10), c06.e.f37716d), false, null, 0L, false, k18, null, 0, 1776, null));
                i57 = i58;
            }
            ((mm2.o4) eVar4.a(mm2.o4.class)).Z = new dk2.u4(null, 0L, 0, 3, 2, arrayList7, 1, 0, null, arrayList8, null, null, 2, 0, 0, 28039, null);
            s0Var.f8743c.j(qo0.b.f365421u4, null);
            pm0.v.V(5000L, new am2.g0(s0Var));
            pm0.v.V(androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS, am2.h0.f8678d);
            return;
        }
        if (menuItem.getItemId() == 1016) {
            s0Var.getClass();
            am2.s0.f8740e = true;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            r45.r22 r22Var11 = new r45.r22();
            r22Var11.set(1, 666666666L);
            r22Var11.set(3, java.lang.Long.valueOf(r22Var11.getLong(1)));
            java.util.LinkedList list13 = r22Var11.getList(0);
            r45.wk6 wk6Var9 = new r45.wk6();
            gk2.e eVar5 = s0Var.f8742b;
            wk6Var9.set(1, ((mm2.e1) eVar5.a(mm2.e1.class)).f328987q.f380301n);
            wk6Var9.set(0, ((mm2.c1) eVar5.a(mm2.c1.class)).f328852o);
            list13.add(wk6Var9);
            r22Var11.set(2, 1);
            arrayList10.add(r22Var11);
            r45.r22 r22Var12 = new r45.r22();
            r22Var12.set(1, 7777777L);
            r22Var12.set(3, java.lang.Long.valueOf(r22Var12.getLong(1)));
            arrayList10.add(r22Var12);
            arrayList9.add(new km2.k(((mm2.c1) eVar5.a(mm2.c1.class)).f328852o, ((mm2.e1) eVar5.a(mm2.e1.class)).f328987q.f380301n, 99000000L, e06.p.j(new e06.k(0, 10), c06.e.f37716d), false, null, 0L, false, 99000000L, null, 0, 1776, null));
            java.util.List list14 = ((mm2.o4) eVar5.a(mm2.o4.class)).f329324s;
            kotlin.jvm.internal.o.f(list14, "<get-anchorPkMicUserList>(...)");
            int i59 = 0;
            for (java.lang.Object obj5 : list14) {
                int i66 = i59 + 1;
                if (i59 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                km2.q qVar5 = (km2.q) obj5;
                if (i59 == 0) {
                    java.util.LinkedList list15 = r22Var11.getList(0);
                    r45.wk6 wk6Var10 = new r45.wk6();
                    wk6Var10.set(1, qVar5.f309170a);
                    wk6Var10.set(0, qVar5.f309172c);
                    list15.add(wk6Var10);
                } else {
                    java.util.LinkedList list16 = r22Var12.getList(0);
                    r45.wk6 wk6Var11 = new r45.wk6();
                    wk6Var11.set(1, qVar5.f309170a);
                    wk6Var11.set(0, qVar5.f309172c);
                    list16.add(wk6Var11);
                }
                java.lang.String str9 = qVar5.f309172c;
                java.lang.String str10 = qVar5.f309170a;
                java.lang.String str11 = str10 == null ? "" : str10;
                e06.n nVar4 = new e06.n(0L, 10000000L);
                c06.d dVar4 = c06.e.f37716d;
                arrayList9.add(new km2.k(str9, str11, e06.p.k(nVar4, dVar4), e06.p.j(new e06.k(0, 10), dVar4), false, null, 0L, false, e06.p.k(new e06.n(0L, 10000000L), dVar4), null, 0, 1776, null));
                r22Var11 = r22Var11;
                i59 = i66;
                r22Var12 = r22Var12;
            }
            ((mm2.o4) eVar5.a(mm2.o4.class)).Z = new dk2.u4(null, 0L, 0, 1, 2, arrayList9, 2, 0, null, arrayList10, null, null, 0, 0, 0, 32135, null);
            s0Var.f8743c.j(qo0.b.f365421u4, null);
            pm0.v.V(5000L, new am2.m0(s0Var));
            pm0.v.V(androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS, am2.n0.f8718d);
            return;
        }
        if (menuItem.getItemId() == 1017) {
            s0Var.getClass();
            am2.s0.f8740e = true;
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            e06.n nVar5 = new e06.n(0L, 100000L);
            c06.d dVar5 = c06.e.f37716d;
            long k19 = e06.p.k(nVar5, dVar5);
            r45.r22 r22Var13 = new r45.r22();
            r22Var13.set(1, java.lang.Long.valueOf(k19));
            r22Var13.set(3, java.lang.Long.valueOf(r22Var13.getLong(1)));
            java.util.LinkedList list17 = r22Var13.getList(0);
            r45.wk6 wk6Var12 = new r45.wk6();
            gk2.e eVar6 = s0Var.f8742b;
            wk6Var12.set(1, ((mm2.e1) eVar6.a(mm2.e1.class)).f328987q.f380301n);
            wk6Var12.set(0, ((mm2.c1) eVar6.a(mm2.c1.class)).f328852o);
            list17.add(wk6Var12);
            r22Var13.set(2, 3);
            arrayList12.add(r22Var13);
            r45.r22 r22Var14 = new r45.r22();
            r22Var14.set(1, java.lang.Long.valueOf(k19));
            r22Var14.set(3, java.lang.Long.valueOf(r22Var14.getLong(1)));
            arrayList12.add(r22Var14);
            arrayList11.add(new km2.k(((mm2.c1) eVar6.a(mm2.c1.class)).f328852o, ((mm2.e1) eVar6.a(mm2.e1.class)).f328987q.f380301n, k19, e06.p.j(new e06.k(0, 10), dVar5), false, null, 0L, false, k19, null, 0, 1776, null));
            java.util.List list18 = ((mm2.o4) eVar6.a(mm2.o4.class)).f329324s;
            kotlin.jvm.internal.o.f(list18, "<get-anchorPkMicUserList>(...)");
            int i67 = 0;
            for (java.lang.Object obj6 : list18) {
                int i68 = i67 + 1;
                if (i67 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                km2.q qVar6 = (km2.q) obj6;
                if (i67 == 0) {
                    java.util.LinkedList list19 = r22Var13.getList(0);
                    r45.wk6 wk6Var13 = new r45.wk6();
                    wk6Var13.set(1, qVar6.f309170a);
                    wk6Var13.set(0, qVar6.f309172c);
                    list19.add(wk6Var13);
                    i19 = 0;
                } else {
                    java.util.LinkedList list20 = r22Var14.getList(0);
                    r45.wk6 wk6Var14 = new r45.wk6();
                    wk6Var14.set(1, qVar6.f309170a);
                    i19 = 0;
                    wk6Var14.set(0, qVar6.f309172c);
                    list20.add(wk6Var14);
                }
                java.lang.String str12 = qVar6.f309172c;
                java.lang.String str13 = qVar6.f309170a;
                arrayList11.add(new km2.k(str12, str13 == null ? "" : str13, k19, e06.p.j(new e06.k(i19, 10), c06.e.f37716d), false, null, 0L, false, k19, null, 0, 1776, null));
                i67 = i68;
            }
            ((mm2.o4) eVar6.a(mm2.o4.class)).Z = new dk2.u4(null, 0L, 0, 3, 2, arrayList11, 2, 0, null, arrayList12, null, null, 0, 0, 0, 32135, null);
            s0Var.f8743c.j(qo0.b.f365421u4, null);
            pm0.v.V(5000L, new am2.k0(s0Var));
            pm0.v.V(androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS, am2.l0.f8710d);
            return;
        }
        if (menuItem.getItemId() == 1018) {
            s0Var.getClass();
            am2.s0.f8740e = true;
            java.util.ArrayList arrayList13 = new java.util.ArrayList();
            java.util.ArrayList arrayList14 = new java.util.ArrayList();
            r45.r22 r22Var15 = new r45.r22();
            r22Var15.set(1, 666666666L);
            r22Var15.set(3, java.lang.Long.valueOf(r22Var15.getLong(1)));
            java.util.LinkedList list21 = r22Var15.getList(0);
            r45.wk6 wk6Var15 = new r45.wk6();
            gk2.e eVar7 = s0Var.f8742b;
            wk6Var15.set(1, ((mm2.e1) eVar7.a(mm2.e1.class)).f328987q.f380301n);
            wk6Var15.set(0, ((mm2.c1) eVar7.a(mm2.c1.class)).f328852o);
            list21.add(wk6Var15);
            r22Var15.set(2, 1);
            arrayList14.add(r22Var15);
            arrayList13.add(new km2.k(((mm2.c1) eVar7.a(mm2.c1.class)).f328852o, ((mm2.e1) eVar7.a(mm2.e1.class)).f328987q.f380301n, 9900000000L, e06.p.j(new e06.k(0, 10), c06.e.f37716d), false, null, 0L, false, 9900000000L, null, 0, 1776, null));
            java.util.List list22 = ((mm2.o4) eVar7.a(mm2.o4.class)).f329324s;
            kotlin.jvm.internal.o.f(list22, "<get-anchorPkMicUserList>(...)");
            int i69 = 0;
            for (java.lang.Object obj7 : list22) {
                int i76 = i69 + 1;
                if (i69 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                km2.q qVar7 = (km2.q) obj7;
                r45.r22 r22Var16 = new r45.r22();
                r22Var16.set(1, 7777777L);
                r22Var16.set(3, java.lang.Long.valueOf(r22Var16.getLong(1)));
                java.util.LinkedList list23 = r22Var16.getList(0);
                r45.wk6 wk6Var16 = new r45.wk6();
                wk6Var16.set(1, qVar7.f309170a);
                wk6Var16.set(0, qVar7.f309172c);
                list23.add(wk6Var16);
                arrayList14.add(r22Var16);
                java.lang.String str14 = qVar7.f309172c;
                java.lang.String str15 = ((mm2.e1) eVar7.a(mm2.e1.class)).f328987q.f380301n;
                e06.n nVar6 = new e06.n(0L, 10000000L);
                c06.d dVar6 = c06.e.f37716d;
                arrayList13.add(new km2.k(str14, str15, e06.p.k(nVar6, dVar6), e06.p.j(new e06.k(0, 10), dVar6), false, null, 0L, false, e06.p.k(new e06.n(0L, 10000000L), dVar6), null, 0, 1776, null));
                i69 = i76;
            }
            ((mm2.o4) eVar7.a(mm2.o4.class)).Z = new dk2.u4(null, 0L, 0, 1, 2, arrayList13, 1, 0, null, arrayList14, null, null, 0, 0, 0, 32135, null);
            s0Var.f8743c.j(qo0.b.f365421u4, null);
            pm0.v.V(5000L, new am2.e0(s0Var));
            pm0.v.V(androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS, am2.f0.f8666d);
            return;
        }
        if (menuItem.getItemId() != 1019) {
            if (menuItem.getItemId() == 1020 || menuItem.getItemId() == 1021 || menuItem.getItemId() == 1022) {
                switch (menuItem.getItemId()) {
                    case com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_USERLIST /* 1020 */:
                    default:
                        i18 = 1;
                        break;
                    case com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_NEED_REENTER /* 1021 */:
                        i18 = 2;
                        break;
                    case com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED /* 1022 */:
                        i18 = 3;
                        break;
                }
                s0Var.b(i18);
                dk2.ef efVar = dk2.ef.f233372a;
                com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
                if (liveRoomControllerStore == null || (wyVar = (df2.wy) liveRoomControllerStore.controller(df2.wy.class)) == null) {
                    return;
                }
                wyVar.f231744u = true;
                kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new am2.a0(s0Var, wyVar.f231741r, wyVar, null), 2, null);
                return;
            }
            return;
        }
        s0Var.getClass();
        am2.s0.f8740e = true;
        java.util.ArrayList arrayList15 = new java.util.ArrayList();
        java.util.ArrayList arrayList16 = new java.util.ArrayList();
        e06.n nVar7 = new e06.n(0L, 100000L);
        c06.d dVar7 = c06.e.f37716d;
        long k27 = e06.p.k(nVar7, dVar7);
        r45.r22 r22Var17 = new r45.r22();
        r22Var17.set(1, java.lang.Long.valueOf(k27));
        r22Var17.set(3, java.lang.Long.valueOf(r22Var17.getLong(1)));
        java.util.LinkedList list24 = r22Var17.getList(0);
        r45.wk6 wk6Var17 = new r45.wk6();
        gk2.e eVar8 = s0Var.f8742b;
        wk6Var17.set(1, ((mm2.e1) eVar8.a(mm2.e1.class)).f328987q.f380301n);
        wk6Var17.set(0, ((mm2.c1) eVar8.a(mm2.c1.class)).f328852o);
        list24.add(wk6Var17);
        r22Var17.set(2, 3);
        arrayList16.add(r22Var17);
        arrayList15.add(new km2.k(((mm2.c1) eVar8.a(mm2.c1.class)).f328852o, ((mm2.e1) eVar8.a(mm2.e1.class)).f328987q.f380301n, k27, e06.p.j(new e06.k(0, 10), dVar7), false, null, 0L, false, k27, null, 0, 1776, null));
        java.util.List list25 = ((mm2.o4) eVar8.a(mm2.o4.class)).f329324s;
        kotlin.jvm.internal.o.f(list25, "<get-anchorPkMicUserList>(...)");
        int i77 = 0;
        for (java.lang.Object obj8 : list25) {
            int i78 = i77 + 1;
            if (i77 < 0) {
                kz5.c0.p();
                throw null;
            }
            km2.q qVar8 = (km2.q) obj8;
            r45.r22 r22Var18 = new r45.r22();
            r22Var18.set(1, java.lang.Long.valueOf(k27));
            r22Var18.set(3, java.lang.Long.valueOf(r22Var18.getLong(1)));
            java.util.LinkedList list26 = r22Var18.getList(0);
            r45.wk6 wk6Var18 = new r45.wk6();
            wk6Var18.set(1, qVar8.f309170a);
            wk6Var18.set(0, qVar8.f309172c);
            list26.add(wk6Var18);
            arrayList16.add(r22Var18);
            java.lang.String str16 = qVar8.f309172c;
            java.lang.String str17 = qVar8.f309170a;
            arrayList15.add(new km2.k(str16, str17 == null ? "" : str17, k27, e06.p.j(new e06.k(0, 10), c06.e.f37716d), false, null, 0L, false, k27, null, 0, 1776, null));
            i77 = i78;
        }
        ((mm2.o4) eVar8.a(mm2.o4.class)).Z = new dk2.u4(null, 0L, 0, 3, 2, arrayList15, 1, 0, null, arrayList16, null, null, 0, 0, 0, 32135, null);
        s0Var.f8743c.j(qo0.b.f365421u4, null);
        pm0.v.V(5000L, new am2.c0(s0Var));
        pm0.v.V(androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS, am2.d0.f8650d);
    }
}
