package kf3;

/* loaded from: classes5.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f388929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f388930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 f388931f;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e6679, java.lang.String str, int i17) {
        this.f388931f = activityC16488xbf7e6679;
        this.f388929d = str;
        this.f388930e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d cj6 = d11.s.fj().cj();
        r45.vh4 vh4Var = new r45.vh4();
        vh4Var.f469768e = true;
        kf3.j1 j1Var = new kf3.j1(this);
        java.lang.String str = this.f388929d;
        if (di3.y.a(str, cj6, vh4Var, j1Var)) {
            di3.y.b(str, cj6, vh4Var, new kf3.k1(this));
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new kf3.l1(this));
    }
}
