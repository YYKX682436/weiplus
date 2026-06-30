package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameBestSellingTitle */
/* loaded from: classes.dex */
public class C15942xb94ae91e extends android.widget.LinearLayout {
    public C15942xb94ae91e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: setText */
    public void m64736x765074af(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            setVisibility(8);
        } else {
            setVisibility(0);
            ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.git)).setText(str);
        }
    }
}
