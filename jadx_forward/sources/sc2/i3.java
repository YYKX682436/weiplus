package sc2;

/* loaded from: classes2.dex */
public final class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.m3 f487498e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f487499f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487500g;

    public i3(in5.s0 s0Var, sc2.m3 m3Var, android.widget.ImageView imageView, android.view.View view) {
        this.f487497d = s0Var;
        this.f487498e = m3Var;
        this.f487499f = imageView;
        this.f487500g = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sc2.e3 e3Var = sc2.m3.A;
        in5.s0 s0Var = this.f487497d;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        int c17 = com.p314xaae8f345.mm.ui.bl.c(s0Var.f374654e);
        int b17 = e3Var.b(context);
        sc2.m3.B[b17] = c17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedJumperBubbleObserver", "[setNavigationBarHeight] index:" + b17 + " navigationBarHeight:" + c17 + ", translationY");
        android.widget.ImageView imageView = this.f487499f;
        sc2.m3 m3Var = this.f487498e;
        sc2.m3.G(m3Var, s0Var, imageView, "showRedPacketCoverBg");
        m3Var.M(s0Var, this.f487500g, false, "showRedPacketCoverBg");
    }
}
