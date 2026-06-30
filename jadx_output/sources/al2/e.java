package al2;

/* loaded from: classes3.dex */
public final class e implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ al2.f f5832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f5833b;

    public e(al2.f fVar, java.lang.Runnable runnable) {
        this.f5832a = fVar;
        this.f5833b = runnable;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        jz5.f0 f0Var = jz5.f0.f302826a;
        al2.f fVar2 = this.f5832a;
        if (i17 != 0 || fVar.f70616b != 0) {
            fVar2.f5836c.postValue(new al2.g(fVar.f70616b, 1, null, null, null, fVar.f70617c, 28, null));
            return f0Var;
        }
        java.util.LinkedList list = ((r45.jg1) fVar.f70618d).getList(1);
        kotlin.jvm.internal.o.f(list, "getPromote_info_list(...)");
        fVar2.f5837d = list;
        fVar2.f5836c.postValue(new al2.g(fVar.f70616b, 1, new java.util.LinkedList(fVar2.f5837d), null, (r45.jg1) fVar.f70618d, null, 32, null));
        java.lang.Runnable runnable = this.f5833b;
        if (runnable == null) {
            return null;
        }
        pm0.v.W(runnable);
        return f0Var;
    }
}
