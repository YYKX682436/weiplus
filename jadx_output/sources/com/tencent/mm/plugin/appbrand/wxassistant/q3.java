package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes7.dex */
public final class q3 implements com.tencent.mm.plugin.appbrand.wxassistant.s2 {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f92298a = jz5.h.b(com.tencent.mm.plugin.appbrand.wxassistant.p3.f92275d);

    @Override // com.tencent.mm.plugin.appbrand.wxassistant.r2
    public java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<native>");
        java.util.Iterator it = f().entrySet().iterator();
        while (it.hasNext()) {
            sb6.append(((com.tencent.mm.plugin.appbrand.wxassistant.r2) ((java.util.Map.Entry) it.next()).getValue()).b());
        }
        sb6.append("</native>");
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    @Override // com.tencent.mm.plugin.appbrand.wxassistant.r2
    public java.lang.String c() {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = f().entrySet().iterator();
        while (it.hasNext()) {
            org.json.JSONArray jSONArray2 = new org.json.JSONArray(((com.tencent.mm.plugin.appbrand.wxassistant.r2) ((java.util.Map.Entry) it.next()).getValue()).c());
            int length = jSONArray2.length();
            for (int i17 = 0; i17 < length; i17++) {
                jSONArray.put(jSONArray2.get(i17));
            }
        }
        java.lang.String jSONArray3 = jSONArray.toString();
        kotlin.jvm.internal.o.f(jSONArray3, "toString(...)");
        return jSONArray3;
    }

    public void d(com.tencent.mm.plugin.appbrand.wxassistant.r2 serializable) {
        kotlin.jvm.internal.o.g(serializable, "serializable");
        com.tencent.mars.xlog.Log.i("MicroMsg.WxAssistantViewGroupSerializer", "addSerializable: " + serializable);
        f().put(java.lang.Integer.valueOf(serializable.id()), serializable);
    }

    @Override // com.tencent.mm.plugin.appbrand.wxassistant.r2
    public void destroy() {
        java.util.Iterator it = f().entrySet().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.wxassistant.r2) ((java.util.Map.Entry) it.next()).getValue()).destroy();
        }
        f().clear();
    }

    public void e(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("MicroMsg.WxAssistantViewGroupSerializer", "addView: " + view);
        f().put(java.lang.Integer.valueOf(view.hashCode()), new com.tencent.mm.plugin.appbrand.wxassistant.z2(view));
    }

    public final java.util.HashMap f() {
        return (java.util.HashMap) ((jz5.n) this.f92298a).getValue();
    }

    public void g(com.tencent.mm.plugin.appbrand.wxassistant.r2 serializable) {
        kotlin.jvm.internal.o.g(serializable, "serializable");
        com.tencent.mars.xlog.Log.i("MicroMsg.WxAssistantViewGroupSerializer", "removeSerializable: " + serializable);
        com.tencent.mm.plugin.appbrand.wxassistant.r2 r2Var = (com.tencent.mm.plugin.appbrand.wxassistant.r2) f().remove(java.lang.Integer.valueOf(serializable.id()));
        if (r2Var != null) {
            r2Var.destroy();
        }
    }

    public void h(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("MicroMsg.WxAssistantViewGroupSerializer", "removeView: " + view);
        com.tencent.mm.plugin.appbrand.wxassistant.r2 r2Var = (com.tencent.mm.plugin.appbrand.wxassistant.r2) f().remove(java.lang.Integer.valueOf(view.hashCode()));
        if (r2Var != null) {
            r2Var.destroy();
        }
    }
}
