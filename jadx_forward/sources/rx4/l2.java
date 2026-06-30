package rx4;

/* loaded from: classes3.dex */
public final class l2 implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.n2 f482760d;

    public l2(rx4.n2 n2Var) {
        this.f482760d = n2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public final void w2(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "onKeyboardHeight height:" + i17 + " isResized:" + z17);
        j75.f Q6 = this.f482760d.Q6();
        if (Q6 != null) {
            Q6.B3(new wu4.a(i17, z17));
        }
    }
}
