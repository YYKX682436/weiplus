package com.tencent.mm.feature.ecs.product.view;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/feature/ecs/product/view/EcsBarrageBoxView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class EcsBarrageBoxView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final int f65942d;

    /* renamed from: e, reason: collision with root package name */
    public final long f65943e;

    /* renamed from: f, reason: collision with root package name */
    public final long f65944f;

    /* renamed from: g, reason: collision with root package name */
    public final android.os.Handler f65945g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f65946h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f65947i;

    /* renamed from: m, reason: collision with root package name */
    public android.animation.Animator f65948m;

    /* renamed from: n, reason: collision with root package name */
    public final int f65949n;

    /* renamed from: o, reason: collision with root package name */
    public int f65950o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f65951p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f65952q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcsBarrageBoxView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static final void a(com.tencent.mm.feature.ecs.product.view.EcsBarrageBoxView ecsBarrageBoxView) {
        java.util.ArrayList arrayList = (java.util.ArrayList) ecsBarrageBoxView.f65947i;
        if (arrayList.isEmpty()) {
            return;
        }
        int childCount = ecsBarrageBoxView.getChildCount();
        int i17 = ecsBarrageBoxView.f65942d;
        if (childCount < i17) {
            return;
        }
        android.view.View childAt = ecsBarrageBoxView.getChildAt(0);
        if (childAt.getHeight() == 0) {
            ecsBarrageBoxView.post(new r20.b(ecsBarrageBoxView));
            return;
        }
        float height = childAt.getHeight() + ecsBarrageBoxView.f65949n;
        bw5.d9 d9Var = (bw5.d9) arrayList.get((ecsBarrageBoxView.f65950o + i17) % arrayList.size());
        android.view.View inflate = android.view.View.inflate(ecsBarrageBoxView.getContext(), com.tencent.mm.R.layout.e4_, null);
        ((com.tencent.mm.feature.ecs.product.view.EcsRichTextButtonView) inflate.findViewById(com.tencent.mm.R.id.azj)).a(d9Var);
        inflate.setTranslationY((i17 + 1) * height);
        ecsBarrageBoxView.addView(inflate);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ecsBarrageBoxView.f65948m = ofFloat;
        ofFloat.setDuration(ecsBarrageBoxView.f65943e);
        ofFloat.addListener(new r20.a(ecsBarrageBoxView, childAt));
        ofFloat.addUpdateListener(new r20.c(ecsBarrageBoxView, childAt, q26.h0.y(q26.h0.o(new n3.r1(ecsBarrageBoxView), r20.d.f368773d)), height));
        ofFloat.start();
    }

    public final void b() {
        if (this.f65952q || !isAttachedToWindow() || !this.f65951p || ((java.util.ArrayList) this.f65947i).size() <= this.f65942d) {
            return;
        }
        this.f65952q = true;
        this.f65945g.postDelayed(this.f65946h, this.f65944f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        super.onMeasure(i17, i18);
        if (!(!q26.h0.y(new n3.r1(this)).isEmpty()) || (i19 = this.f65942d) <= 0) {
            return;
        }
        float measuredHeight = getChildAt(0).getMeasuredHeight() + this.f65949n;
        java.util.List list = this.f65947i;
        if (((java.util.ArrayList) list).size() <= i19) {
            i19 = ((java.util.ArrayList) list).size();
        }
        setMeasuredDimension(getMeasuredWidth(), (int) (measuredHeight * (i19 + 1)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcsBarrageBoxView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f65942d = 2;
        this.f65943e = 500L;
        this.f65944f = 2000L;
        this.f65945g = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f65946h = new r20.e(this);
        this.f65947i = new java.util.ArrayList();
        this.f65949n = i65.a.b(context, 4);
    }
}
