package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes2.dex */
public final class m1 extends w92.a {
    public m1(boolean z17, java.lang.String str, int i17) {
        super(-1, str, z17, 0, i17);
    }

    @Override // zx2.k, zx2.i
    public void c(android.view.ViewGroup viewGroup) {
        android.view.View findViewById;
        super.c(viewGroup);
        android.widget.TextView textView = this.f558585j;
        if (textView != null) {
            textView.setTextSize(1, 14.0f);
        }
        if (viewGroup == null || (findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f568734nv5)) == null) {
            return;
        }
        findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), 0);
    }
}
