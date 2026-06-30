package lh4;

/* loaded from: classes8.dex */
public abstract class h extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final lh4.b f400243d;

    /* renamed from: e, reason: collision with root package name */
    public final int f400244e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f400245f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f400246g;

    /* renamed from: h, reason: collision with root package name */
    public lh4.n f400247h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.FrameLayout f400248i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, lh4.b callback, int i17, android.util.AttributeSet attributeSet, int i18) {
        super(context, attributeSet, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f400243d = callback;
        this.f400244e = i17;
        lh4.m mVar = lh4.n.f400252e;
        this.f400247h = lh4.n.f400253f;
        int i19 = com.p314xaae8f345.mm.R.C30864xbddafb2a.f571084cy1;
        switch (i17) {
            case 1:
            case 2:
            case 7:
                i19 = com.p314xaae8f345.mm.R.C30864xbddafb2a.f571086cy3;
                break;
            case 3:
            case 9:
                i19 = com.p314xaae8f345.mm.R.C30864xbddafb2a.f571083cy0;
                break;
            case 4:
            default:
                i19 = com.p314xaae8f345.mm.R.C30864xbddafb2a.cxz;
                break;
            case 5:
                i19 = com.p314xaae8f345.mm.R.C30864xbddafb2a.f571085cy2;
                break;
            case 6:
            case 8:
                break;
            case 10:
                i19 = com.p314xaae8f345.mm.R.C30864xbddafb2a.epu;
                break;
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(i19, (android.view.ViewGroup) this, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f400245f = viewGroup;
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.cg7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f400248i = (android.widget.FrameLayout) findViewById;
        if (f().length() > 0) {
            android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.obc);
            this.f400246g = textView;
            textView.setText(f());
        } else {
            this.f400246g = null;
        }
        d();
        setImportantForAccessibility(2);
        addView(viewGroup);
    }

    public final void a(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f400248i.addView(view, new android.widget.FrameLayout.LayoutParams(-1, -2));
    }

    public boolean b(int i17) {
        return true;
    }

    public void c() {
    }

    public void d() {
    }

    public void e(int i17) {
    }

    public abstract java.lang.String f();

    public boolean g(int i17) {
        return false;
    }

    /* renamed from: getCallback */
    public final lh4.b m145775x71965dbb() {
        return this.f400243d;
    }

    /* renamed from: getContainerView */
    public final android.widget.FrameLayout m145776x329d8f10() {
        return this.f400248i;
    }

    /* renamed from: getRoot */
    public final android.view.ViewGroup m145777xfb84e958() {
        return this.f400245f;
    }

    /* renamed from: getSectionType */
    public final int m145778xfc19ce89() {
        return this.f400244e;
    }

    /* renamed from: getTitle */
    public final android.widget.TextView m145779x7531c8a2() {
        return this.f400246g;
    }

    /* renamed from: getViewModel */
    public final lh4.n m145780xa0ab20ce() {
        return this.f400247h;
    }

    public void h(int i17) {
        android.widget.TextView textView;
        android.view.ViewGroup viewGroup = this.f400245f;
        if (viewGroup == null || (textView = this.f400246g) == null) {
            return;
        }
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.jrt);
        if (textView2 != null) {
            textView2.setTextSize(0, i17);
        }
        textView.setTextSize(0, i17);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* renamed from: setViewModel */
    public final void m145781xfcfee142(lh4.n nVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<set-?>");
        this.f400247h = nVar;
    }
}
