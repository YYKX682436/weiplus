package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* loaded from: classes7.dex */
public final class d3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f33783x366c91de = 31;

    /* renamed from: NAME */
    public static final java.lang.String f33784x24728b = "startRecord";

    /* renamed from: m, reason: collision with root package name */
    public static volatile java.lang.String f160708m;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11994xe5437c33 f160709g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f160710h;

    /* renamed from: i, reason: collision with root package name */
    public mi1.w0 f160711i;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, org.json.JSONObject jSONObject, int i17) {
        boolean a17;
        si1.e1.a(e9Var.mo48798x74292566(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.z2(this, e9Var, jSONObject, i17));
        android.app.Activity activity = e9Var.mo50352x76847179() instanceof android.app.Activity ? (android.app.Activity) e9Var.mo50352x76847179() : null;
        if (activity == null) {
            e9Var.a(i17, o("fail"));
            a17 = false;
        } else {
            a17 = nf.t.a(activity, e9Var, "android.permission.RECORD_AUDIO", 116, "", "");
            if (a17) {
                si1.e1.c(e9Var.mo48798x74292566());
            }
        }
        if (!a17) {
            e9Var.a(i17, o("fail"));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 x07 = e9Var.t3().x0();
        if (x07.m52169xfdaa7672() == null || x07.m52169xfdaa7672().mo14682x9dee9c37() == null) {
            e9Var.a(i17, o("fail"));
            return;
        }
        if (f160708m != null) {
            e9Var.a(i17, o("fail:audio is recording, don't start record again"));
            return;
        }
        this.f160710h = x07.m52169xfdaa7672().mo14682x9dee9c37();
        int i18 = 60;
        int optInt = jSONObject.optInt("duration", 60);
        if (optInt <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStartRecordVoice", "duration is invalid, less than 0");
        } else {
            i18 = optInt;
        }
        if (i18 > 600) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStartRecordVoice", "duration is invalid, more than %d", 600);
            i18 = 600;
        }
        this.f160710h.R(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.w2(this, e9Var));
        this.f160710h.w(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.x2(this, e9Var));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11994xe5437c33 c11994xe5437c33 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11994xe5437c33(this, e9Var, i18, i17);
        this.f160709g = c11994xe5437c33;
        f160708m = c11994xe5437c33.f160656m;
        this.f160709g.d();
        D(true);
    }

    public final void D(boolean z17) {
        if (this.f160710h == null) {
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.y2(this, z17));
            return;
        }
        if (z17) {
            this.f160711i = mi1.c.a(this.f160710h.t3()).h(mi1.d.VOICE);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.a(this.f160710h.mo48798x74292566()).f167243c = this.f160711i;
        } else {
            mi1.w0 w0Var = this.f160711i;
            if (w0Var != null) {
                w0Var.mo147359x63a3b28a();
                this.f160711i = null;
            }
        }
    }
}
