package a75;

/* loaded from: classes11.dex */
public final class f implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2600x5c6729a.p2601xd7508997.C20986xc7dbdd04 f83475d;

    public f(com.p314xaae8f345.mm.sdk.p2600x5c6729a.p2601xd7508997.C20986xc7dbdd04 c20986xc7dbdd04) {
        this.f83475d = c20986xc7dbdd04;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        int i17 = msg.what;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.p2601xd7508997.C20986xc7dbdd04 c20986xc7dbdd04 = this.f83475d;
        if (i17 == 0) {
            o75.c cVar = c20986xc7dbdd04.f273926g;
            java.util.HashMap hashMap = cVar.f425124e;
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
                    cVar.f425124e = new java.util.HashMap();
                    if (!arrayList.isEmpty()) {
                        c20986xc7dbdd04.f273925f.mo788x5797ad52(arrayList);
                    }
                }
            }
        } else if (i17 == 1) {
            boolean z17 = msg.arg1 == 1;
            java.lang.Object obj = msg.obj;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.sdk.storage.observer.StorageObserverEvent<T of com.tencent.mm.sdk.event.pending.StoragePendingEventNotifier>");
            o75.c cVar2 = c20986xc7dbdd04.f273926g;
            cVar2.f425124e = ((o75.c) cVar2.mo787xbd89c142((o75.c) obj)).f425124e;
            if (!z17) {
                c20986xc7dbdd04.a().mo50305x3d8a09a2(0);
            } else if (!c20986xc7dbdd04.a().mo50285x8fc9be06(0)) {
                c20986xc7dbdd04.a().mo50307xb9e94560(0, c20986xc7dbdd04.f273923d);
            }
        }
        return true;
    }
}
