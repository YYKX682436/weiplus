package jk0;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljk0/c;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipc/GetSimpleDnsRequest;", "Lcom/tencent/mm/ipc/GetSimpleDnsResponse;", "<init>", "()V", "feature-cronet_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class c implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        java.util.ArrayList<java.lang.String> m40299xfb805e1e;
        com.p314xaae8f345.mm.ipc.C10743x8b97dbce request = (com.p314xaae8f345.mm.ipc.C10743x8b97dbce) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.p542x3306d5.p548x6331389.C4576xf14b1004 c4576xf14b1004 = (com.p314xaae8f345.p542x3306d5.p548x6331389.C4576xf14b1004) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37619x6f964b77(com.p314xaae8f345.p542x3306d5.p548x6331389.C4576xf14b1004.class);
        java.lang.String str = request.f149852d;
        if (c4576xf14b1004 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCSyncTask_GetSimpleDns", "MMDnsManager is null, cannot process DNS request for host: " + str);
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.ipc.C10744xea8b52e2(new java.util.ArrayList()));
                return;
            }
            return;
        }
        if (request.f149856h) {
            m40299xfb805e1e = c4576xf14b1004.m40300x39a1c6e9(str, request.f149853e, request.f149854f, request.f149855g);
        } else {
            m40299xfb805e1e = c4576xf14b1004.m40299xfb805e1e(str);
        }
        if (m40299xfb805e1e == null) {
            m40299xfb805e1e = new java.util.ArrayList<>();
        }
        if (rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.ipc.C10744xea8b52e2(m40299xfb805e1e));
        }
    }
}
