package df2;

/* loaded from: classes3.dex */
public final class ne extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ym1 f312384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.qe f312385e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne(r45.ym1 ym1Var, df2.qe qeVar) {
        super(0);
        this.f312384d = ym1Var;
        this.f312385e = qeVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.ym1 ym1Var = this.f312384d;
        int size = ym1Var.m75941xfb821914(1).size();
        df2.qe qeVar = this.f312385e;
        if (size > 0) {
            dk2.y4 y4Var = (dk2.y4) ((mm2.c1) qeVar.m56788xbba4bfc0(mm2.c1.class)).f410370l4.peek();
            java.util.concurrent.PriorityBlockingQueue priorityBlockingQueue = ((mm2.c1) qeVar.m56788xbba4bfc0(mm2.c1.class)).f410370l4;
            java.util.LinkedList<r45.vm1> m75941xfb821914 = ym1Var.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getButton_animation_infos(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
            for (r45.vm1 vm1Var : m75941xfb821914) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(vm1Var);
                arrayList.add(new dk2.y4(vm1Var));
            }
            priorityBlockingQueue.addAll(arrayList);
            java.util.LinkedList m75941xfb8219142 = ym1Var.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getButton_animation_infos(...)");
            boolean z17 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(y4Var, ((mm2.c1) qeVar.m56788xbba4bfc0(mm2.c1.class)).f410370l4.peek());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(qeVar, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new df2.ge(m75941xfb8219142, qeVar, null), 2, null);
            p3325xe03a0797.p3326xc267989b.r2 r2Var = qeVar.f312692n;
            if (((r2Var == null || ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) ? false : true) || qeVar.f312692n == null) {
                qeVar.e7();
            } else if (z17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("needRestartJob, ");
                p3325xe03a0797.p3326xc267989b.f1 f1Var = qeVar.f312693o;
                sb6.append(f1Var != null ? java.lang.Integer.valueOf(f1Var.hashCode()) : null);
                java.lang.String sb7 = sb6.toString();
                int i17 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveButtonChangeController", sb7, null);
                p3325xe03a0797.p3326xc267989b.f1 f1Var2 = qeVar.f312693o;
                if (f1Var2 != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(f1Var2, null, 1, null);
                }
            }
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ym1Var.m75945x2fec8307(2), ((mm2.c1) qeVar.m56788xbba4bfc0(mm2.c1.class)).f410382n4)) {
            ((mm2.c1) qeVar.m56788xbba4bfc0(mm2.c1.class)).f410382n4 = ym1Var.m75945x2fec8307(2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g b76 = qeVar.b7();
            if ((b76 == null || b76.x1()) ? false : true) {
                qeVar.d7();
            }
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ym1Var.m75945x2fec8307(4), ((mm2.c1) qeVar.m56788xbba4bfc0(mm2.c1.class)).f410388o4)) {
            ((mm2.c1) qeVar.m56788xbba4bfc0(mm2.c1.class)).f410388o4 = ym1Var.m75945x2fec8307(4);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g b77 = qeVar.b7();
            if (b77 != null && b77.x1()) {
                qeVar.d7();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g b78 = qeVar.b7();
        boolean y17 = b78 != null ? b78.y1() : false;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ym1Var.m75945x2fec8307(5), ((mm2.c1) qeVar.m56788xbba4bfc0(mm2.c1.class)).f410396p4) || y17 != qeVar.f312691m) {
            ((mm2.c1) qeVar.m56788xbba4bfc0(mm2.c1.class)).f410396p4 = ym1Var.m75945x2fec8307(5);
            qeVar.f312691m = y17;
            if (y17) {
                qeVar.d7();
            }
        }
        if (ym1Var.m75941xfb821914(0).size() > 0) {
            java.util.LinkedList m75941xfb8219143 = ym1Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getButton_infos(...)");
            qeVar.Z6(m75941xfb8219143);
        }
        if (ym1Var.m75941xfb821914(6).size() > 0) {
            java.util.LinkedList m75941xfb8219144 = ym1Var.m75941xfb821914(6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219144, "getGlobal_button_infos(...)");
            java.util.Iterator it = m75941xfb8219144.iterator();
            boolean z18 = false;
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) dk2.ef.f314943y.get(java.lang.Integer.valueOf(((r45.xm1) it.next()).m75939xb282bd08(0)));
                if (str == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "")) {
                    z18 = true;
                }
            }
            if (z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(qeVar, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new df2.je(m75941xfb8219144, qeVar, null), 2, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
