package yn1;

/* loaded from: classes11.dex */
public final class p3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.q0 f545324d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(bw5.q0 q0Var) {
        super(0);
        this.f545324d = q0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yn1.z0 z0Var = yn1.z0.f545466a;
        bw5.q0 statusModel = this.f545324d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusModel, "statusModel");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationGlobalHolder", "updateStatusModel " + statusModel.b());
        if (statusModel.b() == bw5.bj0.NOTIFY_CODE_PREPARE_DONE) {
            java.lang.String str = statusModel.f113413h[2] ? statusModel.f113410e : "";
            try {
                bw5.aj0 aj0Var = new bw5.aj0();
                aj0Var.mo11468x92b714fd(android.util.Base64.decode(str, 0));
                yn1.z0.f545474i = aj0Var;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.Mig.MigrationGlobalHolder", "Fail to parse: status=" + statusModel.b() + ", extra=" + str + ", exception=" + e17);
            }
        } else {
            yn1.z0.f545471f = statusModel;
            z0Var.p();
            bw5.bj0 b17 = statusModel.b();
            bw5.bj0 bj0Var = bw5.bj0.NOTIFY_CODE_NONE;
            if (b17 == bj0Var) {
                z0Var.a();
            }
            if (statusModel.b() == bw5.bj0.NOTIFY_CODE_START) {
                android.content.Intent intent = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1256xcd3633ce.ServiceC12841x401e91e4.f174079d;
                pm0.v.X(yn1.g0.f545204d);
            } else if (statusModel.b() == bw5.bj0.NOTIFY_CODE_FINISH || statusModel.b() == bw5.bj0.NOTIFY_CODE_PAUSE || statusModel.b() == bw5.bj0.NOTIFY_CODE_ERROR || statusModel.b() == bw5.bj0.NOTIFY_CODE_CANCEL || statusModel.b() == bj0Var) {
                android.content.Intent intent2 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1256xcd3633ce.ServiceC12841x401e91e4.f174079d;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop: ");
                sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1256xcd3633ce.ServiceC12841x401e91e4.f174079d != null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MigrationForegroundService", sb6.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1256xcd3633ce.ServiceC12841x401e91e4.f174080e = null;
                pm0.v.X(yn1.h0.f545218d);
            }
        }
        return jz5.f0.f384359a;
    }
}
