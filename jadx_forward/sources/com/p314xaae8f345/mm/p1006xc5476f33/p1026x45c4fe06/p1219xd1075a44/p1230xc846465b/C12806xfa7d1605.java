package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.MenuAppBrandRecentView */
/* loaded from: classes7.dex */
public class C12806xfa7d1605 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12805xabdd4ef7 {

    /* renamed from: u2, reason: collision with root package name */
    public static final int f173455u2;

    /* renamed from: v2, reason: collision with root package name */
    public static final int f173456v2;

    /* renamed from: t2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.h0 f173457t2;

    static {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.w.f173611e;
        f173455u2 = i17 - 1;
        f173456v2 = i17;
    }

    public C12806xfa7d1605(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12805xabdd4ef7
    /* renamed from: getLayoutId */
    public int mo53643x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569675ib;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12805xabdd4ef7
    /* renamed from: getLoadCount */
    public int mo53644x50b42d13() {
        return f173456v2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12805xabdd4ef7
    /* renamed from: getShowCount */
    public int mo53647x8c6e4d5c() {
        return f173455u2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12805xabdd4ef7
    /* renamed from: getType */
    public java.lang.String mo53649xfb85f7b0() {
        return "MenuAppBrandRecentView";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12805xabdd4ef7
    public void i1(android.content.Context context) {
        super.i1(context);
        super.mo53624xa1aeda28(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.e2(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12805xabdd4ef7
    public void j1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.p1 p1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.x xVar, int i17) {
        super.j1(p1Var, xVar, i17);
        int color = getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
        android.widget.TextView textView = p1Var.f173564f;
        textView.setTextColor(color);
        android.widget.ImageView imageView = p1Var.f173562d;
        if (xVar == null || xVar.f173618b != 2) {
            if (xVar == null || xVar.f173618b != -1) {
                return;
            }
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78922x61de8d17);
            return;
        }
        textView.setVisibility(0);
        p1Var.f173563e.setVisibility(8);
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.lto);
        imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78441x1200c679);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12805xabdd4ef7, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12800x5824e46
    /* renamed from: setOnItemClickListener */
    public void mo53624xa1aeda28(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.h0 h0Var) {
        this.f173457t2 = h0Var;
    }
}
