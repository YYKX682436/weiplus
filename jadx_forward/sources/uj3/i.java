package uj3;

/* loaded from: classes14.dex */
public final class i extends uj3.v0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.HashSet hashSet3 = new java.util.HashSet();
        int[] iArr = {1, 3, 4};
        for (int i17 = 0; i17 < 3; i17++) {
            hashSet.add(java.lang.Integer.valueOf(iArr[i17]));
        }
        java.lang.String string = getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ibb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        uj3.j jVar = new uj3.j(string, 5);
        java.lang.String string2 = getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ib_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        uj3.j jVar2 = new uj3.j(string2, 6);
        java.lang.String string3 = getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.iba);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        uj3.j jVar3 = new uj3.j(string3, 7);
        java.lang.String string4 = getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ibq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
        uj3.j[] jVarArr = {jVar, jVar2, jVar3, new uj3.j(string4, 8)};
        for (int i18 = 0; i18 < 4; i18++) {
            hashSet2.add(jVarArr[i18]);
        }
        int[] iArr2 = {11, 9};
        for (int i19 = 0; i19 < 2; i19++) {
            hashSet3.add(java.lang.Integer.valueOf(iArr2[i19]));
        }
        m168176x31d07134(new uj3.k(hashSet, hashSet2, hashSet3, 3));
        android.view.LayoutInflater.from(getContext()).inflate(mo168121x2ee31f5b(), this);
        m168170x3a0f5982((android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.asr));
        m168169xb310d85f((android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.asq));
        m168162xb81a87af((android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.asp));
        m168179x6d4c8d15((android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.ass));
        m168160x45c67dd((android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.aso));
        android.widget.FrameLayout m168147x1cab64eb = m168147x1cab64eb();
        if (m168147x1cab64eb != null) {
            m168147x1cab64eb.setVisibility(8);
        }
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        m168173x98bd1d4(new uj3.c(context2, this, m168154x8dd3dc28()));
        android.content.Context context3 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        m168180x69177191(new uj3.f1(context3, this));
        android.content.Context context4 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
        m168158x53e40f65(new uj3.b0(context4, this));
        android.content.Context context5 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context5, "getContext(...)");
        m168163x50d28f2b(new uj3.l0(context5, this, m168154x8dd3dc28()));
        m168171x4fc62d5(new uj3.k1());
        android.content.Context context6 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context6, "getContext(...)");
        m168175xf1a490b5(new uj3.j1(context6, this, m168154x8dd3dc28()));
        p();
        r(true);
        android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new uj3.h(this));
        }
    }

    @Override // uj3.v0
    /* renamed from: getBackgroundView */
    public android.view.View mo168119x43ae89e9() {
        return m168147x1cab64eb();
    }

    @Override // uj3.v0
    /* renamed from: getCurrentFileMd5 */
    public java.lang.String mo168120x5cddb39f() {
        return null;
    }

    @Override // uj3.v0
    /* renamed from: getLayoutId */
    public int mo168121x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c3l;
    }
}
