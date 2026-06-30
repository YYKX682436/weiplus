package dk2;

/* loaded from: classes.dex */
public final class y9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f315912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f315913e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.ca f315914f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f315915g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f315916h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ dk2.t9 f315917i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315918m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(int i17, java.util.List list, dk2.ca caVar, java.util.List list2, int i18, dk2.t9 t9Var, java.lang.String str) {
        super(1);
        this.f315912d = i17;
        this.f315913e = list;
        this.f315914f = caVar;
        this.f315915g = list2;
        this.f315916h = i18;
        this.f315917i = t9Var;
        this.f315918m = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String filePath = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downloadVideosSequentially: video downloaded, index=");
        int i17 = this.f315912d;
        sb6.append(i17);
        sb6.append(", path=");
        sb6.append(filePath);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVReplayDownloadManager", sb6.toString());
        this.f315913e.add(filePath);
        pm0.v.X(new dk2.x9(this.f315917i, filePath, this.f315918m, this.f315912d, this.f315916h));
        this.f315914f.b(this.f315915g, i17 + 1, this.f315916h, this.f315913e, this.f315917i);
        return jz5.f0.f384359a;
    }
}
