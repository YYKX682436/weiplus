package vr;

/* loaded from: classes8.dex */
public final class n implements com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vr.q f520950a;

    public n(vr.q qVar) {
        this.f520950a = qVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void a(java.lang.String str) {
        vr.q qVar = this.f520950a;
        int i17 = qVar.f520954e;
        if (str == null) {
            str = "";
        }
        ym5.a1.f(new vr.k(qVar, str));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void b() {
        vr.q qVar = this.f520950a;
        int i17 = qVar.f520954e;
        ym5.a1.f(new vr.l(qVar));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void c(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmoticonBoardNativeView", "onTextOp onToSendTextEnable viewId=" + this.f520950a.f520954e + " enable=" + z17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void d() {
        vr.q qVar = this.f520950a;
        int i17 = qVar.f520954e;
        ym5.a1.f(new vr.m(qVar));
    }
}
