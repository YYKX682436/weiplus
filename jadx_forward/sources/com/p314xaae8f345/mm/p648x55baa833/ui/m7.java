package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public final class m7 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f145896d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f145897e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Float f145898f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Float f145899g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f145900h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View.OnTouchListener f145901i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f145902m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p648x55baa833.ui.g7 f145903n;

    public m7(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, java.util.List items) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        this.f145896d = recyclerView;
        this.f145897e = items;
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        this.f145898f = valueOf;
        this.f145899g = valueOf;
        this.f145900h = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.h7(this));
        this.f145901i = new com.p314xaae8f345.mm.p648x55baa833.ui.l7(this);
        this.f145902m = new com.p314xaae8f345.mm.p648x55baa833.ui.k7(this);
        this.f145903n = new com.p314xaae8f345.mm.p648x55baa833.ui.g7(this);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f145897e.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01fc A[LOOP:1: B:11:0x01f6->B:13:0x01fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0484  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r40, int r41) {
        /*
            Method dump skipped, instructions count: 1457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p648x55baa833.ui.m7.mo864xe5e2e48d(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569929s6, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new com.p314xaae8f345.mm.p648x55baa833.ui.z7(inflate, this.f145903n, this.f145902m, this.f145901i);
    }
}
