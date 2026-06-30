package b00;

/* loaded from: classes9.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e00.y f16744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b00.r f16745e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f16746f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(e00.y yVar, b00.r rVar, yz5.l lVar) {
        super(1);
        this.f16744d = yVar;
        this.f16745e = rVar;
        this.f16746f = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.x7 x7Var = (bw5.x7) obj;
        e00.y yVar = this.f16744d;
        yVar.f245833d = null;
        b00.r rVar = this.f16745e;
        c00.y2 y2Var = rVar.f16758e;
        java.lang.String key = yVar.getKey();
        kotlin.jvm.internal.o.f(key, "<get-key>(...)");
        ((e00.e) y2Var).b(x7Var, key);
        b00.r.wi(rVar, yVar);
        this.f16746f.invoke(x7Var);
        return jz5.f0.f302826a;
    }
}
