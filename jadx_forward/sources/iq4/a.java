package iq4;

/* loaded from: classes14.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f375325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f375326e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f375327f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f375328g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f375329h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ iq4.c f375330i;

    public a(iq4.c cVar, int i17, android.view.View view, boolean z17, boolean z18, long j17) {
        this.f375330i = cVar;
        this.f375325d = i17;
        this.f375326e = view;
        this.f375327f = z17;
        this.f375328g = z18;
        this.f375329h = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f375325d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        android.view.View view = this.f375326e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipFloatBallHelper", "addVoipView, no ball, state:%s, view:%s", valueOf, view);
        iq4.c cVar = this.f375330i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = cVar.f174665d;
        c12886x91aa2b6d.I = true;
        c12886x91aa2b6d.f174578J = false;
        c12886x91aa2b6d.f174583h = view;
        c12886x91aa2b6d.f174591s = false;
        c12886x91aa2b6d.L = gq4.v.Bi().f258097g;
        cVar.f174665d.F = true;
        if (!gq4.v.Bi().f258097g) {
            gq4.v.Bi().f258097g = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12887x942bef81 t17 = cVar.t();
        boolean z17 = this.f375327f;
        t17.f174621h = z17 ? "3" : i17 == 4 ? "2" : "1";
        cVar.t().f174622i = z17 ? null : java.lang.String.valueOf(gq4.v.Bi().n());
        cVar.t().f174617d = 2;
        cVar.g();
        if (!z17) {
            cVar.f174665d.H = i17;
        } else if (i17 == 4) {
            cVar.f174665d.H = 512;
        } else if (i17 == 8) {
            cVar.f174665d.H = 1024;
        }
        cVar.h0(i17, z17, this.f375328g);
        cVar.g0(i17, z17);
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().X(false);
        cVar.f375333o = this.f375329h;
        cVar.j();
    }
}
