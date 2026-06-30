package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/o4;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class o4 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r callback) {
        org.json.JSONObject jSONObject;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (bundle == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCCheckStrangerRequest", "data is null");
            bundle2.putString("resJo", "fail:IPCCheckStrangerRequest data is null");
            callback.a(bundle2);
        } else {
            if (!gm0.j1.b().n()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCCheckStrangerRequest", "handleRequest, MMKernel.account().hasLogin() is false");
                return;
            }
            try {
                jSONObject = new org.json.JSONObject(bundle.getString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37645x68f5f8be));
            } catch (java.lang.Throwable unused) {
                jSONObject = null;
            }
            pm0.v.L("MicroMsg.IPCCheckStrangerRequest", true, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n4(jSONObject, bundle2, callback));
        }
    }
}
