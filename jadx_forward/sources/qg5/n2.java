package qg5;

/* loaded from: classes5.dex */
public final class n2 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public n2() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5908xe7a9688a event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5908xe7a9688a) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.uq uqVar = event.f136212g;
        java.lang.String str = uqVar != null ? uqVar.f89659b : null;
        new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2585xce036727.tos.C20842xed68344b();
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "RepairerConfig_ResetYuanBaoSummarizeTos")) {
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("yuanbao_chat_records_feature_service");
        M.putBoolean("yuanbao_summarize_agreed", false);
        M.remove("yuanbao_summarize_agreed");
        return true;
    }
}
