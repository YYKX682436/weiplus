package bp4;

/* loaded from: classes3.dex */
public final class u extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f23384d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f23385e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f23386f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23387g;

    /* renamed from: h, reason: collision with root package name */
    public final int f23388h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(bp4.x xVar, android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        int color = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a0o);
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        this.f23384d = imageView;
        android.view.View view = new android.view.View(getContext());
        this.f23385e = view;
        android.view.View view2 = new android.view.View(getContext());
        this.f23386f = view2;
        int dimension = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
        this.f23387g = dimension;
        int dimension2 = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479727dj);
        this.f23388h = dimension2;
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        int i17 = (dimension * 2) + dimension2;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i17, i17);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(dimension2, dimension2);
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(dimension2, dimension2);
        layoutParams2.gravity = 17;
        layoutParams.gravity = 17;
        layoutParams3.gravity = 17;
        view2.setBackgroundColor(color);
        addView(view2, layoutParams);
        addView(imageView, layoutParams3);
        view.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.aaw));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.5f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "<init>", "(Lcom/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin;Landroid/content/Context;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "<init>", "(Lcom/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin;Landroid/content/Context;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(-2, -1);
        layoutParams4.gravity = 17;
        setLayoutParams(layoutParams4);
    }

    public final android.view.View getFocusedView() {
        return this.f23386f;
    }

    public final android.widget.ImageView getImageView() {
        return this.f23384d;
    }

    public final android.view.View getMaskView() {
        return this.f23385e;
    }

    public final int getPadding() {
        return this.f23387g;
    }

    public final int getSize() {
        return this.f23388h;
    }

    @Override // android.view.View
    public void setFocusable(boolean z17) {
        super.setFocusable(z17);
        android.view.View view = this.f23386f;
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "setFocusable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "setFocusable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "setFocusable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "setFocusable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.view.View
    public void setSelected(boolean z17) {
        super.setSelected(z17);
        android.view.View view = this.f23385e;
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
