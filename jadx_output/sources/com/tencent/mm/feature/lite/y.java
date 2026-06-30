package com.tencent.mm.feature.lite;

/* loaded from: classes15.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q80.f0 f67291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f67292e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.lite.i f67293f;

    public y(com.tencent.mm.feature.lite.i iVar, q80.f0 f0Var, boolean z17) {
        this.f67293f = iVar;
        this.f67291d = f0Var;
        this.f67292e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.feature.lite.i.wi(this.f67293f, this.f67291d, this.f67292e);
    }
}
