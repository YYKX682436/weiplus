package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.x f78166d;

    public w(com.tencent.mm.plugin.appbrand.floatball.x xVar) {
        this.f78166d = xVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.floatball.u uVar = this.f78166d.f78171e;
        uVar.f78158l = true;
        if (uVar.f78159m) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandFloatBallLogic", "back release:" + this.f78166d.f78170d.f74803n);
            ((java.util.concurrent.LinkedBlockingDeque) this.f78166d.f78171e.f78148b).clear();
            return;
        }
        while (true) {
            java.util.Deque deque = uVar.f78148b;
            if (deque.isEmpty()) {
                return;
            } else {
                ((java.lang.Runnable) ((java.util.concurrent.LinkedBlockingDeque) deque).removeFirst()).run();
            }
        }
    }
}
