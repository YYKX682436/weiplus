package androidx.constraintlayout.widget;

/* loaded from: classes14.dex */
public class Placeholder extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public int f10929d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f10930e;

    /* renamed from: f, reason: collision with root package name */
    public int f10931f;

    public Placeholder(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10929d = -1;
        this.f10930e = null;
        this.f10931f = 4;
        a(attributeSet);
    }

    public final void a(android.util.AttributeSet attributeSet) {
        super.setVisibility(this.f10931f);
        this.f10929d = -1;
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R$styleable.ConstraintLayout_placeholder);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i17 = 0; i17 < indexCount; i17++) {
                int index = obtainStyledAttributes.getIndex(i17);
                if (index == androidx.constraintlayout.widget.R$styleable.ConstraintLayout_placeholder_content) {
                    this.f10929d = obtainStyledAttributes.getResourceId(index, this.f10929d);
                } else if (index == androidx.constraintlayout.widget.R$styleable.ConstraintLayout_placeholder_emptyVisibility) {
                    this.f10931f = obtainStyledAttributes.getInt(index, this.f10931f);
                }
            }
        }
    }

    public void b(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        if (this.f10929d == -1 && !isInEditMode()) {
            setVisibility(this.f10931f);
        }
        android.view.View findViewById = constraintLayout.findViewById(this.f10929d);
        this.f10930e = findViewById;
        if (findViewById != null) {
            ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) findViewById.getLayoutParams()).Z = true;
            android.view.View view = this.f10930e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "androidx/constraintlayout/widget/Placeholder", "updatePreLayout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "androidx/constraintlayout/widget/Placeholder", "updatePreLayout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            setVisibility(0);
        }
    }

    public android.view.View getContent() {
        return this.f10930e;
    }

    public int getEmptyVisibility() {
        return this.f10931f;
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

    public void setContentId(int i17) {
        android.view.View findViewById;
        if (this.f10929d == i17) {
            return;
        }
        android.view.View view = this.f10930e;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "androidx/constraintlayout/widget/Placeholder", "setContentId", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "androidx/constraintlayout/widget/Placeholder", "setContentId", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) this.f10930e.getLayoutParams()).Z = false;
            this.f10930e = null;
        }
        this.f10929d = i17;
        if (i17 == -1 || (findViewById = ((android.view.View) getParent()).findViewById(i17)) == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "androidx/constraintlayout/widget/Placeholder", "setContentId", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "androidx/constraintlayout/widget/Placeholder", "setContentId", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void setEmptyVisibility(int i17) {
        this.f10931f = i17;
    }

    public Placeholder(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f10929d = -1;
        this.f10930e = null;
        this.f10931f = 4;
        a(attributeSet);
    }
}
