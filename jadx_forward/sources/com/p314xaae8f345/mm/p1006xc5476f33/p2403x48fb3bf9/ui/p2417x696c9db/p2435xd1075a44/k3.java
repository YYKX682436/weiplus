package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f268896e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p3 f268897f;

    public k3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p3 p3Var, java.lang.String str, int i17) {
        this.f268897f = p3Var;
        this.f268895d = str;
        this.f268896e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f268897f.f269028f.f269087g;
        if (nVar != null) {
            nVar.Q(this.f268895d, this.f268896e);
        }
    }
}
