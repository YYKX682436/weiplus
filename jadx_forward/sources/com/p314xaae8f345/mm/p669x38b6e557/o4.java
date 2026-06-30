package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes7.dex */
public class o4 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.k5) ((s40.z0) i95.n0.c(s40.z0.class))).getClass();
        if (!z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderLiveShellService", "Environment denied: not coolassist or monkey env");
            return;
        }
        try {
            cl0.e eVar = new cl0.e(intent.getStringExtra("stream_data"));
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = ((mm2.h7) dk2.ef.f314905a.i(mm2.h7.class)).f410650i;
            for (int i17 = 0; i17 < eVar.mo15056xbe0e3ae6(); i17++) {
                java.lang.String mo15082x48bce8a4 = eVar.k(i17).mo15082x48bce8a4("stream_id");
                for (int i18 = 0; i18 < linkedList2.size(); i18++) {
                    if (((r45.la4) linkedList2.get(i18)).f460807e.equals(mo15082x48bce8a4)) {
                        linkedList.add((r45.la4) linkedList2.get(i18));
                    }
                }
            }
            ((mm2.h7) dk2.ef.f314905a.i(mm2.h7.class)).f410652n.mo7808x76db6cb1(linkedList);
        } catch (cl0.f unused) {
        }
    }
}
