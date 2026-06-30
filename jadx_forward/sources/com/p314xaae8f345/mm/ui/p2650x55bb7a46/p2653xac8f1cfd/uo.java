package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class uo implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f281627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.vo f281628e;

    public uo(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.vo voVar, long j17) {
        this.f281628e = voVar;
        this.f281627d = j17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 h27 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).h2(((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).f145049b, this.f281627d);
        if (h27 != null && h27.m124847x74d37ac6() > 0) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.vo voVar = this.f281628e;
            int M0 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) voVar.f281676a.f280113d.f542241c.a(sb5.z.class))).M0();
            int mo8143x7444f759 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) voVar.f281676a.f280113d.f542241c.a(sb5.z.class))).mo8143x7444f759();
            xg3.m0 u17 = c01.d9.b().u();
            final java.lang.String str = ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).f145049b;
            final long j17 = this.f281627d;
            final int i19 = M0 - mo8143x7444f759;
            final com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.g9) u17;
            final java.lang.String X8 = g9Var.X8(str);
            if (g9Var.Da(X8)) {
                i18 = ot0.c3.l().d("getPositionByCreateTime", new yz5.a() { // from class: com.tencent.mm.storage.g9$$a0
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        return java.lang.Integer.valueOf(ot0.z2.f430355a.i1(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, j17, i19));
                    }
                }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$b0
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                        g9Var2.getClass();
                        android.database.Cursor B = g9Var2.f275522r.B("SELECT * FROM " + X8 + " WHERE" + g9Var2.Z8(str) + "AND createTime < " + j17 + " ORDER BY createTime ASC LIMIT -1 OFFSET " + i19, null);
                        int count = B.getCount();
                        B.close();
                        return java.lang.Integer.valueOf(count);
                    }
                });
            } else if (g9Var.Pb(X8)) {
                i18 = ot0.z2.f430355a.i1(g9Var.f275522r, X8, str, j17, i19);
            } else {
                android.database.Cursor B = g9Var.f275522r.B("SELECT * FROM " + X8 + " WHERE" + g9Var.Z8(str) + "AND createTime < " + j17 + " ORDER BY createTime ASC LIMIT -1 OFFSET " + i19, null);
                int count = B.getCount();
                B.close();
                i18 = count;
            }
            if (i18 >= 0 && mo8143x7444f759 > i18) {
                voVar.f281676a.f280113d.T(i18, false, false, 0);
            }
        }
    }
}
