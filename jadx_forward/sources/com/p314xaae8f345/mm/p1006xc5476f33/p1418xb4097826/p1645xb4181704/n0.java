package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes8.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f211846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 f211847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f211848f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f211849g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f211850h;

    public n0(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 o0Var, boolean z17, boolean z18, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f211846d = view;
        this.f211847e = o0Var;
        this.f211848f = z17;
        this.f211849g = z18;
        this.f211850h = c1163xf1deaba4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        int[] iArr = new int[2];
        android.view.View view = this.f211846d;
        view.getLocationOnScreen(iArr);
        int i18 = iArr[1];
        int[] iArr2 = new int[2];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var = this.f211847e.f211863o;
        android.widget.FrameLayout g17 = a2Var != null ? a2Var.g() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
        g17.getLocationOnScreen(iArr2);
        int i19 = iArr2[1];
        if (this.f211848f) {
            i17 = -(this.f211849g ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        } else {
            i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        }
        int i27 = i19 - i18;
        int height = (view.getHeight() + i27) - i17;
        if (height > 0) {
            height = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561265dp) + (i27 - i17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", "transToDiscoverComment: targetY:" + height + " headerLayoutBottomY:" + i19 + " viewTopY:" + i18 + " view.height:" + view.getHeight() + " margin:" + i17 + ' ');
        if (height < 0) {
            this.f211850h.mo7976xc291bbd2(0, -height);
        }
    }
}
