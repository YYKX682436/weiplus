package l44;

/* loaded from: classes4.dex */
public class c implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final l44.a f397593d;

    /* renamed from: e, reason: collision with root package name */
    public final int f397594e;

    /* renamed from: f, reason: collision with root package name */
    public final long f397595f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f397596g;

    public c(java.lang.String str, long j17, int i17, l44.a aVar) {
        this.f397596g = str;
        this.f397595f = j17;
        this.f397594e = i17;
        this.f397593d = aVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ADAppointment.AdAppointmentHelper", "parseResp, snsId=" + this.f397596g + ", appointmentId=" + this.f397595f + ", opType=" + this.f397594e + ", errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
        if (this.f397593d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ADAppointment.AdAppointmentHelper", "parseResp callback==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new l44.b(this, i17, i18, m1Var));
        gm0.j1.d().q(5159, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
    }
}
