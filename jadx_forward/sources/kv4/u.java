package kv4;

/* loaded from: classes4.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kv4.b0 f394263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewParent f394264e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f394265f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f394266g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394267h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f394268i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f394269m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f394270n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ rv4.i0 f394271o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.view.View f394272p;

    public u(kv4.b0 b0Var, android.view.ViewParent viewParent, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.widget.TextView textView, java.lang.String str, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522, float f17, rv4.i0 i0Var, android.view.View view) {
        this.f394263d = b0Var;
        this.f394264e = viewParent;
        this.f394265f = h0Var;
        this.f394266g = textView;
        this.f394267h = str;
        this.f394268i = c22699x3dcdb352;
        this.f394269m = c22699x3dcdb3522;
        this.f394270n = f17;
        this.f394271o = i0Var;
        this.f394272p = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.text.TextPaint paint;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f394264e;
        java.lang.Object element = this.f394265f.f391656d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(element, "element");
        android.widget.TextView textView = (android.widget.TextView) element;
        java.util.List list = this.f394271o.f482032j;
        android.content.Context context = this.f394272p.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f394263d.getClass();
        java.lang.Object parent = viewGroup.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        int width = view != null ? view.getWidth() : viewGroup.getWidth();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f394268i;
        boolean z17 = c22699x3dcdb352 != null && c22699x3dcdb352.getVisibility() == 0;
        float f17 = this.f394270n;
        float width2 = z17 ? c22699x3dcdb352.getWidth() + (4 * f17) : 0.0f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f394269m;
        float width3 = (width - width2) - (c22699x3dcdb3522 != null && c22699x3dcdb3522.getVisibility() == 0 ? c22699x3dcdb3522.getWidth() + (4 * f17) : 0.0f);
        android.text.TextPaint paint2 = textView.getPaint();
        java.lang.String str = this.f394267h;
        float measureText = paint2 != null ? paint2.measureText(str) : 0.0f;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p07, java.lang.Integer.valueOf(list.size()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        android.widget.TextView textView2 = this.f394266g;
        float measureText2 = (textView2 == null || (paint = textView2.getPaint()) == null) ? 0.0f : paint.measureText(string);
        if (measureText <= width3) {
            textView.setMaxWidth((int) width3);
            textView.setText(str);
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
            return;
        }
        if (list.size() == 1) {
            kv4.b0.a(textView, str, width3);
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
            return;
        }
        float f18 = width3 - measureText2;
        if (f18 <= 0.0f) {
            textView.setMaxWidth(0);
            kv4.b0.a(textView2, string, width3);
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(0);
            return;
        }
        kv4.b0.a(textView, str, f18);
        if (textView2 != null) {
            textView2.setText(string);
        }
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(0);
    }
}
