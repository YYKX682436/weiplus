package go0;

/* loaded from: classes14.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public int f355374a;

    /* renamed from: b, reason: collision with root package name */
    public go0.c f355375b;

    /* renamed from: c, reason: collision with root package name */
    public os0.d f355376c;

    /* renamed from: d, reason: collision with root package name */
    public int f355377d;

    /* renamed from: e, reason: collision with root package name */
    public int f355378e;

    /* renamed from: f, reason: collision with root package name */
    public int f355379f;

    /* renamed from: g, reason: collision with root package name */
    public int f355380g;

    /* renamed from: h, reason: collision with root package name */
    public int f355381h;

    /* renamed from: i, reason: collision with root package name */
    public int f355382i;

    /* renamed from: j, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f355383j;

    /* renamed from: k, reason: collision with root package name */
    public long f355384k;

    public s1(java.lang.String userId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userId, "userId");
        this.f355374a = 1;
        this.f355377d = 2;
        this.f355383j = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("LiveVisitorRendererCounter", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new go0.r1(this), true);
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorRenderer", "queue release");
        go0.c cVar = this.f355375b;
        if (cVar != null) {
            cVar.n();
        }
        this.f355375b = null;
        os0.d dVar = this.f355376c;
        if (dVar != null) {
            dVar.n();
        }
        this.f355376c = null;
        this.f355383j.d();
    }
}
