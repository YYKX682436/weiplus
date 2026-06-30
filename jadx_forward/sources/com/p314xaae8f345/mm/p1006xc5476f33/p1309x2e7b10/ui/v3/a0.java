package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 f176818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13081x70323a5 f176819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.tt f176820f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 activityC13072x745567c8, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13081x70323a5 c13081x70323a5, r45.tt ttVar) {
        super(0);
        this.f176818d = activityC13072x745567c8;
        this.f176819e = c13081x70323a5;
        this.f176820f = ttVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 activityC13072x745567c8 = this.f176818d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13072x745567c8.f176786i, "view height: " + activityC13072x745567c8.H + ", view width: " + activityC13072x745567c8.I);
        int dimensionPixelSize = activityC13072x745567c8.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13081x70323a5 c13081x70323a5 = this.f176819e;
        c13081x70323a5.f177007e = dimensionPixelSize;
        c13081x70323a5.f177006d = activityC13072x745567c8.H;
        c13081x70323a5.m54470x205ac394(activityC13072x745567c8.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl));
        android.view.ViewGroup.LayoutParams layoutParams = c13081x70323a5.getLayoutParams();
        int i17 = activityC13072x745567c8.H;
        layoutParams.height = i17;
        java.lang.String str = this.f176820f.f468303i;
        if (str == null) {
            return null;
        }
        lu1.b0.c(this.f176819e, str, 0.0f, false, 0, activityC13072x745567c8.I, i17, 28, null);
        return jz5.f0.f384359a;
    }
}
