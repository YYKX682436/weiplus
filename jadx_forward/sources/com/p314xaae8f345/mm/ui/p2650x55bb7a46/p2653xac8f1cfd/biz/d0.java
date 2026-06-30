package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz;

/* loaded from: classes11.dex */
public class d0 implements s01.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a f280307a;

    public d0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar) {
        this.f280307a = aVar;
    }

    @Override // s01.l
    public void a(s01.k kVar) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar = this.f280307a;
        if (aVar.f280286r && kVar != null && kVar.f483423b == aVar.w0()) {
            yb5.d dVar = aVar.f280113d;
            if (!dVar.f542247i) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "onNotifyChange fragment not foreground, return");
                return;
            }
            if (kVar.f483422a == s01.j.DELETE) {
                if (aVar.f280287s) {
                    dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4s), 1).show();
                    aVar.f280113d.d();
                    return;
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "bizChatExtension bizChat change");
            s01.h z07 = r01.q3.Ui().z0(aVar.w0());
            aVar.f280277f = z07;
            if (aVar.f280287s) {
                aVar.P = s01.r.p(z07);
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) aVar.f280113d.f542241c.a(sb5.z0.class))).E0();
            } else {
                s01.a0 y07 = r01.q3.Vi().y0(aVar.f280277f.f69169xf75e5c37);
                if (y07 != null) {
                    aVar.f280278g = y07;
                }
            }
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) aVar.f280113d.f542241c.a(sb5.z0.class))).C();
        }
    }
}
