package a75;

/* loaded from: classes11.dex */
public final class i implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.event.pending.UIPendingEventNotifier f1945d;

    public i(com.tencent.mm.sdk.event.pending.UIPendingEventNotifier uIPendingEventNotifier) {
        this.f1945d = uIPendingEventNotifier;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message msg) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(msg, "msg");
        if (msg.what == 0) {
            com.tencent.mm.sdk.event.pending.UIPendingEventNotifier uIPendingEventNotifier = this.f1945d;
            synchronized (uIPendingEventNotifier.f192398g) {
                java.util.HashMap hashMap = uIPendingEventNotifier.f192399h;
                arrayList = new java.util.ArrayList(hashMap.size());
                java.util.Iterator it = hashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((a75.a) ((java.util.Map.Entry) it.next()).getValue());
                }
                uIPendingEventNotifier.f192399h.clear();
            }
            if (!(!arrayList.isEmpty())) {
                arrayList = null;
            }
            if (arrayList != null) {
                uIPendingEventNotifier.f192396e.handleEvent(arrayList);
            }
            this.f1945d.f192400i.set(false);
        }
        return true;
    }
}
