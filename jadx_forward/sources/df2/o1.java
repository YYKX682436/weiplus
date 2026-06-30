package df2;

/* loaded from: classes3.dex */
public final class o1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.p1 f312445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f312446e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(df2.p1 p1Var, int i17) {
        super(1);
        this.f312445d = p1Var;
        this.f312446e = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.v94 it = (r45.v94) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorLiveReplaySettingController", "New replay setting received: [" + it.m75933x41a8a7f2(0) + ',' + it.m75933x41a8a7f2(1) + ',' + it.m75933x41a8a7f2(2) + ',' + it.m75933x41a8a7f2(3) + ']');
        df2.p1 p1Var = this.f312445d;
        df2.p1.Z6(p1Var, it);
        if (this.f312446e == 1) {
            ((mm2.c1) p1Var.m56788xbba4bfc0(mm2.c1.class)).Y5 = it;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorLiveReplaySettingController", "modifyLiveReplaySetting: " + it);
            df2.n1 n1Var = new df2.n1(it, p1Var);
            dk2.xf P6 = p1Var.P6();
            if (P6 != null) {
                p1Var.O6();
                long m75942xfb822ef2 = ((mm2.e1) p1Var.m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
                long j17 = ((mm2.e1) p1Var.m56788xbba4bfc0(mm2.e1.class)).f410516m;
                dk2.r4 r4Var = (dk2.r4) P6;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4Var.f315542d, "setReplaySetting liveId:" + m75942xfb822ef2 + " objectId:" + j17 + " replaySetting:" + it.m75933x41a8a7f2(0) + ", " + it.m75933x41a8a7f2(2) + ", " + it.m75933x41a8a7f2(1) + ", " + it.m75933x41a8a7f2(3));
                pq5.g l17 = new ke2.g(m75942xfb822ef2, j17, ((mm2.c1) r4Var.m(mm2.c1.class)).f410399q, xy2.c.f(r4Var.f315541c), 0, null, null, null, it, 1073741824L, n1Var, null, 2288, null).l();
                java.lang.Object M = r4Var.M();
                if (M != null && (M instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
                    l17.f((im5.b) M);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
