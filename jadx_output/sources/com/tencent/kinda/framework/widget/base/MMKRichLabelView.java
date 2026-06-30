package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class MMKRichLabelView extends com.tencent.kinda.framework.widget.base.MMKLabelView implements com.tencent.kinda.gen.KRichLabelView {
    public com.tencent.kinda.gen.VoidCallback linkCallback;
    private com.tencent.kinda.framework.widget.base.MMKRichText richText;

    @Override // com.tencent.kinda.gen.KRichLabelView
    public com.tencent.kinda.gen.KText getRichText() {
        return this.richText;
    }

    @Override // com.tencent.kinda.gen.KRichLabelView
    public void setRichText(com.tencent.kinda.gen.KText kText) {
        if (kText == null || !(kText instanceof com.tencent.kinda.framework.widget.base.MMKRichText)) {
            return;
        }
        com.tencent.kinda.framework.widget.base.MMKRichText mMKRichText = (com.tencent.kinda.framework.widget.base.MMKRichText) kText;
        this.richText = mMKRichText;
        mMKRichText.supportDynamicSize = getSupportDynamicSize();
        this.richText.defaultTextSize = i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, getTextSize());
        this.linkCallback = this.richText.linkCallback;
        getView().setText(this.richText.get());
        if (this.richText.hasLinkAndCanCallback) {
            getView().setClickable(true);
        } else {
            getView().setClickable(false);
        }
        this.richText.get().toString();
        new java.lang.StringBuilder("").append(getTextColor());
        com.tencent.kinda.framework.widget.tools.MMKViewUtil.argbColor(com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(getTextColor(), com.tencent.kinda.framework.widget.tools.ColorUtil.MMViewType.MMKRichLabelView));
        java.lang.Integer.toHexString(com.tencent.kinda.framework.widget.tools.MMKViewUtil.argbColor(com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByModeNoCompat(getTextColor())));
        float f17 = this.richText.defaultTextSize;
        setTextColor(getTextColor());
        notifyChanged();
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKLabelView, com.tencent.kinda.gen.KLabelView
    public void setTextColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
        super.setTextColor(dynamicColor);
        java.lang.Integer.toHexString(com.tencent.kinda.framework.widget.tools.MMKViewUtil.argbColor(com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor, com.tencent.kinda.framework.widget.tools.ColorUtil.MMViewType.MMKRichLabelView)));
        getView().setTextColor(com.tencent.kinda.framework.widget.tools.MMKViewUtil.argbColor(com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByModeNoCompat(dynamicColor)));
        notifyChanged();
    }
}
