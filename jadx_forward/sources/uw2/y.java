package uw2;

/* loaded from: classes2.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f513251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f513252e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f513253f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(java.util.List list, android.view.ViewGroup viewGroup, in5.s0 s0Var) {
        super(0);
        this.f513251d = list;
        this.f513252e = viewGroup;
        this.f513253f = s0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.List list = this.f513251d;
        android.view.View view = (android.view.View) list.get(2);
        uw2.h0 h0Var = uw2.h0.f513207a;
        if (view != null) {
            this.f513252e.getGlobalVisibleRect(new android.graphics.Rect());
            h0Var.d(view);
        }
        android.view.View view2 = (android.view.View) list.get(1);
        if (view2 != null) {
            h0Var.b(view2, (r14 & 2) != 0 ? 150L : 150L, (r14 & 4) != 0 ? 150L : 0L);
        }
        android.view.View view3 = (android.view.View) list.get(0);
        if (view3 != null) {
            h0Var.b(view3, 170L, 170L);
        }
        java.lang.Object systemService = this.f513253f.f374654e.getSystemService("vibrator");
        if (systemService instanceof android.os.Vibrator) {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                ((android.os.Vibrator) systemService).vibrate(android.os.VibrationEffect.createOneShot(10L, 255));
            } else {
                ((android.os.Vibrator) systemService).vibrate(10L);
            }
        }
        return jz5.f0.f384359a;
    }
}
