package hb3;

/* loaded from: classes9.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.w0 f361656d;

    public i(hb3.j jVar, l75.w0 w0Var) {
        this.f361656d = w0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 V9;
        jz5.f0 f0Var;
        l75.w0 w0Var = this.f361656d;
        at4.k1 k1Var = (at4.k1) w0Var.f398509d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k1Var.f66565xfd3491a)) {
            return;
        }
        int i17 = w0Var.f398507b;
        if (3 == i17 || 4 == i17) {
            int i18 = k1Var.f66555x2592af31;
            if ((i18 == 4 || i18 == 5) && (V9 = pt0.f0.V9(k1Var.f66565xfd3491a, k1Var.f66560xd09be28e)) != null) {
                long m124847x74d37ac6 = V9.m124847x74d37ac6();
                java.lang.String Q0 = V9.Q0();
                if (Q0 != null) {
                    g95.u uVar = g95.u.f351354a;
                    g15.b wi6 = ((ez.j) uVar.e()).wi(Q0);
                    if (wi6 == null) {
                        wi6 = new g15.b();
                    }
                    boolean removeIf = wi6.j().removeIf(new g95.l(m124847x74d37ac6, 4));
                    if (removeIf) {
                        uVar.n(Q0, wi6);
                    } else {
                        ((kk.l) ((jz5.n) g95.u.f351355b).mo141623x754a37bb()).put(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(m124847x74d37ac6, Q0), 4);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConvRedHintStorage", "remove, [" + Q0 + ", " + m124847x74d37ac6 + ", 4], result: " + removeIf);
                    f0Var = jz5.f0.f384359a;
                } else {
                    g95.u uVar2 = g95.u.f351354a;
                    f0Var = null;
                }
                if (f0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConvRedHintStorage", "talker is null");
                }
            }
        }
    }
}
