package androidx.cardview.widget;

/* loaded from: classes13.dex */
public class CardView extends android.widget.FrameLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f10382i = {android.R.attr.colorBackground};

    /* renamed from: m, reason: collision with root package name */
    public static final w.d f10383m = new w.b();

    /* renamed from: d, reason: collision with root package name */
    public boolean f10384d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10385e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f10386f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Rect f10387g;

    /* renamed from: h, reason: collision with root package name */
    public final w.c f10388h;

    public CardView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478138bm);
    }

    public android.content.res.ColorStateList getCardBackgroundColor() {
        return ((w.b) f10383m).a(this.f10388h).f441818h;
    }

    public float getCardElevation() {
        return ((w.a) this.f10388h).f441810b.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f10386f.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f10386f.left;
    }

    public int getContentPaddingRight() {
        return this.f10386f.right;
    }

    public int getContentPaddingTop() {
        return this.f10386f.top;
    }

    public float getMaxCardElevation() {
        return ((w.b) f10383m).a(this.f10388h).f441815e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f10385e;
    }

    public float getRadius() {
        return ((w.b) f10383m).a(this.f10388h).f441811a;
    }

    public boolean getUseCompatPadding() {
        return this.f10384d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    public void setCardBackgroundColor(int i17) {
        w.d dVar = f10383m;
        w.c cVar = this.f10388h;
        android.content.res.ColorStateList valueOf = android.content.res.ColorStateList.valueOf(i17);
        w.e a17 = ((w.b) dVar).a(cVar);
        a17.b(valueOf);
        a17.invalidateSelf();
    }

    public void setCardElevation(float f17) {
        ((w.a) this.f10388h).f441810b.setElevation(f17);
    }

    public void setMaxCardElevation(float f17) {
        ((w.b) f10383m).b(this.f10388h, f17);
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

    public void setPreventCornerOverlap(boolean z17) {
        if (z17 != this.f10385e) {
            this.f10385e = z17;
            w.d dVar = f10383m;
            w.c cVar = this.f10388h;
            w.b bVar = (w.b) dVar;
            bVar.b(cVar, bVar.a(cVar).f441815e);
        }
    }

    public void setRadius(float f17) {
        w.e a17 = ((w.b) f10383m).a(this.f10388h);
        if (f17 == a17.f441811a) {
            return;
        }
        a17.f441811a = f17;
        a17.c(null);
        a17.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z17) {
        if (this.f10384d != z17) {
            this.f10384d = z17;
            w.d dVar = f10383m;
            w.c cVar = this.f10388h;
            w.b bVar = (w.b) dVar;
            bVar.b(cVar, bVar.a(cVar).f441815e);
        }
    }

    public CardView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        int color;
        android.content.res.ColorStateList valueOf;
        android.graphics.Rect rect = new android.graphics.Rect();
        this.f10386f = rect;
        this.f10387g = new android.graphics.Rect();
        w.a aVar = new w.a(this);
        this.f10388h = aVar;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.a.f432186a, i17, com.tencent.mm.R.style.f494098e5);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            android.content.res.TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f10382i);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            android.graphics.Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(com.tencent.mm.R.color.f478800hk);
            } else {
                color = getResources().getColor(com.tencent.mm.R.color.f478799hj);
            }
            valueOf = android.content.res.ColorStateList.valueOf(color);
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f10384d = obtainStyledAttributes.getBoolean(7, false);
        this.f10385e = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        w.b bVar = (w.b) f10383m;
        w.e eVar = new w.e(valueOf, dimension);
        aVar.f441809a = eVar;
        setBackgroundDrawable(eVar);
        setClipToOutline(true);
        setElevation(dimension2);
        bVar.b(aVar, dimension3);
    }

    public void setCardBackgroundColor(android.content.res.ColorStateList colorStateList) {
        w.e a17 = ((w.b) f10383m).a(this.f10388h);
        a17.b(colorStateList);
        a17.invalidateSelf();
    }
}
