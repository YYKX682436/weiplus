package rx4;

/* loaded from: classes8.dex */
public final class y1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.h2 f482874d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(rx4.h2 h2Var) {
        super(0);
        this.f482874d = h2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rx4.h2 h2Var = this.f482874d;
        float f17 = h2Var.m158354x19263085().getResources().getDisplayMetrics().density;
        android.widget.ScrollView scrollView = h2Var.f482707p;
        if (scrollView != null) {
            rx4.h2.T6(h2Var, scrollView, f17);
            scrollView.post(new rx4.x1(h2Var, scrollView, f17));
        }
        return jz5.f0.f384359a;
    }
}
