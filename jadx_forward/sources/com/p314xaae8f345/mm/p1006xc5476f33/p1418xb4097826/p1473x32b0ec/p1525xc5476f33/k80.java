package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class k80 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.Set f194736r = new java.util.LinkedHashSet();

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f194737p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f194738q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k80(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f194737p = statusMonitor;
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.bzp);
        this.f194738q = findViewById;
        K0(8);
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.j80(this));
        zl2.r4.b(zl2.r4.f555483a, root, this, false, false, 12, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
        if (i17 == 0) {
            qo0.c.a(this.f194737p, qo0.b.f446890g5, null, 2, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return zl2.r4.f555483a.f2(S0());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }
}
