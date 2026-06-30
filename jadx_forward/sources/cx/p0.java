package cx;

/* loaded from: classes7.dex */
public final class p0 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cx.w0 f305986a;

    public p0(cx.w0 w0Var) {
        this.f305986a = w0Var;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onEnterForeground */
    public void mo8896x832bee5c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrandBaseBiz", "run pending exceptionListener");
        cx.w0 w0Var = this.f305986a;
        w0Var.getClass();
        ((je3.i) i95.n0.c(je3.i.class)).Sc("MagicBrandDisconnectWhenAttach", 1, w0Var.O0(), 1.0f);
        yz5.a aVar = w0Var.B;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4678x1d1a4af6.f19964x4fbc8495.mo40976xa01141ab(this);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onExitForeground */
    public void mo8897xa55158c0() {
    }
}
