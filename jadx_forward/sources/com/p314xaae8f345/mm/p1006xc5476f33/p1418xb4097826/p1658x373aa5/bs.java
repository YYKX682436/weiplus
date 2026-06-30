package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class bs implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.wb {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.wb
    public boolean a(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 comment, android.widget.TextView tagView, android.widget.ImageView iconView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagView, "tagView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconView, "iconView");
        int m76071x9ca513a0 = comment.m76071x9ca513a0();
        if (m76071x9ca513a0 <= 0) {
            return false;
        }
        tagView.setVisibility(0);
        tagView.setText(tagView.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d0r, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.o(java.lang.Math.abs(m76071x9ca513a0), false)));
        tagView.setTextColor(b3.l.m9702x7444d5ad(tagView.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.adi));
        iconView.setVisibility(8);
        return true;
    }
}
