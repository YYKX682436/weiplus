package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/feature/finder/live/f;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes3.dex */
public final class f implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r callback) {
        int i17;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (c10756x2a5d7b2d == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c10756x2a5d7b2d.f149939d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CheckEcsProductWxaCoverWidgetDisplayableTask", "invoke but no data");
            callback.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d("false"));
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(c10756x2a5d7b2d.f149939d);
            java.lang.String optString = jSONObject.optString("productId");
            java.lang.String optString2 = jSONObject.optString("finder_username");
            java.lang.String optString3 = jSONObject.optString("reqType");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CheckEcsProductWxaCoverWidgetDisplayableTask", "Check start finderUsername:" + optString2 + " productId:" + optString + " reqType:" + optString3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            boolean z17 = true;
            if (!(optString.length() == 0)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                if (optString2.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    c00.z2 z2Var = (c00.z2) i95.n0.c(c00.z2.class);
                    bw5.ne0 ne0Var = new bw5.ne0();
                    try {
                        ne0Var.d(java.lang.Long.parseLong(optString));
                        ne0Var.c(optString2);
                        try {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
                            i17 = java.lang.Integer.parseInt(optString3);
                        } catch (java.lang.Exception unused) {
                            i17 = 0;
                        }
                        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.e(z2Var, ne0Var, i17, optString, callback, null), 3, null);
                        return;
                    } catch (java.lang.Exception unused2) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CheckEcsProductWxaCoverWidgetDisplayableTask", "invalid productId");
                        callback.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d("false"));
                        return;
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CheckEcsProductWxaCoverWidgetDisplayableTask", "missing required parameters");
            callback.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d("false"));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("CheckEcsProductWxaCoverWidgetDisplayableTask", th6, "Check exception", new java.lang.Object[0]);
            callback.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d("false"));
        }
    }
}
