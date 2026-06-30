package cm1;

/* loaded from: classes14.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f43312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f43313e;

    public q(int i17, java.lang.String str) {
        this.f43312d = i17;
        this.f43313e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WMPFVoip.WMPFVoipCallInManager", "Timeout Reason[didn't accept the call in " + this.f43312d + " seconds]");
        cm1.t.f43316a.c();
        java.lang.String roomId = this.f43313e;
        kotlin.jvm.internal.o.g(roomId, "roomId");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.ze7 ze7Var = new r45.ze7();
        ze7Var.f391963e = 10;
        ze7Var.f391962d = roomId;
        lVar.f70664a = ze7Var;
        lVar.f70665b = new r45.af7();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaruntime/updatenativevoiproomstatus";
        lVar.f70667d = 5036;
        com.tencent.mm.modelbase.z2.d(lVar.a(), bm1.a.f21742d, true);
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f(41);
    }
}
