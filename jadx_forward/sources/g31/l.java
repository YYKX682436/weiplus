package g31;

/* loaded from: classes9.dex */
public abstract class l implements e31.k {

    /* renamed from: h, reason: collision with root package name */
    public static final g31.a f349618h = new g31.a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.HashMap f349619i = new java.util.HashMap();

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.Map f349620j = new java.util.LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final k31.a f349621a;

    /* renamed from: b, reason: collision with root package name */
    public final k31.b f349622b;

    /* renamed from: c, reason: collision with root package name */
    public final g31.p f349623c;

    /* renamed from: d, reason: collision with root package name */
    public final g31.y f349624d;

    /* renamed from: e, reason: collision with root package name */
    public final g31.c0 f349625e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f349626f = new java.util.LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final boolean f349627g;

    public l(k31.a aVar) {
        g31.d dVar = new g31.d(this);
        this.f349621a = aVar;
        this.f349622b = new k31.b(aVar);
        this.f349623c = new g31.p(this);
        g31.y yVar = new g31.y(aVar);
        this.f349624d = yVar;
        java.lang.String key = java.lang.String.valueOf(hashCode());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.Map map = yVar.f349665d;
        map.put(key, dVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubscribeSwitchInfoBatchFetcher", "registerCallback: key=%s, totalSize=%d", key, java.lang.Integer.valueOf(map.size()));
        this.f349625e = new g31.c0(aVar);
        this.f349627g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.mmbiz_service_biz_auto_notify_enable, false);
    }

    public static final void j(g31.l lVar, java.lang.String str, e31.j jVar) {
        lVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSubscribeMsgService", "onUpdatedWrapper templateId: %s, isSubscribed: %b, switchOpen: %b, isShowVoipSetting: %b", str, java.lang.Boolean.valueOf(jVar.f328608a), java.lang.Boolean.valueOf(jVar.f328609b), java.lang.Boolean.valueOf(jVar.f328618k));
        lVar.k(str, new g31.g(str, jVar));
        lVar.r(new g31.h(str, jVar));
    }

    @Override // e31.k
    public void a(java.lang.String bizUsername, java.util.List subscribeMsgList, boolean z17, boolean z18, boolean z19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subscribeMsgList, "subscribeMsgList");
        this.f349622b.a(bizUsername, subscribeMsgList, z17, z18, z19);
    }

    @Override // e31.k
    public void c(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle extra) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra, "extra");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSubscribeMsgService", "clickSubscribeMsgSpan bizUsername: %s, url: %s", str, str2);
        if (str == null || str2 == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11168xbe8821ca.class);
        intent.putExtra("key_biz_username", str);
        intent.putExtra("key_scene", 1);
        intent.putExtra("key_subscribe_url", str2);
        intent.putExtra("key_action", 3);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 4);
        intent.putExtra("key_extra_info", jSONObject.toString());
        intent.putExtras(extra);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/msgsubscription/model/SubscribeMsgService", "clickSubscribeMsgSpan", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/msgsubscription/model/SubscribeMsgService", "clickSubscribeMsgSpan", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // e31.k
    public void d(java.lang.String bizUsername, java.lang.String templateId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        q(bizUsername, templateId, 0);
    }

    @Override // e31.k
    public void f(java.lang.String bizUsername, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSubscribeMsgService", "updateLocalSwitchOpened bizUsername: %s, switchOpened: %b", bizUsername, java.lang.Boolean.valueOf(z17));
        k31.b bVar = this.f349622b;
        bVar.getClass();
        bVar.a(bizUsername, new java.util.ArrayList(), z17, true, false);
    }

    @Override // e31.k
    public void g(android.content.Context context, int i17, int i18, java.lang.String bizAppId, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizAppId, "bizAppId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSubscribeMsgService", "requestSubscribeMsgForResult scene: %d, bizAppId: %s, requestCode: %s", java.lang.Integer.valueOf(i17), bizAppId, java.lang.Integer.valueOf(i18));
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11168xbe8821ca.class);
        intent.putExtra("key_need_result", true);
        intent.putExtra("key_biz_app_id", bizAppId);
        intent.putExtra("key_scene", i17);
        intent.putExtra("key_action", 3);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        if (!(context instanceof android.app.Activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseSubscribeMsgService", "requestSubscribeMsgForResult context is not activity");
            return;
        }
        android.app.Activity activity = (android.app.Activity) context;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/msgsubscription/model/SubscribeMsgService", "requestSubscribeMsgForResult", "(Landroid/content/Context;IILjava/lang/String;Landroid/os/Bundle;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    @Override // e31.k
    public void h(java.lang.String bizUsername, com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 tmpItem, e31.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tmpItem, "tmpItem");
        g31.j jVar = new g31.j(this, tmpItem, iVar);
        g31.p pVar = this.f349623c;
        pVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubscribeStatusUpdateManager", "switchSubscribeStatus templateId: %s, settingStatus: %d, switchOpened: %b", tmpItem.f153336f, java.lang.Integer.valueOf(tmpItem.f153340m), java.lang.Boolean.valueOf(tmpItem.f153341n));
        java.util.ArrayList d17 = kz5.c0.d(tmpItem);
        e31.k kVar = pVar.f349640b;
        if (kVar != null) {
            e31.k.i(kVar, bizUsername, d17, false, false, false, 4, null);
        }
        e31.o oVar = new e31.o();
        oVar.f328622a = bizUsername;
        ((java.util.ArrayList) oVar.f328624c).addAll(d17);
        oVar.f328625d = tmpItem.f153341n;
        oVar.f328630i = new g31.o(tmpItem, pVar, jVar, bizUsername);
        if (kVar != null) {
            ((g31.l) kVar).x(oVar);
        }
    }

    public final void k(java.lang.String str, yz5.l lVar) {
        java.util.HashMap hashMap = (java.util.HashMap) f349619i.get(str);
        java.util.Set keySet = hashMap != null ? hashMap.keySet() : null;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str;
        objArr[1] = keySet != null ? java.lang.Integer.valueOf(keySet.size()) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSubscribeMsgService", "callbackWrapper templateId: %s, callback size: %s", objArr);
        if (keySet != null) {
            java.util.Iterator it = keySet.iterator();
            while (it.hasNext()) {
                lVar.mo146xb9724478(hashMap.get((java.lang.String) it.next()));
            }
        }
    }

    public int l(java.lang.String bizUsername) {
        java.lang.Integer num;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        if (this.f349621a == null || (num = (java.lang.Integer) k31.h.f385375d.get(bizUsername)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public void m(java.lang.String username, e31.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        k31.b bVar = this.f349622b;
        bVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubscribeMsgDataLoader", "getLocalSubscribeList username: %s", username);
        k31.a aVar = bVar.f385355a;
        if (aVar == null) {
            return;
        }
        k31.o.f385383a.b(aVar, new l31.j(username, aVar, lVar));
    }

    public boolean n(java.lang.String bizUsername) {
        java.lang.Boolean bool;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        k31.b bVar = this.f349622b;
        bVar.getClass();
        if (bVar.f385355a == null || (bool = (java.lang.Boolean) k31.h.f385374c.get(bizUsername)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 o(java.lang.String bizUsername, java.lang.String templateId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        k31.b bVar = this.f349622b;
        bVar.getClass();
        if (bVar.f385355a != null) {
            return (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) k31.h.f385373b.get(bizUsername.concat(templateId));
        }
        return null;
    }

    public void p(java.lang.String username, e31.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        k31.b bVar = this.f349622b;
        bVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubscribeMsgDataLoader", "getSubscribeMsgListByUsername %s", username);
        k31.a aVar = bVar.f385355a;
        if (aVar == null) {
            return;
        }
        k31.o.f385383a.b(aVar, new l31.e(username, aVar, lVar));
    }

    public void q(java.lang.String bizUsername, java.lang.String templateId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        g31.c cVar = new g31.c(this, templateId);
        g31.p pVar = this.f349623c;
        pVar.getClass();
        e31.k kVar = pVar.f349640b;
        com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 o17 = kVar != null ? ((g31.l) kVar).o(bizUsername, templateId) : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = o17;
        boolean n17 = kVar != null ? ((g31.l) kVar).n(bizUsername) : false;
        if (o17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubscribeStatusUpdateManager", "isTemplateMsgSubscribed read from local");
            if (kVar != null) {
                ((g31.l) kVar).m(bizUsername, new g31.n(pVar, h0Var, templateId, i17, cVar));
                return;
            }
            return;
        }
        e31.j jVar = new e31.j(o17.f153340m == 1, n17);
        jVar.f328610c = o17.f153347t;
        jVar.f328611d = o17.f153348u;
        jVar.f328612e = o17.f153350w;
        jVar.f328613f = o17.f153351x;
        jVar.f328614g = o17.B;
        jVar.f328615h = o17.C;
        jVar.f328616i = i17;
        jVar.f328618k = o17.A;
        cVar.b(templateId, jVar);
        com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) h0Var.f391656d;
        g31.b bVar = new g31.b(bizUsername, templateId, c11159x8f55e6d3 != null ? c11159x8f55e6d3.f153340m : -1, i17);
        bVar.f349598e = cVar;
        pVar.a(c11159x8f55e6d3, bVar);
    }

    public final void r(yz5.l lVar) {
        java.util.Iterator it = ((java.util.LinkedHashMap) this.f349626f).entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            e31.i iVar = (e31.i) ((java.lang.ref.WeakReference) entry.getValue()).get();
            if (iVar == null) {
                it.remove();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSubscribeMsgService", "notifySubscribeStatusCallback: callback for key %s has been garbage collected", entry.getKey());
            } else {
                lVar.mo146xb9724478(iVar);
            }
        }
    }

    public final void s(java.lang.String str, boolean z17, int i17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
        java.util.Map map = f349620j;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSubscribeMsgService", "onNotifySwitchInfoCallback: username=%s, isOpened=%b, importantNotifyNum=%d, callbacks.size=%d", str, valueOf, valueOf2, java.lang.Integer.valueOf(map.size()));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) map).entrySet()) {
            java.lang.String str2 = (java.lang.String) entry.getKey();
            if (((java.lang.ref.WeakReference) entry.getValue()).get() == null) {
                arrayList.add(str2);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.remove((java.lang.String) it.next());
        }
        if (!arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseSubscribeMsgService", "onNotifySwitchInfoCallback: removed %d dead callbacks: %s", java.lang.Integer.valueOf(arrayList.size()), arrayList);
        }
        for (java.util.Map.Entry entry2 : ((java.util.LinkedHashMap) map).entrySet()) {
            e31.h hVar = (e31.h) ((java.lang.ref.WeakReference) entry2.getValue()).get();
            if (hVar != null) {
                hVar.a(str, z17, i17);
            }
        }
    }

    public void t(java.lang.String key, e31.h callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.Map map = f349620j;
        map.put(key, new java.lang.ref.WeakReference(callback));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSubscribeMsgService", "registerNotifySwitchInfoCallback: key=%s, totalSize=%d", key, java.lang.Integer.valueOf(map.size()));
    }

    public void u(java.lang.String key, e31.i callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.Map map = this.f349626f;
        map.put(key, new java.lang.ref.WeakReference(callback));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSubscribeMsgService", "[registerSubscribeStatusCallback] key=%s, totalSize=%d", key, java.lang.Integer.valueOf(map.size()));
    }

    public void v(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.Map map = f349620j;
        map.remove(key);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSubscribeMsgService", "unregisterNotifySwitchInfoCallback: key=%s, totalSize=%d", key, java.lang.Integer.valueOf(map.size()));
    }

    public void w(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.Map map = this.f349626f;
        map.remove(key);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSubscribeMsgService", "[unregisterGlobalCallback] key=%s, totalSize=%d", key, java.lang.Integer.valueOf(map.size()));
    }

    public long x(e31.o updateRequest) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(updateRequest, "updateRequest");
        g31.k kVar = new g31.k(this);
        k31.b bVar = this.f349622b;
        bVar.getClass();
        k31.a aVar = bVar.f385355a;
        if (aVar == null) {
            return -1L;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubscribeMsgDataLoader", "updateSubscribeList username: " + updateRequest.f328622a + ", appId: " + updateRequest.f328623b + ", size: " + ((java.util.ArrayList) updateRequest.f328624c).size());
        l31.f0 f0Var = new l31.f0(updateRequest, aVar, kVar);
        f0Var.f396847b = updateRequest.f328631j;
        f0Var.f396848c = updateRequest.f328632k;
        k31.o.f385383a.b(aVar, f0Var);
        return f0Var.hashCode();
    }
}
