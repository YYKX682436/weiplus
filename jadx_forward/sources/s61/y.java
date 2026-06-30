package s61;

/* loaded from: classes15.dex */
public class y implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s61.a0 f484936d;

    public y(s61.a0 a0Var) {
        this.f484936d = a0Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        s61.a0 a0Var = this.f484936d;
        android.app.ProgressDialog progressDialog = a0Var.f484850d.f154669g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11376x2afd0f69 activityC11376x2afd0f69 = a0Var.f484850d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            activityC11376x2afd0f69.f154669g = null;
        }
        if (activityC11376x2afd0f69.f154677r != null) {
            gm0.j1.d().q(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60883xc58bd72e, activityC11376x2afd0f69.f154677r);
            activityC11376x2afd0f69.f154677r = null;
        }
        n71.a.e(activityC11376x2afd0f69.f154681v);
        activityC11376x2afd0f69.mo48674x36654fab();
        activityC11376x2afd0f69.W6(1);
    }
}
