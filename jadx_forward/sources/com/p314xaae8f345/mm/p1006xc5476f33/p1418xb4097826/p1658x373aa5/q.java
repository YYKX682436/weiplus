package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class q implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.wb {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.wb
    public boolean a(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 comment, android.widget.TextView tagView, android.widget.ImageView iconView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagView, "tagView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconView, "iconView");
        if (!hc2.c0.c(comment.m76068x3ffea218())) {
            return false;
        }
        tagView.setVisibility(0);
        tagView.setText(tagView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o8a));
        tagView.setTextColor(b3.l.m9702x7444d5ad(tagView.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19));
        iconView.setVisibility(8);
        return true;
    }
}
