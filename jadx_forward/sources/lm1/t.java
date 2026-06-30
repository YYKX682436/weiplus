package lm1;

/* loaded from: classes7.dex */
public final class t implements bg.a {

    /* renamed from: a, reason: collision with root package name */
    public bg.f f400892a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f400893b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.Surface f400894c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f400895d;

    /* renamed from: e, reason: collision with root package name */
    public android.util.Size f400896e;

    /* renamed from: f, reason: collision with root package name */
    public volatile android.view.Surface f400897f;

    public final void a() {
        ae.r rVar;
        if (this.f400893b) {
            return;
        }
        android.view.Surface surface = this.f400894c;
        java.lang.ref.WeakReference weakReference = this.f400895d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = weakReference != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) weakReference.get() : null;
        android.util.Size size = this.f400896e;
        if (surface == null || n7Var == null || size == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 U1 = n7Var.U1();
        com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad w17 = (U1 == null || (rVar = (ae.r) U1.z1(ae.r.class)) == null) ? null : rVar.w();
        if (w17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoCanvasExtTextureProducerMBImpl", "tryRegisterProducerIfNeed, magicBrush is null");
            return;
        }
        com.p314xaae8f345.p485x5dc4f1ad.p486xa7b754fd.C4211x20e2c38e c4211x20e2c38e = w17.f130115f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c4211x20e2c38e, "getExternalTexturePlugin(...)");
        bg.f fVar = this.f400892a;
        if (fVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoPluginHandler");
            throw null;
        }
        bh.a.a(c4211x20e2c38e, "video", fVar.f334030d, size.getWidth(), size.getHeight(), surface, new lm1.s(this, surface), null, false, 192, null);
        this.f400893b = true;
    }
}
