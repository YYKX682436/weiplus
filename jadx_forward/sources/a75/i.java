package a75;

/* loaded from: classes11.dex */
public final class i implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2600x5c6729a.p2601xd7508997.C20987xdf89b6bd f83478d;

    public i(com.p314xaae8f345.mm.sdk.p2600x5c6729a.p2601xd7508997.C20987xdf89b6bd c20987xdf89b6bd) {
        this.f83478d = c20987xdf89b6bd;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message msg) {
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (msg.what == 0) {
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.p2601xd7508997.C20987xdf89b6bd c20987xdf89b6bd = this.f83478d;
            synchronized (c20987xdf89b6bd.f273931g) {
                java.util.HashMap hashMap = c20987xdf89b6bd.f273932h;
                arrayList = new java.util.ArrayList(hashMap.size());
                java.util.Iterator it = hashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((a75.a) ((java.util.Map.Entry) it.next()).getValue());
                }
                c20987xdf89b6bd.f273932h.clear();
            }
            if (!(!arrayList.isEmpty())) {
                arrayList = null;
            }
            if (arrayList != null) {
                c20987xdf89b6bd.f273929e.mo788x5797ad52(arrayList);
            }
            this.f83478d.f273933i.set(false);
        }
        return true;
    }
}
