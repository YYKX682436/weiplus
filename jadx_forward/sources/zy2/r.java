package zy2;

/* loaded from: classes10.dex */
public final class r implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f559078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewTreeObserver f559079e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f559080f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f559081g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f559082h;

    public r(android.widget.TextView textView, android.view.ViewTreeObserver viewTreeObserver, java.util.List list, int i17, int i18) {
        this.f559078d = textView;
        this.f559079e = viewTreeObserver;
        this.f559080f = list;
        this.f559081g = i17;
        this.f559082h = i18;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        int width;
        android.widget.TextView textView = this.f559078d;
        android.view.ViewTreeObserver viewTreeObserver = textView.getViewTreeObserver().isAlive() ? textView.getViewTreeObserver() : this.f559079e;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        if (textView.isAttachedToWindow() && (width = (textView.getWidth() - textView.getPaddingStart()) - textView.getPaddingEnd()) > 0) {
            zy2.p pVar = zy2.p.f559059a;
            android.text.TextPaint paint = textView.getPaint();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint, "getPaint(...)");
            java.util.List list = this.f559080f;
            int i17 = this.f559081g;
            java.lang.String b17 = pVar.b(list, i17, width, paint);
            java.lang.CharSequence text = textView.getText();
            java.lang.String obj = text != null ? text.toString() : null;
            if (obj == null) {
                obj = "";
            }
            java.lang.String t17 = r26.i0.t(obj, " ", "", false);
            if (i17 > 1) {
                java.lang.String d17 = pVar.d(i17);
                if ((d17.length() > 0) && r26.i0.n(t17, d17, false) && t17.length() > d17.length()) {
                    java.lang.String substring = t17.substring(0, t17.length() - d17.length());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                    t17 = r26.n0.v0(substring, ' ') + d17;
                }
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, t17)) {
                if (this.f559082h <= 0) {
                    textView.setMinWidth(textView.getWidth());
                }
                textView.setText(pVar.a(b17, i17));
            }
        }
        return true;
    }
}
