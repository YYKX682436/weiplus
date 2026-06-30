package g75;

/* loaded from: classes11.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g75.f0 f350883d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(g75.f0 f0Var) {
        super(1);
        this.f350883d = f0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        g75.z state = (g75.z) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof g75.w)) {
            g75.f0 f0Var = this.f350883d;
            if (f0Var.f350898c == null) {
                java.lang.Class b17 = d75.b.b(f0Var.getClass(), 0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(b17, "null cannot be cast to non-null type java.lang.Class<InAction of com.tencent.mm.sdk.pipeline.ProcessorPipelineComponent>");
                f0Var.f350898c = b17;
            }
            if (f0Var.f350899d == null) {
                java.lang.Class b18 = d75.b.b(f0Var.getClass(), 1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(b18, "null cannot be cast to non-null type java.lang.Class<OutAction of com.tencent.mm.sdk.pipeline.ProcessorPipelineComponent>");
                f0Var.f350899d = b18;
            }
        }
        return jz5.f0.f384359a;
    }
}
