package com.tencent.kinda.framework.app;

/* loaded from: classes9.dex */
public class UIPageControllerImpl implements com.tencent.kinda.gen.IUIPageController {
    private static java.lang.String TAG = "kinda UIPageControllerImpl";

    @Override // com.tencent.kinda.gen.IUIPageController
    public void popAndStartPageUI(com.tencent.kinda.gen.IUIPage iUIPage, boolean z17, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        if (z17) {
            com.tencent.kinda.framework.widget.tools.ActivityController.startNewUIPage(iUIPage, iTransmitKvData, com.tencent.kinda.framework.widget.tools.ConstantsKinda.ENTER_ANIMATE_STYLE_POP);
        } else {
            com.tencent.kinda.framework.widget.tools.ActivityController.startNewUIPage(iUIPage, iTransmitKvData, com.tencent.kinda.framework.widget.tools.ConstantsKinda.ENTER_ANIMATE_STYLE_DEFAULT);
        }
    }

    @Override // com.tencent.kinda.gen.IUIPageController
    public void startModalPageUI(com.tencent.kinda.gen.IUIPage iUIPage, boolean z17, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        if (z17) {
            com.tencent.kinda.framework.widget.tools.ActivityController.startNewUIPage(iUIPage, iTransmitKvData, com.tencent.kinda.framework.widget.tools.ConstantsKinda.ENTER_ANIMATE_STYLE_POP);
        } else {
            com.tencent.kinda.framework.widget.tools.ActivityController.startNewUIPage(iUIPage, iTransmitKvData, com.tencent.kinda.framework.widget.tools.ConstantsKinda.ENTER_ANIMATE_STYLE_DEFAULT);
        }
    }

    @Override // com.tencent.kinda.gen.IUIPageController
    public void startPageUI(com.tencent.kinda.gen.IUIPage iUIPage, boolean z17, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        if (z17) {
            com.tencent.kinda.framework.widget.tools.ActivityController.startNewUIPage(iUIPage, iTransmitKvData, com.tencent.kinda.framework.widget.tools.ConstantsKinda.ENTER_ANIMATE_STYLE_SLIDE);
        } else {
            com.tencent.kinda.framework.widget.tools.ActivityController.startNewUIPage(iUIPage, iTransmitKvData, com.tencent.kinda.framework.widget.tools.ConstantsKinda.ENTER_ANIMATE_STYLE_DEFAULT);
        }
    }
}
