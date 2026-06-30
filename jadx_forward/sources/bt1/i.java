package bt1;

/* loaded from: classes4.dex */
public final class i implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bt1.l f105695d;

    public i(bt1.l lVar) {
        this.f105695d = lVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (msg.what != 1) {
            return false;
        }
        java.lang.Object obj = msg.obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type java.util.LinkedList<com.tencent.mm.protocal.protobuf.BypSyncItem>");
        java.util.LinkedList<r45.tr> linkedList = (java.util.LinkedList) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[WHAT_DISPATCH_SYNC_RESULT] list=");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf(((r45.tr) it.next()).f468252d));
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Byp.BypSyncCore", sb6.toString());
        java.util.HashMap hashMap = new java.util.HashMap();
        for (r45.tr trVar : linkedList) {
            java.util.LinkedList linkedList2 = (java.util.LinkedList) hashMap.get(java.lang.Integer.valueOf(trVar.f468252d));
            if (linkedList2 == null) {
                linkedList2 = new java.util.LinkedList();
                hashMap.put(java.lang.Integer.valueOf(trVar.f468252d), linkedList2);
            }
            linkedList2.add(trVar);
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            ct1.v vVar = (ct1.v) this.f105695d.f105704a.get(entry.getKey());
            if (vVar != null) {
                ((ct1.c) vVar).pi((java.util.LinkedList) entry.getValue(), msg.arg1 == 1);
            }
            fs.g.c(ct1.x.class, entry.getKey(), new bt1.h(entry, msg));
        }
        return true;
    }
}
