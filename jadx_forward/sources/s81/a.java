package s81;

/* loaded from: classes7.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s81.b f486252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f486253e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f486254f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f486255g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f486256h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f486257i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(s81.b bVar, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3) {
        super(0);
        this.f486252d = bVar;
        this.f486253e = str;
        this.f486254f = str2;
        this.f486255g = i17;
        this.f486256h = i18;
        this.f486257i = str3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        s81.b bVar = this.f486252d;
        bVar.getClass();
        java.lang.String str = this.f486254f;
        if (!(str == null || str.length() == 0)) {
            s81.c cVar = new s81.c();
            cVar.f67271x28d45f97 = str;
            cVar.f67277x8987ca93 = this.f486255g;
            int i17 = this.f486256h;
            cVar.f67274xa1ecfcdb = i17;
            if (i17 == 6) {
                cVar.f67273xbae6789e = str;
            } else {
                if (i17 == 12 || i17 == 13) {
                    cVar.f67273xbae6789e = "";
                } else {
                    java.lang.String str2 = this.f486257i;
                    cVar.f67273xbae6789e = str2 != null ? str2 : "";
                }
            }
            cVar.f67272xcd821ae1 = 0;
            cVar.f67276x10639700 = 0;
            cVar.f67275x44eeb14 = 0;
            if (bVar.get(cVar, new java.lang.String[0])) {
                if (cVar.f67276x10639700 == 1) {
                    boolean z17 = cVar.f67272xcd821ae1 <= 0;
                    r81.f.INSTANCE.b(cVar.f67275x44eeb14, !z17 ? 57 : 56);
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7039x125813ef c7039x125813ef = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7039x125813ef();
                    c7039x125813ef.f143554d = c7039x125813ef.b("Username", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j.class)).D0(cVar.f67271x28d45f97), true);
                    c7039x125813ef.f143555e = c7039x125813ef.b("Appid", cVar.f67271x28d45f97, true);
                    c7039x125813ef.f143556f = cVar.f67277x8987ca93;
                    c7039x125813ef.f143557g = z17 ? 1L : 0L;
                    c7039x125813ef.f143558h = cVar.f67275x44eeb14;
                    c7039x125813ef.f143559i = cVar.f67274xa1ecfcdb;
                    c7039x125813ef.f143560j = c7039x125813ef.b("ModuleName", cVar.f67273xbae6789e, true);
                    c7039x125813ef.f143561k = c7039x125813ef.b("InstanceId", this.f486253e, true);
                    c7039x125813ef.k();
                }
                cVar.f67272xcd821ae1++;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PredownloadGetCodeStatStorage", "checkReportOnLocalPkg(" + bVar.y0(cVar) + "), update hitCount=" + cVar.f67272xcd821ae1 + ", updated:" + bVar.mo9952xce0038c9(cVar, new java.lang.String[0]));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PredownloadGetCodeStatStorage", "checkReportOnLocalPkg(" + bVar.y0(cVar) + "), not pre-downloaded before");
            }
        }
        return jz5.f0.f384359a;
    }
}
