package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class g6 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.b6 {
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.b6
    public void a(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        int i17 = erVar.f285449l;
        if (i17 != 0) {
            qk.v vVar = new qk.v();
            java.lang.String x17 = dVar.x();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            vVar.f445572s = x17;
            java.lang.String str = erVar.f285459v;
            if (str == null) {
                str = "";
            }
            vVar.f445573t = str;
            vVar.f445560g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1(java.lang.Integer.valueOf(i17));
            java.lang.String str2 = erVar.f285450m;
            if (str2 == null) {
                str2 = "";
            }
            vVar.f445563j = str2;
            java.lang.String str3 = erVar.f285451n;
            vVar.f445569p = str3 != null ? str3 : "";
            vVar.f445688a = 22;
            vVar.f445568o = true;
            vVar.f445689b = true;
            vVar.f445576w = true;
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.q6 q6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.q6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.q6.class);
            if (q6Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DesignerClickListener", "emoticon page service not found");
            } else {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h4) q6Var).wi(dVar.g(), vVar);
            }
        }
    }
}
