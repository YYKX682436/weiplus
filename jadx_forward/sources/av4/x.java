package av4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lav4/x;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/websearch/jsapi/OpenWXSearchHalfPageJSApi$RequestParams;", "Lcom/tencent/mm/plugin/websearch/jsapi/OpenWXSearchHalfPageJSApi$ResponseWrapper;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class x implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2395x60b7c31.C19211xe6c8088d requestParams = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2395x60b7c31.C19211xe6c8088d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestParams, "requestParams");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start GenFTSParamsTask ");
        int i17 = requestParams.f263082d;
        sb6.append(i17);
        sb6.append(", ");
        int i18 = requestParams.f263083e;
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.OpenWXSearchHalfPageJSApi", sb6.toString());
        java.util.Map b17 = su4.r2.b(i17, true, i18);
        if (rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2395x60b7c31.C19212xf72cfeaa(b17));
        }
    }
}
