package fn4;

/* loaded from: classes15.dex */
public class y implements in4.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f346155a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f346156b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e f346157c;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e abstractActivityC18755xab3fd75e, android.view.View view, int i17) {
        this.f346157c = abstractActivityC18755xab3fd75e;
        this.f346155a = view;
        this.f346156b = i17;
    }

    @Override // in4.p
    public void a(r45.xn6 xn6Var) {
        r45.vn6 vn6Var = xn6Var.T;
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e abstractActivityC18755xab3fd75e = this.f346157c;
        if (vn6Var != null) {
            abstractActivityC18755xab3fd75e.N = true;
            fn4.z0 z0Var = abstractActivityC18755xab3fd75e.K;
            int i17 = this.f346156b;
            r45.xn6 d17 = z0Var.d(i17);
            in4.h hVar = new in4.h(abstractActivityC18755xab3fd75e.mo55332x76847179(), d17, new fn4.z(abstractActivityC18755xab3fd75e, d17, i17));
            abstractActivityC18755xab3fd75e.P = hVar;
            boolean z17 = abstractActivityC18755xab3fd75e.U;
            android.view.View view = this.f346155a;
            if (z17) {
                hVar.c(view, true, 0 - i65.a.b(abstractActivityC18755xab3fd75e.mo55332x76847179(), 40), i65.a.b(abstractActivityC18755xab3fd75e.mo55332x76847179(), 16));
                try {
                    ((gn4.c0) abstractActivityC18755xab3fd75e.f256659J.f346107c.mo129842x143e7d6c()).z();
                } catch (java.lang.Exception unused) {
                }
            } else {
                hVar.c(view, false, 0, 0 - i65.a.b(abstractActivityC18755xab3fd75e.mo55332x76847179(), 10));
            }
        }
        abstractActivityC18755xab3fd75e.M.dismiss();
    }

    @Override // in4.p
    public void b(r45.xn6 xn6Var) {
    }

    @Override // in4.p
    public void c(r45.xn6 xn6Var) {
        fn4.b1 b1Var = fn4.b1.f346014b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e abstractActivityC18755xab3fd75e = this.f346157c;
        abstractActivityC18755xab3fd75e.getClass();
        b1Var.a(abstractActivityC18755xab3fd75e, abstractActivityC18755xab3fd75e.f256668o, xn6Var);
        abstractActivityC18755xab3fd75e.M.dismiss();
        jx3.f.INSTANCE.d(17080, 65, 2);
    }

    @Override // in4.p
    /* renamed from: onDismiss */
    public void mo129854xb349b3ab() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "more popupWindow dismiss");
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e abstractActivityC18755xab3fd75e = this.f346157c;
        if (abstractActivityC18755xab3fd75e.L) {
            abstractActivityC18755xab3fd75e.L = false;
            if (abstractActivityC18755xab3fd75e.N) {
                return;
            }
            abstractActivityC18755xab3fd75e.f256659J.k();
            if (abstractActivityC18755xab3fd75e.U) {
                try {
                    ((gn4.c0) abstractActivityC18755xab3fd75e.f256659J.f346107c.mo129842x143e7d6c()).y();
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }
}
