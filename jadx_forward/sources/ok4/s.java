package ok4;

/* loaded from: classes4.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427571e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f427572f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.lang.String str, java.lang.String str2, int i17) {
        super(0);
        this.f427570d = str;
        this.f427571e = str2;
        this.f427572f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        java.lang.String str = this.f427570d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str, true);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setVideoBitrate >> ");
        java.lang.String str2 = this.f427571e;
        sb6.append(str2);
        sb6.append(", ");
        sb6.append(str);
        sb6.append(", ");
        int i18 = this.f427572f;
        sb6.append(i18);
        sb6.append(", ");
        sb6.append(d17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoDownloadReporter", sb6.toString());
        jz5.f0 f0Var = jz5.f0.f384359a;
        jz5.f0 f0Var2 = null;
        if (i18 == 2) {
            ok4.u uVar = ok4.u.f427574a;
            i17 = d17 != null ? d17.f243916b : 0;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6749x237baa80 a17 = uVar.a(str2);
            if (a17 != null) {
                a17.E = i17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoDownloadReporter", "setFullScreenVideoBitrate >> " + str2 + ", " + i17);
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsVideoDownloadReporter", "setFullScreenVideoBitrate >> " + str2 + " but data is no find");
            }
        } else {
            ok4.u uVar2 = ok4.u.f427574a;
            i17 = d17 != null ? d17.f243916b : 0;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6749x237baa80 a18 = uVar2.a(str2);
            if (a18 != null) {
                a18.f140794v = i17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoDownloadReporter", "setPreviewVideoBitrate >> " + str2 + ", " + i17);
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsVideoDownloadReporter", "setPreviewVideoBitrate >> " + str2 + "  >> is no have struct");
            }
        }
        return f0Var;
    }
}
