package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class k6 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.b6 {
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.b6
    public void a(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        java.lang.String str = erVar.f285453p;
        java.lang.String str2 = erVar.f285454q;
        java.lang.String str3 = erVar.f285455r;
        java.lang.String str4 = erVar.f285458u;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmotionSetClickListener", "setKey is null.");
            return;
        }
        r45.vd0 vd0Var = new r45.vd0();
        vd0Var.f469667d = str4;
        vd0Var.f469669f = str;
        vd0Var.f469670g = str2;
        vd0Var.f469668e = str3;
        qk.a0 a0Var = new qk.a0(vd0Var);
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6 p6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class);
        if (p6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmotionSetClickListener", "unable to get emoticon liteapp feature service");
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) p6Var).wi(dVar.g(), a0Var);
        }
    }
}
