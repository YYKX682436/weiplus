package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class ai implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284890a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f284891b;

    public ai(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105, java.lang.String str) {
        this.f284891b = c21908xb66fd105;
        this.f284890a = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        final km5.b c17 = km5.u.c();
        final java.lang.String str = this.f284890a;
        qk.o b17 = r01.z.b(str);
        if (b17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17.f66730x28d45f97)) {
            c17.c(java.lang.Boolean.TRUE);
            return null;
        }
        if (b17 == null) {
            qk.o oVar = new qk.o();
            oVar.f66748xdec927b = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", "insert stub bizInfo, username: %s, success: %b", str, java.lang.Boolean.valueOf(r01.q3.cj().mo9952xce0038c9(oVar, new java.lang.String[0])));
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.c.a(3);
        if (r01.q3.Ai().c(str, new r01.c() { // from class: com.tencent.mm.ui.chatting.viewitems.ai$$a
            @Override // r01.c
            public final void a(boolean z17, java.lang.String str2) {
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ai.this.f284891b;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", "flush bizInfo callback, username: %s, success: %b, isUpdatingBizInfo: %b", str2, valueOf, java.lang.Boolean.valueOf(c21908xb66fd105.W));
                boolean z18 = c21908xb66fd105.W;
                km5.b bVar = c17;
                if (!z18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", "callback when request interrupted by user");
                    bVar.a(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.b(2, "flush bizInfo fail"));
                    return;
                }
                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str2 == null) {
                    str2 = "";
                }
                if (!str2.equals(str) || !z17) {
                    bVar.a(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.b(2, "flush bizInfo fail"));
                } else {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.c.a(13);
                    bVar.c(java.lang.Boolean.TRUE);
                }
            }
        })) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemDyeingTemplate", "try2UpdateBizAttributes fail");
        c17.a(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.b(2, "flush bizInfo fail"));
        return null;
    }
}
