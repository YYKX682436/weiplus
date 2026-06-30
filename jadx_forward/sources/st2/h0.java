package st2;

/* loaded from: classes3.dex */
public final class h0 implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f493864a;

    public h0(st2.h1 h1Var) {
        this.f493864a = h1Var;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notify visitor shopping fail times:");
        st2.h1 h1Var = this.f493864a;
        sb6.append(h1Var.T);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", sb6.toString());
        h1Var.A();
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        st2.h1 h1Var = this.f493864a;
        h1Var.U = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "notify visitor shopping success times:" + h1Var.T);
    }
}
