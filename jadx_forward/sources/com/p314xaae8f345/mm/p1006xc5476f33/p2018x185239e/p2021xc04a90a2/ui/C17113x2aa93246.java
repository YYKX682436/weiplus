package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.BankMobileRemitChooseMMHeaderPreference */
/* loaded from: classes8.dex */
public class C17113x2aa93246 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public final java.util.Map L;

    public C17113x2aa93246(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = new java.util.HashMap();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.acq);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.acr);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
            android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(null);
            if (Bi != null) {
                imageView.setImageBitmap(Bi);
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.a aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.a(this, imageView);
                ((java.util.HashMap) this.L).put(null, aVar);
                ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(null, aVar);
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
            return;
        }
        textView.setText((java.lang.CharSequence) null);
    }

    public C17113x2aa93246(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = new java.util.HashMap();
    }

    public C17113x2aa93246(android.content.Context context) {
        super(context);
        this.L = new java.util.HashMap();
    }
}
