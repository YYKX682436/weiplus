package gl4;

/* loaded from: classes11.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gl4.z f354377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f354378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f354379f;

    public b(gl4.z zVar, android.content.Context context, yz5.l lVar) {
        this.f354377d = zVar;
        this.f354378e = context;
        this.f354379f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f354378e;
        yz5.l lVar = this.f354379f;
        gl4.z zVar = this.f354377d;
        jm4.c2 c2Var = (jm4.c2) ((jz5.n) zVar.f354432a).mo141623x754a37bb();
        if (c2Var != null) {
            gl4.c cVar = new gl4.c(false, true, zVar, context, lVar);
            jm4.x1 x1Var = new jm4.x1();
            x1Var.f381979i = cVar;
            p3380x6a61f93.p3381xf512d0a5.C30485x21b88584.m169273x21b17dfc(((jm4.d2) c2Var).m105978x2737f10(), true, x1Var);
        }
    }
}
