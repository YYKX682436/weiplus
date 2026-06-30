package kf3;

/* loaded from: classes5.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kf3.t1 f388962d;

    public s1(kf3.t1 t1Var) {
        this.f388962d = t1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        kf3.t1 t1Var = this.f388962d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e6679 = t1Var.f388968g.f388984a;
        dp.a.m125854x26a183b(activityC16488xbf7e6679, activityC16488xbf7e6679.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k76), 0).show();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = t1Var.f388968g.f388984a.f230082p;
        if (u3Var != null) {
            u3Var.dismiss();
            t1Var.f388968g.f388984a.f230082p = null;
        }
    }
}
