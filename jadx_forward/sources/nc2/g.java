package nc2;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final nc2.g f417641a = new nc2.g();

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(r45.vs2 vs2Var) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        r45.f03 f03Var = null;
        if (vs2Var != null && (linkedList2 = vs2Var.f470022g) != null) {
            java.util.Iterator it = linkedList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.f03) next).f455425i, "FinderLiveEntrance")) {
                    f03Var = next;
                    break;
                }
            }
            f03Var = f03Var;
        }
        r45.f03 f03Var2 = f03Var;
        if (!((vs2Var == null || (linkedList = vs2Var.f470022g) == null) ? false : pm0.v.d0(linkedList, nc2.a.f417635d)) || vs2Var == null || f03Var2 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb();
        jbVar.t0(vs2Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.j(x2Var, jbVar, f03Var2, 5, 2, null, null, 48, null);
    }

    public final void b(java.lang.String tag, java.lang.String source) {
        r45.f03 f03Var;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "[removeFinderLiveEntranceShowInfo] ".concat(source));
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar : ((c61.l7) i95.n0.c(c61.l7.class)).nk().W()) {
            java.util.LinkedList linkedList = jbVar.f65874xb5f7102a.f470022g;
            if (linkedList != null) {
                java.util.Iterator it = linkedList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.f03) obj).f455425i, "FinderLiveEntrance")) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                f03Var = (r45.f03) obj;
            } else {
                f03Var = null;
            }
            if (!(f03Var != null)) {
                jbVar = null;
            }
            if (jbVar != null) {
                java.util.LinkedList linkedList2 = jbVar.f65874xb5f7102a.f470022g;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "removeFinderLiveEntranceShowInfo " + source + " result:" + (linkedList2 != null ? java.lang.Boolean.valueOf(pm0.v.d0(linkedList2, nc2.b.f417636d)) : null));
                java.util.LinkedList linkedList3 = jbVar.f65874xb5f7102a.f470022g;
                if (linkedList3 != null) {
                    java.util.ArrayList<r45.f03> arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : linkedList3) {
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.f03) obj2).f455426m, "FinderLiveEntrance")) {
                            arrayList.add(obj2);
                        }
                    }
                    for (r45.f03 f03Var2 : arrayList) {
                        f03Var2.f455424h = 1;
                        f03Var2.f455426m = "";
                    }
                }
                r45.vs2 vs2Var = new r45.vs2();
                vs2Var.mo11468x92b714fd(jbVar.f65874xb5f7102a.mo14344x5f01b1f6());
                zy2.fa.D(((c61.l7) i95.n0.c(c61.l7.class)).nk(), vs2Var, "removeFinderLiveEntranceShowInfo", null, false, null, 28, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(r45.vs2 vs2Var) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        r45.f03 f03Var = null;
        if (vs2Var != null && (linkedList2 = vs2Var.f470022g) != null) {
            java.util.Iterator it = linkedList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.f03) next).f455425i, "NearbyLiveTab")) {
                    f03Var = next;
                    break;
                }
            }
            f03Var = f03Var;
        }
        r45.f03 f03Var2 = f03Var;
        if (!((vs2Var == null || (linkedList = vs2Var.f470022g) == null) ? false : pm0.v.d0(linkedList, nc2.c.f417637d)) || vs2Var == null || f03Var2 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb();
        jbVar.t0(vs2Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.j(x2Var, jbVar, f03Var2, 5, 2, null, null, 48, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0027 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "source"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r0, r1)
            java.lang.String r1 = "[removeNearByEntranceShowInfo] "
            java.lang.String r0 = r1.concat(r0)
            java.lang.String r1 = "Finder.NearbyRedDotLogic"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            java.lang.Class<c61.l7> r0 = c61.l7.class
            i95.m r1 = i95.n0.c(r0)
            c61.l7 r1 = (c61.l7) r1
            zy2.fa r1 = r1.nk()
            java.util.Set r1 = r1.W()
            java.util.Iterator r1 = r1.iterator()
        L27:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Ldd
            java.lang.Object r2 = r1.next()
            com.tencent.mm.plugin.finder.extension.reddot.jb r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) r2
            r45.vs2 r3 = r2.f65874xb5f7102a
            int r4 = r3.f470020e
            r5 = 1014(0x3f6, float:1.421E-42)
            java.lang.String r6 = "NearbyEntrance"
            r7 = 1
            r8 = 0
            if (r4 == r5) goto L66
            java.util.LinkedList r3 = r3.f470022g
            if (r3 == 0) goto L61
            java.util.Iterator r3 = r3.iterator()
        L47:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5d
            java.lang.Object r4 = r3.next()
            r5 = r4
            r45.f03 r5 = (r45.f03) r5
            java.lang.String r5 = r5.f455425i
            boolean r5 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r5, r6)
            if (r5 == 0) goto L47
            goto L5e
        L5d:
            r4 = r8
        L5e:
            r45.f03 r4 = (r45.f03) r4
            goto L62
        L61:
            r4 = r8
        L62:
            if (r4 == 0) goto L66
            r3 = r7
            goto L67
        L66:
            r3 = 0
        L67:
            if (r3 == 0) goto L6a
            goto L6b
        L6a:
            r2 = r8
        L6b:
            if (r2 == 0) goto L27
            r45.vs2 r3 = r2.f65874xb5f7102a
            java.util.LinkedList r3 = r3.f470022g
            if (r3 == 0) goto L78
            nc2.d r4 = nc2.d.f417638d
            pm0.v.d0(r3, r4)
        L78:
            r45.vs2 r3 = r2.f65874xb5f7102a
            java.util.LinkedList r3 = r3.f470022g
            if (r3 == 0) goto Lb7
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L87:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto La0
            java.lang.Object r5 = r3.next()
            r8 = r5
            r45.f03 r8 = (r45.f03) r8
            java.lang.String r8 = r8.f455426m
            boolean r8 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r8, r6)
            if (r8 == 0) goto L87
            r4.add(r5)
            goto L87
        La0:
            java.util.Iterator r3 = r4.iterator()
        La4:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lb7
            java.lang.Object r4 = r3.next()
            r45.f03 r4 = (r45.f03) r4
            r4.f455424h = r7
            java.lang.String r5 = ""
            r4.f455426m = r5
            goto La4
        Lb7:
            r45.vs2 r9 = new r45.vs2
            r9.<init>()
            r45.vs2 r2 = r2.f65874xb5f7102a
            byte[] r2 = r2.mo14344x5f01b1f6()
            r9.mo11468x92b714fd(r2)
            i95.m r2 = i95.n0.c(r0)
            c61.l7 r2 = (c61.l7) r2
            zy2.fa r8 = r2.nk()
            java.lang.String r10 = "removeNearByEntranceShowInfo"
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 28
            r15 = 0
            zy2.fa.D(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L27
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nc2.g.d(java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(r45.vs2 vs2Var) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        r45.f03 f03Var = null;
        if (vs2Var != null && (linkedList2 = vs2Var.f470022g) != null) {
            java.util.Iterator it = linkedList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.f03) next).f455425i, "NearbyEntrance")) {
                    f03Var = next;
                    break;
                }
            }
            f03Var = f03Var;
        }
        r45.f03 f03Var2 = f03Var;
        if (!((vs2Var == null || (linkedList = vs2Var.f470022g) == null) ? false : pm0.v.d0(linkedList, nc2.e.f417639d)) || vs2Var == null || f03Var2 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb();
        jbVar.t0(vs2Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.j(x2Var, jbVar, f03Var2, 5, 2, null, null, 48, null);
    }
}
