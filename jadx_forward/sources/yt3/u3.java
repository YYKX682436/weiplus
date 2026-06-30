package yt3;

/* loaded from: classes5.dex */
public final class u3 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f547223d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f547224e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f547225f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f547226g;

    public u3(android.widget.ImageView view, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f547223d = view;
        this.f547224e = status;
        view.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(view.getContext(), com.p314xaae8f345.mm.R.raw.f79737xa254b9e3, -1));
        view.setOnClickListener(new yt3.t3(this));
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        if (this.f547225f) {
            this.f547223d.setVisibility(i17);
        }
    }
}
