package com.tencent.mm.plugin.appbrand.jsapi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/k6;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiGetWeAppNewTipsInfo$NewTipInfo;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes7.dex */
public final class k6 implements com.tencent.mm.ipcinvoker.j {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        android.util.Pair c17 = rn3.i.Di().c(new vn3.c(iPCString != null ? iPCString.f68406d : null));
        r45.pm6 pm6Var = (r45.pm6) c17.second;
        if (pm6Var == null) {
            if (rVar != null) {
                rVar.a(null);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.newtips.model.r rVar2 = (com.tencent.mm.plugin.newtips.model.r) c17.first;
        if (rVar2 == com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_NONE || pm6Var == null) {
            if (rVar != null) {
                rVar.a(null);
            }
        } else if (rVar != null) {
            if (rVar2 != null) {
                int i17 = rVar2.f152396e;
                java.lang.String str = pm6Var != null ? pm6Var.f383187e : null;
                java.lang.String str2 = str == null ? "" : str;
                java.lang.String str3 = pm6Var != null ? pm6Var.f383188f : null;
                java.lang.String str4 = str3 == null ? "" : str3;
                int i18 = pm6Var != null ? pm6Var.f383200u : 0;
                r2 = pm6Var != null ? pm6Var.f383201v : null;
                r2 = new com.tencent.mm.plugin.appbrand.jsapi.JsApiGetWeAppNewTipsInfo$NewTipInfo(i17, str2, str4, i18, r2 == null ? "" : r2);
            }
            rVar.a(r2);
        }
    }
}
