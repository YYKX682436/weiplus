package aw1;

/* loaded from: classes12.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f14491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wcdb.support.CancellationSignal f14492e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f14493f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.util.List list, com.tencent.wcdb.support.CancellationSignal cancellationSignal, java.util.List list2) {
        super(0);
        this.f14491d = list;
        this.f14492e = cancellationSignal;
        this.f14493f = list2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "cleanWildFunctions image");
        java.util.List list = this.f14491d;
        if (!list.isEmpty()) {
            aw1.m.f14589a.d(this.f14492e, list, this.f14493f);
        }
        return jz5.f0.f302826a;
    }
}
