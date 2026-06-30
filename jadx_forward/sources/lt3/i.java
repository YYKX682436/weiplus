package lt3;

/* loaded from: classes10.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f402777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f402778e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.de f402779f;

    public i(android.content.Context context, android.view.ViewGroup viewGroup, r45.de deVar) {
        this.f402777d = context;
        this.f402778e = viewGroup;
        this.f402779f = deVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lt3.n nVar = lt3.n.f402793a;
        r45.de it = this.f402779f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "$it");
        zu3.a0 a0Var = new zu3.a0(it);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mix_background.VideoEditStorageUtil", "fake story reshow the text item view");
        if (!android.text.TextUtils.isEmpty(a0Var.f557297g)) {
            zu3.b0 b0Var = new zu3.b0(this.f402777d);
            this.f402778e.addView(b0Var, new android.widget.RelativeLayout.LayoutParams(-1, -1));
            b0Var.k(a0Var);
        }
    }
}
