package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* loaded from: classes7.dex */
public class k1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f33803x366c91de = 295;

    /* renamed from: NAME */
    public static final java.lang.String f33804x24728b = "operateRecorder";

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.Vector f160773n = new java.util.Vector();

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.j1 f160774g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f160775h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 f160776i;

    /* renamed from: m, reason: collision with root package name */
    public mi1.w0 f160777m;

    public static void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.k1 k1Var, boolean z17) {
        k1Var.getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.g1(k1Var, z17));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = k1Var.f160775h;
        if (v5Var == null || v5Var.t3() == null) {
            return;
        }
        if (z17) {
            k1Var.f160777m = mi1.c.a(k1Var.f160775h.t3()).h(mi1.d.VOICE);
            return;
        }
        mi1.w0 w0Var = k1Var.f160777m;
        if (w0Var != null) {
            w0Var.mo147359x63a3b28a();
            k1Var.f160777m = null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, org.json.JSONObject jSONObject, int i17) {
        boolean a17;
        si1.e1.a(e9Var.mo48798x74292566(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.h1(this, e9Var, jSONObject, i17));
        android.app.Activity activity = e9Var.mo50352x76847179() instanceof android.app.Activity ? (android.app.Activity) e9Var.mo50352x76847179() : null;
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.JsApiOperateRecorder", "operateRecorder, pageContext is null");
            e9Var.a(i17, o("fail"));
            a17 = false;
        } else {
            a17 = nf.t.a(activity, e9Var, "android.permission.RECORD_AUDIO", 116, "", "");
            if (a17) {
                si1.e1.c(e9Var.mo48798x74292566());
            }
        }
        if (!a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.JsApiOperateRecorder", "operateRecorder, requestPermission fail");
            e9Var.a(i17, o("fail:system permission denied"));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 x07 = e9Var.t3().x0();
        if (x07.m52169xfdaa7672() == null || x07.m52169xfdaa7672().mo14682x9dee9c37() == null) {
            e9Var.a(i17, o("fail"));
            return;
        }
        this.f160775h = x07.m52169xfdaa7672().mo14682x9dee9c37();
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.JsApiOperateRecorder", "operateRecorder, data is null");
            e9Var.a(i17, o("fail:data is null"));
            return;
        }
        java.lang.String mo48798x74292566 = e9Var.mo48798x74292566();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.JsApiOperateRecorder", "operateRecorder appId:%s, data:%s", mo48798x74292566, jSONObject.toString());
        if (this.f160774g == null) {
            this.f160774g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.j1(this, e9Var, i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.j1 j1Var = this.f160774g;
        j1Var.f160756h = i17;
        j1Var.f160758m = mo48798x74292566;
        j1Var.f160759n = jSONObject.toString();
        this.f160774g.f160757i = bm5.f1.a();
        if (this.f160776i == null) {
            this.f160776i = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.f1(this, mo48798x74292566, e9Var, i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.j1 j1Var2 = this.f160774g;
        j1Var2.f160752d = this.f160776i;
        j1Var2.c();
    }
}
