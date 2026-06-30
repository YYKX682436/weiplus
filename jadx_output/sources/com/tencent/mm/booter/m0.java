package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l85.n0 f63432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f63433e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(l85.n0 n0Var, java.util.List list) {
        super(1);
        this.f63432d = n0Var;
        this.f63433e = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.booter.l0 pending = (com.tencent.mm.booter.l0) obj;
        kotlin.jvm.internal.o.g(pending, "pending");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("exe pending ");
        sb6.append(pending.f63410a);
        sb6.append(" startService: syncNum=");
        android.content.Intent intent = pending.f63412c;
        sb6.append(intent.getLongExtra("notfiy_sync_num", 0L));
        com.tencent.mars.xlog.Log.i("MicroMsg.PushToMain.MMServiceHelperKt", sb6.toString());
        try {
            this.f63432d.startService(intent);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.PushToMain.MMServiceHelperKt", "exe pending err: " + e17.getMessage());
            if (pending.f63413d) {
                intent.putExtra("notify_service_retry", intent.getIntExtra("notify_service_retry", 0) + 1);
                this.f63433e.add(pending);
                l85.l1.a(5L, 1L, false);
            }
        }
        return java.lang.Boolean.TRUE;
    }
}
