package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes.dex */
public final class p0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34638x366c91de = 1216;

    /* renamed from: NAME */
    public static final java.lang.String f34639x24728b = "quickSendRedPacket";

    /* renamed from: g, reason: collision with root package name */
    public final int f164182g = cf.b.a(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiQuickSendRedPacket", "invode jsapi quick send red packet");
        if (c0Var == null) {
            return;
        }
        if (c0Var.t3() == null) {
            c0Var.a(i17, o("fail:internal error"));
            return;
        }
        if (jSONObject == null) {
            c0Var.a(i17, o("fail:invalid data"));
            return;
        }
        if (c0Var.getF229340d() instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiQuickSendRedPacket", "env.context is MMFragmentActivity");
            android.content.Context f229340d = c0Var.getF229340d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(f229340d, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) f229340d;
            java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
            java.lang.String optString2 = jSONObject.optString("materialId");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(27809, 1, optString2, optString2, "", optString, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 12);
            rd0.e1 e1Var = (rd0.e1) i95.n0.c(rd0.e1.class);
            java.lang.String string = c0Var.getF229340d().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gk7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            android.content.Intent Ni = ((qd0.q0) e1Var).Ni(activityC21401x6ce6f73f, string);
            Ni.putExtra("KQuickSendRedPacketSessionId", optString);
            Ni.putExtra("KQuickSendRedPacketMaterialId", optString2);
            Ni.putExtra("KQuickSendRedPacketFromMakeSkinMiniProgram", true);
            Ni.putExtra("key_from", 5);
            ((pg0.d3) ((qg0.c0) i95.n0.c(qg0.c0.class))).getClass();
            if (((j05.f) i95.n0.c(j05.f.class)) != null) {
                pf5.j0.a(Ni, fb3.e.class);
                pf5.j0.a(Ni, fb3.b.class);
            }
            nf.g.a(c0Var.getF229340d()).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.o0(this, new java.lang.ref.WeakReference(c0Var), c0Var, i17));
            activityC21401x6ce6f73f.startActivityForResult(Ni, this.f164182g);
        }
    }
}
