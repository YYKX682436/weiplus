package com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13;

/* loaded from: classes11.dex */
public class i0 extends com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a {
    public java.lang.CharSequence C;
    public final com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c D;
    public final com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b E;

    public i0(int i17) {
        super(5, i17);
        this.D = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.h0(this);
        this.E = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.g0(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d
    public void a(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b bVar) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        for (java.lang.String str : this.A.f432664c) {
            android.text.SpannableString spannableString = new android.text.SpannableString(str);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.c.f219556a), 0, str.length(), 33);
            spannableStringBuilder.append((java.lang.CharSequence) spannableString);
            spannableStringBuilder.append((java.lang.CharSequence) "、");
        }
        this.C = android.text.TextUtils.concat(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ife), spannableStringBuilder.subSequence(0, spannableStringBuilder.length() - 1), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ife));
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c b() {
        return this.D;
    }
}
