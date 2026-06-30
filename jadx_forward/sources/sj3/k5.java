package sj3;

/* loaded from: classes14.dex */
public final class k5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16588x7b895f5a f490145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f490146e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f490147f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f490148g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16588x7b895f5a c16588x7b895f5a, android.view.View view, boolean z17, android.widget.ImageView imageView) {
        super(0);
        this.f490145d = c16588x7b895f5a;
        this.f490146e = view;
        this.f490147f = z17;
        this.f490148g = imageView;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.ImageView m67088x8c409d27;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16588x7b895f5a c16588x7b895f5a = this.f490145d;
        m67088x8c409d27 = c16588x7b895f5a.m67088x8c409d27();
        m67088x8c409d27.setVisibility(0);
        android.view.View view = this.f490146e;
        c16588x7b895f5a.f231893h = view;
        c16588x7b895f5a.f231890e = this.f490147f ? 2 : 1;
        c16588x7b895f5a.addView(view, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
        android.widget.ImageView imageView = this.f490148g;
        if (imageView.getBackground() instanceof android.graphics.drawable.AnimationDrawable) {
            android.graphics.drawable.Drawable background = imageView.getBackground();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
            ((android.graphics.drawable.AnimationDrawable) background).start();
        }
        return jz5.f0.f384359a;
    }
}
