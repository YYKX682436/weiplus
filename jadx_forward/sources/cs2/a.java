package cs2;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f303591a = new java.util.ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object] */
    public final void a(int i17) {
        r45.r11 r11Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        java.lang.Object obj;
        bw5.v9 v9Var;
        java.lang.Object obj2;
        bw5.v9 v9Var2;
        if (i17 <= 0 && !this.f303591a.isEmpty()) {
            for (so2.j5 j5Var : this.f303591a) {
                if (j5Var instanceof so2.p1) {
                    pm0.v.u(j5Var.mo2128x1ed62e84());
                    r45.dm2 m76806xdef68064 = ((so2.p1) j5Var).getFeedObject().getFeedObject().m76806xdef68064();
                    if (m76806xdef68064 != null && (r11Var = (r45.r11) m76806xdef68064.m75936x14adae67(55)) != null && (m75934xbce7f2f = r11Var.m75934xbce7f2f(0)) != null) {
                        ((k20.a) ((c00.z3) i95.n0.c(c00.z3.class))).getClass();
                        java.util.LinkedList linkedList = new bw5.qf().mo11468x92b714fd(m75934xbce7f2f.g()).d().f110099d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getHeadMediaInfos(...)");
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.Iterator it = linkedList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            java.lang.Object next = it.next();
                            if (((bw5.kf) next).f110895d == 2) {
                                arrayList.add(next);
                            }
                        }
                        bw5.kf kfVar = (bw5.kf) kz5.n0.a0(arrayList, 0);
                        if (kfVar != null && kfVar.d() != null) {
                            p20.i iVar = p20.i.f432948a;
                            bw5.w9 d17 = kfVar.d();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getVideo(...)");
                            java.util.LinkedList linkedList2 = d17.f116147d;
                            if (((java.lang.Boolean) ((jz5.n) p20.i.f432955h).mo141623x754a37bb()).booleanValue()) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList2);
                                java.util.Iterator it6 = linkedList2.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        obj2 = it6.next();
                                        if (((bw5.v9) obj2).f115755g == 2) {
                                            break;
                                        }
                                    } else {
                                        obj2 = null;
                                        break;
                                    }
                                }
                                v9Var = (bw5.v9) obj2;
                                if (v9Var == null) {
                                    java.util.Iterator it7 = linkedList2.iterator();
                                    while (true) {
                                        if (it7.hasNext()) {
                                            v9Var2 = it7.next();
                                            if (((bw5.v9) v9Var2).f115755g == 1) {
                                                break;
                                            }
                                        } else {
                                            v9Var2 = 0;
                                            break;
                                        }
                                    }
                                    v9Var = v9Var2;
                                }
                            } else {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList2);
                                java.util.Iterator it8 = linkedList2.iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        obj = it8.next();
                                        if (((bw5.v9) obj).f115755g == 1) {
                                            break;
                                        }
                                    } else {
                                        obj = null;
                                        break;
                                    }
                                }
                                v9Var = (bw5.v9) obj;
                            }
                            if (v9Var != null) {
                                p3325xe03a0797.p3326xc267989b.l.d(p20.i.f432949b, null, null, new p20.b(v9Var, "finder_list", null), 3, null);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void b() {
        ((k20.a) ((c00.z3) i95.n0.c(c00.z3.class))).getClass();
        p3325xe03a0797.p3326xc267989b.l.d(p20.i.f432949b, null, null, new p20.h("finder_list", null), 3, null);
    }
}
