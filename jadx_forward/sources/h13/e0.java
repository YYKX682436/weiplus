package h13;

/* loaded from: classes10.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h13.l0 f359656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.j4 f359657e;

    public e0(h13.l0 l0Var, r45.j4 j4Var) {
        this.f359656d = l0Var;
        this.f359657e = j4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h13.l0 l0Var = this.f359656d;
        l0Var.getClass();
        boolean z17 = c01.id.c() - l0Var.f359676f > 1800000;
        if (z17) {
            l0Var.f359676f = c01.id.c();
        }
        if (z17) {
            j13.a.f378710d.y0();
        }
        l0Var.getClass();
        r45.j4 j4Var = this.f359657e;
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(j4Var.f459099p, "ForcePushId", null);
        java.lang.String str = d17 != null ? (java.lang.String) d17.get(".ForcePushId") : null;
        if (str != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyService", "received msg! MsgSource:%s FromUserName:%s source:%s", j4Var.f459099p, j4Var.f459091e, str);
            java.lang.String g17 = x51.j1.g(j4Var.f459091e);
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c01.z1.r(), g17);
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = l0Var.f359679i;
            if (b17 || concurrentLinkedQueue.contains(g17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ForceNotifyService", "ERROR! no show! notifyList=" + concurrentLinkedQueue);
            } else if (l0Var.Ni(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyService", "fromUser=" + g17 + " isNeedNotify=true");
                i13.j z07 = j13.a.f378710d.z0(str);
                if (z07 != null) {
                    l0Var.f359678h.mo50293x3498a0(new h13.g0(l0Var, z07));
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ForceNotifyService", "ERROR! no show!");
            }
        }
        l0Var.getClass();
        i13.o bj6 = l0Var.bj(x51.j1.g(j4Var.f459094h));
        if (bj6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ForceNotifyService", "ERROR! no show!");
            return;
        }
        java.lang.String str2 = bj6.f368808d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyService", "receive msg! livePushId:%s", str2);
        if (l0Var.Ni(str2)) {
            l0Var.f359678h.mo50293x3498a0(new h13.f0(l0Var, bj6));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ForceNotifyService", "ERROR! no show!");
        }
    }
}
