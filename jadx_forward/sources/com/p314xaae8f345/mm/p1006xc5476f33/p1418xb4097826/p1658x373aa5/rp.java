package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class rp implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.wb {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.wb
    public boolean a(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 comment, android.widget.TextView tagView, android.widget.ImageView iconView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagView, "tagView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconView, "iconView");
        int m76080xf4204902 = comment.m76080xf4204902();
        if (m76080xf4204902 <= 0) {
            return false;
        }
        android.content.Context context = tagView.getContext();
        int textSize = (int) tagView.getTextSize();
        tagView.setVisibility(0);
        tagView.setTextColor(b3.l.m9702x7444d5ad(tagView.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.adi));
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        tagView.setText(spannableStringBuilder.append(hc2.x0.k("#", context, '#', com.p314xaae8f345.mm.R.raw.f80313x7abd4f8b, com.p314xaae8f345.mm.R.C30859x5a72f63.adi, textSize, textSize, 0, 0, 0, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null)).append((java.lang.CharSequence) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.o(java.lang.Math.abs(m76080xf4204902), false)));
        iconView.setVisibility(8);
        return true;
    }
}
