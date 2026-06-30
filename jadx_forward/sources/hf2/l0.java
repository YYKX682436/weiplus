package hf2;

/* loaded from: classes5.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p475x4a451306.C4100x1244b2fb f362631a;

    /* renamed from: b, reason: collision with root package name */
    public android.os.HandlerThread f362632b;

    /* renamed from: c, reason: collision with root package name */
    public android.os.Handler f362633c;

    /* renamed from: d, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f362634d;

    /* renamed from: e, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f362635e;

    public final void a(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(source);
            sb6.append(" release initJob is activate:");
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f362635e;
            sb6.append(r2Var != null ? java.lang.Boolean.valueOf(r2Var.a()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorStickerMaasLogic", sb6.toString());
            p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f362635e;
            if (r2Var2 != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
            }
            com.p314xaae8f345.p457x3304c6.p475x4a451306.C4100x1244b2fb c4100x1244b2fb = this.f362631a;
            if (c4100x1244b2fb != null) {
                c4100x1244b2fb.e();
            }
            p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f362634d;
            if (y0Var != null) {
                p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new hf2.k0(null), 3, null);
            }
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "Finder.LiveAnchorStickerMaasLogic release");
        }
    }
}
