package cj5;

/* loaded from: classes.dex */
public final class b2 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.l2 f42074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.i0 f42075e;

    public b2(cj5.l2 l2Var, wi5.i0 i0Var) {
        this.f42074d = l2Var;
        this.f42075e = i0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ym3.o oVar = (ym3.o) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactMainRecycleViewUIC", "loadStateSharedFlow loadState:" + oVar.f463177a);
        if (oVar.f463177a == ym3.p.f463179d) {
            cj5.l2 l2Var = this.f42074d;
            l2Var.Y6().k().post(new cj5.a2(this.f42075e, l2Var));
        }
        return jz5.f0.f302826a;
    }
}
