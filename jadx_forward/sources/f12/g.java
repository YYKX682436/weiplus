package f12;

/* loaded from: classes4.dex */
public final class g implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 f340138d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 activityC13254xf536ee79) {
        this.f340138d = activityC13254xf536ee79;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public final void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 activityC13254xf536ee79 = this.f340138d;
        int V6 = com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79.V6(activityC13254xf536ee79, (java.lang.String) obj, com.p314xaae8f345.mm.R.C30859x5a72f63.a6x);
        f12.c0 c0Var = activityC13254xf536ee79.f178973f;
        if (c0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        c0Var.f340105a.setBackgroundColor(V6);
        activityC13254xf536ee79.mo64405x4dab7448(V6);
        activityC13254xf536ee79.getWindow().setStatusBarColor(0);
        activityC13254xf536ee79.getWindow().setNavigationBarColor(0);
    }
}
