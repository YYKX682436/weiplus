package sr;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f492923a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.FrameLayout f492924b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.api.AbstractC4989x9e6071f3 f492925c;

    public e(android.content.Context context, android.view.ViewGroup parent, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        this.f492923a = context;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.f492924b = frameLayout;
        parent.addView(frameLayout, new android.view.ViewGroup.LayoutParams(-1, -1));
        frameLayout.setOnClickListener(new sr.c(this));
        com.p314xaae8f345.mm.api.AbstractC4989x9e6071f3 c17 = qk.w9.c(context, z17);
        this.f492925c = c17;
        int i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291.f271298e;
        c17.mo75331xef640234(3);
        c17.mo75345x9e226965(6);
        c17.mo75351x4aab89d0(false);
        c17.mo75347xe8c09ab9(true);
        c17.i();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, qk.w9.a(context));
        layoutParams.gravity = 80;
        frameLayout.addView(c17, layoutParams);
        frameLayout.setVisibility(8);
        c17.setVisibility(8);
        c17.setTranslationY(layoutParams.height);
    }

    public abstract void a();
}
