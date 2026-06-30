package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class m9 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.b4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja f282733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta f282734e;

    public m9(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja jaVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar) {
        this.f282733d = jaVar;
        this.f282734e = taVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.b4
    public final void k(int i17, int i18) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar = this.f282734e;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja jaVar = this.f282733d;
        if (i17 == 701) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Imagegallery.handler.video.tp", "on buffering start");
            jaVar.J(taVar);
        } else {
            if (i17 != 702) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Imagegallery.handler.video.tp", "on buffering end");
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja.E(jaVar, taVar);
        }
    }
}
