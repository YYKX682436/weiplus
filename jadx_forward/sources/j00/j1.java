package j00;

/* loaded from: classes9.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f378337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f378338e;

    public j1(j00.k1 k1Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f378337d = k1Var;
        this.f378338e = f9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r07;
        j00.k1 k1Var = this.f378337d;
        k1Var.getClass();
        l15.c cVar = new l15.c();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f378338e;
        java.lang.String j17 = f9Var.j();
        if (j17 == null) {
            j17 = "";
        }
        cVar.m126728xdc93280d(j17);
        v05.b k17 = cVar.k();
        w05.d dVar = k17 != null ? (w05.d) k17.m75936x14adae67(k17.f513848e + 66) : null;
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "handleGiftMsgStatus, ecsGiftAppMsgInfo is null");
            return;
        }
        java.lang.String t17 = dVar.t();
        java.lang.String j18 = dVar.j();
        n00.d dVar2 = n00.d.f415348a;
        if (dVar2.a().D0(t17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "updateGiftMsgByCgi, giftmsgid:" + t17 + " has been in gift");
            if (dVar.s().size() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "updateGiftMsgByCgi, gift msg list is empty");
                return;
            }
            java.lang.Object obj = dVar.s().get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            w05.e eVar = (w05.e) obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "updateGiftMsgByCgi, gift msg status:" + eVar.l() + ", status version:" + eVar.w());
            r07 = 0;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "updateGiftMsgByCgi, giftmsgid:" + t17 + " insert to db, msg locad Id:" + f9Var.m124847x74d37ac6());
            n00.f a17 = dVar2.a();
            long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
            java.lang.String Q0 = f9Var.Q0();
            if (Q0 == null) {
                Q0 = "";
            }
            r07 = 0;
            a17.z0(t17, m124847x74d37ac6, Q0, false, j18, false);
        }
        java.util.List list = k1Var.f378344e;
        if (list.contains(t17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "updateGiftMsgByCgi, giftMsgId: " + t17 + " has in limit list");
            return;
        }
        list.add(t17);
        if (dVar.s().size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "updateGiftMsgByCgi, gift msg list is empty");
            return;
        }
        java.lang.Object obj2 = dVar.s().get(r07);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
        java.lang.String n17 = ((w05.e) obj2).n();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "updateGiftMsgByCgi, giftMsgId: " + t17 + ", orderId: " + n17 + ", start request cgi");
        bw5.af0 af0Var = new bw5.af0();
        af0Var.f106709d = java.lang.Long.parseLong(n17);
        boolean[] zArr = af0Var.f106714i;
        zArr[2] = true;
        af0Var.f106710e = 1;
        zArr[3] = true;
        af0Var.f106712g = 1;
        zArr[5] = true;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = af0Var;
        lVar.f152198b = new bw5.bf0();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/mmec_getpresentorder";
        lVar.f152200d = 9823;
        com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new j00.n0(t17, k1Var, f9Var), r07);
    }
}
