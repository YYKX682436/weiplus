package xt2;

/* loaded from: classes3.dex */
public final class j2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f538360d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(xt2.e3 e3Var) {
        super(0);
        this.f538360d = e3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        xt2.e3 e3Var = this.f538360d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e3Var.f538239h, "subsidy onExitStart: promoteGroup alpha 0→1 (sync with bg shrink, 500ms)");
        android.widget.LinearLayout linearLayout = e3Var.f538256z;
        linearLayout.animate().cancel();
        linearLayout.setAlpha(0.0f);
        linearLayout.animate().alpha(1.0f).setDuration(500L).start();
        return jz5.f0.f384359a;
    }
}
