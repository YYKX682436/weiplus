package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes13.dex */
public class wc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn.c f281700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f281701e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bd f281702f;

    public wc(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bd bdVar, rn.c cVar, int i17) {
        this.f281702f = bdVar;
        this.f281700d = cVar;
        this.f281701e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f281702f.f280265a.f281305q.add(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.md(this.f281700d, 1, 0, this.f281701e + 1));
    }
}
