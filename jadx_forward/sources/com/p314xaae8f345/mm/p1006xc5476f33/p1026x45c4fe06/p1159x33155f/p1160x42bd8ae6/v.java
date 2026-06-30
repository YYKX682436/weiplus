package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6;

/* loaded from: classes7.dex */
public final class v implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.w f167466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f167467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f167468f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f167469g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ae.r f167470h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ce.g f167471i;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.w wVar, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, java.lang.String str, ae.r rVar, ce.g gVar, int i17) {
        this.f167466d = wVar;
        this.f167467e = context;
        this.f167468f = n7Var;
        this.f167469g = str;
        this.f167470h = rVar;
        this.f167471i = gVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2;
        int itemId = menuItem.getItemId();
        if (itemId == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.w.d(this.f167466d, this.f167467e, this.f167468f, 0, this.f167469g);
            return;
        }
        ae.r rVar = this.f167470h;
        ce.g gVar = this.f167471i;
        if (itemId == 4) {
            rVar.s(3);
            com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf22 = ((ce.o) gVar).f122219g;
            if (c4216x654bedf22 != null) {
                c4216x654bedf22.m34856x4a42b983();
                return;
            }
            return;
        }
        if (itemId != 5) {
            if (itemId == 6 && (c4216x654bedf2 = ((ce.o) gVar).f122219g) != null) {
                c4216x654bedf2.m34856x4a42b983();
                return;
            }
            return;
        }
        rVar.s(2);
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf23 = ((ce.o) gVar).f122219g;
        if (c4216x654bedf23 != null) {
            c4216x654bedf23.m34856x4a42b983();
        }
    }
}
