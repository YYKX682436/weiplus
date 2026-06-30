package cn1;

/* loaded from: classes14.dex */
public final class e extends cn1.g {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f43455a;

    /* renamed from: b, reason: collision with root package name */
    public int f43456b;

    /* renamed from: c, reason: collision with root package name */
    public final int f43457c;

    /* renamed from: d, reason: collision with root package name */
    public final int f43458d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f43459e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f43460f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f43461g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f43462h;

    public e(android.content.Context context, int i17, int i18, int i19, boolean z17, int i27, kotlin.jvm.internal.i iVar) {
        i17 = (i27 & 2) != 0 ? com.tencent.mm.R.color.f478491c : i17;
        i18 = (i27 & 4) != 0 ? com.tencent.mm.R.color.BW_0_Alpha_0_5 : i18;
        i19 = (i27 & 8) != 0 ? com.tencent.mm.R.drawable.cxz : i19;
        z17 = (i27 & 16) != 0 ? true : z17;
        kotlin.jvm.internal.o.g(context, "context");
        this.f43455a = context;
        this.f43456b = i17;
        this.f43457c = i18;
        this.f43458d = i19;
        this.f43459e = z17;
        this.f43460f = jz5.h.b(new cn1.d(this));
        this.f43461g = jz5.h.b(new cn1.b(this));
        jz5.h.b(new cn1.c(this));
    }

    @Override // cn1.g
    public android.view.View a() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        android.view.View findViewById;
        android.view.View findViewById2;
        android.view.View view = this.f43462h;
        android.content.Context context = this.f43455a;
        if (view == null) {
            this.f43462h = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dz_, (android.view.ViewGroup) null);
        }
        android.view.View view2 = this.f43462h;
        if (view2 != null && (findViewById2 = view2.findViewById(com.tencent.mm.R.id.f485216gy1)) != null) {
            findViewById2.setBackgroundResource(this.f43458d);
        }
        android.view.View view3 = this.f43462h;
        boolean z17 = this.f43459e;
        if (view3 != null && (findViewById = view3.findViewById(com.tencent.mm.R.id.gxy)) != null) {
            if (!z17) {
                findViewById.getLayoutParams().height = -2;
            }
            findViewById.setBackgroundColor(context.getResources().getColor(this.f43456b));
        }
        android.view.View view4 = this.f43462h;
        if (view4 != null && (weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view4.findViewById(com.tencent.mm.R.id.gxz)) != null) {
            weImageView.setVisibility(z17 ? 0 : 8);
            weImageView.setIconColor(context.getResources().getColor(this.f43457c));
        }
        return this.f43462h;
    }

    @Override // cn1.g
    public void d(bn1.v layout) {
        kotlin.jvm.internal.o.g(layout, "layout");
        jz5.g gVar = this.f43460f;
        android.view.View view = (android.view.View) ((jz5.n) gVar).getValue();
        android.view.ViewGroup.LayoutParams layoutParams = ((android.view.View) ((jz5.n) gVar).getValue()).getLayoutParams();
        layoutParams.height = i65.a.b(this.f43455a, 4);
        view.setLayoutParams(layoutParams);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.f43461g).getValue()).setAlpha(0.0f);
    }

    @Override // cn1.g
    public void e(bn1.v layout, float f17, java.lang.String source) {
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(source, "source");
        super.e(layout, f17, source);
        if (this.f43459e) {
            float borderExpand = layout.getBorderExpand();
            float borderExpand2 = layout.getBorderExpand();
            android.content.Context context = this.f43455a;
            float b17 = (f17 - borderExpand) / ((borderExpand2 + i65.a.b(context, 56)) - borderExpand);
            float f18 = (b17 - 0.5f) * 2.0f;
            if (f18 < 0.0f) {
                f18 = 0.0f;
            }
            if (f18 > 1.0f) {
                f18 = 1.0f;
            }
            if (b17 > 1.0f) {
                b17 = 1.0f;
            }
            float f19 = 0.0f < b17 ? b17 : 0.0f;
            int b18 = i65.a.b(context, 16);
            int b19 = i65.a.b(context, 4);
            jz5.g gVar = this.f43460f;
            android.view.View view = (android.view.View) ((jz5.n) gVar).getValue();
            android.view.ViewGroup.LayoutParams layoutParams = ((android.view.View) ((jz5.n) gVar).getValue()).getLayoutParams();
            layoutParams.height = (int) (b19 + (f19 * (b18 - b19)));
            view.setLayoutParams(layoutParams);
            ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.f43461g).getValue()).setAlpha(f18);
        }
    }

    public final void f(int i17) {
        android.view.View findViewById;
        this.f43456b = i17;
        android.view.View view = this.f43462h;
        if (view == null || (findViewById = view.findViewById(com.tencent.mm.R.id.gxy)) == null) {
            return;
        }
        findViewById.setBackgroundColor(this.f43455a.getResources().getColor(i17));
    }
}
