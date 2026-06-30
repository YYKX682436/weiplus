package g20;

/* loaded from: classes8.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g20.g f349302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.n9 f349303e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f349304f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f349305g;

    public f(g20.g gVar, bw5.n9 n9Var, java.lang.String str, java.lang.String str2) {
        this.f349302d = gVar;
        this.f349303e = n9Var;
        this.f349304f = str;
        this.f349305g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x02.h Bi = this.f349302d.Bi();
        if (Bi != null) {
            bw5.n9 preloadTiming = this.f349303e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preloadTiming, "preloadTiming");
            java.lang.String reddotId = this.f349304f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reddotId, "reddotId");
            java.lang.String reddotByPass = this.f349305g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reddotByPass, "reddotByPass");
            p3380x6a61f93.p3384xf5161200.C30567x21b1f1a0.m169977x21b9f6b7(((x02.i) Bi).m105978x2737f10(), preloadTiming.f112099d, reddotId, reddotByPass);
        }
    }
}
