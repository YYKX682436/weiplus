package x92;

/* loaded from: classes3.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x92.l f534229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f534230e;

    public i(x92.l lVar, boolean z17) {
        this.f534229d = lVar;
        this.f534230e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x92.l lVar = this.f534229d;
        android.widget.FrameLayout frameLayout = lVar.f534253e;
        if (frameLayout != null) {
            int width = frameLayout.getWidth();
            android.view.View findViewById = lVar.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f564124io);
            int height = findViewById != null ? findViewById.getHeight() : 0;
            if (height == 0) {
                height = lVar.X6(width);
            }
            android.widget.ImageView imageView = lVar.f534237h;
            android.view.ViewGroup.LayoutParams layoutParams = imageView != null ? imageView.getLayoutParams() : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams.height = height;
            android.widget.ImageView imageView2 = lVar.f534237h;
            if (imageView2 != null) {
                imageView2.setLayoutParams(layoutParams);
            }
        }
        lVar.W6(this.f534230e);
    }
}
