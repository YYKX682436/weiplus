package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.booter.x0 f63586d;

    public w0(com.tencent.mm.booter.x0 x0Var) {
        this.f63586d = x0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiver", "summerboot startupDone do delay notify task");
        com.tencent.mm.booter.x0 x0Var = this.f63586d;
        x0Var.f63591f.i(x0Var.f63590e);
        jx3.f.INSTANCE.idkeyStat(99L, 215L, 1L, false);
    }
}
