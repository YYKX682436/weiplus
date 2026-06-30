package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class ve implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.he f292687d;

    public ve(com.p314xaae8f345.mm.ui.he heVar) {
        this.f292687d = heVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.he heVar = this.f292687d;
        heVar.f290401i = true;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(heVar.f290402m);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(heVar.f290402m);
    }
}
