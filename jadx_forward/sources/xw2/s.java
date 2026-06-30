package xw2;

/* loaded from: classes2.dex */
public abstract class s extends android.widget.FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f539248o = 0;

    /* renamed from: d, reason: collision with root package name */
    public final xw2.u f539249d;

    /* renamed from: e, reason: collision with root package name */
    public final int f539250e;

    /* renamed from: f, reason: collision with root package name */
    public final float f539251f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f539252g;

    /* renamed from: h, reason: collision with root package name */
    public final xw2.n f539253h;

    /* renamed from: i, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f539254i;

    /* renamed from: m, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f539255m;

    /* renamed from: n, reason: collision with root package name */
    public int f539256n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(android.content.Context context, xw2.u viewModel) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewModel, "viewModel");
        this.f539249d = viewModel;
        this.f539250e = m176115xd666ff73();
        this.f539251f = 0.5f;
        this.f539252g = jz5.h.b(new xw2.p(context));
        xw2.n nVar = new xw2.n(this);
        this.f539253h = nVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context, 0, false);
        this.f539254i = c1162x665295de;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4(context, null);
        c1163xf1deaba4.mo7967x900dcbe1(c1162x665295de);
        c1163xf1deaba4.setClipToPadding(false);
        c1163xf1deaba4.setOverScrollMode(2);
        c1163xf1deaba4.mo7960x6cab2c8d(nVar);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h00) viewModel).S6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh.f215413d, new xw2.q(this, null), new xw2.r(this));
        this.f539255m = c1163xf1deaba4;
        c1163xf1deaba4.i(new xw2.f(this));
        addView(c1163xf1deaba4, new android.widget.FrameLayout.LayoutParams(-1, -2));
        new p012xc85e97e9.p103xe821e364.p104xd1075a44.y1().b(c1163xf1deaba4);
        addOnLayoutChangeListener(new xw2.g(this));
    }

    public static final java.lang.Object b(xw2.s sVar, java.util.List list, int i17, int i18) {
        java.util.List list2 = (java.util.List) kz5.n0.a0(sVar.c(list), i17);
        if (list2 != null) {
            return kz5.n0.a0(list2, i18);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCurrentGroupCount */
    public final int m176115xd666ff73() {
        return ((xw2.t) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h00) this.f539249d).f216101f).mo144003x754a37bb()).f539259c;
    }

    public final java.util.List c(java.util.List list) {
        return kz5.n0.N(list, m176115xd666ff73());
    }

    /* renamed from: getExtendCount */
    public float m176116xaecd48df() {
        return this.f539251f;
    }

    /* renamed from: getInitialGroupCount */
    public int m176117xd94b177e() {
        return this.f539250e;
    }

    /* renamed from: getItemMinWidth */
    public int m176118x3466693d() {
        return ((java.lang.Number) ((jz5.n) this.f539252g).mo141623x754a37bb()).intValue();
    }

    /* renamed from: getItemResource */
    public abstract int mo63149x721372b7();

    /* renamed from: getViewModel */
    public final xw2.u m176119xa0ab20ce() {
        return this.f539249d;
    }
}
