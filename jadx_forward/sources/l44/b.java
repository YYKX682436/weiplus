package l44;

/* loaded from: classes4.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f397566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f397567e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f397568f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l44.c f397569g;

    public b(l44.c cVar, int i17, int i18, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f397569g = cVar;
        this.f397566d = i17;
        this.f397567e = i18;
        this.f397568f = m1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.k0 k0Var;
        l44.c cVar = this.f397569g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback$1");
        try {
            if (this.f397566d == 0 && this.f397567e == 0 && (k0Var = (r45.k0) ((com.p314xaae8f345.mm.p944x882e457a.o) this.f397568f.mo47948x7f0c4558()).f152244b.f152233a) != null) {
                java.lang.String valueOf = java.lang.String.valueOf(k0Var.f459780d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ADAppointment.AdAppointmentHelper", "parseResp status=" + valueOf);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                java.lang.String str = cVar.f397596g;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                long j17 = cVar.f397595f;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                p34.o.h(str, l44.d.e(j17), valueOf);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                l44.a aVar = cVar.f397593d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                long j18 = cVar.f397595f;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                int i17 = cVar.f397594e;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                aVar.a(j18, i17, true, valueOf);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback$1");
                return;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ADAppointment.AdAppointmentHelper", "parseResp exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
        l44.a aVar2 = cVar.f397593d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
        long j19 = cVar.f397595f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
        int i18 = cVar.f397594e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
        aVar2.a(j19, i18, false, "-1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback$1");
    }
}
