package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class q3 implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    private q3() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        int i17;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c c10750x9556b48c = new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c();
        try {
            i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("EnableWebviewScanQRCode"), 1);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuggageWebViewLongClickHelper", "isAllowScanQRCode parseInt failed");
            i17 = 0;
        }
        c10750x9556b48c.f149933d = i17 == 1;
        return c10750x9556b48c;
    }
}
