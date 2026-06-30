package com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061;

/* JADX INFO: Access modifiers changed from: package-private */
@mk0.a
/* loaded from: classes7.dex */
public final class f0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.i<com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.C10758xed10a605, com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.C10766x6c5cbbad> {
    private f0() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.w wVar;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.C10758xed10a605 c10758xed10a605 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.C10758xed10a605) obj;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = c10758xed10a605.f149946e;
        if (oVar != null && oVar.f152244b.f152233a.getClass() != com.p314xaae8f345.mm.p2495xc50a8b8b.f.class) {
            java.lang.String str = c10758xed10a605.f149945d;
            if (str == null) {
                wVar = com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.h0.f149965b;
            } else {
                try {
                    wVar = (com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.w) d56.b.i(str).c().f308165b;
                } catch (d56.c e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCRunCgi", "createInterceptor with name:%s, get exception:%s", c10758xed10a605.f149945d, e17);
                    wVar = com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.h0.f149965b;
                }
            }
            com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.h0.b(oVar, wVar, new com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.e0(this, rVar), null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCRunCgi", "InvokeTask, mm received invalid rr %s", oVar);
        if (rVar != null) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.C10766x6c5cbbad c10766x6c5cbbad = new com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.C10766x6c5cbbad();
            c10766x6c5cbbad.f149991g = oVar;
            c10766x6c5cbbad.f149990f = null;
            c10766x6c5cbbad.f149988d = 3;
            c10766x6c5cbbad.f149989e = -2;
            rVar.a(c10766x6c5cbbad);
        }
    }
}
