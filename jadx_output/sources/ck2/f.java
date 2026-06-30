package ck2;

/* loaded from: classes10.dex */
public final class f implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck2.o f42412d;

    public f(ck2.o oVar) {
        this.f42412d = oVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        r45.g02 g02Var = (r45.g02) obj;
        ck2.o oVar = this.f42412d;
        com.tencent.mars.xlog.Log.i(oVar.f42433m, "lotteryMetaInfo collect value " + g02Var);
        oVar.g7(g02Var);
        return jz5.f0.f302826a;
    }
}
