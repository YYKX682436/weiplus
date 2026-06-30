package vg2;

/* loaded from: classes3.dex */
public final class b implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.c f518011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f518012e;

    public b(vg2.c cVar, android.view.ViewGroup viewGroup) {
        this.f518011d = cVar;
        this.f518012e = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.graphics.drawable.Drawable drawable;
        vg2.c cVar = this.f518011d;
        cVar.f518018c.getViewTreeObserver().removeOnPreDrawListener(this);
        cVar.getClass();
        int i17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
        android.view.ViewGroup viewGroup = this.f518012e;
        int[] t17 = pm0.v.t(viewGroup);
        int i18 = t17[1];
        android.view.View view = cVar.f518018c;
        int height = (i18 - view.getHeight()) + cVar.b();
        int width = t17[0] + (viewGroup.getWidth() / 2);
        android.content.Context context = cVar.f518016a;
        int b17 = i65.a.b(context, 16);
        if (width - (view.getWidth() / 2) >= b17) {
            int i19 = i17 - b17;
            b17 = (view.getWidth() / 2) + width > i19 ? i19 - view.getWidth() : width - (view.getWidth() / 2);
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = b17;
            marginLayoutParams.topMargin = height;
        }
        android.widget.ImageView imageView = cVar.f518019d;
        android.graphics.drawable.Drawable drawable2 = imageView.getDrawable();
        android.graphics.drawable.LayerDrawable layerDrawable = drawable2 instanceof android.graphics.drawable.LayerDrawable ? (android.graphics.drawable.LayerDrawable) drawable2 : null;
        if (layerDrawable != null && (drawable = layerDrawable.getDrawable(0)) != null) {
            drawable.setColorFilter(new android.graphics.PorterDuffColorFilter(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560591om), android.graphics.PorterDuff.Mode.SRC_IN));
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.leftMargin = (width - (imageView.getWidth() / 2)) - b17;
        }
        pm0.v.V(100L, new vg2.a(cVar));
        view.requestLayout();
        return true;
    }
}
