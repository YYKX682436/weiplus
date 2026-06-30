package com.tencent.mm.console;

/* loaded from: classes7.dex */
public class o4 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        ((com.tencent.mm.feature.finder.live.k5) ((s40.z0) i95.n0.c(s40.z0.class))).getClass();
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FinderLiveShellService", "Environment denied: not coolassist or monkey env");
            return;
        }
        try {
            cl0.e eVar = new cl0.e(intent.getStringExtra("stream_data"));
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = ((mm2.h7) dk2.ef.f233372a.i(mm2.h7.class)).f329117i;
            for (int i17 = 0; i17 < eVar.length(); i17++) {
                java.lang.String optString = eVar.k(i17).optString("stream_id");
                for (int i18 = 0; i18 < linkedList2.size(); i18++) {
                    if (((r45.la4) linkedList2.get(i18)).f379274e.equals(optString)) {
                        linkedList.add((r45.la4) linkedList2.get(i18));
                    }
                }
            }
            ((mm2.h7) dk2.ef.f233372a.i(mm2.h7.class)).f329119n.postValue(linkedList);
        } catch (cl0.f unused) {
        }
    }
}
