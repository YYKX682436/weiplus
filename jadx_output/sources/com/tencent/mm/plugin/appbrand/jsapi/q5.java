package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes4.dex */
public final class q5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f82856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f82857b;

    public q5(java.util.List list, com.tencent.mm.ipcinvoker.r rVar) {
        this.f82856a = list;
        this.f82857b = rVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        int i17;
        java.util.LinkedList session_info_list = ((v53.g) ((com.tencent.mm.modelbase.f) obj).f70618d).f433337d;
        kotlin.jvm.internal.o.f(session_info_list, "session_info_list");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = session_info_list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if ((((v53.o) next).f433357m == 1 ? 1 : 0) != 0) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((v53.o) it6.next()).f433351d);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : this.f82856a) {
            java.lang.Object obj3 = ((java.util.Map) obj2).get(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
            if (arrayList2.contains((java.lang.String) obj3)) {
                arrayList3.add(obj2);
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
        java.util.Iterator it7 = arrayList3.iterator();
        while (it7.hasNext()) {
            java.lang.Object obj4 = ((java.util.Map) it7.next()).get("unreadCount");
            kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Int");
            arrayList4.add(java.lang.Integer.valueOf(((java.lang.Integer) obj4).intValue()));
        }
        if (!arrayList4.isEmpty()) {
            java.util.Iterator it8 = arrayList4.iterator();
            if (!it8.hasNext()) {
                throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
            }
            java.lang.Object next2 = it8.next();
            while (it8.hasNext()) {
                next2 = java.lang.Integer.valueOf(((java.lang.Number) next2).intValue() + ((java.lang.Number) it8.next()).intValue());
            }
            i17 = ((java.lang.Number) next2).intValue();
        }
        java.lang.String.valueOf(i17);
        com.tencent.mm.plugin.appbrand.jsapi.JsApiGamelifeManager$GetGameLifeRedCountData jsApiGamelifeManager$GetGameLifeRedCountData = new com.tencent.mm.plugin.appbrand.jsapi.JsApiGamelifeManager$GetGameLifeRedCountData(i17, "get redcount", true);
        com.tencent.mm.ipcinvoker.r rVar = this.f82857b;
        if (rVar == null) {
            return null;
        }
        rVar.a(jsApiGamelifeManager$GetGameLifeRedCountData);
        return jz5.f0.f302826a;
    }
}
