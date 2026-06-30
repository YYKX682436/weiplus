package ya2;

/* loaded from: classes4.dex */
public final class s implements db5.j4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f542060a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f542061b;

    public s(android.content.Context context, java.lang.String str) {
        this.f542060a = context;
        this.f542061b = str;
    }

    @Override // db5.j4
    public final void a(android.widget.ImageView iconIV, android.widget.ImageView imageView, android.view.MenuItem menuItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconIV, "iconIV");
        iconIV.setBackground(null);
        iconIV.setImageDrawable(null);
        iconIV.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        android.content.Context context = this.f542060a;
        iconIV.setOutlineProvider(new al5.z1(i65.a.b(context, 4)));
        iconIV.setClipToOutline(true);
        android.view.ViewGroup.LayoutParams layoutParams = iconIV.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
            marginLayoutParams.bottomMargin = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
            marginLayoutParams.leftMargin = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
            marginLayoutParams.rightMargin = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
            layoutParams.height = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
            layoutParams.width = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561253dd);
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        ya2.l.f542035a.h(this.f542061b, iconIV, mn2.f1.D);
    }
}
