package bm;

/* loaded from: classes16.dex */
public class q extends xn5.g {
    @Override // xn5.e0
    public java.lang.String a() {
        return "sns_media_video_item_x2c_old";
    }

    @Override // xn5.g
    public android.view.View c(android.content.Context context) {
        o();
        com.tencent.mm.view.x2c.X2CRelativeLayout x2CRelativeLayout = (com.tencent.mm.view.x2c.X2CRelativeLayout) h(context, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0);
        if (x2CRelativeLayout == null) {
            x2CRelativeLayout = new com.tencent.mm.view.x2c.X2CRelativeLayout(context, xn5.q0.f455705d);
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(context, xn5.q0.f455705d);
        xn5.i0 i0Var = xn5.j0.f455685a;
        i0Var.B(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        i0Var.y(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        x2CRelativeLayout.setTag(com.tencent.mm.R.id.psd, marginLayoutParams);
        com.tencent.mm.plugin.sns.ui.MaskImageView maskImageView = (com.tencent.mm.plugin.sns.ui.MaskImageView) h(context, "com.tencent.mm.plugin.sns.ui.MaskImageView", 1);
        if (maskImageView == null) {
            maskImageView = new com.tencent.mm.plugin.sns.ui.MaskImageView(context, xn5.q0.f455705d);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, maskImageView, "com.tencent.mm.plugin.sns.ui.MaskImageView", com.tencent.mm.R.id.f485336hc1);
        i0Var.B(context, layoutParams, "X2CRelativeLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams, "X2CRelativeLayout.LayoutParams", -1);
        i0Var.I(context, maskImageView, "com.tencent.mm.plugin.sns.ui.MaskImageView", android.widget.ImageView.ScaleType.CENTER_CROP);
        com.tencent.mm.plugin.sns.ui.MaskImageView maskImageView2 = maskImageView;
        i0Var.K(context, maskImageView, "com.tencent.mm.plugin.sns.ui.MaskImageView", r(context, maskImageView2, "com.tencent.mm.plugin.sns.ui.MaskImageView", "@color/BG_3", com.tencent.mm.R.color.f478492d));
        maskImageView.setLayoutParams(layoutParams);
        x2CRelativeLayout.addView(maskImageView);
        d(context, maskImageView2, "com.tencent.mm.plugin.sns.ui.MaskImageView", false, 1);
        com.tencent.mm.view.x2c.X2CImageView x2CImageView = (com.tencent.mm.view.x2c.X2CImageView) h(context, "com.tencent.mm.view.x2c.X2CImageView", 2);
        if (x2CImageView == null) {
            x2CImageView = new com.tencent.mm.view.x2c.X2CImageView(context, xn5.q0.f455705d);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, x2CImageView, "com.tencent.mm.view.x2c.X2CImageView", com.tencent.mm.R.id.hbz);
        i0Var.B(context, layoutParams2, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams2, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.v(context, layoutParams2, "X2CRelativeLayout.LayoutParams", -1);
        com.tencent.mm.view.x2c.X2CImageView x2CImageView2 = x2CImageView;
        i0Var.f(context, x2CImageView, "com.tencent.mm.view.x2c.X2CImageView", r(context, x2CImageView2, "com.tencent.mm.view.x2c.X2CImageView", "@raw/shortvideo_play_btn", com.tencent.mm.R.raw.shortvideo_play_btn));
        x2CImageView.setLayoutParams(layoutParams2);
        x2CRelativeLayout.addView(x2CImageView);
        d(context, x2CImageView2, "com.tencent.mm.view.x2c.X2CImageView", false, 2);
        com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout improveVideoFrameLayout = (com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout) h(context, "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout", 3);
        if (improveVideoFrameLayout == null) {
            improveVideoFrameLayout = new com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout(context, xn5.q0.f455705d);
        }
        com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout improveVideoFrameLayout2 = improveVideoFrameLayout;
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, improveVideoFrameLayout2, "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout", com.tencent.mm.R.id.f485335hc0);
        i0Var.B(context, layoutParams3, "X2CRelativeLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams3, "X2CRelativeLayout.LayoutParams", -1);
        improveVideoFrameLayout2.setLayoutParams(layoutParams3);
        x2CRelativeLayout.addView(improveVideoFrameLayout2);
        d(context, improveVideoFrameLayout2, "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout", false, 3);
        d(context, x2CRelativeLayout, "com.tencent.mm.view.x2c.X2CRelativeLayout", true, 0);
        n();
        return x2CRelativeLayout;
    }

    @Override // xn5.g
    public android.view.View f(android.content.Context context, android.util.AttributeSet attributeSet, java.lang.String str, int i17) {
        android.view.View view;
        if (i17 == 0) {
            o();
        }
        if (i17 == 0) {
            view = (com.tencent.mm.view.x2c.X2CRelativeLayout) h(context, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0);
            g(context, view, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0);
        } else {
            view = null;
        }
        if (i17 == 1) {
            view = (com.tencent.mm.plugin.sns.ui.MaskImageView) h(context, "com.tencent.mm.plugin.sns.ui.MaskImageView", 1);
            if (view != null) {
                xn5.i0 i0Var = xn5.j0.f455685a;
                i0Var.p(context, view, "com.tencent.mm.plugin.sns.ui.MaskImageView", com.tencent.mm.R.id.f485336hc1);
                i0Var.I(context, view, "com.tencent.mm.plugin.sns.ui.MaskImageView", android.widget.ImageView.ScaleType.CENTER_CROP);
                i0Var.K(context, view, "com.tencent.mm.plugin.sns.ui.MaskImageView", r(context, view, "com.tencent.mm.plugin.sns.ui.MaskImageView", "@color/BG_3", com.tencent.mm.R.color.f478492d));
            }
            g(context, view, "com.tencent.mm.plugin.sns.ui.MaskImageView", 1);
        }
        if (i17 == 2) {
            view = (com.tencent.mm.view.x2c.X2CImageView) h(context, "com.tencent.mm.view.x2c.X2CImageView", 2);
            if (view != null) {
                view.setId(com.tencent.mm.R.id.hbz);
                view.setBackground(r(context, view, "com.tencent.mm.view.x2c.X2CImageView", "@raw/shortvideo_play_btn", com.tencent.mm.R.raw.shortvideo_play_btn));
            }
            g(context, view, "com.tencent.mm.view.x2c.X2CImageView", 2);
        }
        if (i17 == 3) {
            view = (com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout) h(context, "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout", 3);
            if (view != null) {
                view.setId(com.tencent.mm.R.id.f485335hc0);
            }
            g(context, view, "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout", 3);
        }
        if (i17 == 3) {
            n();
        }
        return view;
    }

    @Override // xn5.e0
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dif;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Sns_Media_Video_Item_X2c_Old_X2C";
    }
}
