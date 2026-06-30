package s61;

/* loaded from: classes15.dex */
public class f implements com.p314xaae8f345.mm.sdk.p2603x2137b148.s3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11375x7be2c669 f484876a;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11375x7be2c669 activityC11375x7be2c669) {
        this.f484876a = activityC11375x7be2c669;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.s3
    public boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11375x7be2c669 activityC11375x7be2c669 = this.f484876a;
        try {
            activityC11375x7be2c669.f154663v = o25.b.e(activityC11375x7be2c669);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FindMContactAddUI", e17, "", new java.lang.Object[0]);
        }
        r61.n0 n0Var = activityC11375x7be2c669.f154650f;
        n0Var.f474445g = activityC11375x7be2c669.f154663v;
        ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
        gm0.j1.b().c();
        m61.k.Ai().getClass();
        n0Var.g(null);
        return true;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.s3
    public boolean b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11375x7be2c669 activityC11375x7be2c669 = this.f484876a;
        android.app.ProgressDialog progressDialog = activityC11375x7be2c669.f154651g;
        if (progressDialog != null) {
            progressDialog.dismiss();
            activityC11375x7be2c669.f154651g = null;
        }
        activityC11375x7be2c669.f154650f.notifyDataSetChanged();
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m163936x9616526c() {
        return super.toString() + "|listMFriendData";
    }
}
