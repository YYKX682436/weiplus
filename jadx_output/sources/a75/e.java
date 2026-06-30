package a75;

/* loaded from: classes11.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.event.pending.PendingEventNotifier f1941d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.sdk.event.pending.PendingEventNotifier pendingEventNotifier) {
        super(0);
        this.f1941d = pendingEventNotifier;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.event.pending.PendingEventNotifier pendingEventNotifier = this.f1941d;
        a75.d dVar = new a75.d(pendingEventNotifier);
        if (kotlin.jvm.internal.o.b(pendingEventNotifier.f192384e, e75.g.MainThread)) {
            return new com.tencent.mm.sdk.platformtools.n3(xu5.b.b(), dVar);
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = xu5.b.f457300e;
        java.lang.String str = pendingEventNotifier.f192384e;
        xu5.b bVar = (xu5.b) concurrentHashMap.get(str);
        if (bVar == null) {
            bVar = xu5.b.a(str);
        }
        return new com.tencent.mm.sdk.platformtools.n3(bVar, dVar);
    }
}
