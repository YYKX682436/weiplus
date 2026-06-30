package lt3;

/* loaded from: classes10.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.hi0 f402789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.de f402790e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f402791f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f402792g;

    public m(r45.hi0 hi0Var, r45.de deVar, android.content.Context context, android.view.ViewGroup viewGroup) {
        this.f402789d = hi0Var;
        this.f402790e = deVar;
        this.f402791f = context;
        this.f402792g = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.hi0 hi0Var = this.f402789d;
        long j17 = hi0Var.f457715f - hi0Var.f457714e;
        r45.de it = this.f402790e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "$it");
        zu3.t tVar = new zu3.t(it);
        tVar.i(j17);
        lt3.n nVar = lt3.n.f402793a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mix_background.VideoEditStorageUtil", "fake story reshow the position item view");
        zu3.v vVar = new zu3.v(this.f402791f);
        this.f402792g.addView(vVar, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        vVar.R = tVar;
        vVar.m179585xa21f74c8(tVar.f557296f);
        vVar.q(tVar.f557363g);
        vVar.c();
        vVar.I = zu3.e.f557333i;
    }
}
