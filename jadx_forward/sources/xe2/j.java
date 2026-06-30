package xe2;

/* loaded from: classes3.dex */
public final class j extends we2.z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        java.util.Iterator it = msgList.iterator();
        while (it.hasNext()) {
            r45.ch1 ch1Var = (r45.ch1) it.next();
            int m75939xb282bd08 = ch1Var.m75939xb282bd08(1);
            r45.lk1 lk1Var = null;
            r45.ch1 ch1Var2 = null;
            lk1Var = null;
            if (m75939xb282bd08 == 20038) {
                mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
                if (c1Var != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it6 = msgList.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it6.next();
                        if (((r45.ch1) next).m75939xb282bd08(1) == 20038) {
                            arrayList.add(next);
                        }
                    }
                    java.util.Iterator it7 = arrayList.iterator();
                    if (it7.hasNext()) {
                        ?? next2 = it7.next();
                        if (it7.hasNext()) {
                            long m75942xfb822ef2 = ((r45.ch1) next2).m75942xfb822ef2(12);
                            do {
                                java.lang.Object next3 = it7.next();
                                long m75942xfb822ef22 = ((r45.ch1) next3).m75942xfb822ef2(12);
                                next2 = next2;
                                if (m75942xfb822ef2 < m75942xfb822ef22) {
                                    next2 = next3;
                                    m75942xfb822ef2 = m75942xfb822ef22;
                                }
                            } while (it7.hasNext());
                        }
                        ch1Var2 = next2;
                    }
                    r45.ch1 ch1Var3 = ch1Var2;
                    if (ch1Var3 != null && (m75934xbce7f2f = ch1Var3.m75934xbce7f2f(4)) != null) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("localCheerInfo:");
                        mm2.v0 v0Var = c1Var.E3;
                        sb6.append(v0Var);
                        java.lang.String sb7 = sb6.toString();
                        java.lang.String str = c1Var.f410333f;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
                        if (v0Var.f411005e == 0) {
                            r45.mk1 mk1Var = new r45.mk1();
                            try {
                                mk1Var.mo11468x92b714fd(m75934xbce7f2f.g());
                            } catch (java.lang.Exception e17) {
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "remoteCheerInfo:" + pm0.b0.g(mk1Var));
                            c1Var.O9((r45.on1) mk1Var.m75936x14adae67(0));
                        }
                    }
                }
            } else if (m75939xb282bd08 == 20075) {
                r45.lk1 lk1Var2 = new r45.lk1();
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f2 = ch1Var.m75934xbce7f2f(4);
                byte[] g17 = m75934xbce7f2f2 != null ? m75934xbce7f2f2.g() : null;
                if (g17 != null) {
                    try {
                        lk1Var2.mo11468x92b714fd(g17);
                        lk1Var = lk1Var2;
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e18);
                    }
                }
                ((mm2.l0) this.f526800a.a(mm2.l0.class)).P6(lk1Var);
            }
        }
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20038, 20075};
    }
}
