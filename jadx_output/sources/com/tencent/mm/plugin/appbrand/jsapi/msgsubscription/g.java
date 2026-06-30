package com.tencent.mm.plugin.appbrand.jsapi.msgsubscription;

/* loaded from: classes9.dex */
public final class g implements m31.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.SubscribeMsgRequestResult f82332a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f82333b;

    public g(com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult, java.util.Map map) {
        this.f82332a = subscribeMsgRequestResult;
        this.f82333b = map;
    }

    @Override // m31.o0
    public void a(java.lang.String templateId, boolean z17, int i17) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(templateId, "templateId");
        java.util.Iterator it = this.f82332a.f71785h.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (android.text.TextUtils.equals(((com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) obj).f71803f, templateId)) {
                    break;
                }
            }
        }
        if (((com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) obj) != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
            java.util.Map map = this.f82333b;
            java.lang.Integer num = (java.lang.Integer) map.get(valueOf2);
            map.put(valueOf, java.lang.Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        }
    }
}
