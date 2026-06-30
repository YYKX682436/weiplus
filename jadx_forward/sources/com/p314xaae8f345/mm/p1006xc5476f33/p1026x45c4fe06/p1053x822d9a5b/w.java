package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b;

/* loaded from: classes7.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.x f159699d;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.x xVar) {
        this.f159699d = xVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.u uVar = this.f159699d.f159704e;
        uVar.f159691l = true;
        if (uVar.f159692m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandFloatBallLogic", "back release:" + this.f159699d.f159703d.f156336n);
            ((java.util.concurrent.LinkedBlockingDeque) this.f159699d.f159704e.f159681b).clear();
            return;
        }
        while (true) {
            java.util.Deque deque = uVar.f159681b;
            if (deque.isEmpty()) {
                return;
            } else {
                ((java.lang.Runnable) ((java.util.concurrent.LinkedBlockingDeque) deque).removeFirst()).run();
            }
        }
    }
}
