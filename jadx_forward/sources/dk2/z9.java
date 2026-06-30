package dk2;

/* loaded from: classes.dex */
public final class z9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f315960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.ca f315961e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f315962f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f315963g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f315964h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ dk2.t9 f315965i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(int i17, dk2.ca caVar, java.util.List list, int i18, java.util.List list2, dk2.t9 t9Var) {
        super(1);
        this.f315960d = i17;
        this.f315961e = caVar;
        this.f315962f = list;
        this.f315963g = i18;
        this.f315964h = list2;
        this.f315965i = t9Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String errorMsg = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMsg, "errorMsg");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downloadVideosSequentially: download failed at index ");
        int i17 = this.f315960d;
        sb6.append(i17);
        sb6.append(", error=");
        sb6.append(errorMsg);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveKTVReplayDownloadManager", sb6.toString());
        this.f315961e.b(this.f315962f, i17 + 1, this.f315963g, this.f315964h, this.f315965i);
        return jz5.f0.f384359a;
    }
}
