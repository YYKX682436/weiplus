package dr4;

/* loaded from: classes14.dex */
public final class a2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.d2 f324124d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(dr4.d2 d2Var) {
        super(0);
        this.f324124d = d2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        pq4.c l17 = gq4.v.Bi().l("CAMERA");
        rs0.h hVar = l17 != null ? l17.f439216d : null;
        dr4.d2 d2Var = this.f324124d;
        d2Var.f324218k = hVar;
        d2Var.f324219l = new dr4.r0(d2Var.f324221n, d2Var.f324222o, 0, 0, 0, 2, true, 24, null);
        return jz5.f0.f384359a;
    }
}
