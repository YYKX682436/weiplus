package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class f5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sb5.z f280543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f280544e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.g5 f280545f;

    public f5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.g5 g5Var, sb5.z zVar, android.content.Context context) {
        this.f280545f = g5Var;
        this.f280543d = zVar;
        this.f280544e = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingMoreBtnBarHelper", "delete message");
        sb5.z zVar = this.f280543d;
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5[] c16564xb55e1d5Arr = (com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5[]) ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).W.toArray(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5[0]);
        java.util.Arrays.sort(c16564xb55e1d5Arr, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.e5(this));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).I.f233598o;
        int size = arrayList2.size();
        int i18 = size;
        for (com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 : c16564xb55e1d5Arr) {
            do {
                size--;
                if (size >= 0) {
                    f9Var = ((rd5.d) arrayList2.get(size)).f475787d.f526833b;
                    if (f9Var.m124847x74d37ac6() <= c16564xb55e1d5.f231013d) {
                        break;
                    }
                }
            } while (f9Var.j2());
            long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
            long j17 = c16564xb55e1d5.f231013d;
            if (m124847x74d37ac6 == j17) {
                for (int i19 = i18 - 1; i19 > size; i19--) {
                    arrayList.add(tg3.l1.a(((rd5.d) arrayList2.get(i19)).f475787d.f526833b));
                }
                i18 = size;
            }
            do {
                size--;
                if (size < 0) {
                    break;
                }
            } while (((rd5.d) arrayList2.get(size)).f475787d.f526833b.m124847x74d37ac6() != j17);
            i18 = size;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.g5 g5Var = this.f280545f;
        int i27 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a1) ((sb5.l) g5Var.f280612d.f280113d.f542241c.a(sb5.l.class))).A;
        int i28 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a1) ((sb5.l) g5Var.f280612d.f280113d.f542241c.a(sb5.l.class))).B;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).W;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5 b5Var = g5Var.f280612d;
        android.content.Context context = this.f280544e;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingEditModeDelMsg", "do delete msg fail, context is null");
        } else if (copyOnWriteArraySet == null || copyOnWriteArraySet.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingEditModeDelMsg", "do delete msg fail, select ids is empty");
        } else {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5.f280226t.a(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.h3(copyOnWriteArraySet, db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bot), true, false, null), b5Var));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingEditModeDelMsg", "do delete msg by QuickSelect, ClickCount=%d, ResultCount=%d", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28));
            pm0.v.K(null, new yd5.l(4L, copyOnWriteArraySet.size(), 0L, i27, i28, 1L));
        }
        if (arrayList.size() > 0) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.i3.a(context, new java.util.concurrent.CopyOnWriteArraySet(arrayList), g5Var.f280612d);
        }
        tb5.i0 i0Var = tb5.i0.f498588a;
        java.util.List p07 = g5Var.f280612d.p0();
        tb5.g0 state = g5Var.f280612d.f280236q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        i0Var.b("multi_select_msg_del_succ", p07, state);
        g5Var.f280612d.o0();
    }
}
