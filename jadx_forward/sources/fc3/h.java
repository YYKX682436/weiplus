package fc3;

/* loaded from: classes9.dex */
public final class h {

    /* renamed from: g, reason: collision with root package name */
    public static android.graphics.Typeface f342575g;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f342576a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.FrameLayout f342577b;

    /* renamed from: c, reason: collision with root package name */
    public final fc3.s f342578c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f342579d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f342580e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f342581f;

    public h(android.content.Context context, android.widget.FrameLayout layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        this.f342576a = context;
        this.f342577b = layout;
        this.f342578c = new fc3.s(context, layout);
        this.f342580e = kz5.p0.f395529d;
    }

    public final void a() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var;
        if (this.f342579d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyWordCloudTextHelper", "startTextCloud, but helper is destroy, would not start");
            return;
        }
        if (this.f342580e.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyWordCloudTextHelper", "textCloud is empty, would not start");
            return;
        }
        android.widget.FrameLayout frameLayout = this.f342577b;
        float f17 = 2;
        android.graphics.PointF pointF = new android.graphics.PointF(frameLayout.getWidth() / f17, frameLayout.getHeight() / f17);
        fc3.s sVar = this.f342578c;
        sVar.getClass();
        sVar.f342613e = pointF;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyWordCloudTextHelper", hashCode() + " startTextCloud startPos:" + sVar.f342613e + ' ');
        if (this.f342581f == null) {
            this.f342581f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new fc3.g(this), true);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = this.f342581f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b4Var2);
        if (!b4Var2.e() || (b4Var = this.f342581f) == null) {
            return;
        }
        b4Var.c(0L, 700L);
    }

    public final void b(boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyWordCloudTextHelper", hashCode() + " stopAll withAnimation:" + z17);
        this.f342578c.d(z17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = this.f342581f;
        if (b4Var2 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b4Var2);
            if (!b4Var2.e() && (b4Var = this.f342581f) != null) {
                b4Var.d();
            }
        }
        this.f342581f = null;
    }
}
