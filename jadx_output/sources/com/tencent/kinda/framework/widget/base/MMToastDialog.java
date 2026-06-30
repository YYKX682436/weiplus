package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class MMToastDialog implements com.tencent.kinda.gen.KToastDialog {
    private static final java.lang.String TAG = "MMToastDialog";

    @Override // com.tencent.kinda.gen.KToastDialog
    public void show(java.lang.String str, java.lang.String str2) {
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "MMToastDialog showImpl() KindaContext.get() return null!");
            return;
        }
        int drawableId = com.tencent.kinda.framework.widget.tools.ResourcesUtils.getDrawableId(com.tencent.mm.sdk.platformtools.x2.f193071a, str2);
        int resId = com.tencent.kinda.framework.widget.tools.ResourcesUtils.getResId(com.tencent.mm.sdk.platformtools.x2.f193071a, str2, com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW);
        if (resId != 0) {
            drawableId = resId;
        }
        db5.t7.i(context, str, drawableId);
    }

    @Override // com.tencent.kinda.gen.KToastDialog
    public void showDialogToast(java.lang.String str) {
    }
}
