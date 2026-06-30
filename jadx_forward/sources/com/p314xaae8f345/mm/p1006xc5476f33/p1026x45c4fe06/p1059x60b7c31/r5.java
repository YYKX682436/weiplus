package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/r5;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiGamelifeManager$GetGameLifeRedCountData;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes8.dex */
final class r5 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        ((m60.i) ((n60.i) i95.n0.c(n60.i.class))).getClass();
        android.database.Cursor m149149xb5882a6b = ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Di().m149149xb5882a6b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        m149149xb5882a6b.moveToFirst();
        while (!m149149xb5882a6b.isAfterLast()) {
            dm.n5 n5Var = new dm.n5();
            n5Var.mo9015xbf5d97fd(m149149xb5882a6b);
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.String field_sessionId = n5Var.f67669xbed8694c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
            hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, field_sessionId);
            hashMap.put("unreadCount", java.lang.Integer.valueOf(n5Var.f67671xa35b5abb));
            arrayList.add(hashMap);
            m149149xb5882a6b.moveToNext();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object obj2 = ((java.util.Map) it.next()).get(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            arrayList2.add((java.lang.String) obj2);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList(arrayList2);
        ((m60.k) ((n60.k) i95.n0.c(n60.k.class))).getClass();
        new w53.b(linkedList).l().H(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.q5(arrayList, rVar));
    }
}
