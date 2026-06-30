package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f266028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19391xc941d0e f266029f;

    public k3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19391xc941d0e activityC19391xc941d0e, java.lang.String str, int i17) {
        this.f266029f = activityC19391xc941d0e;
        this.f266027d = str;
        this.f266028e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f266029f.f265377p0;
        if (nVar != null) {
            nVar.V(this.f266027d, this.f266028e);
        }
    }
}
