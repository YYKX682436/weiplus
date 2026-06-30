package wj0;

/* loaded from: classes11.dex */
public class l implements java.lang.Runnable {
    public l(wj0.m mVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc interfaceC10732xd7a300cc = (com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc) i95.n0.c(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.class);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
        objArr[1] = java.lang.Thread.currentThread().getName();
        objArr[2] = java.lang.Boolean.valueOf(interfaceC10732xd7a300cc.mo45967x2c52560f() && interfaceC10732xd7a300cc.mo45969x39e05d35() > 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXHardCoderJNI", "reportHardCoder tid[%d, %s], running[%b]", objArr);
        interfaceC10732xd7a300cc.mo45975xf0018e90(true, 0, 1, false);
        interfaceC10732xd7a300cc.mo45970xcc0e980a(true);
        interfaceC10732xd7a300cc.mo45975xf0018e90(true, (!interfaceC10732xd7a300cc.mo45967x2c52560f() || interfaceC10732xd7a300cc.mo45969x39e05d35() <= 0) ? 5 : 4, 1, false);
        interfaceC10732xd7a300cc.mo45975xf0018e90(true, interfaceC10732xd7a300cc.mo45968x586d7588() ? 6 : 7, 1, false);
    }
}
