package a75;

/* loaded from: classes11.dex */
public final class f implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.event.pending.StoragePendingEventNotifier f1942d;

    public f(com.tencent.mm.sdk.event.pending.StoragePendingEventNotifier storagePendingEventNotifier) {
        this.f1942d = storagePendingEventNotifier;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        int i17 = msg.what;
        com.tencent.mm.sdk.event.pending.StoragePendingEventNotifier storagePendingEventNotifier = this.f1942d;
        if (i17 == 0) {
            o75.c cVar = storagePendingEventNotifier.f192393g;
            java.util.HashMap hashMap = cVar.f343591e;
            if (hashMap != null) {
                if (!(!hashMap.isEmpty())) {
                    hashMap = null;
                }
                if (hashMap != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(hashMap.size());
                    java.util.Iterator it = hashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        arrayList.add((o75.c) ((java.util.Map.Entry) it.next()).getValue());
                    }
                    cVar.f343591e = new java.util.HashMap();
                    if (!arrayList.isEmpty()) {
                        storagePendingEventNotifier.f192392f.handleEvent(arrayList);
                    }
                }
            }
        } else if (i17 == 1) {
            boolean z17 = msg.arg1 == 1;
            java.lang.Object obj = msg.obj;
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.sdk.storage.observer.StorageObserverEvent<T of com.tencent.mm.sdk.event.pending.StoragePendingEventNotifier>");
            o75.c cVar2 = storagePendingEventNotifier.f192393g;
            cVar2.f343591e = ((o75.c) cVar2.mergeEvent((o75.c) obj)).f343591e;
            if (!z17) {
                storagePendingEventNotifier.a().sendEmptyMessage(0);
            } else if (!storagePendingEventNotifier.a().hasMessages(0)) {
                storagePendingEventNotifier.a().sendEmptyMessageDelayed(0, storagePendingEventNotifier.f192390d);
            }
        }
        return true;
    }
}
