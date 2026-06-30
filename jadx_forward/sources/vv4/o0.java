package vv4;

/* loaded from: classes4.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19218x71796ad1 f522016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f522017f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522018g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f522019h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f522020i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19218x71796ad1 activityC19218x71796ad1, int i17, java.lang.String str2, int i18, long j17) {
        super(0);
        this.f522015d = str;
        this.f522016e = activityC19218x71796ad1;
        this.f522017f = i17;
        this.f522018g = str2;
        this.f522019h = i18;
        this.f522020i = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19218x71796ad1 activityC19218x71796ad1 = this.f522016e;
        long longExtra = activityC19218x71796ad1.getIntent().getLongExtra("key_msg_id", 0L);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(activityC19218x71796ad1.getIntent().getStringExtra("key_msg_talker"), longExtra);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6367x7875a8e4 c6367x7875a8e4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6367x7875a8e4();
        c6367x7875a8e4.r(java.lang.String.valueOf(java.lang.Long.valueOf(n17.I0())));
        c6367x7875a8e4.f137161f = activityC19218x71796ad1.getIntent().getIntExtra("key_source", 0);
        c6367x7875a8e4.f137160e = this.f522017f;
        c6367x7875a8e4.f137162g = 67;
        c6367x7875a8e4.q("");
        c6367x7875a8e4.p("");
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(n17.Q0())) {
            c6367x7875a8e4.f137165j = 2;
        } else {
            c6367x7875a8e4.f137165j = 1;
        }
        c6367x7875a8e4.t(this.f522018g);
        c6367x7875a8e4.s(kk.k.e(this.f522015d));
        c6367x7875a8e4.f137169n = this.f522019h;
        c6367x7875a8e4.f137168m = this.f522020i;
        c6367x7875a8e4.k();
        su4.k3.m(c6367x7875a8e4);
        return jz5.f0.f384359a;
    }
}
