package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class dg implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej4.k f255347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18666x4f101031 f255348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f255349f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f255350g;

    public dg(ej4.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18666x4f101031 c18666x4f101031, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f255347d = kVar;
        this.f255348e = c18666x4f101031;
        this.f255349f = i17;
        this.f255350g = c1163xf1deaba4;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        yz5.a onRemoveListener;
        bk4.r.f103077a.a(this.f255347d);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18666x4f101031 c18666x4f101031 = this.f255348e;
        c18666x4f101031.f255222g.remove(this.f255349f);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = this.f255350g.mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        if (c18666x4f101031.f255222g.isEmpty() && (onRemoveListener = c18666x4f101031.getOnRemoveListener()) != null) {
            onRemoveListener.mo152xb9724478();
        }
        rl5.r rVar = c18666x4f101031.f255225m;
        if (rVar != null) {
            rVar.a();
        }
    }
}
