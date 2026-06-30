package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* loaded from: classes7.dex */
public class v2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f33831x366c91de = 33;

    /* renamed from: NAME */
    public static final java.lang.String f33832x24728b = "playVoice";

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f160824h;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11993xd14dcf53 f160825g;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, null);
        java.lang.String optString2 = jSONObject.optString(dm.i4.f66867x2a5c95c7);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (optString == null) {
            optString = optString2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStartPlayVoice", "doPlayVoice, appId : %s, localId : %s", e9Var.mo48798x74292566(), optString);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            e9Var.a(i17, o("fail_missing arguments"));
            return;
        }
        com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = e9Var.mo50354x59eafec1().mo49620x1d537609(optString);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = e9Var.V0();
        if (mo49620x1d537609 == null || !mo49620x1d537609.m() || V0 == null) {
            e9Var.a(i17, o("fail"));
            return;
        }
        c01.l2 c17 = c01.n2.d().c("JsApi@" + V0.hashCode(), true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v vVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v) c17.c("onBackgroundListener", null);
        if (vVar == null) {
            vVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.p2(this, V0);
            c17.i("onBackgroundListener", vVar);
        }
        V0.R(vVar);
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w) c17.c("onDestroyListener", null)) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.q2 q2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.q2(this, V0);
            c17.i("onDestroyListener", q2Var);
            V0.w(q2Var);
        }
        if (this.f160825g == null) {
            this.f160825g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11993xd14dcf53(this, e9Var, i17);
        }
        if (f160824h != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(dm.i4.f66867x2a5c95c7, this.f160825g.f160649i);
            e9Var.a(this.f160825g.f160648h, p("fail", hashMap));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11993xd14dcf53 c11993xd14dcf53 = this.f160825g;
        c11993xd14dcf53.f160646f = this;
        c11993xd14dcf53.f160647g = e9Var;
        c11993xd14dcf53.f160648h = i17;
        c11993xd14dcf53.f160649i = optString;
        c11993xd14dcf53.f160650m = mo49620x1d537609.o();
        this.f160825g.d();
        f160824h = optString;
    }
}
