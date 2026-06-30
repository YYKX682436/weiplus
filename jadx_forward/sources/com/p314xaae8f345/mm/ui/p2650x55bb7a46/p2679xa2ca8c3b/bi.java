package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class bi implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f285013b;

    public bi(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105, java.lang.String str) {
        this.f285013b = c21908xb66fd105;
        this.f285012a = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        final km5.b c17 = km5.u.c();
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        final java.lang.String str = this.f285012a;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi.n(str, true);
        if (n17 == null || ((int) n17.E2) == 0 || !n17.k2()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", "contact do not exist.(username : %s)", str);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.c.a(2);
            ((c01.k7) c01.n8.a()).b(str, 5, new c01.o8() { // from class: com.tencent.mm.ui.chatting.viewitems.bi$$a
                @Override // c01.o8
                public final void a(java.lang.String str2, boolean z17) {
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bi.this.f285013b;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", "flush contact callback, username: %s, success: %b, isUpdatingBizInfo: %b", str2, valueOf, java.lang.Boolean.valueOf(c21908xb66fd105.W));
                    boolean z18 = c21908xb66fd105.W;
                    km5.b bVar = c17;
                    if (!z18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", "callback when request interrupted by user");
                        bVar.a(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.b(1, "flush contact fail"));
                        return;
                    }
                    boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    java.lang.String str3 = str;
                    if (str3 == null) {
                        str3 = "";
                    }
                    if (!str3.equals(str2) || !z17) {
                        bVar.a(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.b(1, "flush contact fail"));
                    } else {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.c.a(11);
                        bVar.c(java.lang.Boolean.TRUE);
                    }
                }
            });
        } else {
            c17.c(java.lang.Boolean.TRUE);
        }
        return java.lang.Boolean.FALSE;
    }
}
