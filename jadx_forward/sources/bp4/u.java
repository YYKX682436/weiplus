package bp4;

/* loaded from: classes3.dex */
public final class u extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f104917d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f104918e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f104919f;

    /* renamed from: g, reason: collision with root package name */
    public final int f104920g;

    /* renamed from: h, reason: collision with root package name */
    public final int f104921h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(bp4.x xVar, android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int color = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0o);
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        this.f104917d = imageView;
        android.view.View view = new android.view.View(getContext());
        this.f104918e = view;
        android.view.View view2 = new android.view.View(getContext());
        this.f104919f = view2;
        int dimension = (int) getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        this.f104920g = dimension;
        int dimension2 = (int) getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
        this.f104921h = dimension2;
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
        view.setBackgroundColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.5f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "<init>", "(Lcom/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin;Landroid/content/Context;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "<init>", "(Lcom/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin;Landroid/content/Context;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(-2, -1);
        layoutParams4.gravity = 17;
        setLayoutParams(layoutParams4);
    }

    /* renamed from: getFocusedView */
    public final android.view.View m11002x5e9ded86() {
        return this.f104919f;
    }

    /* renamed from: getImageView */
    public final android.widget.ImageView m11003xcb16a3ea() {
        return this.f104917d;
    }

    /* renamed from: getMaskView */
    public final android.view.View m11004x8c409d27() {
        return this.f104918e;
    }

    /* renamed from: getPadding */
    public final int m11005xdbd77db() {
        return this.f104920g;
    }

    /* renamed from: getSize */
    public final int m11006xfb854877() {
        return this.f104921h;
    }

    @Override // android.view.View
    public void setFocusable(boolean z17) {
        super.setFocusable(z17);
        android.view.View view = this.f104919f;
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "setFocusable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "setFocusable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "setFocusable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "setFocusable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.view.View
    public void setSelected(boolean z17) {
        super.setSelected(z17);
        android.view.View view = this.f104918e;
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
