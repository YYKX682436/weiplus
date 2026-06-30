package cm1;

/* loaded from: classes14.dex */
public final class i implements com.p314xaae8f345.mm.sdk.p2603x2137b148.h5 {

    /* renamed from: a, reason: collision with root package name */
    public static final cm1.i f124837a = new cm1.i();

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.h5
    public final void a(int i17) {
        if (i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WMPFVoip.WMPFVoipCallInManager", "phone calling broke voip calling");
            cm1.f fVar = cm1.t.f124851c;
            if (fVar != null) {
                java.lang.String roomId = fVar.f124816b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomId, "roomId");
                com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                r45.ze7 ze7Var = new r45.ze7();
                ze7Var.f473496e = 9;
                ze7Var.f473495d = roomId;
                lVar.f152197a = ze7Var;
                lVar.f152198b = new r45.af7();
                lVar.f152199c = "/cgi-bin/mmbiz-bin/wxaruntime/updatenativevoiproomstatus";
                lVar.f152200d = 5036;
                com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), bm1.a.f103275d, true);
                cm1.t tVar = cm1.t.f124849a;
                tVar.c();
                tVar.d();
            }
        }
    }
}
