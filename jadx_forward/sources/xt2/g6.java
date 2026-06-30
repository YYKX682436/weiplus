package xt2;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lxt2/g6;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes.dex */
public final class g6 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r callback) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (c10756x2a5d7b2d == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c10756x2a5d7b2d.f149939d)) {
            callback.a(null);
            return;
        }
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProductAutoScrollWidget", "fetch data with params:" + c10756x2a5d7b2d.f149939d);
            org.json.JSONObject jSONObject = new org.json.JSONObject(c10756x2a5d7b2d.f149939d);
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new xt2.f6(jSONObject.optLong("productId"), jSONObject.optLong("liveId"), jSONObject.optLong("objectId"), jSONObject.optString("anchorUsername"), jSONObject.optInt("reqScene"), jSONObject.optBoolean("isFirstReq"), callback, null), 3, null);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderProductAutoScrollWidget", th6, "FetchDataTask parse data failed", new java.lang.Object[0]);
            callback.a(null);
        }
    }
}
