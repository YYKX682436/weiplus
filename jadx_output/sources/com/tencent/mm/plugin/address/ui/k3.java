package com.tencent.mm.plugin.address.ui;

/* loaded from: classes.dex */
public class k3 extends com.tencent.mm.plugin.address.ui.l3 {
    @Override // com.tencent.mm.plugin.address.ui.l3, android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.sbg);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.ptv);
        if (weImageView.getVisibility() == 0) {
            weImageView.performClick();
        }
        if (weImageView2.getVisibility() == 0) {
            weImageView2.performClick();
        }
    }
}
