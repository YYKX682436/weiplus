package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes2.dex */
public final class m1 extends w92.a {
    public m1(boolean z17, java.lang.String str, int i17) {
        super(-1, str, z17, 0, i17);
    }

    @Override // zx2.k, zx2.i
    public void c(android.view.ViewGroup viewGroup) {
        android.view.View findViewById;
        super.c(viewGroup);
        android.widget.TextView textView = this.f477052j;
        if (textView != null) {
            textView.setTextSize(1, 14.0f);
        }
        if (viewGroup == null || (findViewById = viewGroup.findViewById(com.tencent.mm.R.id.f487201nv5)) == null) {
            return;
        }
        findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), 0);
    }
}
