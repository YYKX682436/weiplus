package h72;

/* loaded from: classes14.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f360967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f360968e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f360969f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f360970g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f360971h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f360972i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f360973m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f360974n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h72.s f360975o;

    public h(h72.s sVar, int i17, int i18, int i19, boolean z17, int i27, int i28, int i29, java.lang.Runnable runnable) {
        this.f360975o = sVar;
        this.f360967d = i17;
        this.f360968e = i18;
        this.f360969f = i19;
        this.f360970g = z17;
        this.f360971h = i27;
        this.f360972i = i28;
        this.f360973m = i29;
        this.f360974n = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        h72.s sVar;
        int i17 = this.f360967d;
        if (i17 == 90 || i17 == 270) {
            this.f360975o.j("MicroMsg.FaceVideoRecorder", "hy: need make width and height upside down", new java.lang.Object[0]);
            h72.s sVar2 = this.f360975o;
            sVar2.f361009j = this.f360968e;
            sVar2.f361010k = this.f360969f;
        } else {
            h72.s sVar3 = this.f360975o;
            sVar3.f361009j = this.f360969f;
            sVar3.f361010k = this.f360968e;
        }
        synchronized (this.f360975o.f361001b) {
            sVar = this.f360975o;
            sVar.f361004e = this.f360967d;
            sVar.f361005f = this.f360970g;
            sVar.f361006g = this.f360971h;
        }
        h72.s.a(sVar);
        h72.s.b(this.f360975o);
        h72.s.c(this.f360975o);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new h72.g(this));
    }
}
