package com.tencent.mm.plugin.appbrand.jsapi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/r5;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiGamelifeManager$GetGameLifeRedCountData;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes8.dex */
final class r5 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        ((m60.i) ((n60.i) i95.n0.c(n60.i.class))).getClass();
        android.database.Cursor all = ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Di().getAll();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        all.moveToFirst();
        while (!all.isAfterLast()) {
            dm.n5 n5Var = new dm.n5();
            n5Var.convertFrom(all);
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.String field_sessionId = n5Var.field_sessionId;
            kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
            hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, field_sessionId);
            hashMap.put("unreadCount", java.lang.Integer.valueOf(n5Var.field_unReadCount));
            arrayList.add(hashMap);
            all.moveToNext();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object obj2 = ((java.util.Map) it.next()).get(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            arrayList2.add((java.lang.String) obj2);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList(arrayList2);
        ((m60.k) ((n60.k) i95.n0.c(n60.k.class))).getClass();
        new w53.b(linkedList).l().H(new com.tencent.mm.plugin.appbrand.jsapi.q5(arrayList, rVar));
    }
}
