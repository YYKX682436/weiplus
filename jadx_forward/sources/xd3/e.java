package xd3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lxd3/e;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/plugin/magicbrush/texture/IPCMBExternalInputData;", "Lcom/tencent/mm/plugin/magicbrush/texture/IPCMBExternalCallbackData;", "<init>", "()V", "mb-jsapi_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class e implements com.p314xaae8f345.mm.p794xb0fa9b5e.i<com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16467x9eb59478, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16466x1a72912b> {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16467x9eb59478 data = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16467x9eb59478) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.util.List list = xd3.b.f535148a;
        ve3.u action = data.f229695d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        java.util.Iterator it = ((java.util.ArrayList) xd3.b.f535148a).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (((xd3.a) obj2).a(action)) {
                    break;
                }
            }
        }
        xd3.a aVar = (xd3.a) obj2;
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MB_External_surface_action", "no handler found data: " + data);
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16466x1a72912b(-1, "action invalid", null, 4, null));
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_action", "find handler: " + aVar.getClass().getSimpleName() + " data: " + data);
        xd3.d dVar = (xd3.d) aVar;
        try {
            dVar.f(action, data, rVar);
            dVar.c(action, data, rVar);
        } catch (java.lang.Exception e17) {
            dVar.e(rVar, -1, "Handler failed: " + e17.getMessage());
        }
    }
}
