package aq1;

/* loaded from: classes11.dex */
public class t1 implements vg3.x4 {
    @Override // vg3.x4
    public void A(com.tencent.mm.protobuf.f fVar) {
        r45.fp4 fp4Var = (r45.fp4) fVar;
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ai();
        ip.l.t(fp4Var.E);
        c01.d9.b().b(fp4Var.f374523v);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.o4.M("updateNotificationShowDetail_" + gm0.m.i()).getBoolean("notification_show_detail", false));
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(c01.z1.e() == 0);
        if (valueOf.booleanValue() || valueOf2.booleanValue()) {
            boolean z17 = (fp4Var.f374514m & 2048) != 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.UserInfoSyncCallbackImpl", "afterSyncDoCmd isTipsClose:%s, Status:%s, uploaded:%s, exDevice:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(fp4Var.f374514m), valueOf, valueOf2);
            ip.l.n(!z17);
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).cj("" + fp4Var.K);
    }

    @Override // vg3.x4
    public /* bridge */ /* synthetic */ void E0(com.tencent.mm.protobuf.f fVar) {
    }
}
