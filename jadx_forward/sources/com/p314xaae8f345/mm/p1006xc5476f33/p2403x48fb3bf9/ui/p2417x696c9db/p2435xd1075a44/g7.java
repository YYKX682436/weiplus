package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
final class g7 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private g7() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        int i17 = ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2) obj).f149937d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewBagService", "ipc invoke:%d", java.lang.Integer.valueOf(i17));
        if (i17 == 1) {
            if (i95.n0.c(dx4.e.class) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewBagService", "doOp ServiceManager.getService(IWebViewBagService.class) null");
                return;
            }
            gx4.w wVar = (gx4.w) ((dx4.e) i95.n0.c(dx4.e.class));
            wVar.getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new gx4.u(wVar));
            return;
        }
        if (i17 != 2) {
            return;
        }
        if (i95.n0.c(dx4.e.class) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewBagService", "doOp ServiceManager.getService(IWebViewBagService.class) null");
            return;
        }
        gx4.w wVar2 = (gx4.w) ((dx4.e) i95.n0.c(dx4.e.class));
        wVar2.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new gx4.v(wVar2));
    }
}
