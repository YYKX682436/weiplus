package zk3;

/* loaded from: classes8.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zk3.w0 f555024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f555025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c f555026f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f555027g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f555028h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(zk3.w0 w0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c, int i18, android.graphics.Bitmap bitmap) {
        super(0);
        this.f555024d = w0Var;
        this.f555025e = i17;
        this.f555026f = c16601x7ed0e40c;
        this.f555027g = i18;
        this.f555028h = bitmap;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.lr4 v07;
        zk3.w0 w0Var = this.f555024d;
        android.view.ViewParent parent = w0Var.m80380x71e92c1d().getParent();
        java.lang.Integer num = null;
        if ((parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null) != null) {
            float width = r1.getWidth() / this.f555025e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f555026f;
            if (c16601x7ed0e40c != null && (v07 = c16601x7ed0e40c.v0()) != null) {
                num = java.lang.Integer.valueOf(v07.m75939xb282bd08(9));
            }
            if (num != null && num.intValue() == 90) {
                width = r1.getHeight() / this.f555027g;
            }
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.setScale(width, width);
            ((android.widget.ImageView) w0Var.m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.ui9)).setImageMatrix(matrix);
            ((android.widget.ImageView) w0Var.m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.ui9)).setImageBitmap(this.f555028h);
        }
        return jz5.f0.f384359a;
    }
}
