package sc2;

/* loaded from: classes2.dex */
public final class a9 {

    /* renamed from: a, reason: collision with root package name */
    public final zy2.gc f487301a = new sc2.x8(this);

    /* renamed from: b, reason: collision with root package name */
    public yz5.p f487302b;

    /* renamed from: c, reason: collision with root package name */
    public android.app.Dialog f487303c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f487304d;

    public final void a(db5.g4 menu, android.content.Context context, int i17, int i18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (z17) {
            menu.g(i17, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cn6), com.p314xaae8f345.mm.R.raw.f80334xa4bb772d);
        } else {
            menu.g(i18, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f49), com.p314xaae8f345.mm.R.raw.f80332xde5160fd);
        }
    }

    public final void b(android.content.Context context, long j17, boolean z17, java.lang.String nonceId, yz5.p succCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(succCallback, "succCallback");
        this.f487302b = succCallback;
        this.f487304d = true;
        pm0.v.V(500L, new sc2.z8(this, context));
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        int i17 = !z17 ? 1 : 0;
        zy2.gc gcVar = this.f487301a;
        hb2.s sVar = hb2.s.f361621e;
        sVar.getClass();
        r45.mi2 mi2Var = new r45.mi2();
        mi2Var.set(0, java.lang.Long.valueOf(j17));
        mi2Var.set(1, java.lang.Integer.valueOf(i17));
        mi2Var.set(2, nonceId);
        hb2.w0.m(sVar, mi2Var, gcVar, false, false, null, null, 60, null);
    }
}
