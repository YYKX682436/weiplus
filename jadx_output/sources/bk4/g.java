package bk4;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent f21476d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent) {
        super(0);
        this.f21476d = checkResUpdateCacheFileEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            bk4.y yVar = bk4.y.f21618a;
            java.lang.String filePath = this.f21476d.f54053g.f7761c;
            kotlin.jvm.internal.o.f(filePath, "filePath");
            yVar.c0(filePath);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TextStatus.StatusIconHelper", th6, "updateRes exception", new java.lang.Object[0]);
        }
        jx3.f.INSTANCE.idkeyStat(1629L, 9L, 1L, false);
        return jz5.f0.f302826a;
    }
}
