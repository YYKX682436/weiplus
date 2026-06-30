package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes8.dex */
public class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f225166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.m3 f225167e;

    public k3(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.m3 m3Var, boolean[] zArr) {
        this.f225167e = m3Var;
        this.f225166d = zArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f225166d) {
            if (!this.f225166d[0]) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiteAppJsApiLogin", "geta8key timeout");
                this.f225166d[0] = true;
                this.f225167e.f224976f.a("getA8Key timeout");
            }
        }
    }
}
