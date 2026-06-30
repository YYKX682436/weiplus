package com.tencent.kinda.framework.widget.base;

/* loaded from: classes15.dex */
public class KindaSwitchViewImpl extends com.tencent.kinda.framework.widget.base.MMKView<com.tencent.mm.ui.widget.MMSwitchBtn> implements com.tencent.kinda.gen.KSwitchView {
    private com.tencent.mm.ui.widget.MMSwitchBtn mmSwitchBtn;
    public com.tencent.kinda.gen.KSwitchViewOnChangeSwitchCallback onChangeSwitchCallback;

    @Override // com.tencent.kinda.gen.KSwitchView
    public boolean getEnabled() {
        return this.mmSwitchBtn.isEnabled();
    }

    @Override // com.tencent.kinda.gen.KSwitchView
    public com.tencent.kinda.gen.KImage getOffImage() {
        return null;
    }

    @Override // com.tencent.kinda.gen.KSwitchView
    public boolean getOn() {
        return this.mmSwitchBtn.f211363x;
    }

    @Override // com.tencent.kinda.gen.KSwitchView
    public com.tencent.kinda.gen.KImage getOnImage() {
        return null;
    }

    @Override // com.tencent.kinda.gen.KSwitchView
    public com.tencent.kinda.gen.DynamicColor getOnTintColor() {
        return null;
    }

    @Override // com.tencent.kinda.gen.KSwitchView
    public com.tencent.kinda.gen.DynamicColor getThumbTintColor() {
        return null;
    }

    @Override // com.tencent.kinda.gen.KSwitchView
    public com.tencent.kinda.gen.DynamicColor getTintColor() {
        return null;
    }

    @Override // com.tencent.kinda.gen.KSwitchView
    public void setEnabled(boolean z17) {
        this.mmSwitchBtn.setEnabled(z17);
    }

    @Override // com.tencent.kinda.gen.KSwitchView
    public void setOffImage(com.tencent.kinda.gen.KImage kImage) {
    }

    @Override // com.tencent.kinda.gen.KSwitchView
    public void setOn(boolean z17) {
        this.mmSwitchBtn.setCheck(z17);
    }

    @Override // com.tencent.kinda.gen.KSwitchView
    public void setOnChangeSwitchCallback(com.tencent.kinda.gen.KSwitchViewOnChangeSwitchCallback kSwitchViewOnChangeSwitchCallback) {
        this.onChangeSwitchCallback = kSwitchViewOnChangeSwitchCallback;
        this.mmSwitchBtn.setSwitchListener(new al5.c2() { // from class: com.tencent.kinda.framework.widget.base.KindaSwitchViewImpl.1
            @Override // al5.c2
            public void onStatusChange(boolean z17) {
                com.tencent.kinda.framework.widget.base.KindaSwitchViewImpl.this.onChangeSwitchCallback.onChangeSwitch();
            }
        });
    }

    @Override // com.tencent.kinda.gen.KSwitchView
    public void setOnImage(com.tencent.kinda.gen.KImage kImage) {
    }

    @Override // com.tencent.kinda.gen.KSwitchView
    public void setOnTintColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
    }

    @Override // com.tencent.kinda.gen.KSwitchView
    public void setThumbTintColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
    }

    @Override // com.tencent.kinda.gen.KSwitchView
    public void setTintColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public com.tencent.mm.ui.widget.MMSwitchBtn createView(android.content.Context context) {
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = new com.tencent.mm.ui.widget.MMSwitchBtn(context);
        this.mmSwitchBtn = mMSwitchBtn;
        return mMSwitchBtn;
    }
}
