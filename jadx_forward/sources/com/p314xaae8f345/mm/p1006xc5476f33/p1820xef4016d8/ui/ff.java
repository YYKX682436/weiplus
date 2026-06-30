package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes.dex */
public final class ff extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final void O6(boolean z17, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4) {
        rk0.c.c("MicroMsg.LuckyMoneyNewReceiveUIC", "[doTextStyle] hasEnvelope :" + z17 + ' ', new java.lang.Object[0]);
        if (z17) {
            com.p314xaae8f345.mm.ui.bk.r0(textView != null ? textView.getPaint() : null, 0.8f);
            com.p314xaae8f345.mm.ui.bk.r0(textView2 != null ? textView2.getPaint() : null, 0.8f);
            com.p314xaae8f345.mm.ui.bk.r0(textView3 != null ? textView3.getPaint() : null, 0.8f);
            int parseColor = android.graphics.Color.parseColor("#FA755411");
            if (textView != null) {
                textView.setShadowLayer(12.0f, 0.0f, 0.0f, parseColor);
            }
            if (textView2 != null) {
                textView2.setShadowLayer(12.0f, 0.0f, 0.0f, parseColor);
            }
            if (textView3 != null) {
                textView3.setShadowLayer(12.0f, 0.0f, 0.0f, parseColor);
            }
            if (textView != null) {
                textView.setTextColor(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.al8));
            }
            if (textView2 != null) {
                textView2.setTextColor(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.al8));
            }
            if (textView3 != null) {
                textView3.setTextColor(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.al7));
            }
            if (textView4 != null) {
                textView4.setTextColor(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.al8));
            }
            if (textView4 != null) {
                textView4.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, m158361x893a2f6f().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.d6l), (android.graphics.drawable.Drawable) null);
            }
        }
    }
}
