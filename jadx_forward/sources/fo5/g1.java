package fo5;

/* loaded from: classes14.dex */
public final class g1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final fo5.g1 f346523d = new fo5.g1();

    public g1() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        fo5.r0 f17 = fo5.q2.f346604d.f();
        f17.getClass();
        if (com.p314xaae8f345.mm.ui.bk.Q()) {
            io5.e eVar = f17.f346631q;
            if (!eVar.f375070e) {
                eVar.e();
                int i17 = 360 - ((eVar.f375068c + (eVar.f375072g == 1 ? 0 : 270)) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3);
                if (eVar.f375069d != i17) {
                    eVar.f375069d = i17;
                    fo5.r0 r0Var = ((fo5.o) eVar.f375066a).f346570a;
                    r0Var.w();
                    fo5.r0.g(r0Var);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPDeviceController", "device rotate changed to " + i17);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
