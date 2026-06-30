package mm2;

/* loaded from: classes3.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.u0 f410917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.o92 f410918e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(mm2.u0 u0Var, r45.o92 o92Var) {
        super(0);
        this.f410917d = u0Var;
        this.f410918e = o92Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.o92 o92Var = this.f410918e;
        mm2.u0 u0Var = this.f410917d;
        u0Var.f410981n = o92Var;
        int i17 = u0Var.f410980m + 1;
        u0Var.f410980m = i17;
        if (i17 >= Integer.MAX_VALUE) {
            u0Var.f410980m = 0;
        }
        u0Var.f410979i.mo7808x76db6cb1(java.lang.Integer.valueOf(u0Var.f410980m));
        return jz5.f0.f384359a;
    }
}
