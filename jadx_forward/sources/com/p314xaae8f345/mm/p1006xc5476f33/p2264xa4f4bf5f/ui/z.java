package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class z implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18612x3f06d82e f255997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255998e;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18612x3f06d82e c18612x3f06d82e, java.lang.String str) {
        this.f255997d = c18612x3f06d82e;
        this.f255998e = str;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        java.lang.CharSequence text;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18612x3f06d82e c18612x3f06d82e = this.f255997d;
        c18612x3f06d82e.removeOnLayoutChangeListener(this);
        android.widget.TextView tvInvisible = c18612x3f06d82e.getTvInvisible();
        if (tvInvisible != null) {
            tvInvisible.setVisibility(4);
            tvInvisible.setText(this.f255998e);
            int measuredHeight = c18612x3f06d82e.getMeasuredHeight();
            int measuredHeight2 = tvInvisible.getMeasuredHeight();
            float b17 = ym5.x.b(tvInvisible.getContext(), (float) java.lang.Math.ceil(java.lang.Math.min(measuredHeight, measuredHeight2)));
            c18612x3f06d82e.m71759x97d1f9a5(measuredHeight2);
            bk4.c2 textviewSuffixWrapper = c18612x3f06d82e.getTextviewSuffixWrapper();
            p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975 = textviewSuffixWrapper != null ? textviewSuffixWrapper.f102959q : null;
            if (abstractC1183x100d4975 != null) {
                ((p012xc85e97e9.p112x993b6d55.C1184xfa388aad) abstractC1183x100d4975).Z((b17 * 1000) / 5000);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LongTextView", "tvInvisible: tvHeight:" + measuredHeight2 + " rootViewHeight:" + measuredHeight + " rootView.paddingTop:" + tvInvisible.getRootView().getPaddingTop() + " duration:" + c18612x3f06d82e.m71734xf2fc9082() + " speed:5000");
            tvInvisible.setText("");
            tvInvisible.setVisibility(8);
            android.widget.TextView tvLongText = c18612x3f06d82e.getTvLongText();
            if (tvLongText != null) {
                tvLongText.getHeight();
            }
            android.widget.TextView tvLongText2 = c18612x3f06d82e.getTvLongText();
            if (tvLongText2 != null) {
                tvLongText2.getPaddingTop();
            }
            android.widget.TextView tvLongText3 = c18612x3f06d82e.getTvLongText();
            if (tvLongText3 != null) {
                tvLongText3.getPaddingBottom();
            }
            android.widget.TextView tvLongText4 = c18612x3f06d82e.getTvLongText();
            java.util.Objects.toString(tvLongText4 != null ? pm0.v.r(tvLongText4) : null);
            android.widget.TextView tvLongText5 = c18612x3f06d82e.getTvLongText();
            if (tvLongText5 != null && (text = tvLongText5.getText()) != null) {
                text.length();
            }
            android.widget.TextView tvLongText6 = c18612x3f06d82e.getTvLongText();
            if (tvLongText6 != null) {
                tvLongText6.getVisibility();
            }
            c18612x3f06d82e.m71737x736aaa7d();
        }
        android.view.ViewGroup rootView = c18612x3f06d82e.getRootView();
        if (rootView != null) {
            rootView.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.y(c18612x3f06d82e));
        }
    }
}
