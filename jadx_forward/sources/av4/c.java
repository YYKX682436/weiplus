package av4;

/* loaded from: classes.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qu4.e f95800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95801e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95802f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95803g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f95804h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95805i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95806m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95807n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ nw4.g f95808o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95809p;

    public c(qu4.e eVar, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, java.lang.String str4, java.lang.String str5, java.lang.String str6, nw4.g gVar, java.lang.String str7) {
        this.f95800d = eVar;
        this.f95801e = str;
        this.f95802f = str2;
        this.f95803g = str3;
        this.f95804h = j17;
        this.f95805i = str4;
        this.f95806m = str5;
        this.f95807n = str6;
        this.f95808o = gVar;
        this.f95809p = str7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f95809p;
        nw4.g gVar = this.f95808o;
        try {
            if (((pu4.a) this.f95800d).Bi(this.f95801e, this.f95802f, this.f95803g, this.f95804h, this.f95805i, this.f95806m, this.f95807n)) {
                gVar.e(str, "addOrUpdateAiHistoryMsg:ok", null);
            } else {
                gVar.e(str, "addOrUpdateAiHistoryMsg:fail", null);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddOrUpdateAiHistoryMsgJsApi", "insertOrReplaceMessage failed: " + e17);
            gVar.e(str, "addOrUpdateAiHistoryMsg:fail", null);
        }
    }
}
