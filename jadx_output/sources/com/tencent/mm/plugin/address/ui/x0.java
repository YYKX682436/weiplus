package com.tencent.mm.plugin.address.ui;

/* loaded from: classes15.dex */
public final class x0 implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.l1 f74641d;

    public x0(com.tencent.mm.plugin.address.ui.l1 l1Var) {
        this.f74641d = l1Var;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectAddressDialog", "onPageSelected");
        com.tencent.mm.plugin.address.ui.l1 l1Var = this.f74641d;
        android.widget.TextView[] textViewArr = {(android.widget.TextView) ((jz5.n) l1Var.f74583x).getValue(), (android.widget.TextView) ((jz5.n) l1Var.f74584y).getValue(), (android.widget.TextView) ((jz5.n) l1Var.f74585z).getValue(), (android.widget.TextView) ((jz5.n) l1Var.A).getValue()};
        int i18 = 0;
        int i19 = 0;
        while (i18 < 4) {
            android.widget.TextView textView = textViewArr[i18];
            int i27 = i19 + 1;
            com.tencent.mm.plugin.address.model.RcptItem rcptItem = i19 >= l1Var.D.size() ? null : (com.tencent.mm.plugin.address.model.RcptItem) l1Var.D.get(i19);
            if (rcptItem != null) {
                if (textView != null) {
                    textView.setText(rcptItem.f74371d);
                }
                if (textView != null) {
                    textView.setTextColor(l1Var.getContext().getResources().getColor(com.tencent.mm.R.color.a0c));
                }
            } else {
                if (textView != null) {
                    java.lang.CharSequence hint = textView.getHint();
                    textView.setText(hint != null ? hint.toString() : null);
                }
                if (textView != null) {
                    textView.setTextColor(l1Var.getContext().getResources().getColor(com.tencent.mm.R.color.f479232tk));
                }
            }
            if (textView != null) {
                textView.setVisibility(l1Var.C > i19 ? 0 : 4);
            }
            if (i17 == i19) {
                if (textView != null) {
                    com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                }
            } else if (textView != null) {
                com.tencent.mm.ui.bk.t0(textView.getPaint());
            }
            i18++;
            i19 = i27;
        }
    }
}
