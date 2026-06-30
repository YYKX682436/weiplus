package lx2;

/* loaded from: classes2.dex */
public final class e extends lx2.d {

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f403593k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f403594l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f403595m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15298x95ee76f1 tipsLayout) {
        super(tipsLayout);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsLayout, "tipsLayout");
        this.f403593k = "followtab_tl_bubble";
        this.f403594l = "TLFollow";
        this.f403595m = "FollowTipsBubbleViewHelper";
    }

    @Override // lx2.d
    public r45.qt2 c() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((jz5.n) this.f403587e).mo141623x754a37bb()).W6(3);
    }

    @Override // lx2.d
    public java.lang.String d() {
        return this.f403594l;
    }

    @Override // lx2.d
    public java.lang.String e() {
        return this.f403593k;
    }

    @Override // lx2.d
    public java.lang.String f() {
        return this.f403595m;
    }

    @Override // lx2.d
    public void h() {
        super.h();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gb gbVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15298x95ee76f1.f212670h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15298x95ee76f1.f212671i = true;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5538x56837f90 c5538x56837f90 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5538x56837f90();
        c5538x56837f90.f135862g.f88471a = 3;
        c5538x56837f90.e();
    }

    @Override // lx2.d
    public void i(android.view.View arrow, android.widget.LinearLayout.LayoutParams arrowParams, android.widget.FrameLayout.LayoutParams tipsParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arrow, "arrow");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arrowParams, "arrowParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsParams, "tipsParams");
        int width = this.f403583a.getWidth();
        android.content.Context context = this.f403584b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gi X6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl.class)).X6(3);
        android.widget.TextView textView = X6 != null ? X6.f216061e : null;
        int[] iArr = new int[2];
        if (textView != null) {
            textView.getLocationInWindow(iArr);
        }
        android.content.res.Resources resources = this.f403585c;
        int dimension = (int) resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        int i17 = iArr[0];
        int dimension2 = i17 > 0 ? i17 + dimension : (int) resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561200c4);
        int i18 = width / 2;
        int i19 = dimension2 - i18;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[adjustTipsBubbleLayout] width=");
        sb6.append(width);
        sb6.append(" startPadding=");
        sb6.append(i19);
        sb6.append(" values=");
        sb6.append(iArr[0]);
        sb6.append(" followTitleView is null?=");
        sb6.append(textView == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f403595m, sb6.toString());
        if (i18 > dimension2) {
            arrowParams.gravity = 51;
            arrowParams.leftMargin = dimension2 - (dimension * 2);
        }
        tipsParams.gravity = 8388659;
        tipsParams.leftMargin = java.lang.Math.max(i19, dimension);
        super.i(arrow, arrowParams, tipsParams);
    }
}
