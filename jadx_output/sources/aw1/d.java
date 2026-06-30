package aw1;

/* loaded from: classes12.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f14506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wcdb.support.CancellationSignal f14507e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f14508f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.util.List list, com.tencent.wcdb.support.CancellationSignal cancellationSignal, java.util.List list2) {
        super(0);
        this.f14506d = list;
        this.f14507e = cancellationSignal;
        this.f14508f = list2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "cleanWildFunctions attachment");
        java.util.List list = this.f14506d;
        if (!list.isEmpty()) {
            aw1.m.f14589a.c(this.f14507e, list, this.f14508f);
        }
        return jz5.f0.f302826a;
    }
}
