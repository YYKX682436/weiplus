package lt3;

/* loaded from: classes10.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f402783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f402784e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.de f402785f;

    public k(android.content.Context context, android.view.ViewGroup viewGroup, r45.de deVar) {
        this.f402783d = context;
        this.f402784e = viewGroup;
        this.f402785f = deVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lt3.n nVar = lt3.n.f402793a;
        r45.de it = this.f402785f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "$it");
        zu3.s sVar = new zu3.s(it);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mix_background.VideoEditStorageUtil", "fake story reshow the position item view");
        zu3.z zVar = new zu3.z(this.f402783d);
        this.f402784e.addView(zVar, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        zVar.d(sVar);
    }
}
