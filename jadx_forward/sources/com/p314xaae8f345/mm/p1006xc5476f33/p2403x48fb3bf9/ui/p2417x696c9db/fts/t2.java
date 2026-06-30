package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class t2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ su4.c2 f266154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f266155e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.v2 f266156f;

    public t2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.v2 v2Var, su4.c2 c2Var, int i17) {
        this.f266156f = v2Var;
        this.f266154d = c2Var;
        this.f266155e = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int i18 = this.f266155e;
        su4.c2 c2Var = this.f266154d;
        if (c2Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.e0) c2Var).a(i17, i18);
        }
        ((java.util.HashMap) this.f266156f.f266201a).remove(java.lang.Integer.valueOf(i18));
    }
}
