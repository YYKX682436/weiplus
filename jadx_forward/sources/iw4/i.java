package iw4;

/* loaded from: classes15.dex */
public final class i implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.ui.ActivityC19250xb79f2208 f376793a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f376794b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f376795c;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.ui.ActivityC19250xb79f2208 activityC19250xb79f2208, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.content.Context context) {
        this.f376793a = activityC19250xb79f2208;
        this.f376794b = h0Var;
        this.f376795c = context;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f376794b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.ui.ActivityC19250xb79f2208 activityC19250xb79f2208 = this.f376793a;
        if (z17) {
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.y5 y5Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.y5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.y5.class);
            com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc c21007x2f4a06dc = activityC19250xb79f2208.f263583d.f376778e;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.s0) y5Var).Ai(c21007x2f4a06dc != null ? c21007x2f4a06dc.f274687i : null, (com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var.f391656d, null);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                tg3.a1 a17 = tg3.t1.a();
                com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc c21007x2f4a06dc2 = activityC19250xb79f2208.f263583d.f376778e;
                ((dk5.s5) a17).Ui(str, c21007x2f4a06dc2 != null ? c21007x2f4a06dc2.f274687i : null);
            }
            android.content.Context context = this.f376795c;
            db5.t7.m123883x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572086yc), 1).show();
        }
        activityC19250xb79f2208.V6((com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var.f391656d, z17);
    }
}
