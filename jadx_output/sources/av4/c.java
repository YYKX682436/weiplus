package av4;

/* loaded from: classes.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qu4.e f14267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14268e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14269f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14270g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f14271h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14272i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14273m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14274n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ nw4.g f14275o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14276p;

    public c(qu4.e eVar, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, java.lang.String str4, java.lang.String str5, java.lang.String str6, nw4.g gVar, java.lang.String str7) {
        this.f14267d = eVar;
        this.f14268e = str;
        this.f14269f = str2;
        this.f14270g = str3;
        this.f14271h = j17;
        this.f14272i = str4;
        this.f14273m = str5;
        this.f14274n = str6;
        this.f14275o = gVar;
        this.f14276p = str7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f14276p;
        nw4.g gVar = this.f14275o;
        try {
            if (((pu4.a) this.f14267d).Bi(this.f14268e, this.f14269f, this.f14270g, this.f14271h, this.f14272i, this.f14273m, this.f14274n)) {
                gVar.e(str, "addOrUpdateAiHistoryMsg:ok", null);
            } else {
                gVar.e(str, "addOrUpdateAiHistoryMsg:fail", null);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddOrUpdateAiHistoryMsgJsApi", "insertOrReplaceMessage failed: " + e17);
            gVar.e(str, "addOrUpdateAiHistoryMsg:fail", null);
        }
    }
}
