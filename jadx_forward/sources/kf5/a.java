package kf5;

/* loaded from: classes9.dex */
public final class a implements g75.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2686xc5e33a1f.C22114x956fa607 f389027a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f389028b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c11.e f389029c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f389030d;

    public a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2686xc5e33a1f.C22114x956fa607 c22114x956fa607, android.widget.FrameLayout frameLayout, c11.e eVar, android.widget.ImageView imageView) {
        this.f389027a = c22114x956fa607;
        this.f389028b = frameLayout;
        this.f389029c = eVar;
        this.f389030d = imageView;
    }

    @Override // g75.s
    public void a(g75.x result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        int i17 = result.f350937a;
        if (i17 == 0) {
            int i18 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2686xc5e33a1f.C22114x956fa607.f286418h;
            this.f389027a.g(this.f389028b, this.f389029c);
        } else if (i17 == -1) {
            android.widget.ImageView imageView = this.f389030d;
            imageView.setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.r(com.p314xaae8f345.mm.R.raw.f80862x137353c3, imageView.getWidth(), imageView.getHeight(), imageView.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77768x20e836), imageView.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77627xb498cd1c), 0.625f));
        }
    }
}
