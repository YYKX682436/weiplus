package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d;

/* loaded from: classes7.dex */
public final class q3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.s2 {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f173831a = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p3.f173808d);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.r2
    public java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<native>");
        java.util.Iterator it = f().entrySet().iterator();
        while (it.hasNext()) {
            sb6.append(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.r2) ((java.util.Map.Entry) it.next()).getValue()).b());
        }
        sb6.append("</native>");
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.r2
    public java.lang.String c() {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = f().entrySet().iterator();
        while (it.hasNext()) {
            org.json.JSONArray jSONArray2 = new org.json.JSONArray(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.r2) ((java.util.Map.Entry) it.next()).getValue()).c());
            int length = jSONArray2.length();
            for (int i17 = 0; i17 < length; i17++) {
                jSONArray.put(jSONArray2.get(i17));
            }
        }
        java.lang.String jSONArray3 = jSONArray.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray3, "toString(...)");
        return jSONArray3;
    }

    public void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.r2 serializable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serializable, "serializable");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxAssistantViewGroupSerializer", "addSerializable: " + serializable);
        f().put(java.lang.Integer.valueOf(serializable.id()), serializable);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.r2
    /* renamed from: destroy */
    public void mo53732x5cd39ffa() {
        java.util.Iterator it = f().entrySet().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.r2) ((java.util.Map.Entry) it.next()).getValue()).mo53732x5cd39ffa();
        }
        f().clear();
    }

    public void e(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxAssistantViewGroupSerializer", "addView: " + view);
        f().put(java.lang.Integer.valueOf(view.hashCode()), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.z2(view));
    }

    public final java.util.HashMap f() {
        return (java.util.HashMap) ((jz5.n) this.f173831a).mo141623x754a37bb();
    }

    public void g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.r2 serializable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serializable, "serializable");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxAssistantViewGroupSerializer", "removeSerializable: " + serializable);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.r2 r2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.r2) f().remove(java.lang.Integer.valueOf(serializable.id()));
        if (r2Var != null) {
            r2Var.mo53732x5cd39ffa();
        }
    }

    public void h(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxAssistantViewGroupSerializer", "removeView: " + view);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.r2 r2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.r2) f().remove(java.lang.Integer.valueOf(view.hashCode()));
        if (r2Var != null) {
            r2Var.mo53732x5cd39ffa();
        }
    }
}
