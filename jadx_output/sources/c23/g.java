package c23;

/* loaded from: classes.dex */
public final class g implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c23.m f38034d;

    public g(c23.m mVar) {
        this.f38034d = mVar;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public final void w2(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSHotSearchUIC", "onKeyboardHeight height:" + i17 + " isResized:" + z17);
        c23.m mVar = this.f38034d;
        ((d23.h) ((jz5.n) mVar.f38045f).getValue()).f225898e = i17;
        j75.f Q6 = mVar.Q6();
        if (Q6 != null) {
            Q6.B3(new b23.c(i17));
        }
    }
}
