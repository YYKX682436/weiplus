package lf4;

/* loaded from: classes4.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.b0 f399981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f399982e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(lf4.b0 b0Var, int i17) {
        super(0);
        this.f399981d = b0Var;
        this.f399982e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        lf4.b0 b0Var = this.f399981d;
        java.util.List list = b0Var.f399894n;
        int i17 = this.f399982e;
        list.remove(i17);
        ((sf4.a1) b0Var.f399888e).a(i17);
        return jz5.f0.f384359a;
    }
}
