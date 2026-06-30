package fh1;

/* loaded from: classes7.dex */
public final class u0 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fh1.x0 f344139a;

    public u0(fh1.x0 x0Var) {
        this.f344139a = x0Var;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onEnterForeground */
    public void mo8896x832bee5c() {
        fh1.x0 x0Var = this.f344139a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x0Var.A, "run pending exceptionListener");
        yz5.a aVar = x0Var.F;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40976xa01141ab(this);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onExitForeground */
    public void mo8897xa55158c0() {
    }
}
