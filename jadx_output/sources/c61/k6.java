package c61;

/* loaded from: classes.dex */
public final class k6 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f39104a;

    public k6(yz5.l lVar) {
        this.f39104a = lVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        yz5.l lVar = this.f39104a;
        if (i17 == 0 && fVar.f70616b == 0) {
            lVar.invoke(java.lang.Boolean.TRUE);
        } else {
            lVar.invoke(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f302826a;
    }
}
