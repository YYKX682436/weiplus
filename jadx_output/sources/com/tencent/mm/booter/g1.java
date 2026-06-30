package com.tencent.mm.booter;

/* loaded from: classes10.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f63360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f63361e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f63362f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(long j17, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.c0 c0Var2) {
        super(1);
        this.f63360d = j17;
        this.f63361e = c0Var;
        this.f63362f = c0Var2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.booter.a1 fixUp = (com.tencent.mm.booter.a1) obj;
        kotlin.jvm.internal.o.g(fixUp, "fixUp");
        long j17 = this.f63360d;
        long j18 = fixUp.f63298a;
        boolean z17 = true;
        long j19 = fixUp.f63299b;
        if (j17 >= j18 && j17 < j19 && !fixUp.a().contains(java.lang.Long.valueOf(j17))) {
            if (fixUp.a().contains(java.lang.Long.valueOf(j17))) {
                this.f63361e.f310112d = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.PushToMain.NotifyReceiver", "fixUp distinct: syncNum=" + j17 + ", fixUp=" + fixUp);
            } else {
                this.f63362f.f310112d = true;
                fixUp.a().add(java.lang.Long.valueOf(j17));
                com.tencent.mars.xlog.Log.i("MicroMsg.PushToMain.NotifyReceiver", "fixUp success: syncNum=" + j17 + ", fixUp=" + fixUp);
            }
        }
        e06.n nVar = j19 <= Long.MIN_VALUE ? e06.n.f246224g : new e06.n(j18, j19 - 1);
        if (!(nVar instanceof java.util.Collection) || !((java.util.Collection) nVar).isEmpty()) {
            java.util.Iterator it = nVar.iterator();
            while (true) {
                if (!((e06.m) it).f246222f) {
                    break;
                }
                if (!fixUp.a().contains(java.lang.Long.valueOf(((kz5.y0) it).b()))) {
                    z17 = false;
                    break;
                }
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
