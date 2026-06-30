package c23;

/* loaded from: classes.dex */
public final class g implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c23.m f119567d;

    public g(c23.m mVar) {
        this.f119567d = mVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public final void w2(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSHotSearchUIC", "onKeyboardHeight height:" + i17 + " isResized:" + z17);
        c23.m mVar = this.f119567d;
        ((d23.h) ((jz5.n) mVar.f119578f).mo141623x754a37bb()).f307431e = i17;
        j75.f Q6 = mVar.Q6();
        if (Q6 != null) {
            Q6.B3(new b23.c(i17));
        }
    }
}
