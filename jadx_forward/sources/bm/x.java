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
            android.view.View view2 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22881x884f82ee) h(context, "com.tencent.mm.view.x2c.X2CView", 0);
            if (view2 != null) {
                view2.setId(com.p314xaae8f345.mm.R.id.vpo);
                view2.setBackground(r(context, view2, "com.tencent.mm.view.x2c.X2CView", "@color/BW_90", com.p314xaae8f345.mm.R.C30859x5a72f63.f77696x3cb0741));
            }
            g(context, view2, "com.tencent.mm.view.x2c.X2CView", 0);
            view = view2;
        } else {
            view = null;
        }
        android.view.View view3 = view;
        if (i17 == 1) {
            android.view.View view4 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
            if (view4 != null) {
                xn5.i0 i0Var = xn5.j0.f537218a;
                i0Var.o(context, view4, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
                i0Var.H(context, view4, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            }
            g(context, view4, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
            view3 = view4;
        }
        android.view.View view5 = view3;
        if (i17 == 3) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) h(context, "com.tencent.mm.ui.widget.imageview.WeImageView", 3);
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageDrawable(r(context, c22699x3dcdb352, "com.tencent.mm.ui.widget.imageview.WeImageView", "@raw/icons_outlined_arrow", com.p314xaae8f345.mm.R.raw.f80007x8e72c9b1));
                c22699x3dcdb352.m82040x7541828(p(context, c22699x3dcdb352, "com.tencent.mm.ui.widget.imageview.WeImageView", "@color/Glyph_1", com.p314xaae8f345.mm.R.C30859x5a72f63.adg));
            }
            g(context, c22699x3dcdb352, "com.tencent.mm.ui.widget.imageview.WeImageView", 3);
            view5 = c22699x3dcdb352;
        }
        if (i17 == 3) {
            n();
        }
        return view5;
    }

    @Override // xn5.e0
    /* renamed from: getLayoutId */
    public int mo10731x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.epn;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Sns_Ws_Fold_Item_X2c_X2C";
    }
}
