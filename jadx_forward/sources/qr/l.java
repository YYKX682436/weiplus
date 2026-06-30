package qr;

/* loaded from: classes12.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f447552a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f447553b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f447554c;

    /* renamed from: d, reason: collision with root package name */
    public final long f447555d;

    /* renamed from: e, reason: collision with root package name */
    public qr.i f447556e;

    /* renamed from: f, reason: collision with root package name */
    public dn.h f447557f = null;

    public l(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4, boolean z17, qr.i iVar) {
        this.f447552a = c21053xdbf1e5f4;
        this.f447553b = z17;
        this.f447556e = iVar;
        boolean g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(c21053xdbf1e5f4.N0());
        this.f447554c = g17;
        this.f447555d = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiUpload", "EmojiUpload: %s, %s, %s", c21053xdbf1e5f4.f68671x4b6e68b9, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(g17));
    }

    public void a(int i17) {
        b(i17, null, "", "");
    }

    public void b(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        qr.i iVar = this.f447556e;
        if (iVar != null) {
            if (iVar instanceof qr.j) {
                ((qr.j) iVar).a(i17, str, this.f447557f);
            } else if (iVar instanceof qr.k) {
                ((qr.k) iVar).a(i17, str, str2, str3);
            } else {
                iVar.mo44657x57429edc(i17, str);
            }
        }
    }

    public void c() {
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            a(5);
        } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            a(6);
        } else {
            a(7);
        }
    }

    public void d(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = this.f447552a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiUpload", "save emoji gif md5, wxam %b, md5 %s, %s", java.lang.Boolean.valueOf(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21053xdbf1e5f4.f68691xdde7652c)), str, c21053xdbf1e5f4.f68691xdde7652c);
        if (!this.f447554c || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            c21053xdbf1e5f4.f68650xee2fac53 = 0;
            ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().G2(c21053xdbf1e5f4);
            return;
        }
        java.lang.String N0 = c21053xdbf1e5f4.N0();
        java.lang.String h07 = c21053xdbf1e5f4.h0();
        com.p314xaae8f345.mm.vfs.w6.c(N0, rr.s.f480682a.c() + str);
        java.lang.String str2 = c21053xdbf1e5f4.f68671x4b6e68b9;
        c21053xdbf1e5f4.f68671x4b6e68b9 = str;
        c21053xdbf1e5f4.f68660x7650f4b9 = c21053xdbf1e5f4.f68691xdde7652c;
        c21053xdbf1e5f4.f68650xee2fac53 = 0;
        com.p314xaae8f345.mm.vfs.w6.c(h07, c21053xdbf1e5f4.h0());
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().J0(c21053xdbf1e5f4);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str2, c21053xdbf1e5f4.f68671x4b6e68b9)) {
            return;
        }
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().f1(str2);
    }
}
