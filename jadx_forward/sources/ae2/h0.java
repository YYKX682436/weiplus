package ae2;

/* loaded from: classes5.dex */
public final class h0 extends ob2.a {

    /* renamed from: u, reason: collision with root package name */
    public int f85172u;

    public h0() {
        super(1, "直播间SurfaceView切换", null, null, 12, null);
        this.f85172u = -1;
    }

    @Override // lb2.j
    public java.lang.Object r() {
        if (this.f85172u == -1) {
            this.f85172u = ((java.lang.Number) super.r()).intValue() != 1 ? 0 : 1;
        }
        return java.lang.Integer.valueOf(this.f85172u);
    }
}
