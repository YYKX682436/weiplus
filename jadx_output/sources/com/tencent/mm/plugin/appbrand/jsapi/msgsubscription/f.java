package com.tencent.mm.plugin.appbrand.jsapi.msgsubscription;

/* loaded from: classes9.dex */
public final class f implements m31.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f82325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.q f82326b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor f82327c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f82328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f82329e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.SubscribeMsgRequestResult f82330f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f82331g;

    public f(boolean z17, yz5.q qVar, com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor getSubscribeMsgListExecutor, java.util.Map map, java.util.List list, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult, android.content.Context context) {
        this.f82325a = z17;
        this.f82326b = qVar;
        this.f82327c = getSubscribeMsgListExecutor;
        this.f82328d = map;
        this.f82329e = list;
        this.f82330f = subscribeMsgRequestResult;
        this.f82331g = context;
    }

    @Override // m31.c1
    public void a(int i17, java.util.List resultData) {
        kotlin.jvm.internal.o.g(resultData, "resultData");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(resultData);
        com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor getSubscribeMsgListExecutor = this.f82327c;
        int i18 = 3;
        if (i17 == 1 || i17 == 2 || i17 == 3) {
            boolean z17 = this.f82325a;
            yz5.q qVar = this.f82326b;
            if (z17) {
                qVar.invoke(java.lang.Integer.valueOf(i17 == 2 ? 3 : i17), arrayList, java.lang.Boolean.valueOf(getSubscribeMsgListExecutor.c().A.isChecked()));
            } else {
                qVar.invoke(java.lang.Integer.valueOf(i17), arrayList, java.lang.Boolean.valueOf(getSubscribeMsgListExecutor.c().A.isChecked()));
            }
        }
        java.util.Map map = this.f82328d;
        java.util.List S0 = kz5.n0.S0(map.keySet());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = S0.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) map.get(java.lang.Integer.valueOf(((java.lang.Number) it.next()).intValue()));
            if (num != null) {
                arrayList2.add(java.lang.Integer.valueOf(num.intValue()));
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.addAll(this.f82330f.f71785h);
        getSubscribeMsgListExecutor.getClass();
        com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.k kVar = new com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.k(this.f82329e);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) it6.next();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("templateType", java.lang.String.valueOf(subscribeMsgTmpItem.f71804g));
            linkedHashMap.put("selected", java.lang.String.valueOf(((java.lang.Boolean) kVar.invoke(subscribeMsgTmpItem)).booleanValue()));
            linkedHashMap.put("templateID", subscribeMsgTmpItem.f71803f);
            arrayList4.add(linkedHashMap);
        }
        boolean isChecked = getSubscribeMsgListExecutor.c().A.isChecked();
        if (i17 == 1) {
            i18 = 1;
        } else if (i17 == 2) {
            i18 = 2;
        } else if (i17 != 3) {
            i18 = 0;
        }
        java.lang.String g07 = kz5.n0.g0(S0, "#", null, null, 0, null, null, 62, null);
        java.lang.String g08 = kz5.n0.g0(arrayList2, "#", null, null, 0, null, null, 62, null);
        com.tencent.mm.plugin.appbrand.profile.c cVar = (com.tencent.mm.plugin.appbrand.profile.c) nd.f.d(com.tencent.mm.plugin.appbrand.profile.c.class, true);
        if (cVar != null) {
            ((ch1.d) cVar).c(17524, -1, android.net.Uri.encode(new org.json.JSONArray((java.util.Collection) arrayList4).toString()), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(isChecked ? 1 : 0), -1, -1, getSubscribeMsgListExecutor.f82295d, "", g07, g08, 1, "", getSubscribeMsgListExecutor.f82297f, java.lang.Integer.valueOf(getSubscribeMsgListExecutor.f82298g + 1000));
        }
    }

    @Override // m31.c1
    public void b(m31.b1 b1Var, boolean z17, m31.q0 item, boolean z18) {
        ze.n t37;
        fl1.g2 authorizeDialogContainer;
        ze.n t38;
        fl1.g2 authorizeDialogContainer2;
        kotlin.jvm.internal.o.g(b1Var, "switch");
        kotlin.jvm.internal.o.g(item, "item");
        if (b1Var == m31.b1.f323122d && z17 && z18) {
            com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor getSubscribeMsgListExecutor = this.f82327c;
            m31.p1 c17 = getSubscribeMsgListExecutor.c();
            getSubscribeMsgListExecutor.getClass();
            android.content.Context context = this.f82331g;
            if (context == null) {
                return;
            }
            m31.c0 c0Var = new m31.c0(context);
            if (com.tencent.mm.sdk.platformtools.o4.L().getBoolean("appbrand_subscribe_msg_force_notify_template_show_guide", false)) {
                return;
            }
            com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.e eVar = getSubscribeMsgListExecutor.f82300i;
            if (eVar != null) {
                com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.l lVar = new com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.l(getSubscribeMsgListExecutor, c0Var);
                com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.JsApiRequestSubscribeMessage$SubscribeMsgTask jsApiRequestSubscribeMessage$SubscribeMsgTask = ((com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.q) eVar).f82352a;
                com.tencent.luggage.sdk.jsapi.component.service.y yVar = jsApiRequestSubscribeMessage$SubscribeMsgTask.f82306h;
                if (yVar != null && (t38 = yVar.t3()) != null && (authorizeDialogContainer2 = t38.getAuthorizeDialogContainer()) != null) {
                    ((fl1.c0) authorizeDialogContainer2).d(new com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.p(jsApiRequestSubscribeMessage$SubscribeMsgTask, lVar));
                }
                com.tencent.luggage.sdk.jsapi.component.service.y yVar2 = jsApiRequestSubscribeMessage$SubscribeMsgTask.f82306h;
                if (yVar2 != null && (t37 = yVar2.t3()) != null && (authorizeDialogContainer = t37.getAuthorizeDialogContainer()) != null) {
                    ((fl1.c0) authorizeDialogContainer).a(c17);
                }
            }
            c0Var.f323128g = new com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.m(getSubscribeMsgListExecutor, c17);
            com.tencent.mm.sdk.platformtools.o4.L().putBoolean("appbrand_subscribe_msg_force_notify_template_show_guide", true);
        }
    }
}
