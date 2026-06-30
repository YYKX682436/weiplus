package vc1;

/* loaded from: classes13.dex */
public class s implements o91.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f516692a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f516693b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f516694c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f516695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a f516696e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f516697f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f516698g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516699h;

    public s(vc1.p1 p1Var, float f17, float f18, android.widget.ImageView imageView, java.lang.String str, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a, android.widget.FrameLayout frameLayout, boolean z17) {
        this.f516699h = p1Var;
        this.f516692a = f17;
        this.f516693b = f18;
        this.f516694c = imageView;
        this.f516695d = str;
        this.f516696e = interfaceC4409x88f1805a;
        this.f516697f = frameLayout;
        this.f516698g = z17;
    }

    @Override // o91.b
    public void a(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            this.f516699h.T(this.f516695d, this.f516696e, this.f516694c, this.f516697f, this.f516698g);
            return;
        }
        vc1.p1 p1Var = this.f516699h;
        p1Var.t(this.f516692a, this.f516693b, bitmap, this.f516694c);
        p1Var.Z(this.f516695d, this.f516696e, this.f516697f);
    }
}
