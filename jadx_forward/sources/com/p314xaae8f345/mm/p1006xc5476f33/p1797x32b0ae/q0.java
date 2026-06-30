package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae;

/* loaded from: classes15.dex */
public class q0 implements com.p314xaae8f345.mm.app.s5 {
    @Override // com.p314xaae8f345.mm.app.s5
    public void Jb(java.lang.String str) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.f226045o[0]) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "onProcessForeground");
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65399x3d65c882("", 0L);
        }
    }

    @Override // com.p314xaae8f345.mm.app.s5
    public void k2(java.lang.String str) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.f226045o[0]) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "onProcessBackground");
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65391x77b5b46d("", 0L);
            ia3.e c17 = ia3.e.c();
            c17.f371551e++;
            z21.e eVar = c17.f371547a;
            if (eVar != null) {
                eVar.mo48278xae7a2e7a(true);
                c17.f371547a.mo48299x360802(true);
                c17.f371547a = null;
            }
            ia3.d dVar = c17.f371548b;
            if (dVar != null) {
                dVar.c();
                c17.f371548b.b();
                c17.f371548b = null;
            }
            c17.f371550d = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVoiceHelper", "onProcessBackground done, session cleared");
        }
    }
}
