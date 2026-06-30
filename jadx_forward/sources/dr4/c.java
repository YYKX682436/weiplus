package dr4;

/* loaded from: classes14.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.h f324130d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(dr4.h hVar) {
        super(1);
        this.f324130d = hVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.nio.ByteBuffer data = (java.nio.ByteBuffer) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        dr4.h hVar = this.f324130d;
        dr4.r1 r1Var = hVar.f324219l;
        if (r1Var != null) {
            dr4.h.o(hVar, data, r1Var.f429548x, r1Var.f429549y, false);
        }
        return jz5.f0.f384359a;
    }
}
