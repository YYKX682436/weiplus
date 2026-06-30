package lh;

/* loaded from: classes12.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final lh.t f400157d;

    /* renamed from: e, reason: collision with root package name */
    public final int f400158e;

    /* renamed from: f, reason: collision with root package name */
    public final float f400159f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f400160g;

    public q(lh.t inspector, int i17, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inspector, "inspector");
        this.f400157d = inspector;
        this.f400158e = i17;
        this.f400159f = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        rh.c1 c1Var;
        if (this.f400160g || (c1Var = this.f400157d.f400169c) == null || !(c1Var instanceof gi.w0)) {
            return;
        }
        gi.w0 w0Var = (gi.w0) c1Var;
        if (w0Var.E()) {
            gi.w0 m17 = w0Var.m();
            m17.l();
            m17.q(new lh.p(m17, this));
        }
    }
}
