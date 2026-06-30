package df2;

/* loaded from: classes3.dex */
public final class q4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.r4 f312665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f312666e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.tm1 f312667f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f312668g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(df2.r4 r4Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, r45.tm1 tm1Var, java.lang.String str) {
        super(0);
        this.f312665d = r4Var;
        this.f312666e = c0Var;
        this.f312667f = tm1Var;
        this.f312668g = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        df2.r4 r4Var = this.f312665d;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = r4Var.f312754q;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        r45.tm1 tm1Var = this.f312667f;
        java.lang.String str = this.f312668g;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f312666e;
        int i17 = c0Var.f391645d ? 2 : 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSubscribeNextLiveGuideController", "CgiFinderAudienceReserveLiveNotification do op=" + i17);
        ke2.b bVar = new ke2.b(((mm2.c1) r4Var.m56788xbba4bfc0(mm2.c1.class)).f410385o, 2, i17, null, 1, ((mm2.e1) r4Var.m56788xbba4bfc0(mm2.e1.class)).f410516m, java.lang.Long.valueOf(((mm2.e1) r4Var.m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
        bVar.t(r4Var.O6(), r4Var.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 500L);
        bVar.l().K(new df2.p4(i17, c0Var, r4Var, tm1Var, str));
        return jz5.f0.f384359a;
    }
}
