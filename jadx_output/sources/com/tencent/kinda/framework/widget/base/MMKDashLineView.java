package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class MMKDashLineView extends com.tencent.kinda.framework.widget.base.MMKView<android.widget.LinearLayout> implements com.tencent.kinda.gen.KDashLineView {
    private android.widget.LinearLayout contentView;
    private boolean isVertical = false;
    private com.tencent.kinda.gen.DynamicColor mDashColor = new com.tencent.kinda.gen.DynamicColor(-1, 0);
    private float mDashWidth = com.tencent.mm.ui.zk.a(this.mContext, 2);
    private android.view.View mLine;

    @Override // com.tencent.kinda.gen.KDashLineView
    public com.tencent.kinda.gen.DynamicColor getDashColor() {
        return this.mDashColor;
    }

    @Override // com.tencent.kinda.gen.KDashLineView
    public float getDashWidth() {
        return this.mDashWidth;
    }

    @Override // com.tencent.kinda.gen.KDashLineView
    public boolean getVertical() {
        return this.isVertical;
    }

    @Override // com.tencent.kinda.gen.KDashLineView
    public void setDashColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
        this.mDashColor = dynamicColor;
    }

    @Override // com.tencent.kinda.gen.KDashLineView
    public void setDashWidth(float f17) {
        this.mDashWidth = f17;
    }

    @Override // com.tencent.kinda.gen.KDashLineView
    public void setVertical(boolean z17) {
        this.isVertical = z17;
        if (z17) {
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -1);
            this.contentView.setGravity(17);
            this.contentView.setLayoutParams(layoutParams);
            android.view.View findViewById = this.contentView.findViewById(com.tencent.kinda.framework.R.id.order_info_tinyapp_splitter_1);
            this.mLine = findViewById;
            android.view.ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
            layoutParams2.width = com.tencent.mm.ui.zk.a(this.mContext, java.lang.Math.round(getHeight()));
            layoutParams2.height = -1;
            android.graphics.drawable.Drawable drawable = this.mContext.getResources().getDrawable(com.tencent.mm.R.drawable.f480890et);
            drawable.setTint((int) com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByModeNoCompat(this.mDashColor));
            this.mLine.setBackground(drawable);
            this.mLine.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public android.widget.LinearLayout createView(android.content.Context context) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.View.inflate(context, com.tencent.kinda.framework.R.layout.kinda_dash_line_view, null);
        this.contentView = linearLayout;
        return linearLayout;
    }
}
