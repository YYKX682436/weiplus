package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class v0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf f176920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13081x70323a5 f176921e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.t0 f176922f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf activityC13074xfcf8fabf, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13081x70323a5 c13081x70323a5, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.t0 t0Var) {
        super(0);
        this.f176920d = activityC13074xfcf8fabf;
        this.f176921e = c13081x70323a5;
        this.f176922f = t0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf activityC13074xfcf8fabf = this.f176920d;
        java.lang.String str = activityC13074xfcf8fabf.f176802i;
        int dimensionPixelSize = activityC13074xfcf8fabf.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13081x70323a5 c13081x70323a5 = this.f176921e;
        c13081x70323a5.f177007e = dimensionPixelSize;
        c13081x70323a5.f177006d = activityC13074xfcf8fabf.N;
        c13081x70323a5.m54470x205ac394(activityC13074xfcf8fabf.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
        c13081x70323a5.getLayoutParams().height = activityC13074xfcf8fabf.N;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.t0 t0Var = this.f176922f;
        java.lang.String str2 = t0Var.a().f468303i;
        if (str2 == null || str2.length() == 0) {
            java.lang.String str3 = t0Var.a().f468302h;
            if (!(str3 == null || str3.length() == 0)) {
                c13081x70323a5.setImageDrawable(ju1.e.a(android.graphics.Color.parseColor(t0Var.a().f468302h)));
            }
        } else {
            ju1.e.b(c13081x70323a5, t0Var.a().f468303i, activityC13074xfcf8fabf.P, activityC13074xfcf8fabf.N);
        }
        return jz5.f0.f384359a;
    }
}
