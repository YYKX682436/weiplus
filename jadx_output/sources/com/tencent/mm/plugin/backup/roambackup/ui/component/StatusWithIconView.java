package com.tencent.mm.plugin.backup.roambackup.ui.component;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fB\u001b\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001e\u0010 J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R#\u0010\u0018\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/component/StatusWithIconView;", "Landroid/widget/LinearLayout;", "", "dimId", "Ljz5/f0;", "setIconSize", "setTextSize", "Landroid/widget/TextView;", "getStatusTv", "", "str", "setText", "resId", "color", "setTextColor", "colorId", "setTextColorRes", "setPaddingBetween", "Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "f", "Ljz5/g;", "getAnim", "()Landroid/view/animation/Animation;", "anim", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class StatusWithIconView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f92753d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f92754e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g anim;

    /* renamed from: g, reason: collision with root package name */
    public boolean f92756g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusWithIconView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(context);
        this.f92753d = weImageView;
        android.widget.TextView textView = new android.widget.TextView(context);
        this.f92754e = textView;
        this.anim = jz5.h.b(new wo1.m1(context));
        setOrientation(0);
        setGravity(48);
        addView(weImageView);
        addView(textView);
        setIconSize(com.tencent.mm.R.dimen.f479673ca);
        setTextSize(com.tencent.mm.R.dimen.f479925j4);
        setPaddingBetween(com.tencent.mm.R.dimen.f479646bl);
    }

    public static void e(com.tencent.mm.plugin.backup.roambackup.ui.component.StatusWithIconView statusWithIconView, int i17, java.lang.Integer num, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            num = null;
        }
        statusWithIconView.a();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = statusWithIconView.f92753d;
        weImageView.setVisibility(0);
        if (num != null) {
            weImageView.s(i17, num.intValue());
        } else {
            weImageView.setImageResource(i17);
            weImageView.setClearColorFilter(true);
        }
    }

    private final android.view.animation.Animation getAnim() {
        return (android.view.animation.Animation) ((jz5.n) this.anim).getValue();
    }

    public final void a() {
        this.f92756g = false;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f92753d;
        weImageView.clearAnimation();
        weImageView.setVisibility(8);
    }

    public final void b() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.R.color.a9e);
        a();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f92753d;
        weImageView.setVisibility(0);
        if (valueOf == null) {
            weImageView.setImageResource(com.tencent.mm.R.raw.spinner_green_16_outer_holo);
            weImageView.setClearColorFilter(true);
        } else {
            weImageView.s(com.tencent.mm.R.raw.spinner_green_16_outer_holo, valueOf.intValue());
        }
        weImageView.startAnimation(getAnim());
        this.f92756g = true;
    }

    public final void c() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.R.color.a9e);
        a();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f92753d;
        weImageView.setVisibility(0);
        if (valueOf == null) {
            weImageView.setImageResource(com.tencent.mm.R.raw.spinner_16_outer_holo);
            weImageView.setClearColorFilter(true);
        } else {
            weImageView.s(com.tencent.mm.R.raw.spinner_16_outer_holo, valueOf.intValue());
        }
        weImageView.startAnimation(getAnim());
        this.f92756g = true;
    }

    public final void d(int i17, android.graphics.ColorFilter colorFilter) {
        kotlin.jvm.internal.o.g(colorFilter, "colorFilter");
        a();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f92753d;
        weImageView.setVisibility(0);
        weImageView.setImageResource(i17);
        weImageView.setColorFilter(colorFilter);
        weImageView.setEnableColorFilter(true);
    }

    /* renamed from: getStatusTv, reason: from getter */
    public final android.widget.TextView getF92754e() {
        return this.f92754e;
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z17) {
        super.onVisibilityAggregated(z17);
        if (z17 && this.f92756g) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f92753d;
            if (weImageView.getVisibility() == 0 && weImageView.getAnimation() == null) {
                weImageView.startAnimation(getAnim());
            }
        }
    }

    public final void setIconSize(int i17) {
        int dimension = (int) getResources().getDimension(i17);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f92753d;
        weImageView.getLayoutParams().height = dimension;
        weImageView.getLayoutParams().width = dimension;
    }

    public final void setPaddingBetween(int i17) {
        android.view.ViewGroup.LayoutParams layoutParams = this.f92754e.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((android.widget.LinearLayout.LayoutParams) layoutParams).setMarginStart((int) getResources().getDimension(i17));
        android.view.ViewGroup.LayoutParams layoutParams2 = this.f92753d.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((android.widget.LinearLayout.LayoutParams) layoutParams2).topMargin = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479645bk);
    }

    public final void setText(java.lang.CharSequence str) {
        kotlin.jvm.internal.o.g(str, "str");
        android.widget.TextView textView = this.f92754e;
        textView.setText(str);
        textView.setVisibility(0);
    }

    public final void setTextColor(int i17) {
        this.f92754e.setTextColor(i17);
    }

    public final void setTextColorRes(int i17) {
        setTextColor(getContext().getColor(i17));
    }

    public final void setTextSize(int i17) {
        this.f92754e.setTextSize(0, getResources().getDimension(i17));
    }

    public final void setText(int i17) {
        android.widget.TextView textView = this.f92754e;
        textView.setText(i17);
        textView.setVisibility(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatusWithIconView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
