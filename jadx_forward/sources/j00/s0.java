package j00;

/* loaded from: classes9.dex */
public final class s0 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f378417b;

    public s0(j00.k1 k1Var) {
        this.f378417b = k1Var;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "onEnterBackground");
        j00.k1 k1Var = this.f378417b;
        java.lang.Runnable task = k1Var.f378350n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = k1Var.f378347h;
        n3Var.mo50302x6b17ad39(null);
        n3Var.mo50297x7c4d7ca2(task, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "onExitBackground");
        this.f378417b.f378347h.mo50302x6b17ad39(null);
    }
}
