package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes4.dex */
public final class o implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu5.c f84828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f84829e;

    public o(wu5.c cVar, int i17) {
        this.f84828d = cVar;
        this.f84829e = i17;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchedResp appBrandCgiPrefetchedResp;
        com.tencent.mm.modelbase.f fVar;
        java.lang.String str;
        r45.ie baseResponse;
        r45.du5 du5Var;
        r45.ie baseResponse2;
        java.lang.Object obj;
        r45.ie ieVar;
        java.lang.String str2 = "";
        try {
            fVar = (com.tencent.mm.modelbase.f) this.f84828d.get(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.Exception unused) {
            appBrandCgiPrefetchedResp = new com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchedResp("", -1, "Timeout");
        }
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            r45.k50 k50Var = (r45.k50) fVar.f70618d;
            if ((k50Var == null || (ieVar = k50Var.BaseResponse) == null || ieVar.f376959d != 0) ? false : true) {
                java.util.LinkedList resp_item_list = k50Var.f378380e;
                kotlin.jvm.internal.o.f(resp_item_list, "resp_item_list");
                java.util.Iterator it = resp_item_list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((r45.cb0) obj).f371423d == this.f84829e) {
                        break;
                    }
                }
                r45.cb0 cb0Var = (r45.cb0) obj;
                if (cb0Var == null) {
                    appBrandCgiPrefetchedResp = new com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchedResp("", -1, "Response item not found");
                    return appBrandCgiPrefetchedResp;
                }
                java.lang.String str3 = cb0Var.f371424e;
                if (str3 == null) {
                    str3 = "";
                }
                int i17 = cb0Var.f371425f;
                r45.du5 du5Var2 = ((r45.k50) fVar.f70618d).getBaseResponse().f376960e;
                str = du5Var2 != null ? du5Var2.f372756d : null;
                if (str == null) {
                    java.lang.String str4 = fVar.f70617c;
                    if (str4 != null) {
                        str2 = str4;
                    }
                } else {
                    str2 = str;
                }
                return new com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchedResp(str3, i17, str2);
            }
        }
        r45.k50 k50Var2 = (r45.k50) fVar.f70618d;
        int i18 = (k50Var2 == null || (baseResponse2 = k50Var2.getBaseResponse()) == null) ? fVar.f70616b : baseResponse2.f376959d;
        r45.k50 k50Var3 = (r45.k50) fVar.f70618d;
        if (k50Var3 != null && (baseResponse = k50Var3.getBaseResponse()) != null && (du5Var = baseResponse.f376960e) != null) {
            str = du5Var.f372756d;
        }
        if (str == null && (str = fVar.f70617c) == null) {
            str = "";
        }
        return new com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchedResp("", i18, str);
    }
}
