package aw1;

/* loaded from: classes12.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wcdb.support.CancellationSignal f14528d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        super(0);
        this.f14528d = cancellationSignal;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "cleanWildFunctions image");
        java.lang.String str = "lastCleanImageTime_" + gm0.j1.b().h();
        long j17 = com.tencent.mm.sdk.platformtools.o4.L().getLong(str, 0L);
        aw1.m mVar = aw1.m.f14589a;
        if (aw1.m.a(mVar, j17)) {
            mVar.d(this.f14528d, aw1.m.i(mVar, "image2", null, 2, null), null);
            com.tencent.mm.sdk.platformtools.o4.L().putLong(str, java.lang.System.currentTimeMillis());
        }
        return jz5.f0.f302826a;
    }
}
