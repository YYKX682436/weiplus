package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f f176829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f176830e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13081x70323a5 f176831f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.a f176832g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f activityC13069x47bc6a4f, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13081x70323a5 c13081x70323a5, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.a aVar) {
        super(0);
        this.f176829d = activityC13069x47bc6a4f;
        this.f176830e = s0Var;
        this.f176831f = c13081x70323a5;
        this.f176832g = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f activityC13069x47bc6a4f = this.f176829d;
        java.lang.String str = activityC13069x47bc6a4f.f176767d;
        this.f176830e.w(com.p314xaae8f345.mm.R.id.bvp, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13081x70323a5 c13081x70323a5 = this.f176831f;
        c13081x70323a5.setVisibility(0);
        c13081x70323a5.f177007e = activityC13069x47bc6a4f.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
        c13081x70323a5.f177006d = activityC13069x47bc6a4f.f176783w;
        c13081x70323a5.m54470x205ac394(activityC13069x47bc6a4f.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
        c13081x70323a5.getLayoutParams().height = activityC13069x47bc6a4f.f176783w;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.a aVar = this.f176832g;
        java.lang.String str2 = aVar.a().f472878h;
        if (str2 == null || str2.length() == 0) {
            java.lang.String str3 = aVar.a().f472879i;
            if (!(str3 == null || str3.length() == 0)) {
                c13081x70323a5.setImageDrawable(ju1.e.a(android.graphics.Color.parseColor(aVar.a().f472879i)));
            }
        } else {
            ju1.e.b(c13081x70323a5, aVar.a().f472878h, activityC13069x47bc6a4f.f176784x, activityC13069x47bc6a4f.f176783w);
        }
        return jz5.f0.f384359a;
    }
}
