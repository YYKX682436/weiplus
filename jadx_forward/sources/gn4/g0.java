package gn4;

/* loaded from: classes15.dex */
public class g0 implements in4.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355155a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f355156b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.fs.ActivityC18757xb5c40a02 f355157c;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.fs.ActivityC18757xb5c40a02 activityC18757xb5c40a02, android.view.View view, int i17) {
        this.f355157c = activityC18757xb5c40a02;
        this.f355155a = view;
        this.f355156b = i17;
    }

    @Override // in4.p
    public void a(r45.xn6 xn6Var) {
        r45.vn6 vn6Var = xn6Var.T;
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.fs.ActivityC18757xb5c40a02 activityC18757xb5c40a02 = this.f355157c;
        if (vn6Var != null) {
            activityC18757xb5c40a02.Q = true;
            fn4.z0 z0Var = activityC18757xb5c40a02.f256680J;
            int i17 = this.f355156b;
            r45.xn6 d17 = z0Var.d(i17);
            new in4.h(activityC18757xb5c40a02.mo55332x76847179(), d17, new gn4.h0(activityC18757xb5c40a02, d17, i17)).c(this.f355155a, true, 0, i65.a.b(activityC18757xb5c40a02.mo55332x76847179(), 16));
            try {
                ((gn4.c0) activityC18757xb5c40a02.I.f346107c.mo129842x143e7d6c()).z();
            } catch (java.lang.Exception unused) {
            }
        }
        activityC18757xb5c40a02.P.dismiss();
    }

    @Override // in4.p
    public void b(r45.xn6 xn6Var) {
    }

    @Override // in4.p
    public void c(r45.xn6 xn6Var) {
        fn4.b1 b1Var = fn4.b1.f346014b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.fs.ActivityC18757xb5c40a02 activityC18757xb5c40a02 = this.f355157c;
        activityC18757xb5c40a02.getClass();
        b1Var.a(activityC18757xb5c40a02, activityC18757xb5c40a02.f256686i, xn6Var);
        activityC18757xb5c40a02.P.dismiss();
    }

    @Override // in4.p
    /* renamed from: onDismiss */
    public void mo129854xb349b3ab() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryFSVideoUI", "more popupWindow dismiss");
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.fs.ActivityC18757xb5c40a02 activityC18757xb5c40a02 = this.f355157c;
        if (activityC18757xb5c40a02.N) {
            activityC18757xb5c40a02.N = false;
            if (activityC18757xb5c40a02.Q) {
                return;
            }
            activityC18757xb5c40a02.I.k();
            try {
                ((gn4.c0) activityC18757xb5c40a02.I.f346107c.mo129842x143e7d6c()).y();
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
