package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.KindaBarCodeViewImpl */
/* loaded from: classes9.dex */
public class C3295x6802e838 extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3284x2b63612e implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3428xa6dd61a {
    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3284x2b63612e
    /* renamed from: getNewBitmap */
    public android.graphics.Bitmap mo26109xbe4f4039(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.TAG, "getBarcodeBitmap mBarcode == null");
            return null;
        }
        kd0.k2 k2Var = (kd0.k2) i95.n0.c(kd0.k2.class);
        android.content.Context context = ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3284x2b63612e) this).f12651xd6cfe882;
        ((jd0.w1) k2Var).getClass();
        return x45.a.b(context, str, 5, 0, 0.0d);
    }
}
