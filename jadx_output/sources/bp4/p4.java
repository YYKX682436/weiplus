package bp4;

/* loaded from: classes10.dex */
public final class p4 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.RectF f23344f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.RectF f23345g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.RelativeLayout f23346h;

    /* renamed from: i, reason: collision with root package name */
    public final int f23347i;

    /* renamed from: m, reason: collision with root package name */
    public final int f23348m;

    /* renamed from: n, reason: collision with root package name */
    public final int f23349n;

    /* renamed from: o, reason: collision with root package name */
    public final dp4.a f23350o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(android.view.ViewGroup parent, ju3.d0 status) {
        super(status, null);
        java.util.HashMap hashMap;
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        this.f23344f = new android.graphics.RectF();
        this.f23345g = new android.graphics.RectF();
        android.view.View findViewById = parent.findViewById(com.tencent.mm.R.id.f486397l41);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
        this.f23346h = relativeLayout;
        this.f23347i = parent.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479716d9);
        this.f23348m = parent.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9);
        this.f23349n = parent.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.by);
        this.f23350o = new dp4.a();
        com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.a5w, (android.view.ViewGroup) relativeLayout, true);
        android.view.View findViewById2 = relativeLayout.findViewById(com.tencent.mm.R.id.aft);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        android.view.View findViewById3 = relativeLayout.findViewById(com.tencent.mm.R.id.imc);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.view.View findViewById4 = relativeLayout.findViewById(com.tencent.mm.R.id.imj);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        weImageView.setIconColor(-1);
        weImageView.setVisibility(8);
        relativeLayout.setVisibility(8);
        dp4.b bVar = dp4.b.f242262a;
        if (com.tencent.mm.sdk.platformtools.o4.M("FINDER_CONFIG_USER_KEY").getInt("USERINFO_FINDER_SHOW_IMAGE_ENHANCEMENT_SETTING_INT_SYNC", 0) == 1) {
            try {
                hashMap = bVar.c(new org.json.JSONArray(com.tencent.mm.vfs.w6.M(dp4.b.f242263b)));
            } catch (java.lang.Exception unused) {
                hashMap = dp4.b.f242264c;
            }
            if (hashMap != null) {
                java.util.HashMap hashMap2 = dp4.b.f242265d;
                hashMap2.clear();
                hashMap2.putAll(hashMap);
                dp4.b.f242262a.d();
            }
        }
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
    }

    public final void z(android.graphics.RectF rect) {
        kotlin.jvm.internal.o.g(rect, "rect");
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPreviewDecorationPlugin", "setVisibleRect:" + rect + ", animator:0, isRunning:" + ((java.lang.Object) null));
        android.graphics.RectF rectF = this.f23344f;
        if (kotlin.jvm.internal.o.b(rectF, rect)) {
            this.f23345g.set(rect);
            return;
        }
        rectF.set(rect);
        android.widget.RelativeLayout relativeLayout = this.f23346h;
        android.view.ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        float height = ((int) rectF.top) + rectF.height();
        int i17 = this.f23347i;
        int i18 = this.f23348m;
        marginLayoutParams.topMargin = (int) ((height - i17) - i18);
        marginLayoutParams.leftMargin = (int) (((rectF.width() + rectF.left) - i17) - i18);
        relativeLayout.setLayoutParams(marginLayoutParams);
    }
}
