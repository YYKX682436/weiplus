package p012xc85e97e9.p071xe6df7747.p072xd1075a44;

/* renamed from: androidx.constraintlayout.widget.Placeholder */
/* loaded from: classes14.dex */
public class C1077x87122d53 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public int f92462d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f92463e;

    /* renamed from: f, reason: collision with root package name */
    public int f92464f;

    public C1077x87122d53(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f92462d = -1;
        this.f92463e = null;
        this.f92464f = 4;
        a(attributeSet);
    }

    public final void a(android.util.AttributeSet attributeSet) {
        super.setVisibility(this.f92464f);
        this.f92462d = -1;
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1080x77359cb9.f2775xf0f378bb);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i17 = 0; i17 < indexCount; i17++) {
                int index = obtainStyledAttributes.getIndex(i17);
                if (index == p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1080x77359cb9.f2776x753f68f5) {
                    this.f92462d = obtainStyledAttributes.getResourceId(index, this.f92462d);
                } else if (index == p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1080x77359cb9.f2777xabac40bb) {
                    this.f92464f = obtainStyledAttributes.getInt(index, this.f92464f);
                }
            }
        }
    }

    public void b(p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787) {
        if (this.f92462d == -1 && !isInEditMode()) {
            setVisibility(this.f92464f);
        }
        android.view.View findViewById = c1073x7e08a787.findViewById(this.f92462d);
        this.f92463e = findViewById;
        if (findViewById != null) {
            ((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) findViewById.getLayoutParams()).Z = true;
            android.view.View view = this.f92463e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "androidx/constraintlayout/widget/Placeholder", "updatePreLayout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "androidx/constraintlayout/widget/Placeholder", "updatePreLayout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            setVisibility(0);
        }
    }

    /* renamed from: getContent */
    public android.view.View m7189x76847043() {
        return this.f92463e;
    }

    /* renamed from: getEmptyVisibility */
    public int m7190xa3d41a09() {
        return this.f92464f;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(android.graphics.Paint.Align.CENTER);
            paint.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0));
            android.graphics.Rect rect = new android.graphics.Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(android.graphics.Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    /* renamed from: setContentId */
    public void m7191x437d3532(int i17) {
        android.view.View findViewById;
        if (this.f92462d == i17) {
            return;
        }
        android.view.View view = this.f92463e;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "androidx/constraintlayout/widget/Placeholder", "setContentId", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "androidx/constraintlayout/widget/Placeholder", "setContentId", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) this.f92463e.getLayoutParams()).Z = false;
            this.f92463e = null;
        }
        this.f92462d = i17;
        if (i17 == -1 || (findViewById = ((android.view.View) getParent()).findViewById(i17)) == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "androidx/constraintlayout/widget/Placeholder", "setContentId", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "androidx/constraintlayout/widget/Placeholder", "setContentId", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: setEmptyVisibility */
    public void m7192xdaaab37d(int i17) {
        this.f92464f = i17;
    }

    public C1077x87122d53(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f92462d = -1;
        this.f92463e = null;
        this.f92464f = 4;
        a(attributeSet);
    }
}
