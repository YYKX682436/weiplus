package com.p314xaae8f345.mm.p1006xc5476f33.p1943xc4ac0ffe.ui;

/* renamed from: com.tencent.mm.plugin.patmsg.ui.AvatarPatTipImageView */
/* loaded from: classes5.dex */
public class C16784x72b881cf extends com.p314xaae8f345.mm.p1006xc5476f33.p1943xc4ac0ffe.ui.C16783xd8f83d56 implements mp3.m {

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1943xc4ac0ffe.ui.C16785xfbc81739 f234428i;

    public C16784x72b881cf(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* renamed from: getTipTextSize */
    public float mo67516x298edb53() {
        try {
            return ((android.widget.TextView) this.f234428i.getContentView().findViewById(com.p314xaae8f345.mm.R.id.kpx)).getTextSize();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AvatarPatTipImageView", th6, "getTipTextSize err", new java.lang.Object[0]);
            return 0.0f;
        }
    }

    @Override // mp3.m
    public void m(java.lang.CharSequence charSequence) {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int dimensionPixelSize = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.rightMargin = dimensionPixelSize;
        layoutParams.leftMargin = dimensionPixelSize;
        android.widget.TextView textView = (android.widget.TextView) this.f234428i.getContentView().findViewById(com.p314xaae8f345.mm.R.id.kpx);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, charSequence));
        this.f234428i.a(this, 0, 1, layoutParams, false, true, false);
        post(new pp3.a(this, iArr));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        pp3.j jVar = (pp3.j) this.f234427h;
        jVar.getClass();
        jVar.f439016b = this;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1943xc4ac0ffe.ui.C16783xd8f83d56, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((pp3.j) this.f234427h).b();
        this.f234428i.dismiss();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i17) {
        super.onWindowVisibilityChanged(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1943xc4ac0ffe.ui.C16783xd8f83d56
    /* renamed from: setTagUsername */
    public void mo67515x133d2cce(java.lang.String str) {
        java.lang.String mo67511x7cd7b95a = mo67511x7cd7b95a();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (mo67511x7cd7b95a == null) {
            mo67511x7cd7b95a = "";
        }
        if (!mo67511x7cd7b95a.equals(str)) {
            ((pp3.j) this.f234427h).b();
        }
        super.mo67515x133d2cce(str);
    }

    public C16784x72b881cf(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1943xc4ac0ffe.ui.C16785xfbc81739 c16785xfbc81739 = new com.p314xaae8f345.mm.p1006xc5476f33.p1943xc4ac0ffe.ui.C16785xfbc81739(com.p314xaae8f345.mm.ui.id.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c8y, (android.view.ViewGroup) null));
        this.f234428i = c16785xfbc81739;
        c16785xfbc81739.setAnimationStyle(com.p314xaae8f345.mm.R.C30868x68b1db1.f575978ne);
        c16785xfbc81739.setOutsideTouchable(false);
    }
}
