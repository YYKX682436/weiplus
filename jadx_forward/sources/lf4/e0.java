package lf4;

/* loaded from: classes4.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f399916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lf4.q0 f399917e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(boolean z17, lf4.q0 q0Var) {
        super(0);
        this.f399916d = z17;
        this.f399917e = q0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        lf4.q0 q0Var = this.f399917e;
        boolean z17 = this.f399916d;
        if (z17) {
            int size = q0Var.f399998i.size();
            int i17 = q0Var.f400000n;
            if (i17 >= 0 && i17 < size) {
                java.util.ArrayList arrayList = q0Var.f399998i;
                arrayList.remove(i17);
                lf4.h hVar = q0Var.f399995f;
                ((sf4.a1) hVar).h(0, arrayList);
                ((sf4.a1) hVar).f(0, q0Var.f400000n, 1);
                ((sf4.a1) hVar).d();
            }
        }
        ((sf4.a1) q0Var.f399995f).b(z17);
        q0Var.f400000n = -1;
        return jz5.f0.f384359a;
    }
}
