package aw1;

/* loaded from: classes12.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f14501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wcdb.support.CancellationSignal f14502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f14503f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.util.List list, com.tencent.wcdb.support.CancellationSignal cancellationSignal, java.util.List list2) {
        super(0);
        this.f14501d = list;
        this.f14502e = cancellationSignal;
        this.f14503f = list2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "cleanWildFunctions video");
        java.util.List list = this.f14501d;
        if (!list.isEmpty()) {
            aw1.m.f14589a.f(this.f14502e, list, this.f14503f);
        }
        return jz5.f0.f302826a;
    }
}
