package gf;

/* loaded from: classes7.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf.f1 f352566d;

    public d1(gf.f1 f1Var) {
        this.f352566d = f1Var;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [gf.c1] */
    @Override // java.lang.Runnable
    public final void run() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m137262x60866884;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df m137441x5e5b7e39;
        final gf.f1 f1Var = this.f352566d;
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1 = (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1) kz5.n0.Y(f1Var.f352589p);
        android.graphics.Bitmap m138025x12501425 = (c28553x45ef20c1 == null || (m137262x60866884 = c28553x45ef20c1.m137262x60866884()) == null || (m137441x5e5b7e39 = m137262x60866884.m137441x5e5b7e39()) == null) ? null : m137441x5e5b7e39.m138025x12501425();
        if (m138025x12501425 == null || m138025x12501425.isRecycled()) {
            return;
        }
        f1Var.setForeground(new android.graphics.drawable.BitmapDrawable(f1Var.getResources(), m138025x12501425));
        if (c28553x45ef20c1 != null) {
            c28553x45ef20c1.m137275xa2124329((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6) new p3321xbce91901.jvm.p3324x21ffc6bd.y(f1Var) { // from class: gf.c1
                @Override // p3321xbce91901.jvm.p3324x21ffc6bd.y, f06.s
                public java.lang.Object get() {
                    return ((gf.f1) this.f72685xcfcbe9ef).f352592s;
                }
            }.get());
        }
    }
}
