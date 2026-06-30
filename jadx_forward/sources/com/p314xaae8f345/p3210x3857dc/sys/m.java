package com.p314xaae8f345.p3210x3857dc.sys;

/* loaded from: classes13.dex */
public class m implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3210x3857dc.sys.q f302096d;

    public m(com.p314xaae8f345.p3210x3857dc.sys.q qVar) {
        this.f302096d = qVar;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        by5.c4.f("SysWebFactory", "getWebviewStorage, not yet init, try run in main loop.");
        return this.f302096d.i();
    }
}
