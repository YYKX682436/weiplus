package um2;

/* loaded from: classes3.dex */
public final class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510360d;

    public i2(um2.x5 x5Var) {
        this.f510360d = x5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.Object obj;
        kn0.p pVar;
        xh2.a aVar;
        xh2.i iVar;
        xh2.i iVar2;
        java.util.LinkedList linkedList;
        java.lang.Object obj2;
        kn0.p pVar2;
        kn0.p pVar3;
        um2.x5 x5Var = this.f510360d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x5Var.f510565f, "restoreLinkMicUI: curLinkMicUser:" + ((mm2.o4) x5Var.c(mm2.o4.class)).l7() + ", audienceLinkMicUserList:" + ((mm2.o4) x5Var.c(mm2.o4.class)).f410860v + ", audienceMode:" + ((mm2.c1) x5Var.c(mm2.c1.class)).P6());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vi0 vi0Var = x5Var.f510584l0;
        if (vi0Var != null) {
            vi0Var.t1();
        }
        if (((mm2.o4) x5Var.c(mm2.o4.class)).E7()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vi0 vi0Var2 = x5Var.f510584l0;
            if (vi0Var2 != null) {
                vi0Var2.w1();
            }
        } else {
            java.util.List list = ((mm2.o4) x5Var.c(mm2.o4.class)).f410860v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    str = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((km2.q) obj).f390703a, ((mm2.c1) x5Var.c(mm2.c1.class)).m8())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
            }
            km2.q qVar = (km2.q) obj;
            java.util.List list2 = ((mm2.o4) x5Var.c(mm2.o4.class)).f410860v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-audienceLinkMicUserList>(...)");
            synchronized (list2) {
                java.util.Iterator it6 = list2.iterator();
                while (true) {
                    int i17 = 0;
                    if (!it6.hasNext()) {
                        break;
                    }
                    km2.q qVar2 = (km2.q) it6.next();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(qVar2.f390703a, ((mm2.c1) x5Var.c(mm2.c1.class)).m8())) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 ob0Var = x5Var.f510571h;
                        if (ob0Var != null) {
                            ob0Var.H1(true);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 ob0Var2 = x5Var.f510571h;
                        if (ob0Var2 != null) {
                            ob0Var2.K0(8);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dk0 dk0Var = x5Var.f510574i;
                        if (dk0Var != null) {
                            dk0Var.K0(0);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dk0 dk0Var2 = x5Var.f510574i;
                        if (dk0Var2 != null) {
                            dk0Var2.w1();
                        }
                        co0.s E = x5Var.E();
                        if (E != null) {
                            co0.s E2 = x5Var.E();
                            E.P0((E2 == null || (pVar2 = E2.D) == null) ? null : pVar2.f391119f);
                        }
                        xh2.c cVar = (xh2.c) ((mm2.o4) x5Var.c(mm2.o4.class)).A.mo3195x754a37bb();
                        if (cVar == null || (linkedList = cVar.f536064a) == null) {
                            aVar = null;
                        } else {
                            java.util.Iterator it7 = linkedList.iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    obj2 = it7.next();
                                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((xh2.a) obj2).b(), qVar2.f390703a)) {
                                        break;
                                    }
                                } else {
                                    obj2 = null;
                                    break;
                                }
                            }
                            aVar = (xh2.a) obj2;
                        }
                        java.lang.String str2 = x5Var.f510565f;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append("restoreLinkMicUI micCoverData us: ");
                        sb6.append((aVar == null || (iVar2 = aVar.f536054b) == null) ? null : java.lang.Integer.valueOf(iVar2.f536090i));
                        sb6.append(" id: ");
                        sb6.append(qVar2.f390703a);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
                        um2.r5 r5Var = new um2.r5(x5Var);
                        if (((mm2.y2) x5Var.c(mm2.y2.class)).X6()) {
                            if (aVar != null && (iVar = aVar.f536054b) != null) {
                                i17 = iVar.f536090i;
                            }
                            if (!pm0.v.z(i17, 2)) {
                                r5Var.mo152xb9724478();
                            }
                        } else if (qVar2.f390707e == 2) {
                            r5Var.mo152xb9724478();
                        }
                    } else if (((mm2.c1) x5Var.c(mm2.c1.class)).P6() == 0 || (((mm2.c1) x5Var.c(mm2.c1.class)).P6() == 1 && qVar != null)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dk0 dk0Var3 = x5Var.f510574i;
                        if (dk0Var3 != null) {
                            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ck0(dk0Var3, qVar2.f390703a, 0));
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dk0 dk0Var4 = x5Var.f510574i;
                        if (dk0Var4 != null) {
                            dk0Var4.w1();
                        }
                        co0.s E3 = x5Var.E();
                        if (E3 != null) {
                            co0.s E4 = x5Var.E();
                            E3.P0((E4 == null || (pVar3 = E4.D) == null) ? null : pVar3.f391119f);
                        }
                        co0.s E5 = x5Var.E();
                        if (E5 != null) {
                            E5.P0(qVar2.f390703a);
                        }
                    }
                }
            }
            if (((mm2.o4) x5Var.c(mm2.o4.class)).f410857s.size() <= 0) {
                dk2.ef.s0(dk2.ef.f314905a, 2, null, null, null, false, 30, null);
            } else if (((mm2.c1) x5Var.c(mm2.c1.class)).P6() == 0 || (((mm2.c1) x5Var.c(mm2.c1.class)).P6() == 1 && qVar != null)) {
                java.util.List<km2.q> list3 = ((mm2.o4) x5Var.c(mm2.o4.class)).f410857s;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list3, "<get-anchorPkMicUserList>(...)");
                synchronized (list3) {
                    for (km2.q qVar3 : list3) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dk0 dk0Var5 = x5Var.f510574i;
                        if (dk0Var5 != null) {
                            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ck0(dk0Var5, qVar3.f390703a, 0));
                        }
                        co0.s E6 = x5Var.E();
                        if (E6 != null) {
                            E6.P0(qVar3.f390703a);
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dk0 dk0Var6 = x5Var.f510574i;
                if (dk0Var6 != null) {
                    dk0Var6.w1();
                }
                co0.s E7 = x5Var.E();
                if (E7 != null) {
                    co0.s E8 = x5Var.E();
                    if (E8 != null && (pVar = E8.D) != null) {
                        str = pVar.f391119f;
                    }
                    E7.P0(str);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var = this.f510360d.f510608t0;
        if (ag0Var != null) {
            ag0Var.D1();
        }
    }
}
