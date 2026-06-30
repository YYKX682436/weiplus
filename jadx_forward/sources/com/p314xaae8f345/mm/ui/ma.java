package com.p314xaae8f345.mm.ui;

/* loaded from: classes14.dex */
public class ma implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ga f290634d;

    public ma(com.p314xaae8f345.mm.ui.ga gaVar) {
        this.f290634d = gaVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f290634d;
        gaVar.f290203t.getWindow().setFlags(1024, 1024);
        p012xc85e97e9.p016x746ad0e3.app.b bVar = gaVar.G;
        if (bVar != null) {
            bVar.o();
        }
    }
}
