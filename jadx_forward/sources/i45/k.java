package i45;

/* loaded from: classes16.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final i45.k f369953a = new i45.k();

    public static void a(i45.k kVar, long j17, java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            num = -1;
        }
        if ((i17 & 4) != 0) {
            str = "";
        }
        if ((i17 & 8) != 0) {
            str2 = "";
        }
        if ((i17 & 16) != 0) {
            str3 = "";
        }
        if ((i17 & 32) != 0) {
            str4 = "";
        }
        if ((i17 & 64) != 0) {
            str5 = "";
        }
        if ((i17 & 128) != 0) {
            str6 = "";
        }
        if ((i17 & 256) != 0) {
            str7 = "";
        }
        if ((i17 & 512) != 0) {
            str8 = "";
        }
        kVar.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6661x25ef0ea c6661x25ef0ea = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6661x25ef0ea();
        c6661x25ef0ea.f140066d = j17;
        c6661x25ef0ea.f140067e = c6661x25ef0ea.b("ContentTitle", str, true);
        c6661x25ef0ea.f140068f = c6661x25ef0ea.b("AppID", str2, true);
        c6661x25ef0ea.f140069g = c6661x25ef0ea.b("SongID", str3, true);
        c6661x25ef0ea.f140070h = c6661x25ef0ea.b("EmojiMd5", str4, true);
        c6661x25ef0ea.f140071i = c6661x25ef0ea.b("EmojiProductID", str5, true);
        c6661x25ef0ea.f140072j = c6661x25ef0ea.b("SongName", str6, true);
        c6661x25ef0ea.f140073k = c6661x25ef0ea.b("ToUsername", str7, true);
        c6661x25ef0ea.f140074l = num != null ? num.intValue() : 0L;
        c6661x25ef0ea.f140075m = c6661x25ef0ea.b("imageUrl", str8, true);
        c6661x25ef0ea.k();
        f369953a.b(c6661x25ef0ea);
    }

    public final void b(jx3.a aVar) {
        java.lang.String n17 = aVar.n();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxImeReport", "report%s %s", java.lang.Integer.valueOf(aVar.g()), r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false));
    }
}
