package ht2;

/* loaded from: classes2.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.r6 f366413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ht2.y0 f366414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f366415f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(zy2.r6 r6Var, ht2.y0 y0Var, yz5.l lVar) {
        super(2);
        this.f366413d = r6Var;
        this.f366414e = y0Var;
        this.f366415f = lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.widget.TextView textView = (android.widget.TextView) obj;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 floatIv = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(floatIv, "floatIv");
        if (textView != null) {
            textView.setAlpha(0.0f);
        }
        zy2.r6 r6Var = this.f366413d;
        r6Var.getClass();
        this.f366414e.Di(floatIv, r6Var);
        this.f366415f.mo146xb9724478(uw2.h0.f(uw2.h0.f513207a, floatIv, 1.4f, r6Var.f559092j, true, 0.0f, 0L, 0L, 0L, 240, null));
        return jz5.f0.f384359a;
    }
}
