package aq1;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Laq1/f0;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCLong;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class f0 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.type.IPCLong iPCLong = (com.tencent.mm.ipcinvoker.type.IPCLong) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ipc AutoLightPushTask: ");
        sb6.append(iPCLong != null ? java.lang.Long.valueOf(iPCLong.f68405d) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.LightPushServiceImpl", sb6.toString());
        try {
            ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).Zi();
            com.tencent.mars.xlog.Log.i("MicroMsg.proc.LightPushServiceImpl", "ipc AutoLightPushTask Done");
            if (rVar != null) {
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(true));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.proc.LightPushServiceImpl", "ipc onCallback err: " + e17.getMessage());
        }
    }
}
