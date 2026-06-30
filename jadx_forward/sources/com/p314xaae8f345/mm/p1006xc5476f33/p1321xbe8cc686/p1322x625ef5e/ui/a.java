package com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui;

/* loaded from: classes12.dex */
public abstract class a extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.f0 f177056d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f177057e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f177058f = gm0.j1.u().l();

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.v f177059g;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.f0 f0Var, java.util.List list) {
        this.f177056d = f0Var;
        this.f177057e = list;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f177057e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return x(i17).h();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.w
    public boolean o() {
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List list) {
        x(i17).getClass();
        super.mo8157xe5e2e48d(k3Var, i17, list);
    }

    public wv1.a x(int i17) {
        java.util.List list = this.f177057e;
        if (list == null || list.size() <= i17) {
            return null;
        }
        return (wv1.a) list.get(i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        boolean z17 = this.f177058f;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseChooseFileAdapter", "[onBindViewHolder] isSDCardAvailable:%b", java.lang.Boolean.valueOf(z17));
        } else {
            x(i17).j(k3Var, i17, x(i17 + 1));
        }
    }
}
