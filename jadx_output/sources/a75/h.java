package a75;

/* loaded from: classes11.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.event.pending.UIPendingEventNotifier f1944d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.sdk.event.pending.UIPendingEventNotifier uIPendingEventNotifier) {
        super(0);
        this.f1944d = uIPendingEventNotifier;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.event.pending.UIPendingEventNotifier uIPendingEventNotifier = this.f1944d;
        uIPendingEventNotifier.f192397f.mo133getLifecycle().a(uIPendingEventNotifier);
        return jz5.f0.f302826a;
    }
}
