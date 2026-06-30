package s22;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f483822a;

    /* renamed from: b, reason: collision with root package name */
    public int f483823b;

    /* renamed from: c, reason: collision with root package name */
    public int f483824c;

    /* renamed from: d, reason: collision with root package name */
    public int f483825d;

    /* renamed from: e, reason: collision with root package name */
    public p05.l4 f483826e;

    /* renamed from: f, reason: collision with root package name */
    public int f483827f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f483828g = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("xlab_effect_config").getBoolean("effect", true);

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f483829h;

    public final void a(t85.j jVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("changeSticker: ");
        sb6.append(this.f483829h);
        sb6.append(", ");
        sb6.append(jVar != null ? jVar.f498007a : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFilterProcess", sb6.toString());
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f483829h, jVar != null ? jVar.f498007a : null)) {
            return;
        }
        this.f483829h = jVar != null ? jVar.f498007a : null;
        p05.l4 l4Var = this.f483826e;
        if (l4Var != null) {
            l4Var.i(jVar);
        }
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFilterProcess", "clear %s %d", this, java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        try {
            android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{this.f483827f}, 0);
            p05.l4 l4Var = this.f483826e;
            if (l4Var != null) {
                l4Var.o();
            }
            this.f483826e = null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EmojiFilterProcess", e17, "clear error: %s", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markSdkReleaseFailed");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1012L, 15L, 1L);
        }
    }
}
