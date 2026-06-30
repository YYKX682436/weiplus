package ch2;

/* loaded from: classes10.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ om2.i f41462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41463e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(om2.i iVar, ch2.o2 o2Var) {
        super(0);
        this.f41462d = iVar;
        this.f41463e = o2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        vn0.e eVar;
        ch2.o2 o2Var = this.f41463e;
        tn0.w0 Q6 = o2Var.Q6();
        this.f41462d.f((Q6 == null || (eVar = Q6.f420764m) == null) ? -1 : eVar.c());
        ah2.b k76 = o2Var.k7();
        if (k76 != null) {
            ((dh2.x) k76).l();
        }
        return jz5.f0.f302826a;
    }
}
