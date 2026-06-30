package com.tencent.kinda.framework.module.base;

/* loaded from: classes9.dex */
public class KindaBaseViewModule extends com.tencent.kinda.modularize.KindaModule {
    @Override // com.tencent.kinda.modularize.KindaModule
    public void configModule() {
        registerView("KView", com.tencent.kinda.framework.widget.base.MMKView.class);
        registerView("KViewLayout", com.tencent.kinda.framework.widget.base.MMKViewLayout.class);
        registerView("KLabelView", com.tencent.kinda.framework.widget.base.MMKLabelView.class);
        registerView("KEditText", com.tencent.kinda.framework.widget.base.MMKEditText.class);
        registerView("KButton", com.tencent.kinda.framework.widget.base.MMKButton.class);
        registerView("KImageView", com.tencent.kinda.framework.widget.base.MMKImageView.class);
        registerView("KText", com.tencent.kinda.framework.widget.base.MMKRichText.class);
        registerView("KLink", com.tencent.kinda.framework.widget.base.MMKRichText.MMKLink.class);
        registerView("KImage", com.tencent.kinda.framework.widget.base.MMKImage.class);
        registerView("KListView", com.tencent.kinda.framework.widget.base.MMKListView.class);
        registerView("KScrollView", com.tencent.kinda.framework.widget.base.MMKScrollView.class);
        registerView("KHorizontalScrollView", com.tencent.kinda.framework.widget.base.MMKHorizontalScrollView.class);
        registerView("KRichLabelView", com.tencent.kinda.framework.widget.base.MMKRichLabelView.class);
        registerView("KAvatarImageView", com.tencent.kinda.framework.widget.base.MMKAvatarImageView.class);
        registerView("KPwdInputView", com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.class);
        registerView("KSecureEditText", com.tencent.kinda.framework.widget.base.KindaSecureEditTextImpl.class);
        registerView("KSwitchView", com.tencent.kinda.framework.widget.base.KindaSwitchViewImpl.class);
        registerView("KProfessionEditView", com.tencent.kinda.framework.widget.base.KindaProfessionEditViewImpl.class);
        registerView("KPhoneEditText", com.tencent.kinda.framework.widget.base.KindaPhoneEditTextImpl.class);
        registerView("KRegionEditView", com.tencent.kinda.framework.widget.base.KindaRegionEditViewImpl.class);
        registerView("KCardNumberEditView", com.tencent.kinda.framework.widget.base.KindaCardNumberEditViewImpl.class);
        registerView("KBankEditView", com.tencent.kinda.framework.widget.base.KindaBankEditViewImpl.class);
        registerView("KOnePxLineView", com.tencent.kinda.framework.widget.base.MMKOnePxLineView.class);
        registerView("KCardTypePickerView", com.tencent.kinda.framework.widget.base.KindaCardTypePickerView.class);
        registerView("KValidDatePickerView", com.tencent.kinda.framework.widget.base.KindaValidDatePickerView.class);
        registerView("KDatePickerView", com.tencent.kinda.framework.widget.base.KindaDatePickerView.class);
        registerView("KDashLineView", com.tencent.kinda.framework.widget.base.MMKDashLineView.class);
        registerView("KDashLineBoarderLineView", com.tencent.kinda.framework.widget.base.KindaDashLineBoarderLineView.class);
        registerView("KCountryCallingCodeView", com.tencent.kinda.framework.widget.base.KCountryCallingCodeViewImpl.class);
        registerView("KCountPickerView", com.tencent.kinda.framework.widget.base.KindaCountPickerViewImpl.class);
        registerView("KActionSheet", com.tencent.kinda.framework.widget.base.KindaActionSheetImpl.class);
        registerView("KPatternLockView", com.tencent.kinda.framework.widget.base.KindaPatternLockView.class);
        registerView("KAlertDialog", com.tencent.kinda.framework.widget.base.AlertDialogImpl.class);
        registerView("KOptionPicker", com.tencent.kinda.framework.widget.base.MMKOptionsPicker.class);
        registerView("KProgressDialog", com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.class);
        registerView("KLoadingImage", com.tencent.kinda.framework.widget.base.MMKLoadingImage.class);
        registerView("KQRCodeView", com.tencent.kinda.framework.widget.base.KindaQRCodeViewImpl.class);
        registerView("KBarCodeView", com.tencent.kinda.framework.widget.base.KindaBarCodeViewImpl.class);
        registerView("KBankCardTypePickerView", com.tencent.kinda.framework.widget.base.KindaBankCardTypePickerViewImpl.class);
        registerView("KTableView", com.tencent.kinda.framework.widget.base.KindaTableViewImpl.class);
        registerView("KTableViewV2", com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.class);
        registerView("KPickerView", com.tencent.kinda.framework.widget.base.MMKPickerView.class);
        registerView("KToastDialog", com.tencent.kinda.framework.widget.base.MMToastDialog.class);
        registerView("KMoneyLoadingView", com.tencent.kinda.framework.widget.base.KindaMoneyLoadingView.class);
        registerView("KOpenIMInfoView", com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView.class);
        registerView("KMultiLineEditText", com.tencent.kinda.framework.widget.base.MMKMultiLineEditText.class);
    }

    @Override // com.tencent.kinda.modularize.KindaModule
    public void onAppCreate() {
    }
}
