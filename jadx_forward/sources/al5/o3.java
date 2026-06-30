package al5;

/* loaded from: classes9.dex */
public final class o3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f87504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f87505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f87506f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f87507g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f87508h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f87509i;

    public o3(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039, java.lang.String str, int i17, int i18, boolean z17, boolean z18) {
        this.f87504d = c22624x85d69039;
        this.f87505e = str;
        this.f87506f = i17;
        this.f87507g = i18;
        this.f87508h = z17;
        this.f87509i = z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = this.f87504d;
        float width = (c22624x85d69039.getWidth() - c22624x85d69039.getPaddingLeft()) - c22624x85d69039.getPaddingRight();
        if (width <= 0.0f) {
            return;
        }
        java.lang.String str = this.f87505e;
        int i17 = this.f87506f;
        android.text.TextPaint m84162x74f59ea8 = c22624x85d69039.m84162x74f59ea8();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m84162x74f59ea8, "getPaint(...)");
        c22624x85d69039.b(al5.p3.a(str, width, i17, m84162x74f59ea8, this.f87507g, this.f87508h, this.f87509i));
    }
}
