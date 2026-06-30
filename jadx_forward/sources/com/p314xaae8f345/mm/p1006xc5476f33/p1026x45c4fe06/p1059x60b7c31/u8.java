package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class u8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r8 {

    /* renamed from: CTRL_INDEX */
    public static final int f34902x366c91de = 905;

    /* renamed from: NAME */
    public static final java.lang.String f34903x24728b = "openAddressWithLightMode";

    public u8() {
        si1.e.a(f34903x24728b);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r8
    public void C(android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        intent.putExtra("force_light_mode", jSONObject != null ? jSONObject.optBoolean("forceLightMode", false) : false);
    }
}
