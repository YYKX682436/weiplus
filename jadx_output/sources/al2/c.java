package al2;

/* loaded from: classes3.dex */
public final class c implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ al2.f f5827a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.z42 f5828b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f5829c;

    public c(al2.f fVar, r45.z42 z42Var, yz5.l lVar) {
        this.f5827a = fVar;
        this.f5828b = z42Var;
        this.f5829c = lVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        yz5.l lVar = this.f5829c;
        al2.f fVar2 = this.f5827a;
        if (i17 == 0 && fVar.f70616b == 0) {
            fVar2.f5837d.remove(this.f5828b);
            if (lVar == null) {
                fVar2.f5836c.postValue(new al2.g(fVar.f70616b, 3, null, this.f5828b, null, null, 48, null));
            } else {
                lVar.invoke(java.lang.Boolean.TRUE);
            }
            al2.h.a(fVar2, null, 1, null);
        } else if (lVar == null) {
            fVar2.f5836c.postValue(new al2.g(fVar.f70616b, 3, null, null, null, fVar.f70617c, 28, null));
        } else {
            lVar.invoke(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f302826a;
    }
}
