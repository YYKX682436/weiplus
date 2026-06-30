package bp4;

/* loaded from: classes10.dex */
public final class p4 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.RectF f104877f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.RectF f104878g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.RelativeLayout f104879h;

    /* renamed from: i, reason: collision with root package name */
    public final int f104880i;

    /* renamed from: m, reason: collision with root package name */
    public final int f104881m;

    /* renamed from: n, reason: collision with root package name */
    public final int f104882n;

    /* renamed from: o, reason: collision with root package name */
    public final dp4.a f104883o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(android.view.ViewGroup parent, ju3.d0 status) {
        super(status, null);
        java.util.HashMap hashMap;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f104877f = new android.graphics.RectF();
        this.f104878g = new android.graphics.RectF();
        android.view.View findViewById = parent.findViewById(com.p314xaae8f345.mm.R.id.f567930l41);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
        this.f104879h = relativeLayout;
        this.f104880i = parent.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561249d9);
        this.f104881m = parent.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        this.f104882n = parent.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.by);
        this.f104883o = new dp4.a();
        com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a5w, (android.view.ViewGroup) relativeLayout, true);
        android.view.View findViewById2 = relativeLayout.findViewById(com.p314xaae8f345.mm.R.id.aft);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById2;
        android.view.View findViewById3 = relativeLayout.findViewById(com.p314xaae8f345.mm.R.id.imc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.view.View findViewById4 = relativeLayout.findViewById(com.p314xaae8f345.mm.R.id.imj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        c22699x3dcdb352.m82040x7541828(-1);
        c22699x3dcdb352.setVisibility(8);
        relativeLayout.setVisibility(8);
        dp4.b bVar = dp4.b.f323795a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("FINDER_CONFIG_USER_KEY").getInt("USERINFO_FINDER_SHOW_IMAGE_ENHANCEMENT_SETTING_INT_SYNC", 0) == 1) {
            try {
                hashMap = bVar.c(new org.json.JSONArray(com.p314xaae8f345.mm.vfs.w6.M(dp4.b.f323796b)));
            } catch (java.lang.Exception unused) {
                hashMap = dp4.b.f323797c;
            }
            if (hashMap != null) {
                java.util.HashMap hashMap2 = dp4.b.f323798d;
                hashMap2.clear();
                hashMap2.putAll(hashMap);
                dp4.b.f323795a.d();
            }
        }
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
    }

    public final void z(android.graphics.RectF rect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPreviewDecorationPlugin", "setVisibleRect:" + rect + ", animator:0, isRunning:" + ((java.lang.Object) null));
        android.graphics.RectF rectF = this.f104877f;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(rectF, rect)) {
            this.f104878g.set(rect);
            return;
        }
        rectF.set(rect);
        android.widget.RelativeLayout relativeLayout = this.f104879h;
        android.view.ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        float height = ((int) rectF.top) + rectF.height();
        int i17 = this.f104880i;
        int i18 = this.f104881m;
        marginLayoutParams.topMargin = (int) ((height - i17) - i18);
        marginLayoutParams.leftMargin = (int) (((rectF.width() + rectF.left) - i17) - i18);
        relativeLayout.setLayoutParams(marginLayoutParams);
    }
}
