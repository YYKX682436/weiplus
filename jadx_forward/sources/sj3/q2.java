package sj3;

/* loaded from: classes14.dex */
public final class q2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.g3 f490241d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(sj3.g3 g3Var) {
        super(0);
        this.f490241d = g3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sj3.g3 g3Var = this.f490241d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = g3Var.f490053a;
        android.view.View h17 = g3Var.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "access$getMultitalkScreenProjectorAction(...)");
        android.view.View g17 = g3Var.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "access$getMultiScreenProjectRedDot(...)");
        return new rj3.a(serviceConnectionC16581x3d1d6bd2, h17, "screenShare", g17);
    }
}
