package iw4;

/* loaded from: classes15.dex */
public final class g implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f376788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.ui.ActivityC19250xb79f2208 f376789b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f376790c;

    public g(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.ui.ActivityC19250xb79f2208 activityC19250xb79f2208, android.content.Context context) {
        this.f376788a = h0Var;
        this.f376789b = activityC19250xb79f2208;
        this.f376790c = context;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9 v9Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f376788a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.ui.ActivityC19250xb79f2208 activityC19250xb79f2208 = this.f376789b;
        if (z17) {
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.a6 a6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.a6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.a6.class);
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = (com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var.f391656d;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.u0) a6Var).getClass();
            y75.d dVar = y75.a.f541319a;
            if (dVar != null && (v9Var = dVar.f402101d) != null) {
                v9Var.b((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb);
            }
            tg3.a1 a17 = tg3.t1.a();
            com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc c21007x2f4a06dc = activityC19250xb79f2208.f263583d.f376778e;
            ((dk5.s5) a17).Ui(str, c21007x2f4a06dc != null ? c21007x2f4a06dc.f274687i : null);
            android.content.Context context = this.f376790c;
            db5.t7.m123883x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572086yc), 1).show();
        }
        activityC19250xb79f2208.V6((com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var.f391656d, z17);
    }
}
