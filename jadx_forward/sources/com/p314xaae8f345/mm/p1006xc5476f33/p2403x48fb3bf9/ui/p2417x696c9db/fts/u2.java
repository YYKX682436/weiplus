package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class u2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ su4.c2 f266165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f266166e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.v2 f266167f;

    public u2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.v2 v2Var, su4.c2 c2Var, int i17) {
        this.f266167f = v2Var;
        this.f266165d = c2Var;
        this.f266166e = i17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1
    /* renamed from: onDismiss */
    public void mo889xb349b3ab() {
        int i17 = this.f266166e;
        su4.c2 c2Var = this.f266165d;
        if (c2Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.e0) c2Var).a(-1, i17);
        }
        ((java.util.HashMap) this.f266167f.f266201a).remove(java.lang.Integer.valueOf(i17));
    }
}
