package mm2;

/* loaded from: classes3.dex */
public final class g5 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public double f410622f;

    /* renamed from: g, reason: collision with root package name */
    public r45.p52 f410623g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f410624h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f410625i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
    }

    public final void N6() {
        r45.kf5 kf5Var = ((mm2.o4) m147920xbba4bfc0(mm2.o4.class)).U.f458665g;
        if (kf5Var == null) {
            java.util.regex.Pattern pattern = pm0.v.f438335a;
        } else if (kf5Var.f460191f == 0 || kf5Var.f460189d == 0) {
            ((mm2.o4) m147920xbba4bfc0(mm2.o4.class)).U.f458665g = null;
            java.util.regex.Pattern pattern2 = pm0.v.f438335a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LivePayMicSlice", "checkPaySettingValid reset");
        }
    }

    public final void O6(r45.wz1 micInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micInfo, "micInfo");
        r45.p52 p52Var = (r45.p52) micInfo.m75936x14adae67(17);
        if (p52Var != null) {
            this.f410623g = p52Var;
        }
        if (!(micInfo.m75937x160e9ec7(18) == 0.0d)) {
            this.f410622f = micInfo.m75937x160e9ec7(18);
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) micInfo.m75936x14adae67(19);
        if (c19786x6a1e2862 != null) {
            this.f410624h = c19786x6a1e2862;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) micInfo.m75936x14adae67(21);
        if (c19786x6a1e28622 != null) {
            this.f410625i = c19786x6a1e28622;
        }
    }
}
