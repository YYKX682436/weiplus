package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class f8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f194041p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f194042q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f194043r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f194044s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f194045t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f194046u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f194047v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f194048w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f194049x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f194050y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f194041p = root.findViewById(com.p314xaae8f345.mm.R.id.elj);
        this.f194042q = root.findViewById(com.p314xaae8f345.mm.R.id.elg);
        this.f194043r = root.findViewById(com.p314xaae8f345.mm.R.id.elm);
        this.f194044s = root.findViewById(com.p314xaae8f345.mm.R.id.ela);
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.mbs);
        this.f194045t = findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.lca);
        this.f194046u = findViewById2;
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.p_3);
        this.f194047v = findViewById3;
        this.f194048w = "anchorlive.bottom.tools.screenshare";
        this.f194049x = "anchorlive.bottom.tools.link";
        this.f194050y = "anchorlive.bottom.tools.vote";
        jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.e8(root));
        if (!x0()) {
            root.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b8(root));
        }
        root.setTranslationY(com.p314xaae8f345.mm.ui.bl.b(root.getContext()).y);
        root.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c8(this));
        ll2.e eVar = ll2.e.f400666a;
        java.lang.Object context = root.getContext();
        ll2.e.l(eVar, context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null, "anchorlive.bottom.tools.screenshare", findViewById, null, null, 24, null);
        java.lang.Object context2 = root.getContext();
        ll2.e.l(eVar, context2 instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context2 : null, "anchorlive.bottom.tools.link", findViewById2, null, null, 24, null);
        java.lang.Object context3 = root.getContext();
        ll2.e.l(eVar, context3 instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context3 : null, "anchorlive.bottom.tools.vote", findViewById3, null, null, 24, null);
    }

    @Override // qo0.a
    public boolean B0() {
        if (w0() != 0) {
            return false;
        }
        t1();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void t1() {
        ll2.e eVar = ll2.e.f400666a;
        eVar.e(this.f194048w, false);
        eVar.e(this.f194049x, false);
        eVar.e(this.f194050y, false);
        this.f446856d.animate().translationY(com.p314xaae8f345.mm.ui.bl.b(r0.getContext()).y).setDuration(200L).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.d8(this)).start();
    }
}
