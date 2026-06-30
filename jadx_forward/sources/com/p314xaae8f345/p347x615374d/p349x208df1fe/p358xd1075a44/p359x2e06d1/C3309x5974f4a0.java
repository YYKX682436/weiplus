package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.KindaQRCodeViewImpl */
/* loaded from: classes9.dex */
public class C3309x5974f4a0 extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3284x2b63612e implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3512x3847b9fe {
    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3284x2b63612e
    /* renamed from: getNewBitmap */
    public android.graphics.Bitmap mo26109xbe4f4039(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.TAG, "kinda getBitmap mQRcode == null");
            return null;
        }
        kd0.k2 k2Var = (kd0.k2) i95.n0.c(kd0.k2.class);
        android.content.Context context = ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3284x2b63612e) this).f12651xd6cfe882;
        ((jd0.w1) k2Var).getClass();
        return x45.a.b(context, str, 12, 3, 0.0d);
    }
}
