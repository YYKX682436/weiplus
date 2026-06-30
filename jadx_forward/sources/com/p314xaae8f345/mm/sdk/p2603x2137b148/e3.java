package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes.dex */
public final class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f274082d;

    public e3(java.util.List list) {
        this.f274082d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = this.f274082d.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.vfs.w6.f((java.lang.String) it.next());
        }
    }
}
