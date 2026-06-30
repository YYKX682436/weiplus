package bd2;

/* loaded from: classes2.dex */
public final class l implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f19266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f19267b;

    public l(yz5.l lVar, yz5.a aVar) {
        this.f19266a = lVar;
        this.f19267b = aVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        r45.vw0 vw0Var = (r45.vw0) fVar.f70618d;
        int i17 = fVar.f70616b;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0 && fVar.f70615a == 0) {
            yz5.l lVar = this.f19266a;
            if (lVar != null) {
                java.util.LinkedList list = vw0Var.getList(2);
                kotlin.jvm.internal.o.f(list, "getNot_interested_wording_list(...)");
                lVar.invoke(list);
                return f0Var;
            }
        } else {
            yz5.a aVar = this.f19267b;
            if (aVar != null) {
                aVar.invoke();
                return f0Var;
            }
        }
        return null;
    }
}
