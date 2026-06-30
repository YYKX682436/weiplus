package cm1;

/* loaded from: classes14.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f124845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124846e;

    public q(int i17, java.lang.String str) {
        this.f124845d = i17;
        this.f124846e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WMPFVoip.WMPFVoipCallInManager", "Timeout Reason[didn't accept the call in " + this.f124845d + " seconds]");
        cm1.t.f124849a.c();
        java.lang.String roomId = this.f124846e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomId, "roomId");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.ze7 ze7Var = new r45.ze7();
        ze7Var.f473496e = 10;
        ze7Var.f473495d = roomId;
        lVar.f152197a = ze7Var;
        lVar.f152198b = new r45.af7();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxaruntime/updatenativevoiproomstatus";
        lVar.f152200d = 5036;
        com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), bm1.a.f103275d, true);
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).f(41);
    }
}
