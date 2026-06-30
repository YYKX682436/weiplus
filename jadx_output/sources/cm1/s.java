package cm1;

/* loaded from: classes14.dex */
public final class s implements dz.m {
    @Override // dz.m
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WMPFVoip.WMPFVoipCallInManager", "onInterruptBegin");
        cm1.f fVar = cm1.t.f43318c;
        if (fVar != null) {
            java.lang.String roomId = fVar.f43283b;
            kotlin.jvm.internal.o.g(roomId, "roomId");
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            r45.ze7 ze7Var = new r45.ze7();
            ze7Var.f391963e = 9;
            ze7Var.f391962d = roomId;
            lVar.f70664a = ze7Var;
            lVar.f70665b = new r45.af7();
            lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaruntime/updatenativevoiproomstatus";
            lVar.f70667d = 5036;
            com.tencent.mm.modelbase.z2.d(lVar.a(), bm1.a.f21742d, true);
        }
        cm1.t tVar = cm1.t.f43316a;
        tVar.c();
        tVar.d();
    }

    @Override // dz.m
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WMPFVoip.WMPFVoipCallInManager", "onInterruptEnd");
    }
}
