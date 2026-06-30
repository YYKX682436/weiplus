package com.tencent.mm.live.core.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB%\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/live/core/view/FinderLiveSurfaceView;", "Landroid/view/SurfaceView;", "", "alpha", "Ljz5/f0;", "setAlpha", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveSurfaceView extends android.view.SurfaceView {
    public FinderLiveSurfaceView(android.content.Context context) {
        super(context);
        setId(com.tencent.mm.R.id.r8u);
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    public final void a(int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[makeSureWidthHeight] width=");
        sb6.append(i17);
        sb6.append(" height=");
        sb6.append(i18);
        sb6.append(" hash=");
        android.view.ViewParent parent = getParent();
        sb6.append(parent != null ? java.lang.Integer.valueOf(parent.hashCode()) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveSurfaceView", sb6.toString());
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.view.ViewGroup.LayoutParams(i17, i18);
        }
        if ((getAlpha() == 1.0f) && layoutParams.height == i18 && layoutParams.width == i17) {
            return;
        }
        layoutParams.height = i18;
        layoutParams.width = i17;
        setAlpha(1.0f);
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onLayout] changed=");
        sb6.append(z17);
        sb6.append(" width=");
        sb6.append(i19 - i17);
        sb6.append(" height=");
        sb6.append(i27 - i18);
        sb6.append(" hash=");
        android.view.ViewParent parent = getParent();
        sb6.append(parent != null ? java.lang.Integer.valueOf(parent.hashCode()) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveSurfaceView", sb6.toString());
    }

    @Override // android.view.SurfaceView, android.view.View
    public void setAlpha(float f17) {
        super.setAlpha(f17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[setAlpha] alpha=");
        sb6.append(f17);
        sb6.append(" hash=");
        android.view.ViewParent parent = getParent();
        sb6.append(parent != null ? java.lang.Integer.valueOf(parent.hashCode()) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveSurfaceView", sb6.toString());
    }

    public FinderLiveSurfaceView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setId(com.tencent.mm.R.id.r8u);
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    public FinderLiveSurfaceView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        setId(com.tencent.mm.R.id.r8u);
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
    }
}
