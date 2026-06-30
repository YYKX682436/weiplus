package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public abstract class s1 implements fs2.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f190493d;

    /* renamed from: e, reason: collision with root package name */
    public final int f190494e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.e1 f190495f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f190496g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f190497h;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager f190498i;

    public s1(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, int i17, int i18, boolean z17, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i19 = (i27 & 16) != 0 ? -1 : i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f190493d = context;
        this.f190494e = i19;
        android.view.View findViewById = context.findViewById(com.p314xaae8f345.mm.R.id.m6e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
        this.f190496g = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) findViewById;
        new tu2.b().f503664a = false;
    }

    public abstract android.view.View a();

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.e1 g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.e1 e1Var = this.f190495f;
        if (e1Var != null) {
            return e1Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("present");
        throw null;
    }

    /* renamed from: getRecyclerView */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56551x4905e9fa() {
        return this.f190496g.m82555x4905e9fa();
    }

    public final boolean j(r45.qt2 qt2Var) {
        int m75939xb282bd08 = qt2Var.m75939xb282bd08(5);
        boolean z17 = m75939xb282bd08 == 22 || m75939xb282bd08 == 28 || m75939xb282bd08 == 30 || m75939xb282bd08 == 81 || m75939xb282bd08 == 155;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderBaseGridFeedUIContract.ViewCallback", "needMarkRead:" + z17 + " commentScene:" + qt2Var.m75939xb282bd08(5) + " fromCommentScene:" + qt2Var.m75939xb282bd08(7));
        return z17;
    }
}
