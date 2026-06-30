package xk3;

/* loaded from: classes8.dex */
public final class g implements p11.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xk3.i f536562a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f536563b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f536564c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f536565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c f536566e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f536567f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f536568g;

    public g(xk3.i iVar, in5.s0 s0Var, java.lang.String str, android.widget.ImageView imageView, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c, android.widget.ImageView imageView2, android.view.View view) {
        this.f536562a = iVar;
        this.f536563b = s0Var;
        this.f536564c = str;
        this.f536565d = imageView;
        this.f536566e = c16601x7ed0e40c;
        this.f536567f = imageView2;
        this.f536568g = view;
    }

    @Override // p11.k
    public final void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, java.lang.Object[] objArr) {
        jz5.f0 f0Var = null;
        f0Var = null;
        android.widget.ImageView imageView = view instanceof android.widget.ImageView ? (android.widget.ImageView) view : null;
        if (imageView != null && bitmap != null) {
            xk3.i iVar = this.f536562a;
            iVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTask.MinusScreenRoundCornerConvert", "loadImage callback " + imageView.hashCode() + ' ' + bitmap);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 o17 = this.f536563b.o();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = o17 != null ? o17.getLayoutManager() : null;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) layoutManager : null;
            int i17 = c1161x57298f5d != null ? c1161x57298f5d.f93394w : 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.b.f232092a.getClass();
            float g17 = (com.p314xaae8f345.mm.ui.bk.g() - (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.a.f232091b * (i17 + 1))) / (i17 * bitmap.getWidth());
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.setScale(g17, g17);
            pm0.v.X(new xk3.e(imageView, matrix, bitmap, iVar));
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            android.widget.ImageView imageView2 = this.f536565d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f536566e;
            android.widget.ImageView imageView3 = this.f536567f;
            android.view.View view2 = this.f536568g;
            in5.s0 s0Var = this.f536563b;
            n11.a.b().a(this.f536564c, imageView2);
            pm0.v.X(new xk3.f(c16601x7ed0e40c, imageView3, imageView2, view2, s0Var));
        }
    }
}
