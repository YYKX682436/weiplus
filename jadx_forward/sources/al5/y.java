package al5;

/* loaded from: classes14.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f87623a;

    /* renamed from: b, reason: collision with root package name */
    public final int f87624b;

    /* renamed from: c, reason: collision with root package name */
    public int f87625c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f87626d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f87627e;

    /* renamed from: f, reason: collision with root package name */
    public int f87628f;

    /* renamed from: g, reason: collision with root package name */
    public int f87629g;

    /* renamed from: h, reason: collision with root package name */
    public int f87630h;

    /* renamed from: i, reason: collision with root package name */
    public int f87631i;

    public y(int i17, int i18, int i19) {
        this.f87623a = i17;
        this.f87624b = i18;
        this.f87625c = i19;
    }

    public final void a(android.view.View child) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        this.f87626d.add(child);
        int i17 = this.f87627e;
        int i18 = this.f87624b;
        this.f87627e = i17 + i18;
        int i19 = this.f87630h + i18;
        this.f87630h = i19;
        al5.x xVar = com.p314xaae8f345.mm.ui.p2747xd1075a44.C22604x4b44d306.f292789n;
        this.f87630h = i19 + al5.x.a(xVar, child);
        this.f87627e += al5.x.c(xVar, child);
        if (this.f87629g < child.getMeasuredHeight()) {
            this.f87629g = child.getMeasuredHeight();
        }
        int b17 = al5.x.b(xVar, child) + this.f87625c;
        if (child instanceof android.widget.TextView) {
            android.widget.TextView textView = (android.widget.TextView) child;
            this.f87631i = textView.getLayout() == null ? 0 : textView.getLayout().getLineTop(textView.getLineCount() - 1);
        } else if (child instanceof com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) {
            this.f87631i = al5.x.d(xVar, (com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) child);
        } else {
            b17 += this.f87631i;
        }
        if (this.f87628f < b17) {
            this.f87628f = b17;
        }
    }

    /* renamed from: equals */
    public boolean m2320xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al5.y)) {
            return false;
        }
        al5.y yVar = (al5.y) obj;
        return this.f87623a == yVar.f87623a && this.f87624b == yVar.f87624b && this.f87625c == yVar.f87625c;
    }

    /* renamed from: hashCode */
    public int m2321x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f87623a) * 31) + java.lang.Integer.hashCode(this.f87624b)) * 31) + java.lang.Integer.hashCode(this.f87625c);
    }

    /* renamed from: toString */
    public java.lang.String m2322x9616526c() {
        return "MeasureLine(index=" + this.f87623a + ", horizontalSpacing=" + this.f87624b + ", verticalSpacing=" + this.f87625c + ')';
    }
}
