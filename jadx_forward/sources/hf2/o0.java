package hf2;

/* loaded from: classes5.dex */
public final class o0 implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.y0 f362662d;

    public o0(hf2.y0 y0Var) {
        this.f362662d = y0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public final void w2(int i17, boolean z17) {
        android.view.View view;
        hf2.y0 y0Var = this.f362662d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(y0Var.f362734b, "onKeyboardHeightChanged, height:" + i17 + ", isResized:" + z17 + ",editing:" + y0Var.f362733a.F);
        hf2.x xVar = y0Var.f362733a;
        if (!xVar.F || (view = y0Var.f362737e) == null) {
            return;
        }
        int c17 = i17 + com.p314xaae8f345.mm.ui.bl.c(xVar.N6());
        if (c17 < 0) {
            c17 = 0;
        }
        view.setPadding(0, 0, 0, c17);
    }
}
