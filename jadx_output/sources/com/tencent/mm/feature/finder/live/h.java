package com.tencent.mm.feature.finder.live;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/feature/finder/live/h;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes3.dex */
public final class h implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r callback) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        kotlin.jvm.internal.o.g(callback, "callback");
        if (iPCString == null || com.tencent.mm.sdk.platformtools.t8.K0(iPCString.f68406d)) {
            com.tencent.mars.xlog.Log.e("CheckWidgetDisplayableTask", "invoke but no data");
            callback.a(new com.tencent.mm.ipcinvoker.type.IPCString("false"));
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(iPCString.f68406d);
            java.lang.String optString = jSONObject.optString("finder_username");
            java.lang.String optString2 = jSONObject.optString("productId");
            com.tencent.mars.xlog.Log.i("CheckWidgetDisplayableTask", "Check start username:" + optString + " productId:" + optString2);
            kotlin.jvm.internal.o.d(optString);
            if (!(optString.length() == 0)) {
                kotlin.jvm.internal.o.d(optString2);
                if (!(optString2.length() == 0)) {
                    r45.ld2 ld2Var = new r45.ld2();
                    ld2Var.set(3, optString);
                    r45.iu1 iu1Var = new r45.iu1();
                    iu1Var.set(0, java.lang.Long.valueOf(java.lang.Long.parseLong(optString2)));
                    iu1Var.set(1, 1);
                    new ke2.o0("/cgi-bin/mmbiz-bin/finderlivegetproductpromotereplaywidget", 18719, iu1Var, ld2Var, null).l().K(new com.tencent.mm.feature.finder.live.g(callback));
                }
            }
            com.tencent.mars.xlog.Log.e("CheckWidgetDisplayableTask", "missing required parameters");
            callback.a(new com.tencent.mm.ipcinvoker.type.IPCString("false"));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("CheckWidgetDisplayableTask", th6, "Check exception", new java.lang.Object[0]);
            callback.a(new com.tencent.mm.ipcinvoker.type.IPCString("false"));
        }
    }
}
