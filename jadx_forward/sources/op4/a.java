package op4;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final op4.a f428793a = new op4.a();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f428794b = "";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f428795c = "";

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f428796d = "";

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f428797e = "";

    public final void a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveFinderRecordTemplateReporter", "report >> " + i17 + "  " + f428794b + ' ' + f428795c + " 0 0 " + f428796d + ' ' + f428797e);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6656xd9606896 c6656xd9606896 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6656xd9606896();
        c6656xd9606896.f140025e = 0;
        c6656xd9606896.f140027g = c6656xd9606896.b("FollowTemplateId", f428794b, true);
        c6656xd9606896.f140029i = c6656xd9606896.b("FollowMusicId", f428795c, true);
        c6656xd9606896.f140030j = 0;
        c6656xd9606896.f140026f = c6656xd9606896.b("TemplateId", f428796d, true);
        c6656xd9606896.f140028h = c6656xd9606896.b("MusicId", f428797e, true);
        c6656xd9606896.f140024d = i17;
        c6656xd9606896.k();
        if (i17 == 3) {
            f428794b = "";
            f428795c = "";
            f428796d = "";
            f428797e = "";
        }
    }
}
