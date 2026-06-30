package lt3;

/* loaded from: classes10.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f402786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f402787e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.de f402788f;

    public l(android.content.Context context, android.view.ViewGroup viewGroup, r45.de deVar) {
        this.f402786d = context;
        this.f402787e = viewGroup;
        this.f402788f = deVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lt3.n nVar = lt3.n.f402793a;
        r45.de it = this.f402788f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "$it");
        zu3.a0 a0Var = new zu3.a0(it);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mix_background.VideoEditStorageUtil", "fake story reshow the text item view");
        if (!android.text.TextUtils.isEmpty(a0Var.f557297g)) {
            zu3.c0 c0Var = new zu3.c0(this.f402786d);
            this.f402787e.addView(c0Var, new android.widget.RelativeLayout.LayoutParams(-1, -1));
            c0Var.m179526x765074af(a0Var);
            c0Var.m179525xa21f74c8(a0Var.f557296f);
            c0Var.m179517xcfebc441(zu3.e.f557332h);
        }
    }
}
