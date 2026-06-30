package com.tencent.mm.booter;

/* loaded from: classes7.dex */
public final class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.booter.v1 f63585d = new com.tencent.mm.booter.v1();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.w("MicroMsg.PushToMain.NotifyReceiver", "do delay notify task");
        com.tencent.mm.booter.x1.f63592a.a();
        jx3.f.INSTANCE.idkeyStat(99L, 215L, 1L, false);
    }
}
