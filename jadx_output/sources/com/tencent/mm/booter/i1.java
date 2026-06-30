package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.booter.i1 f63398d = new com.tencent.mm.booter.i1();

    public i1() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.booter.b1 pending = (com.tencent.mm.booter.b1) obj;
        kotlin.jvm.internal.o.g(pending, "pending");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("exe pending ");
        sb6.append(pending.f63308a);
        sb6.append(" withKernel: syncNum=");
        android.content.Intent intent = pending.f63309b;
        sb6.append(intent.getLongExtra("notfiy_sync_num", 0L));
        com.tencent.mars.xlog.Log.w("MicroMsg.PushToMain.NotifyReceiver", sb6.toString());
        com.tencent.mm.booter.x1.f63592a.c(intent);
        return java.lang.Boolean.TRUE;
    }
}
