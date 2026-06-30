package al5;

/* loaded from: classes14.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f6090a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6091b;

    /* renamed from: c, reason: collision with root package name */
    public int f6092c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f6093d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f6094e;

    /* renamed from: f, reason: collision with root package name */
    public int f6095f;

    /* renamed from: g, reason: collision with root package name */
    public int f6096g;

    /* renamed from: h, reason: collision with root package name */
    public int f6097h;

    /* renamed from: i, reason: collision with root package name */
    public int f6098i;

    public y(int i17, int i18, int i19) {
        this.f6090a = i17;
        this.f6091b = i18;
        this.f6092c = i19;
    }

    public final void a(android.view.View child) {
        kotlin.jvm.internal.o.g(child, "child");
        this.f6093d.add(child);
        int i17 = this.f6094e;
        int i18 = this.f6091b;
        this.f6094e = i17 + i18;
        int i19 = this.f6097h + i18;
        this.f6097h = i19;
        al5.x xVar = com.tencent.mm.ui.widget.FlowTextMixView.f211256n;
        this.f6097h = i19 + al5.x.a(xVar, child);
        this.f6094e += al5.x.c(xVar, child);
        if (this.f6096g < child.getMeasuredHeight()) {
            this.f6096g = child.getMeasuredHeight();
        }
        int b17 = al5.x.b(xVar, child) + this.f6092c;
        if (child instanceof android.widget.TextView) {
            android.widget.TextView textView = (android.widget.TextView) child;
            this.f6098i = textView.getLayout() == null ? 0 : textView.getLayout().getLineTop(textView.getLineCount() - 1);
        } else if (child instanceof com.tencent.neattextview.textview.view.NeatTextView) {
            this.f6098i = al5.x.d(xVar, (com.tencent.neattextview.textview.view.NeatTextView) child);
        } else {
            b17 += this.f6098i;
        }
        if (this.f6095f < b17) {
            this.f6095f = b17;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al5.y)) {
            return false;
        }
        al5.y yVar = (al5.y) obj;
        return this.f6090a == yVar.f6090a && this.f6091b == yVar.f6091b && this.f6092c == yVar.f6092c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f6090a) * 31) + java.lang.Integer.hashCode(this.f6091b)) * 31) + java.lang.Integer.hashCode(this.f6092c);
    }

    public java.lang.String toString() {
        return "MeasureLine(index=" + this.f6090a + ", horizontalSpacing=" + this.f6091b + ", verticalSpacing=" + this.f6092c + ')';
    }
}
