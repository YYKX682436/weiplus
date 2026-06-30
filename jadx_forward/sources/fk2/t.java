package fk2;

/* loaded from: classes3.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f345006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f345007e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fk2.v f345008f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14309x7fd7c1d9 f345009g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345010h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.g f345011i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f345012m;

    public t(bm2.h1 h1Var, android.view.View view, fk2.v vVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14309x7fd7c1d9 c14309x7fd7c1d9, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, android.content.Context context) {
        this.f345007e = h1Var;
        this.f345006d = view;
        this.f345008f = vVar;
        this.f345009g = c14309x7fd7c1d9;
        this.f345010h = str;
        this.f345011i = gVar;
        this.f345012m = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bm2.h1 h1Var = this.f345007e;
        android.widget.FrameLayout frameLayout = h1Var.f103467o;
        android.view.View emojiViewContainer = this.f345006d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(emojiViewContainer, "$emojiViewContainer");
        if (frameLayout.indexOfChild(emojiViewContainer) != -1) {
            int[] iArr = new int[2];
            emojiViewContainer.getLocationOnScreen(iArr);
            int measuredWidth = iArr[0] + emojiViewContainer.getMeasuredWidth();
            int[] iArr2 = new int[2];
            h1Var.f103462g.getLocationOnScreen(iArr2);
            int measuredWidth2 = iArr2[0] + h1Var.f103462g.getMeasuredWidth();
            fk2.v vVar = this.f345008f;
            java.lang.String str = vVar.f345027m;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("containerActualRight = ");
            sb6.append(measuredWidth);
            sb6.append(", bgActualRight = ");
            sb6.append(measuredWidth2);
            sb6.append(",containerMeasuredWidth = ");
            sb6.append(emojiViewContainer.getMeasuredWidth());
            sb6.append(", emojiMeasuredWidth = ");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14309x7fd7c1d9 c14309x7fd7c1d9 = this.f345009g;
            sb6.append(c14309x7fd7c1d9.getMeasuredWidth());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            if (measuredWidth > measuredWidth2 || emojiViewContainer.getMeasuredWidth() < c14309x7fd7c1d9.getMeasuredWidth()) {
                h1Var.f103467o.setVisibility(8);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(emojiViewContainer, "$emojiViewContainer");
                pm0.v.B(emojiViewContainer);
                fk2.v.q(vVar, this.f345012m, h1Var.f103466n);
                h1Var.f103466n.addView(emojiViewContainer);
                h1Var.f103466n.setVisibility(0);
                if (c14309x7fd7c1d9.getStatus() != 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f345027m, "re-loadEmoji, case remove view before emoji load success");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(emojiViewContainer, "$emojiViewContainer");
                    vVar.r(this.f345010h, this.f345011i, emojiViewContainer);
                }
                c14309x7fd7c1d9.requestLayout();
            }
        }
    }
}
