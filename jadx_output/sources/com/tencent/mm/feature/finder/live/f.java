package com.tencent.mm.feature.finder.live;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/feature/finder/live/f;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes3.dex */
public final class f implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r callback) {
        int i17;
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        kotlin.jvm.internal.o.g(callback, "callback");
        if (iPCString == null || com.tencent.mm.sdk.platformtools.t8.K0(iPCString.f68406d)) {
            com.tencent.mars.xlog.Log.e("CheckEcsProductWxaCoverWidgetDisplayableTask", "invoke but no data");
            callback.a(new com.tencent.mm.ipcinvoker.type.IPCString("false"));
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(iPCString.f68406d);
            java.lang.String optString = jSONObject.optString("productId");
            java.lang.String optString2 = jSONObject.optString("finder_username");
            java.lang.String optString3 = jSONObject.optString("reqType");
            com.tencent.mars.xlog.Log.i("CheckEcsProductWxaCoverWidgetDisplayableTask", "Check start finderUsername:" + optString2 + " productId:" + optString + " reqType:" + optString3);
            kotlin.jvm.internal.o.d(optString);
            boolean z17 = true;
            if (!(optString.length() == 0)) {
                kotlin.jvm.internal.o.d(optString2);
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
                            kotlin.jvm.internal.o.d(optString3);
                            i17 = java.lang.Integer.parseInt(optString3);
                        } catch (java.lang.Exception unused) {
                            i17 = 0;
                        }
                        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.feature.finder.live.e(z2Var, ne0Var, i17, optString, callback, null), 3, null);
                        return;
                    } catch (java.lang.Exception unused2) {
                        com.tencent.mars.xlog.Log.e("CheckEcsProductWxaCoverWidgetDisplayableTask", "invalid productId");
                        callback.a(new com.tencent.mm.ipcinvoker.type.IPCString("false"));
                        return;
                    }
                }
            }
            com.tencent.mars.xlog.Log.e("CheckEcsProductWxaCoverWidgetDisplayableTask", "missing required parameters");
            callback.a(new com.tencent.mm.ipcinvoker.type.IPCString("false"));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("CheckEcsProductWxaCoverWidgetDisplayableTask", th6, "Check exception", new java.lang.Object[0]);
            callback.a(new com.tencent.mm.ipcinvoker.type.IPCString("false"));
        }
    }
}
