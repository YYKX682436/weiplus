package com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/sport/model/o;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-sport_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class o implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r callback) {
        android.os.Bundle data = (android.os.Bundle) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.PushSportTask", "PushUpdateConfigTask execute");
        java.lang.String string = data.getString("config");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.f253347c = new org.json.JSONObject(string);
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.f253347c = null;
            }
        }
        if (i95.n0.c(ue4.r.class) != null) {
            ((ue4.r) i95.n0.c(ue4.r.class)).Bi().a();
        }
        callback.a(new android.os.Bundle());
    }
}
