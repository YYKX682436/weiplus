package cm1;

/* loaded from: classes14.dex */
public final class i implements com.tencent.mm.sdk.platformtools.h5 {

    /* renamed from: a, reason: collision with root package name */
    public static final cm1.i f43304a = new cm1.i();

    @Override // com.tencent.mm.sdk.platformtools.h5
    public final void a(int i17) {
        if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WMPFVoip.WMPFVoipCallInManager", "phone calling broke voip calling");
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
                cm1.t tVar = cm1.t.f43316a;
                tVar.c();
                tVar.d();
            }
        }
    }
}
