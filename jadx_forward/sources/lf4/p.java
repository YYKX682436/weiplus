package lf4;

/* loaded from: classes4.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.b0 f399988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f399989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f399990f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(lf4.b0 b0Var, int i17, java.util.ArrayList arrayList) {
        super(0);
        this.f399988d = b0Var;
        this.f399989e = i17;
        this.f399990f = arrayList;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        lf4.b0 b0Var = this.f399988d;
        sf4.a1 a1Var = (sf4.a1) b0Var.f399888e;
        int i17 = this.f399989e;
        a1Var.h(i17, this.f399990f);
        lf4.h hVar = b0Var.f399888e;
        ((sf4.a1) hVar).c(i17);
        ((sf4.a1) hVar).d();
        return jz5.f0.f384359a;
    }
}
