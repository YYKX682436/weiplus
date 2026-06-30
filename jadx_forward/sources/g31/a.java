package g31;

/* loaded from: classes9.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(java.lang.String templateId, java.lang.String viewKey, e31.i callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewKey, "viewKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.HashMap hashMap = g31.l.f349619i;
        java.util.HashMap hashMap2 = (java.util.HashMap) hashMap.get(templateId);
        if (hashMap2 == null) {
            hashMap2 = new java.util.HashMap();
        }
        hashMap2.put(viewKey, callback);
        hashMap.put(templateId, hashMap2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSubscribeMsgService", "registerNotifyCallback templateId: %s, size: %d", templateId, java.lang.Integer.valueOf(hashMap2.size()));
    }

    public final void b(java.lang.String templateId, java.lang.String viewKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewKey, "viewKey");
        java.util.HashMap hashMap = (java.util.HashMap) g31.l.f349619i.get(templateId);
        if (hashMap != null) {
            hashMap.remove(viewKey);
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = templateId;
        objArr[1] = hashMap != null ? java.lang.Integer.valueOf(hashMap.size()) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSubscribeMsgService", "unregisterNotifyCallback templateId: %s, size: %s", objArr);
    }
}
