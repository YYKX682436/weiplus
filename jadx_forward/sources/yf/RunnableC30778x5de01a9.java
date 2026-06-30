package yf;

/* renamed from: yf.i0$$p */
/* loaded from: classes7.dex */
public final /* synthetic */ class RunnableC30778x5de01a9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f542930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f542931e;

    public /* synthetic */ RunnableC30778x5de01a9(yf.i0 i0Var, java.lang.String str) {
        this.f542930d = i0Var;
        this.f542931e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yf.i0 i0Var = this.f542930d;
        yf.o oVar = i0Var.f542895i;
        if (oVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(i0Var.x(), "run#operate, adapter is null");
        } else {
            oVar.h(this.f542931e, null);
        }
    }
}
