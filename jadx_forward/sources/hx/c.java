package hx;

/* loaded from: classes7.dex */
public final class c implements com.p314xaae8f345.p3133xd0ce8b26.mm.biz.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hx.e f367132a;

    public c(hx.e eVar) {
        this.f367132a = eVar;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.mm.biz.y
    /* renamed from: complete */
    public final void mo118822xdc453139(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiManulResort", " onWechatIntoActive requestAdFetchingWithResortAsync =" + z17);
        hx.e eVar = this.f367132a;
        yz5.l s17 = eVar.s();
        lc3.a0 a0Var = new lc3.a0();
        a0Var.put("result", z17);
        eVar.m(a0Var);
        s17.mo146xb9724478(a0Var);
    }
}
