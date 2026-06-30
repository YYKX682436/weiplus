package bk5;

/* loaded from: classes10.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f103201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f103202e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f103203f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.CharSequence charSequence, int i17) {
        super(0);
        this.f103201d = h0Var;
        this.f103202e = charSequence;
        this.f103203f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.app.Activity activity;
        java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
        if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
            java.lang.ref.WeakReference j17 = com.p314xaae8f345.mm.app.w.INSTANCE.j();
            activity = j17 != null ? (android.app.Activity) j17.get() : null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f103201d;
        h0Var.f391656d = activity;
        if (activity == null) {
            h0Var.f391656d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeToastStarter", "snackBarMsgReceiver1 msgReceiver topActivity:%s", h0Var.f391656d);
        android.content.Context context = (android.content.Context) h0Var.f391656d;
        int i17 = com.p314xaae8f345.mm.ui.p2739x6969627.C22494x95d1448a.f291491a;
        if (context != null) {
            int i18 = al5.u4.f87591t;
            al5.t4 t4Var = new al5.t4(context);
            t4Var.f87575e = this.f103202e;
            t4Var.e(this.f103203f);
            t4Var.g();
        }
        return jz5.f0.f384359a;
    }
}
