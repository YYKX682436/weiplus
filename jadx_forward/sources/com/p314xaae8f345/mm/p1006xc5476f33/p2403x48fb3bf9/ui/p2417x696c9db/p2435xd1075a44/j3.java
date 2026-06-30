package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public class j3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f268876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f268877f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f268878g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p3 f268879h;

    public j3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p3 p3Var, java.lang.String str, long j17, int i17, float f17) {
        this.f268879h = p3Var;
        this.f268875d = str;
        this.f268876e = j17;
        this.f268877f = i17;
        this.f268878g = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p3 p3Var = this.f268879h;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3 u3Var = p3Var.f269028f;
        if (u3Var.f269087g == null || (wVar = u3Var.f269085e) == null || !wVar.c().f(42)) {
            return;
        }
        p3Var.f269028f.f269087g.C(this.f268875d, this.f268876e, this.f268877f, this.f268878g);
    }
}
