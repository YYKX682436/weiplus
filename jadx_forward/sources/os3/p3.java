package os3;

/* loaded from: classes8.dex */
public class p3 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: f, reason: collision with root package name */
    public static long f429704f;

    /* renamed from: d, reason: collision with root package name */
    public os3.o3 f429705d;

    /* renamed from: e, reason: collision with root package name */
    public final android.app.Activity f429706e;

    public p3(android.app.Activity activity) {
        gm0.j1.n().f354821b.a(138, this);
        this.f429706e = activity;
    }

    /* renamed from: finalize */
    public void m156983xd764dc1e() {
        gm0.j1.n().f354821b.q(138, this);
        super.finalize();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            os3.o3 o3Var = this.f429705d;
            if (o3Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16932x23233efa activityC16932x23233efa = ((os3.y0) o3Var).f429786a.f429794a;
                int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16932x23233efa.f236389s;
                activityC16932x23233efa.T6();
                this.f429705d = null;
            }
        } else {
            os3.o3 o3Var2 = this.f429705d;
            if (o3Var2 != null) {
                o3Var2.getClass();
                this.f429705d = null;
            }
        }
        f429704f = java.lang.System.currentTimeMillis();
    }
}
