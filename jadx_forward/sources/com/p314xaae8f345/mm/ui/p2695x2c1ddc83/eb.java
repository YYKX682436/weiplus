package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes9.dex */
public class eb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.fb f289189d;

    public eb(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.fb fbVar) {
        this.f289189d = fbVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.fb fbVar = this.f289189d;
        fbVar.f289218f.f289242d.f288957e.remove(fbVar.f289216d);
        fbVar.f289218f.f289242d.f288958f.notifyDataSetChanged();
    }
}
