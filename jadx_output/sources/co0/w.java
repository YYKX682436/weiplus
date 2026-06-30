package co0;

/* loaded from: classes10.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ co0.y f43741d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(co0.y yVar) {
        super(0);
        this.f43741d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        co0.y yVar = this.f43741d;
        if (yVar.f43744b == co0.u.f43738e) {
            yVar.f43744b = co0.u.f43739f;
            com.tencent.mars.xlog.Log.i("VisitorPauseStateManager", "executeRealPause");
            co0.v vVar = yVar.f43743a;
            if (vVar != null) {
                com.tencent.mars.xlog.Log.i("BaseLiveTXPlayer", "onExecuteRealPause");
                mn0.c cVar = mn0.c.f329703f;
                mn0.y yVar2 = ((mn0.j) vVar).f329761a;
                yVar2.H(false, cVar);
                yVar2.E();
                yVar2.p().stopPlay(false);
            }
        } else {
            com.tencent.mars.xlog.Log.w("VisitorPauseStateManager", "timeout callback: ignore, currentState=" + yVar.f43744b);
        }
        return jz5.f0.f302826a;
    }
}
