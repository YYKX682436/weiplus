package my2;

/* loaded from: classes.dex */
public final class h0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ my2.k0 f414267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.me2 f414268b;

    public h0(my2.k0 k0Var, r45.me2 me2Var) {
        this.f414267a = k0Var;
        this.f414268b = me2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            my2.k0 k0Var = this.f414267a;
            k0Var.getClass();
            r45.me2 me2Var = this.f414268b;
            if (!((me2Var != null ? me2Var.m75939xb282bd08(13) : 0) == 1)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveVoteCardPlugin", "setStopVoteSpan: can_cancel revoked, skip stop voting");
                return;
            }
            r45.le2 le2Var = new r45.le2();
            le2Var.set(4, me2Var != null ? me2Var.m75945x2fec8307(5) : null);
            le2Var.set(1, me2Var != null ? me2Var.m75945x2fec8307(1) : null);
            le2Var.set(0, java.lang.Integer.valueOf(me2Var != null ? me2Var.m75939xb282bd08(0) : 0));
            le2Var.set(3, java.lang.Integer.valueOf(me2Var != null ? me2Var.m75939xb282bd08(7) : 0));
            k0Var.A.a();
            mm2.e1 e1Var = (mm2.e1) k0Var.P0(mm2.e1.class);
            pq5.g l17 = new ly2.b(e1Var.f410521r.m75942xfb822ef2(0), e1Var.f410516m, e1Var.f410525v, le2Var, 1).l();
            l17.K(new my2.g0(k0Var, me2Var));
            android.content.Context context = k0Var.f446856d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context);
        }
    }
}
