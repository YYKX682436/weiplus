package ok4;

/* loaded from: classes4.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427530e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f427531f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f427532g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f427533h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f427534i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427535m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f427536n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f427537o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f427538p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f427539q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f427540r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f427541s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String str, java.lang.String str2, int i17, boolean z17, boolean z18, int i18, java.lang.String str3, long j17, int i19, int i27, boolean z19, int i28, boolean z27) {
        super(0);
        this.f427529d = str;
        this.f427530e = str2;
        this.f427531f = i17;
        this.f427532g = z17;
        this.f427533h = z18;
        this.f427534i = i18;
        this.f427535m = str3;
        this.f427536n = j17;
        this.f427537o = i19;
        this.f427538p = i27;
        this.f427539q = z19;
        this.f427540r = i28;
        this.f427541s = z27;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initStruct >> mediaId: ");
        java.lang.String str = this.f427529d;
        sb6.append(str);
        sb6.append("， feedId: ");
        java.lang.String str2 = this.f427530e;
        sb6.append(str2);
        sb6.append(", wsType: ");
        int i17 = this.f427531f;
        sb6.append(i17);
        sb6.append(", isMine: ");
        boolean z17 = this.f427532g;
        sb6.append(z17);
        sb6.append(", canSwitchSource: ");
        boolean z18 = this.f427533h;
        sb6.append(z18);
        sb6.append(", previewSourceModeResult: ");
        int i18 = this.f427534i;
        sb6.append(i18);
        sb6.append(", previewReqFlag: ");
        sb6.append(this.f427535m);
        sb6.append(", predictStartTimeMS: ");
        long j17 = this.f427536n;
        sb6.append(j17);
        sb6.append(", predictCost: ");
        int i19 = this.f427537o;
        sb6.append(i19);
        sb6.append(", reqFlagReason: ");
        int i27 = this.f427538p;
        sb6.append(i27);
        sb6.append(", ");
        sb6.append(java.lang.Thread.currentThread().getName());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoDownloadReporter", sb6.toString());
        java.util.HashMap hashMap = ok4.u.f427575b;
        if (hashMap.containsKey(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsVideoDownloadReporter", "mediaId is no report " + str);
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6749x237baa80 c6749x237baa80 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6749x237baa80();
            c6749x237baa80.f140780h = 1;
            c6749x237baa80.f140779g = z17 ? 1 : 0;
            c6749x237baa80.f140776d = c6749x237baa80.b("Feed_ItemID", str2, true);
            c6749x237baa80.f140777e = c6749x237baa80.b("Feed_MediaID", str, true);
            c6749x237baa80.f140778f = i17;
            c6749x237baa80.f140781i = this.f427539q ? 1 : 0;
            c6749x237baa80.f140782j = this.f427540r;
            c6749x237baa80.f140783k = this.f427541s ? 1 : 0;
            c6749x237baa80.f140784l = z18 ? 1 : 0;
            c6749x237baa80.f140785m = i18;
            c6749x237baa80.L = j17;
            c6749x237baa80.M = i19;
            c6749x237baa80.f140795w = i27;
            hashMap.put(str, c6749x237baa80);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoDownloadReporter", "initStruct >> add finish " + str);
        }
        return jz5.f0.f384359a;
    }
}
