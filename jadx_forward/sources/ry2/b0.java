package ry2;

/* loaded from: classes8.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry2.q0 f482901d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ry2.q0 q0Var) {
        super(0);
        this.f482901d = q0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f482901d.f482988w;
        if (view != null) {
            view.setEnabled(true);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectCoverView");
        throw null;
    }
}
