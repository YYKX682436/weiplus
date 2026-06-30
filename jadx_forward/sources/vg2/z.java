package vg2;

/* loaded from: classes3.dex */
public final class z implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.a0 f518165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f518166e;

    public z(vg2.a0 a0Var, android.view.ViewGroup viewGroup) {
        this.f518165d = a0Var;
        this.f518166e = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        int width;
        android.graphics.drawable.Drawable drawable;
        vg2.a0 a0Var = this.f518165d;
        a0Var.f518001d.getViewTreeObserver().removeOnPreDrawListener(this);
        a0Var.getClass();
        android.view.ViewGroup attachView = this.f518166e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attachView, "attachView");
        int i17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
        int[] t17 = pm0.v.t(attachView);
        int i18 = t17[1];
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = a0Var.f518006i;
        int height = c1163xf1deaba4.getHeight();
        android.widget.ImageView imageView = a0Var.f518002e;
        int height2 = i18 - (height + imageView.getHeight());
        int width2 = t17[0] + (attachView.getWidth() / 2);
        android.content.Context context = a0Var.f517998a;
        int b17 = i65.a.b(context, 16);
        if (width2 - (c1163xf1deaba4.getWidth() / 2) < b17) {
            width = b17;
        } else {
            int i19 = i17 - b17;
            width = (c1163xf1deaba4.getWidth() / 2) + width2 > i19 ? i19 - c1163xf1deaba4.getWidth() : width2 - (c1163xf1deaba4.getWidth() / 2);
        }
        android.view.ViewGroup.LayoutParams layoutParams = c1163xf1deaba4.getLayoutParams();
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
            drawable.setColorFilter(new android.graphics.PorterDuffColorFilter(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560590ol), android.graphics.PorterDuff.Mode.SRC_IN));
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.leftMargin = width2 - (imageView.getWidth() / 2);
        }
        android.view.View view = a0Var.f518001d;
        view.requestLayout();
        view.post(new vg2.y(a0Var));
        return true;
    }
}
