package gg1;

/* loaded from: classes7.dex */
public final class r0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f353155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f353156e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(gg1.c1 c1Var, boolean z17) {
        super(2);
        this.f353155d = c1Var;
        this.f353156e = z17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        x91.h hVar = (x91.h) obj;
        ((java.lang.Number) obj2).intValue();
        gg1.c1 c1Var = this.f353155d;
        if (hVar == null) {
            ((fg1.g) c1Var.f353069b).d(false);
            gg1.w wVar = c1Var.f353073f;
            if (wVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectDeviceBottomSheet");
                throw null;
            }
            wVar.f353182v = null;
            wVar.e();
        } else {
            ((fg1.g) c1Var.f353069b).d(true);
            yz5.a aVar = c1Var.f353075h;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
            gg1.k1 k1Var = c1Var.f353072e;
            k1Var.getClass();
            ((b06.b) k1Var.f353123c).a(k1Var, gg1.k1.f353120k[0], hVar);
            c1Var.f353071d = 3;
            if (this.f353156e) {
                ik1.h0.b(new gg1.q0(c1Var));
            }
        }
        return jz5.f0.f384359a;
    }
}
