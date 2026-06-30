package gn4;

/* loaded from: classes15.dex */
public class h0 implements in4.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.xn6 f355159a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f355160b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.fs.ActivityC18757xb5c40a02 f355161c;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.fs.ActivityC18757xb5c40a02 activityC18757xb5c40a02, r45.xn6 xn6Var, int i17) {
        this.f355161c = activityC18757xb5c40a02;
        this.f355159a = xn6Var;
        this.f355160b = i17;
    }

    @Override // in4.g
    public void a(java.util.Set set) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryFSVideoUI", "popupWindow commit");
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.fs.ActivityC18757xb5c40a02 activityC18757xb5c40a02 = this.f355161c;
        db5.t7.m123882x26a183b(activityC18757xb5c40a02.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f574925k06, 0).show();
        pm4.y.a(activityC18757xb5c40a02.f256686i, this.f355159a, set, activityC18757xb5c40a02.f256680J.e());
        activityC18757xb5c40a02.I.m();
        fn4.z0 z0Var = activityC18757xb5c40a02.f256680J;
        int i17 = this.f355160b;
        z0Var.o(i17);
        if (activityC18757xb5c40a02.f256680J.e() == 0) {
            activityC18757xb5c40a02.finish();
            return;
        }
        gn4.c1 c1Var = activityC18757xb5c40a02.f256689o;
        c1Var.m8155x27702c4(i17 + c1Var.z());
        activityC18757xb5c40a02.f256687m.mo7976xc291bbd2(0, 3);
    }

    @Override // in4.g
    /* renamed from: onDismiss */
    public void mo129855xb349b3ab() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryFSVideoUI", "popupWindow dismiss");
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.fs.ActivityC18757xb5c40a02 activityC18757xb5c40a02 = this.f355161c;
        if (activityC18757xb5c40a02.Q) {
            activityC18757xb5c40a02.I.k();
            activityC18757xb5c40a02.Q = false;
            try {
                ((gn4.c0) activityC18757xb5c40a02.I.f346107c.mo129842x143e7d6c()).y();
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
