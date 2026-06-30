package yf5;

/* loaded from: classes11.dex */
public final class s0 implements xm3.m0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf5.w0 f543483d;

    public s0(yf5.w0 w0Var) {
        this.f543483d = w0Var;
    }

    @Override // xm3.m0
    public void k(xm3.o0 pendingData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pendingData, "pendingData");
        yf5.w0 w0Var = this.f543483d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w0Var.f543511g, "onUpdateAdapter notifyDataSetChanged");
        if (w0Var.f543512h != null) {
            w0Var.notifyDataSetChanged();
        }
    }
}
