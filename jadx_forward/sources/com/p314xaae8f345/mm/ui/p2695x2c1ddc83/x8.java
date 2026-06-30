package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes5.dex */
public final class x8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuChattingUIFragment f289771d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuChattingUIFragment openImKefuChattingUIFragment) {
        super(0);
        this.f289771d = openImKefuChattingUIFragment;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.s4 s4Var;
        r45.s4 s4Var2;
        java.lang.String str;
        int i17 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuChattingUIFragment.V;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parseStartConversationRequest: ");
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuChattingUIFragment openImKefuChattingUIFragment = this.f289771d;
        sb6.append((com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1) ((jz5.n) openImKefuChattingUIFragment.S).mo141623x754a37bb());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = openImKefuChattingUIFragment.N;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7);
        jz5.g gVar = openImKefuChattingUIFragment.S;
        com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 c11207x71c7a1c1 = (com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1) ((jz5.n) gVar).mo141623x754a37bb();
        if ((c11207x71c7a1c1 == null || (s4Var2 = c11207x71c7a1c1.f153810i) == null || (str = s4Var2.f467019d) == null || !(r26.n0.N(str) ^ true)) ? false : true) {
            com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 c11207x71c7a1c12 = (com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1) ((jz5.n) gVar).mo141623x754a37bb();
            android.net.Uri parse = android.net.Uri.parse((c11207x71c7a1c12 == null || (s4Var = c11207x71c7a1c12.f153810i) == null) ? null : s4Var.f467019d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "Uri.parse " + parse);
            java.lang.String queryParameter = parse.getQueryParameter("carryword");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "carryWord = " + queryParameter);
            if (queryParameter == null || queryParameter.length() == 0) {
                java.lang.String queryParameter2 = parse.getQueryParameter("_kf_custom");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "kf_custom = " + queryParameter2);
                if (queryParameter2 != null) {
                    try {
                        queryParameter = new org.json.JSONObject(queryParameter2).getString("carryword");
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "parse _kf_custom failed: " + e17);
                    }
                } else {
                    queryParameter = null;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "carryWord from js = " + queryParameter);
            }
            if (!(queryParameter == null || queryParameter.length() == 0)) {
                try {
                    byte[] decode = android.util.Base64.decode(queryParameter, 0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
                    java.lang.String str3 = new java.lang.String(decode, r26.c.f450398a);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "carryWord decoded = ".concat(str3));
                    boolean z17 = str3.length() > 0;
                    yb5.d dVar = openImKefuChattingUIFragment.f279685f;
                    if (z17) {
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) dVar.f542241c.a(sb5.s0.class))).f280796e;
                        java.lang.String m75458x24dd4e59 = c19666xfd6e2f33 != null ? c19666xfd6e2f33.m75458x24dd4e59() : null;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[" + openImKefuChattingUIFragment.m7479x8cdac1b() + "] lastTextInFooter: " + m75458x24dd4e59);
                        boolean z18 = m75458x24dd4e59 == null || m75458x24dd4e59.length() == 0;
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c cVar = dVar.f542241c;
                        if (z18) {
                            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f332 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) cVar.a(sb5.s0.class))).f280796e;
                            if (c19666xfd6e2f332 != null) {
                                c19666xfd6e2f332.m75500x1f95af65(str3);
                            }
                        } else {
                            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f333 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) cVar.a(sb5.s0.class))).f280796e;
                            if (c19666xfd6e2f333 != null) {
                                c19666xfd6e2f333.m75500x1f95af65(m75458x24dd4e59 + ' ' + str3);
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "put carryWord to footer lastText");
                    }
                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) dVar.f542241c.a(sb5.s0.class))).E0(1);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str2, e18, "", new java.lang.Object[0]);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
