package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public class n3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f268976e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p3 f268977f;

    public n3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p3 p3Var, java.lang.String str, int i17) {
        this.f268977f = p3Var;
        this.f268975d = str;
        this.f268976e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f268977f.f269028f.f269087g;
        if (nVar != null) {
            nVar.p0(this.f268975d, this.f268976e);
        }
    }
}
