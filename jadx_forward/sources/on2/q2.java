package on2;

/* loaded from: classes3.dex */
public final class q2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ht1 f428529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ on2.z2 f428530e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(r45.ht1 ht1Var, on2.z2 z2Var) {
        super(0);
        this.f428529d = ht1Var;
        this.f428530e = z2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList<r45.zy1> m75941xfb8219142;
        java.lang.Integer num;
        java.util.LinkedList m75941xfb8219143;
        r45.cz1 cz1Var;
        r45.ht1 ht1Var = this.f428529d;
        if (ht1Var != null) {
            r45.cz1 cz1Var2 = (r45.cz1) ht1Var.m75936x14adae67(1);
            java.lang.String m75945x2fec8307 = cz1Var2 != null ? cz1Var2.m75945x2fec8307(0) : null;
            on2.z2 z2Var = this.f428530e;
            r45.ht1 ht1Var2 = z2Var.f428627o;
            java.lang.String m75945x2fec83072 = (ht1Var2 == null || (cz1Var = (r45.cz1) ht1Var2.m75936x14adae67(1)) == null) ? null : cz1Var.m75945x2fec8307(0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLotterySlice", "mergeLotteryRecord localRecordLotteryId:" + m75945x2fec83072 + ",remoteRecordId:" + m75945x2fec8307);
            if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                if ((m75945x2fec83072 == null || m75945x2fec83072.length() == 0) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec83072, m75945x2fec8307)) {
                    z2Var.e7(ht1Var);
                } else {
                    r45.ht1 ht1Var3 = z2Var.f428627o;
                    if (ht1Var3 != null) {
                        ht1Var3.set(1, (r45.cz1) ht1Var.m75936x14adae67(1));
                        ht1Var3.set(2, ht1Var.m75934xbce7f2f(2));
                        ht1Var3.set(3, java.lang.Integer.valueOf(ht1Var.m75939xb282bd08(3)));
                        ht1Var3.set(9, ht1Var.m75945x2fec8307(9));
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        r45.jz1 jz1Var = (r45.jz1) ht1Var.m75936x14adae67(4);
                        if (jz1Var != null && (m75941xfb8219142 = jz1Var.m75941xfb821914(0)) != null) {
                            for (r45.zy1 zy1Var : m75941xfb8219142) {
                                r45.jz1 jz1Var2 = (r45.jz1) ht1Var3.m75936x14adae67(4);
                                if (jz1Var2 == null || (m75941xfb8219143 = jz1Var2.m75941xfb821914(0)) == null) {
                                    num = null;
                                } else {
                                    java.util.Iterator it = m75941xfb8219143.iterator();
                                    int i17 = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            i17 = -1;
                                            break;
                                        }
                                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.zy1) it.next()).m75945x2fec8307(0), zy1Var.m75945x2fec8307(0))) {
                                            break;
                                        }
                                        i17++;
                                    }
                                    num = java.lang.Integer.valueOf(i17);
                                }
                                if (num != null && num.intValue() == -1) {
                                    linkedList.add(zy1Var);
                                }
                            }
                        }
                        r45.jz1 jz1Var3 = (r45.jz1) ht1Var3.m75936x14adae67(4);
                        if (jz1Var3 != null && (m75941xfb821914 = jz1Var3.m75941xfb821914(0)) != null) {
                            m75941xfb821914.addAll(linkedList);
                        }
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("after mergeLotteryRecord lotteryRecord:");
                    java.lang.Object obj = z2Var.f428627o;
                    if (obj == null) {
                        obj = "";
                    }
                    sb6.append(pm0.b0.g(obj));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLotterySlice", sb6.toString());
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
