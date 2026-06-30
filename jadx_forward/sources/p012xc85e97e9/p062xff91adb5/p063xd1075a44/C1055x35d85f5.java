package p012xc85e97e9.p062xff91adb5.p063xd1075a44;

/* renamed from: androidx.cardview.widget.CardView */
/* loaded from: classes13.dex */
public class C1055x35d85f5 extends android.widget.FrameLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f91915i = {android.R.attr.colorBackground};

    /* renamed from: m, reason: collision with root package name */
    public static final w.d f91916m = new w.b();

    /* renamed from: d, reason: collision with root package name */
    public boolean f91917d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f91918e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f91919f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Rect f91920g;

    /* renamed from: h, reason: collision with root package name */
    public final w.c f91921h;

    public C1055x35d85f5(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559671bm);
    }

    /* renamed from: getCardBackgroundColor */
    public android.content.res.ColorStateList m6980x76448e6f() {
        return ((w.b) f91916m).a(this.f91921h).f523351h;
    }

    /* renamed from: getCardElevation */
    public float m6981x16120177() {
        return ((w.a) this.f91921h).f523343b.getElevation();
    }

    /* renamed from: getContentPaddingBottom */
    public int m6982xa0ec3619() {
        return this.f91919f.bottom;
    }

    /* renamed from: getContentPaddingLeft */
    public int m6983xd4c35f75() {
        return this.f91919f.left;
    }

    /* renamed from: getContentPaddingRight */
    public int m6984xc3fef06e() {
        return this.f91919f.right;
    }

    /* renamed from: getContentPaddingTop */
    public int m6985xa3c45c27() {
        return this.f91919f.top;
    }

    /* renamed from: getMaxCardElevation */
    public float m6986x275f199f() {
        return ((w.b) f91916m).a(this.f91921h).f523348e;
    }

    /* renamed from: getPreventCornerOverlap */
    public boolean m6987x34d165b0() {
        return this.f91918e;
    }

    /* renamed from: getRadius */
    public float m6988x2d258f88() {
        return ((w.b) f91916m).a(this.f91921h).f523344a;
    }

    /* renamed from: getUseCompatPadding */
    public boolean m6989xb4864f5e() {
        return this.f91917d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    /* renamed from: setCardBackgroundColor */
    public void m6990xc4894de3(int i17) {
        w.d dVar = f91916m;
        w.c cVar = this.f91921h;
        android.content.res.ColorStateList valueOf = android.content.res.ColorStateList.valueOf(i17);
        w.e a17 = ((w.b) dVar).a(cVar);
        a17.b(valueOf);
        a17.invalidateSelf();
    }

    /* renamed from: setCardElevation */
    public void m6992xa8e867eb(float f17) {
        ((w.a) this.f91921h).f523343b.setElevation(f17);
    }

    /* renamed from: setMaxCardElevation */
    public void m6993xcb5baeab(float f17) {
        ((w.b) f91916m).b(this.f91921h, f17);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i17) {
        super.setMinimumHeight(i17);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i17) {
        super.setMinimumWidth(i17);
    }

    @Override // android.view.View
    public void setPadding(int i17, int i18, int i19, int i27) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i17, int i18, int i19, int i27) {
    }

    /* renamed from: setPreventCornerOverlap */
    public void m6994xaf2494bc(boolean z17) {
        if (z17 != this.f91918e) {
            this.f91918e = z17;
            w.d dVar = f91916m;
            w.c cVar = this.f91921h;
            w.b bVar = (w.b) dVar;
            bVar.b(cVar, bVar.a(cVar).f523348e);
        }
    }

    /* renamed from: setRadius */
    public void mo6995x205ac394(float f17) {
        w.e a17 = ((w.b) f91916m).a(this.f91921h);
        if (f17 == a17.f523344a) {
            return;
        }
        a17.f523344a = f17;
        a17.c(null);
        a17.invalidateSelf();
    }

    /* renamed from: setUseCompatPadding */
    public void m6996x5882e46a(boolean z17) {
        if (this.f91917d != z17) {
            this.f91917d = z17;
            w.d dVar = f91916m;
            w.c cVar = this.f91921h;
            w.b bVar = (w.b) dVar;
            bVar.b(cVar, bVar.a(cVar).f523348e);
        }
    }

    public C1055x35d85f5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        int color;
        android.content.res.ColorStateList valueOf;
        android.graphics.Rect rect = new android.graphics.Rect();
        this.f91919f = rect;
        this.f91920g = new android.graphics.Rect();
        w.a aVar = new w.a(this);
        this.f91921h = aVar;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.a.f513719a, i17, com.p314xaae8f345.mm.R.C30868x68b1db1.f575631e5);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            android.content.res.TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f91915i);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            android.graphics.Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560333hk);
            } else {
                color = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560332hj);
            }
            valueOf = android.content.res.ColorStateList.valueOf(color);
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f91917d = obtainStyledAttributes.getBoolean(7, false);
        this.f91918e = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        w.b bVar = (w.b) f91916m;
        w.e eVar = new w.e(valueOf, dimension);
        aVar.f523342a = eVar;
        setBackgroundDrawable(eVar);
        setClipToOutline(true);
        setElevation(dimension2);
        bVar.b(aVar, dimension3);
    }

    /* renamed from: setCardBackgroundColor */
    public void m6991xc4894de3(android.content.res.ColorStateList colorStateList) {
        w.e a17 = ((w.b) f91916m).a(this.f91921h);
        a17.b(colorStateList);
        a17.invalidateSelf();
    }
}
