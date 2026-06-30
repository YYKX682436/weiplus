package uf;

/* loaded from: classes7.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.o0 f508560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f508561e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(uf.o0 o0Var, boolean z17) {
        super(2);
        this.f508560d = o0Var;
        this.f508561e = z17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        x91.h hVar = (x91.h) obj;
        ((java.lang.Number) obj2).intValue();
        uf.o0 o0Var = this.f508560d;
        if (hVar == null) {
            o0Var.f508592b.j(false);
            uf.c2 c2Var = o0Var.f508596f;
            if (c2Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectDeviceBottomSheet");
                throw null;
            }
            c2Var.f508543w = null;
            c2Var.f();
        } else {
            o0Var.f508601k = uf.a.f508492f;
            o0Var.f508592b.j(true);
            if (this.f508561e) {
                uf.c2 c2Var2 = o0Var.f508596f;
                if (c2Var2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectDeviceBottomSheet");
                    throw null;
                }
                c2Var2.f();
            }
        }
        return jz5.f0.f384359a;
    }
}
