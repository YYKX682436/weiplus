package ck2;

/* loaded from: classes10.dex */
public final class h implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck2.o f42415d;

    public h(ck2.o oVar) {
        this.f42415d = oVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        r45.f02 f02Var = (r45.f02) obj;
        ck2.o oVar = this.f42415d;
        com.tencent.mars.xlog.Log.i(oVar.f42433m, "joinLiveLotteryInfo collect value " + f02Var);
        if (f02Var != null) {
            oVar.Z6(f02Var);
        }
        return jz5.f0.f302826a;
    }
}
