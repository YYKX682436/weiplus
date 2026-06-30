package hr3;

/* loaded from: classes9.dex */
public class s8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.t8 f365503d;

    public s8(hr3.t8 t8Var) {
        this.f365503d = t8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetWxGame", "doClearData");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetWxGame", "doClearData result:%d", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().J0("gh_25d9ac85a4bc")));
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Ui()) {
            this.f365503d.f365556d.a("clearAllMessage", true);
        } else {
            ((g05.r) ((g05.i) i95.n0.c(g05.i.class))).Zi();
        }
    }
}
