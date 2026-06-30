package androidx.appcompat.view.menu;

/* loaded from: classes15.dex */
public final class ExpandedMenuView extends android.widget.ListView implements o.q, o.i0, android.widget.AdapterView.OnItemClickListener {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f9275e = {android.R.attr.background, android.R.attr.divider};

    /* renamed from: d, reason: collision with root package name */
    public o.r f9276d;

    public ExpandedMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.listViewStyle);
    }

    @Override // o.q
    public boolean c(o.u uVar) {
        return this.f9276d.q(uVar, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        c((o.u) getAdapter().getItem(i17));
    }

    @Override // o.i0
    public void r(o.r rVar) {
        this.f9276d = rVar;
    }

    public ExpandedMenuView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        android.graphics.drawable.Drawable drawable;
        int resourceId;
        android.graphics.drawable.Drawable drawable2;
        int resourceId2;
        setOnItemClickListener(this);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9275e, i17, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            if (obtainStyledAttributes.hasValue(0) && (resourceId2 = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                drawable2 = k.a.a(context, resourceId2);
            } else {
                drawable2 = obtainStyledAttributes.getDrawable(0);
            }
            setBackgroundDrawable(drawable2);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            if (obtainStyledAttributes.hasValue(1) && (resourceId = obtainStyledAttributes.getResourceId(1, 0)) != 0) {
                drawable = k.a.a(context, resourceId);
            } else {
                drawable = obtainStyledAttributes.getDrawable(1);
            }
            setDivider(drawable);
        }
        obtainStyledAttributes.recycle();
    }
}
