package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f;

/* loaded from: classes7.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f165532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165533e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165534f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n f165535g;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n nVar, int i17, java.lang.String str, java.lang.String str2) {
        this.f165535g = nVar;
        this.f165532d = i17;
        this.f165533e = str;
        this.f165534f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n nVar = this.f165535g;
        com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5130x9c70410d c5130x9c70410d = nVar.f165553e;
        int i17 = this.f165532d;
        if (c5130x9c70410d == null) {
            nVar.f165553e = new com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5130x9c70410d();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJ2V8Context", "nativeCreateRuntime triggered by invokeCallbackHandler callbackId[%d]", java.lang.Integer.valueOf(i17));
            nVar.f165553e.mo43186xe258f33c(nVar.L(), nVar.G());
        }
        nVar.f165553e.mo43190x44c4dbad(i17, this.f165533e, this.f165534f);
    }
}
