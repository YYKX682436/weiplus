package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes12.dex */
public abstract class h0 extends android.widget.BaseAdapter {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f236933f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f236934g;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ListView f236939o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f236940p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.a f236941q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.f0 f236942r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2 f236943s;

    /* renamed from: t, reason: collision with root package name */
    public int f236944t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f236945u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f236946v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.Runnable f236947w;

    /* renamed from: d, reason: collision with root package name */
    public int f236931d = -1;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f236932e = "";

    /* renamed from: h, reason: collision with root package name */
    public final android.util.SparseArray f236935h = new android.util.SparseArray();

    /* renamed from: i, reason: collision with root package name */
    public boolean f236936i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f236937m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f236938n = false;

    public h0(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.f0 f0Var) {
        this.f236934g = null;
        i65.a.b(this.f236933f, 35);
        this.f236940p = new java.util.LinkedList();
        this.f236944t = 0;
        this.f236945u = "";
        this.f236946v = "";
        this.f236947w = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.b0(this);
        this.f236933f = context;
        this.f236934g = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.a0(this, android.os.Looper.getMainLooper());
        this.f236942r = f0Var;
    }

    public void a() {
        int i17 = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.f236935h;
            if (i17 >= sparseArray.size()) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.g0 g0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.g0) sparseArray.valueAt(i17);
            if (g0Var != null) {
                g0Var.mo67872x5cd39ffa();
            }
            i17++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.f0 f0Var = this.f236942r;
        if (f0Var != null) {
            f0Var.d();
            this.f236942r = null;
        }
    }

    public abstract int c();

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public r45.gp0 getItem(int i17) {
        java.util.List list = this.f236940p;
        if (list != null && i17 >= 0 && i17 < ((java.util.LinkedList) list).size()) {
            return (r45.gp0) ((java.util.LinkedList) list).get(i17);
        }
        return null;
    }

    public final void f(java.lang.String str) {
        if (c01.e2.J(str)) {
            return;
        }
        com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = new com.p314xaae8f345.mm.p943x351df9c2.r0();
        r0Var.f152062a = str;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(r0Var);
    }

    public abstract void g(et3.b bVar);

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f236940p;
        if (list == null) {
            return 0;
        }
        return ((java.util.LinkedList) list).size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        int i18 = getItem(i17).I;
        if (i18 == 1) {
            return 0;
        }
        if (i18 == 2) {
            return 1;
        }
        if (i18 != 3) {
            return i18 != 21 ? 3 : 5;
        }
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02d2  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r29, android.view.View r30, android.view.ViewGroup r31) {
        /*
            Method dump skipped, instructions count: 1808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.h0.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 6;
    }

    public abstract void h(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.a aVar);

    public com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.m j(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.m mVar) {
        return mVar;
    }
}
