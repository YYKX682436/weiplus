package aw1;

/* loaded from: classes12.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f14512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wcdb.support.CancellationSignal f14513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f14514f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.util.List list, com.tencent.wcdb.support.CancellationSignal cancellationSignal, java.util.List list2) {
        super(0);
        this.f14512d = list;
        this.f14513e = cancellationSignal;
        this.f14514f = list2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "cleanWildFunctions record");
        java.util.List list = this.f14512d;
        if (!list.isEmpty()) {
            aw1.m.f14589a.e(this.f14513e, list, this.f14514f);
        }
        return jz5.f0.f302826a;
    }
}
