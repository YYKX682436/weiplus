package go0;

/* loaded from: classes14.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.v0 f355369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f355370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.util.Size f355371f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f355372g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.util.Size f355373h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(go0.v0 v0Var, int i17, android.util.Size size, android.graphics.Point point, android.util.Size size2) {
        super(0);
        this.f355369d = v0Var;
        this.f355370e = i17;
        this.f355371f = size;
        this.f355372g = point;
        this.f355373h = size2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Boolean bool;
        go0.w0 B;
        go0.w0 B2;
        go0.v0 v0Var = this.f355369d;
        go0.b1 b1Var = v0Var.f355413g;
        android.util.Size size = this.f355373h;
        android.graphics.Point point = this.f355372g;
        android.util.Size size2 = this.f355371f;
        if (b1Var == null || (B2 = b1Var.B()) == null) {
            bool = null;
        } else {
            bool = java.lang.Boolean.valueOf(point.x == B2.f355423a && point.y == B2.f355424b && size.getWidth() == B2.f355425c && size.getHeight() == B2.f355426d && size2.getWidth() == B2.f355427e && size2.getHeight() == B2.f355428f);
        }
        go0.b1 b1Var2 = v0Var.f355413g;
        if (b1Var2 != null) {
            b1Var2.R = this.f355370e;
        }
        if (b1Var2 != null && (B = b1Var2.B()) != null) {
            B.f355423a = point.x;
            B.f355424b = point.y;
            B.f355425c = size.getWidth();
            B.f355426d = size.getHeight();
            B.f355427e = size2.getWidth();
            B.f355428f = size2.getHeight();
        }
        go0.b1 b1Var3 = v0Var.f355413g;
        if (b1Var3 != null) {
            android.graphics.Point point2 = new android.graphics.Point(0, size2.getHeight());
            android.graphics.Point point3 = new android.graphics.Point(size2.getWidth(), 0);
            b1Var3.A = point2;
            b1Var3.B = point3;
        }
        if (v0Var.f355415i == go0.q0.f355351e) {
            go0.v0.a(v0Var);
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.FALSE)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateRenderOriginal Renderer info:");
            go0.b1 b1Var4 = v0Var.f355413g;
            sb6.append(b1Var4 != null ? b1Var4.C() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveScreenShareRender", sb6.toString());
            go0.b1 b1Var5 = v0Var.f355413g;
            if (b1Var5 != null) {
                b1Var5.P++;
            }
        }
        return jz5.f0.f384359a;
    }
}
