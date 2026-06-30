package a75;

/* loaded from: classes11.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.event.pending.StoragePendingEventNotifier f1943d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.sdk.event.pending.StoragePendingEventNotifier storagePendingEventNotifier) {
        super(0);
        this.f1943d = storagePendingEventNotifier;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.event.pending.StoragePendingEventNotifier storagePendingEventNotifier = this.f1943d;
        a75.f fVar = new a75.f(storagePendingEventNotifier);
        xu5.b bVar = (xu5.b) xu5.b.f457300e.get(storagePendingEventNotifier.f192391e);
        if (bVar == null) {
            bVar = xu5.b.a(storagePendingEventNotifier.f192391e);
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3(bVar, fVar);
        n3Var.setLogging(false);
        return n3Var;
    }
}
