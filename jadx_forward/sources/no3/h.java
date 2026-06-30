package no3;

/* loaded from: classes11.dex */
public class h extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ no3.i f420293a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(no3.i iVar, android.os.Looper looper) {
        super(looper);
        this.f420293a = iVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        cp.e.c("NotificationObserver", new no3.g(this, message.getData().getString("com.tencent.mm.notification.observer")), 500L);
    }
}
