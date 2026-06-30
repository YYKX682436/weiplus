package lt3;

/* loaded from: classes10.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f402780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f402781e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.de f402782f;

    public j(android.content.Context context, android.view.ViewGroup viewGroup, r45.de deVar) {
        this.f402780d = context;
        this.f402781e = viewGroup;
        this.f402782f = deVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lt3.n nVar = lt3.n.f402793a;
        r45.de it = this.f402782f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "$it");
        zu3.j jVar = new zu3.j(it);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mix_background.VideoEditStorageUtil", "fake story reshow the emoji item view");
        zu3.l lVar = new zu3.l(this.f402780d);
        this.f402781e.addView(lVar, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        lVar.f557354y = true;
        lVar.m179537xa21f74c8(jVar.f557344h);
        lVar.m43712xc040f7d2(jVar.f557343g);
        lVar.m64933xc84dc82d();
    }
}
