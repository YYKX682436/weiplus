package b92;

/* loaded from: classes10.dex */
public final class q1 extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b92.v1 f18505a;

    public q1(b92.v1 v1Var) {
        this.f18505a = v1Var;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        com.tencent.mars.xlog.Log.i("FinderLiveDNSParseService", "onEnterForeground: ");
        pm0.v.X(new b92.o1(this.f18505a));
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        com.tencent.mars.xlog.Log.i("FinderLiveDNSParseService", "onExitForeground: ");
        pm0.v.X(new b92.p1(this.f18505a));
    }
}
