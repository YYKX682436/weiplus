package fr5;

/* loaded from: classes3.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr5.f0 f347555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f347556e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(fr5.f0 f0Var, android.view.View view) {
        super(1);
        this.f347555d = f0Var;
        this.f347556e = view;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.MotionEvent e17 = (android.view.MotionEvent) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        this.f347555d.getClass();
        return java.lang.Boolean.valueOf(this.f347556e.performClick());
    }
}
