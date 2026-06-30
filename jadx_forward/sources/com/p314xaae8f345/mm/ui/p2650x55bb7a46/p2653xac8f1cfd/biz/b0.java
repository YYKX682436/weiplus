package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz;

/* loaded from: classes9.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a f280303d;

    public b0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar) {
        this.f280303d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        yb5.d dVar;
        qk.o oVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar = this.f280303d;
        try {
            try {
                dVar = aVar.f280113d;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.BizComponent", "bobkw markAsReadRunnable failed: ", e17);
            }
            if (!((dVar != null && dVar.u().n2()) || ((oVar = aVar.f280279h) != null && oVar.T0()))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "bobkw not isBizSubscribeContact");
                aVar.E.set(false);
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.h2 oj6 = r01.q3.oj();
            java.lang.String str = "";
            if (aVar.f280113d.u() != null && !aVar.f280113d.u().d1().isEmpty()) {
                str = aVar.f280113d.u().d1();
            } else if (aVar.f280113d.g() != null && aVar.f280113d.g().getIntent() != null) {
                str = aVar.f280113d.g().getIntent().getStringExtra("Chat_User");
            }
            if (str == null || str.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "bobkw markAsReadRunnable getTalker null or empty");
            } else {
                oj6.d1(str);
            }
        } finally {
            aVar.E.set(false);
        }
    }
}
