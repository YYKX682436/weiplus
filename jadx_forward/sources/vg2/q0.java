package vg2;

/* loaded from: classes3.dex */
public final class q0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.v0 f518087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f518088e;

    public q0(vg2.v0 v0Var, android.view.ViewGroup viewGroup) {
        this.f518087d = v0Var;
        this.f518088e = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int width;
        android.graphics.drawable.Drawable drawable;
        vg2.v0 v0Var = this.f518087d;
        v0Var.f518136d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        android.view.ViewGroup viewGroup = this.f518088e;
        if (viewGroup != null) {
            v0Var.getClass();
            int i17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
            int[] t17 = pm0.v.t(viewGroup);
            int i18 = t17[1];
            int height = v0Var.a().getHeight();
            android.widget.ImageView imageView = v0Var.f518137e;
            int height2 = i18 - (height + imageView.getHeight());
            int width2 = t17[0] + (viewGroup.getWidth() / 2);
            android.content.Context context = v0Var.f518133a;
            int b17 = i65.a.b(context, 16);
            if (width2 - (v0Var.a().getWidth() / 2) < b17) {
                width = b17;
            } else {
                int i19 = i17 - b17;
                width = (v0Var.a().getWidth() / 2) + width2 > i19 ? (i19 - v0Var.a().getWidth()) - v0Var.a().getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj) : width2 - (v0Var.a().getWidth() / 2);
            }
            android.view.ViewGroup.LayoutParams layoutParams = v0Var.a().getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                if (width < b17) {
                    width = b17;
                }
                marginLayoutParams.leftMargin = width;
                marginLayoutParams.topMargin = height2;
                marginLayoutParams.rightMargin = b17;
            }
            android.graphics.drawable.Drawable drawable2 = imageView.getDrawable();
            android.graphics.drawable.LayerDrawable layerDrawable = drawable2 instanceof android.graphics.drawable.LayerDrawable ? (android.graphics.drawable.LayerDrawable) drawable2 : null;
            if (layerDrawable != null && (drawable = layerDrawable.getDrawable(0)) != null) {
                drawable.setColorFilter(new android.graphics.PorterDuffColorFilter(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560591om), android.graphics.PorterDuff.Mode.SRC_IN));
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.leftMargin = width2 - (imageView.getWidth() / 2);
            }
            android.view.View view = v0Var.f518136d;
            view.requestLayout();
            view.post(new vg2.k0(v0Var));
        }
    }
}
