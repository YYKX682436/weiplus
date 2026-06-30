package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes3.dex */
public final class b1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b f211737d;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b c15147x19964f7b) {
        this.f211737d = c15147x19964f7b;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b c15147x19964f7b = this.f211737d;
        c15147x19964f7b.m61024xdb574fcd().postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a1(c15147x19964f7b), 160L);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTextChanged: s?.length：");
        sb6.append(charSequence != null ? java.lang.Integer.valueOf(charSequence.length()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentFooter", sb6.toString());
        if (charSequence != null) {
            int length = charSequence.length();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b c15147x19964f7b = this.f211737d;
            if (length < c15147x19964f7b.getCommentTextLimit() - c15147x19964f7b.getCommentTextTipsLimit()) {
                android.widget.TextView tvTextCountLimit = c15147x19964f7b.getTvTextCountLimit();
                if (tvTextCountLimit == null) {
                    return;
                }
                tvTextCountLimit.setVisibility(8);
                return;
            }
            android.widget.TextView tvTextCountLimit2 = c15147x19964f7b.getTvTextCountLimit();
            if (tvTextCountLimit2 != null) {
                tvTextCountLimit2.setVisibility(0);
            }
            if (charSequence.length() > c15147x19964f7b.getCommentTextLimit()) {
                android.widget.TextView tvTextCountLimit3 = c15147x19964f7b.getTvTextCountLimit();
                if (tvTextCountLimit3 != null) {
                    tvTextCountLimit3.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
                }
                android.widget.TextView tvTextCountLimit4 = c15147x19964f7b.getTvTextCountLimit();
                if (tvTextCountLimit4 == null) {
                    return;
                }
                tvTextCountLimit4.setText(java.lang.String.valueOf(c15147x19964f7b.getCommentTextLimit() - charSequence.length()));
                return;
            }
            android.widget.TextView tvTextCountLimit5 = c15147x19964f7b.getTvTextCountLimit();
            if (tvTextCountLimit5 != null) {
                tvTextCountLimit5.setText(java.lang.String.valueOf(c15147x19964f7b.getCommentTextLimit() - charSequence.length()));
            }
            android.widget.TextView tvTextCountLimit6 = c15147x19964f7b.getTvTextCountLimit();
            if (tvTextCountLimit6 != null) {
                tvTextCountLimit6.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
            }
        }
    }
}
