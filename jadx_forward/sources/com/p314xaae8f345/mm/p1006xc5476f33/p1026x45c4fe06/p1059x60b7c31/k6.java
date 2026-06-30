package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/k6;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiGetWeAppNewTipsInfo$NewTipInfo;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes7.dex */
public final class k6 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        android.util.Pair c17 = rn3.i.Di().c(new vn3.c(c10756x2a5d7b2d != null ? c10756x2a5d7b2d.f149939d : null));
        r45.pm6 pm6Var = (r45.pm6) c17.second;
        if (pm6Var == null) {
            if (rVar != null) {
                rVar.a(null);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r) c17.first;
        if (rVar2 == com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_NONE || pm6Var == null) {
            if (rVar != null) {
                rVar.a(null);
            }
        } else if (rVar != null) {
            if (rVar2 != null) {
                int i17 = rVar2.f233929e;
                java.lang.String str = pm6Var != null ? pm6Var.f464720e : null;
                java.lang.String str2 = str == null ? "" : str;
                java.lang.String str3 = pm6Var != null ? pm6Var.f464721f : null;
                java.lang.String str4 = str3 == null ? "" : str3;
                int i18 = pm6Var != null ? pm6Var.f464733u : 0;
                r2 = pm6Var != null ? pm6Var.f464734v : null;
                r2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11919x694eb55(i17, str2, str4, i18, r2 == null ? "" : r2);
            }
            rVar.a(r2);
        }
    }
}
