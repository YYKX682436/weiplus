package bk5;

/* loaded from: classes.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f103198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f103199e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f103200f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.Integer num, java.lang.CharSequence charSequence) {
        super(0);
        this.f103198d = h0Var;
        this.f103199e = num;
        this.f103200f = charSequence;
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
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f103198d;
        h0Var.f391656d = activity;
        if (activity == null) {
            h0Var.f391656d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeToastStarter", "msgReceiver topActivity:%s", h0Var.f391656d);
        java.lang.Integer num = this.f103199e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
        int intValue = num.intValue();
        java.lang.CharSequence charSequence = this.f103200f;
        if (intValue > 0 && charSequence != null) {
            android.content.Context context = (android.content.Context) h0Var.f391656d;
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.f293309c = charSequence;
            e4Var.b(num.intValue());
            e4Var.c();
        } else if (charSequence != null) {
            android.content.Context context2 = (android.content.Context) h0Var.f391656d;
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context2);
            e4Var2.f293309c = charSequence;
            e4Var2.c();
        }
        return jz5.f0.f384359a;
    }
}
