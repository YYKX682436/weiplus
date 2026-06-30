package bt3;

/* loaded from: classes9.dex */
public class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final zs3.b0 f24365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bt3.t2 f24366e;

    public o2(bt3.t2 t2Var, zs3.b0 b0Var) {
        this.f24366e = t2Var;
        this.f24365d = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        bt3.t2 t2Var;
        zs3.b0 b0Var = this.f24365d;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "dojob FavDataCopyRunnable, info id:%s", java.lang.Long.valueOf(b0Var.field_msgId));
        java.util.Iterator it = b0Var.field_dataProto.f370964f.iterator();
        boolean z17 = false;
        while (true) {
            boolean hasNext = it.hasNext();
            t2Var = this.f24366e;
            if (!hasNext) {
                break;
            }
            r45.gp0 gp0Var = (r45.gp0) it.next();
            com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
            am.z9 z9Var = favoriteOperationEvent.f54243g;
            z9Var.f8528a = 2;
            z9Var.f8533f = gp0Var;
            favoriteOperationEvent.e();
            java.lang.String str = gp0Var.T;
            am.aa aaVar = favoriteOperationEvent.f54244h;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(aaVar.f6136c)) {
                java.lang.String t17 = bt3.g2.t(gp0Var, b0Var.field_toUser, b0Var.field_msgId, 1);
                if (!aaVar.f6136c.equals(t17)) {
                    com.tencent.mm.vfs.w6.d(aaVar.f6136c, t17, true);
                    bt3.t2.a(t2Var, t17);
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(aaVar.f6137d)) {
                java.lang.String H = bt3.g2.H(gp0Var, b0Var.field_toUser, b0Var.field_msgId, 1);
                if (!aaVar.f6137d.equals(H)) {
                    com.tencent.mm.vfs.w6.d(aaVar.f6137d, H, true);
                    bt3.t2.a(t2Var, H);
                }
            }
            if (gp0Var.I == 3) {
                com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgSendService", "match voice type, clear cdn info");
                gp0Var.a0("");
                gp0Var.b0("");
                gp0Var.c0("");
                gp0Var.d0("");
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375434s) || !com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375412h)) {
                z17 = true;
            }
        }
        if (z17) {
            gm0.j1.n().f273288b.g(new bt3.r0(b0Var));
            return;
        }
        this.f24366e.c(b0Var.field_toUser, b0Var.field_msgId, b0Var.field_localId, bt3.g2.g(b0Var.field_title, b0Var.field_desc, b0Var.field_dataProto));
        t2Var.f24412d = false;
        t2Var.f(null, false);
    }
}
