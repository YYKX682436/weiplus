package al2;

/* loaded from: classes3.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ al2.f f5821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f5822e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f5823f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(al2.f fVar, com.tencent.mm.modelbase.f fVar2, yz5.l lVar) {
        super(0);
        this.f5821d = fVar;
        this.f5822e = fVar2;
        this.f5823f = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.lifecycle.j0 j0Var = this.f5821d.f5836c;
        com.tencent.mm.modelbase.f fVar = this.f5822e;
        j0Var.postValue(new al2.g(fVar.f70616b, 2, null, null, null, fVar.f70617c, 16, null));
        yz5.l lVar = this.f5823f;
        if (lVar != null) {
            lVar.invoke(-1L);
        }
        return jz5.f0.f302826a;
    }
}
