package bm;

/* loaded from: classes16.dex */
public class x extends xn5.g {
    @Override // xn5.e0
    public java.lang.String a() {
        return "sns_ws_fold_item_x2c";
    }

    @Override // xn5.g
    public android.view.View c(android.content.Context context) {
        return null;
    }

    @Override // xn5.g
    public android.view.View f(android.content.Context context, android.util.AttributeSet attributeSet, java.lang.String str, int i17) {
        android.view.View view;
        if (i17 == 0) {
            o();
        }
        if (i17 == 0) {
            android.view.View view2 = (com.tencent.mm.view.x2c.X2CView) h(context, "com.tencent.mm.view.x2c.X2CView", 0);
            if (view2 != null) {
                view2.setId(com.tencent.mm.R.id.vpo);
                view2.setBackground(r(context, view2, "com.tencent.mm.view.x2c.X2CView", "@color/BW_90", com.tencent.mm.R.color.BW_90));
            }
            g(context, view2, "com.tencent.mm.view.x2c.X2CView", 0);
            view = view2;
        } else {
            view = null;
        }
        android.view.View view3 = view;
        if (i17 == 1) {
            android.view.View view4 = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
            if (view4 != null) {
                xn5.i0 i0Var = xn5.j0.f455685a;
                i0Var.o(context, view4, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
                i0Var.H(context, view4, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            }
            g(context, view4, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
            view3 = view4;
        }
        android.view.View view5 = view3;
        if (i17 == 3) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) h(context, "com.tencent.mm.ui.widget.imageview.WeImageView", 3);
            if (weImageView != null) {
                weImageView.setImageDrawable(r(context, weImageView, "com.tencent.mm.ui.widget.imageview.WeImageView", "@raw/icons_outlined_arrow", com.tencent.mm.R.raw.icons_outlined_arrow));
                weImageView.setIconColor(p(context, weImageView, "com.tencent.mm.ui.widget.imageview.WeImageView", "@color/Glyph_1", com.tencent.mm.R.color.adg));
            }
            g(context, weImageView, "com.tencent.mm.ui.widget.imageview.WeImageView", 3);
            view5 = weImageView;
        }
        if (i17 == 3) {
            n();
        }
        return view5;
    }

    @Override // xn5.e0
    public int getLayoutId() {
        return com.tencent.mm.R.layout.epn;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Sns_Ws_Fold_Item_X2c_X2C";
    }
}
