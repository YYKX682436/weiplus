package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class KindaBarCodeViewImpl extends com.tencent.kinda.framework.widget.base.BaseKindaCodeView implements com.tencent.kinda.gen.KBarCodeView {
    @Override // com.tencent.kinda.framework.widget.base.BaseKindaCodeView
    public android.graphics.Bitmap getNewBitmap(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e(com.tencent.kinda.framework.widget.base.MMKView.TAG, "getBarcodeBitmap mBarcode == null");
            return null;
        }
        kd0.k2 k2Var = (kd0.k2) i95.n0.c(kd0.k2.class);
        android.content.Context context = ((com.tencent.kinda.framework.widget.base.BaseKindaCodeView) this).mContext;
        ((jd0.w1) k2Var).getClass();
        return x45.a.b(context, str, 5, 0, 0.0d);
    }
}
