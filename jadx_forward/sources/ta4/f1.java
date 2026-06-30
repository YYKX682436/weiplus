package ta4;

/* loaded from: classes3.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ta4.f1 f498276a = new ta4.f1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f498277b = new java.util.ArrayList();

    public final void a(int i17, float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addAction", "com.tencent.mm.plugin.sns.report.SnsScaleReporter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsScaleReporter", "addAction >> " + i17 + ", " + f17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append(';');
        sb6.append(f17);
        f498277b.add(sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addAction", "com.tencent.mm.plugin.sns.report.SnsScaleReporter");
    }

    public final void b(int i17, int i18, java.lang.String snsId, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("report", "com.tencent.mm.plugin.sns.report.SnsScaleReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsId, "snsId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsScaleReporter", "report >> " + i17 + ", " + i18 + " snsId:" + snsId + " index:" + i19);
        java.util.ArrayList arrayList = f498277b;
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsScaleReporter", "report >> no action");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("report", "com.tencent.mm.plugin.sns.report.SnsScaleReporter");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6703x5892a207 c6703x5892a207 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6703x5892a207();
        c6703x5892a207.f140430e = i18;
        c6703x5892a207.f140429d = i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = arrayList.iterator();
        int i27 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i28 = i27 + 1;
            if (i27 < 0) {
                kz5.c0.p();
                throw null;
            }
            sb6.append((java.lang.String) next);
            if (i27 < arrayList.size() - 1) {
                sb6.append("#");
            }
            i27 = i28;
        }
        arrayList.clear();
        c6703x5892a207.f140431f = c6703x5892a207.b("ActionAndScales", sb6.toString(), true);
        c6703x5892a207.f140432g = c6703x5892a207.b("SnsFeedId", snsId, true);
        c6703x5892a207.f140433h = i19;
        c6703x5892a207.k();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("report", "com.tencent.mm.plugin.sns.report.SnsScaleReporter");
    }
}
