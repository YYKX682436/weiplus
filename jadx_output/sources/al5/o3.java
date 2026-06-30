package al5;

/* loaded from: classes9.dex */
public final class o3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMNeat7extView f5971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5972e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5973f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5974g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f5975h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f5976i;

    public o3(com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView, java.lang.String str, int i17, int i18, boolean z17, boolean z18) {
        this.f5971d = mMNeat7extView;
        this.f5972e = str;
        this.f5973f = i17;
        this.f5974g = i18;
        this.f5975h = z17;
        this.f5976i = z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = this.f5971d;
        float width = (mMNeat7extView.getWidth() - mMNeat7extView.getPaddingLeft()) - mMNeat7extView.getPaddingRight();
        if (width <= 0.0f) {
            return;
        }
        java.lang.String str = this.f5972e;
        int i17 = this.f5973f;
        android.text.TextPaint paint = mMNeat7extView.getPaint();
        kotlin.jvm.internal.o.f(paint, "getPaint(...)");
        mMNeat7extView.b(al5.p3.a(str, width, i17, paint, this.f5974g, this.f5975h, this.f5976i));
    }
}
