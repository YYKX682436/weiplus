package bt3;

/* loaded from: classes9.dex */
public class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final zs3.b0 f105898d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bt3.t2 f105899e;

    public o2(bt3.t2 t2Var, zs3.b0 b0Var) {
        this.f105899e = t2Var;
        this.f105898d = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        bt3.t2 t2Var;
        zs3.b0 b0Var = this.f105898d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "dojob FavDataCopyRunnable, info id:%s", java.lang.Long.valueOf(b0Var.f68498x297eb4f7));
        java.util.Iterator it = b0Var.f68494x84214f59.f452497f.iterator();
        boolean z17 = false;
        while (true) {
            boolean hasNext = it.hasNext();
            t2Var = this.f105899e;
            if (!hasNext) {
                break;
            }
            r45.gp0 gp0Var = (r45.gp0) it.next();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
            am.z9 z9Var = c5432x35bb364f.f135776g;
            z9Var.f90061a = 2;
            z9Var.f90066f = gp0Var;
            c5432x35bb364f.e();
            java.lang.String str = gp0Var.T;
            am.aa aaVar = c5432x35bb364f.f135777h;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aaVar.f87669c)) {
                java.lang.String t17 = bt3.g2.t(gp0Var, b0Var.f68503x1209e7cb, b0Var.f68498x297eb4f7, 1);
                if (!aaVar.f87669c.equals(t17)) {
                    com.p314xaae8f345.mm.vfs.w6.d(aaVar.f87669c, t17, true);
                    bt3.t2.a(t2Var, t17);
                }
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aaVar.f87670d)) {
                java.lang.String H = bt3.g2.H(gp0Var, b0Var.f68503x1209e7cb, b0Var.f68498x297eb4f7, 1);
                if (!aaVar.f87670d.equals(H)) {
                    com.p314xaae8f345.mm.vfs.w6.d(aaVar.f87670d, H, true);
                    bt3.t2.a(t2Var, H);
                }
            }
            if (gp0Var.I == 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgSendService", "match voice type, clear cdn info");
                gp0Var.a0("");
                gp0Var.b0("");
                gp0Var.c0("");
                gp0Var.d0("");
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456967s) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456945h)) {
                z17 = true;
            }
        }
        if (z17) {
            gm0.j1.n().f354821b.g(new bt3.r0(b0Var));
            return;
        }
        this.f105899e.c(b0Var.f68503x1209e7cb, b0Var.f68498x297eb4f7, b0Var.f68497x88be67a1, bt3.g2.g(b0Var.f68502x29dd02d3, b0Var.f68495x225aa2b6, b0Var.f68494x84214f59));
        t2Var.f105945d = false;
        t2Var.f(null, false);
    }
}
