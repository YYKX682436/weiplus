package s61;

/* loaded from: classes15.dex */
public class r implements com.p314xaae8f345.mm.sdk.p2603x2137b148.s3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11376x2afd0f69 f484918a;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11376x2afd0f69 activityC11376x2afd0f69) {
        this.f484918a = activityC11376x2afd0f69;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.s3
    public boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11376x2afd0f69 activityC11376x2afd0f69 = this.f484918a;
        try {
            activityC11376x2afd0f69.f154680u = o25.b.e(activityC11376x2afd0f69);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FindMContactInviteUI", e17, "", new java.lang.Object[0]);
        }
        r61.n0 n0Var = activityC11376x2afd0f69.f154668f;
        n0Var.f474445g = activityC11376x2afd0f69.f154680u;
        ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
        gm0.j1.b().c();
        m61.k.Ai().getClass();
        n0Var.g(null);
        return true;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.s3
    public boolean b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11376x2afd0f69 activityC11376x2afd0f69 = this.f484918a;
        android.app.ProgressDialog progressDialog = activityC11376x2afd0f69.f154669g;
        if (progressDialog != null) {
            progressDialog.dismiss();
            activityC11376x2afd0f69.f154669g = null;
        }
        activityC11376x2afd0f69.f154668f.notifyDataSetChanged();
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m163940x9616526c() {
        return super.toString() + "|listMFriendData";
    }
}
