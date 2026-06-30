package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.BaseKindaCodeView */
/* loaded from: classes9.dex */
public abstract class AbstractC3284x2b63612e extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0<android.widget.ImageView> {

    /* renamed from: mCodeBitmaps */
    private java.util.ArrayList<android.graphics.Bitmap> f12649x6e061bca;

    /* renamed from: mCodeStringValue */
    private java.lang.String f12650xbbd3c786;

    /* renamed from: mContext */
    protected android.content.Context f12651xd6cfe882;

    /* renamed from: mIvCodeView */
    private android.widget.ImageView f12652x35fb8acc;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: recycleBmpList */
    public void m26106x6d0701b0() {
        if (this.f12649x6e061bca.size() >= 2) {
            for (int size = this.f12649x6e061bca.size() - 1; size > 1; size--) {
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n0(this.f12649x6e061bca.remove(size));
            }
        }
    }

    /* renamed from: getCode */
    public java.lang.String m26108xfb7e1663() {
        return this.f12650xbbd3c786;
    }

    /* renamed from: getNewBitmap */
    public abstract android.graphics.Bitmap mo26109xbe4f4039(java.lang.String str);

    /* renamed from: setCode */
    public void m26110x7648dd6f(final java.lang.String str) {
        this.f12650xbbd3c786 = str;
        ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.BaseKindaCodeView.1
            @Override // java.lang.Runnable
            public void run() {
                final android.graphics.Bitmap mo26109xbe4f4039 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3284x2b63612e.this.mo26109xbe4f4039(str);
                ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.BaseKindaCodeView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3284x2b63612e.this.f12652x35fb8acc != null) {
                            android.graphics.Bitmap bitmap = mo26109xbe4f4039;
                            if (bitmap == null || bitmap.isRecycled()) {
                                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3284x2b63612e.this.f12652x35fb8acc.setImageBitmap(null);
                            } else {
                                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3284x2b63612e.this.f12652x35fb8acc.setImageBitmap(mo26109xbe4f4039);
                            }
                        }
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3284x2b63612e.this.m26106x6d0701b0();
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3284x2b63612e.this.f12649x6e061bca.add(mo26109xbe4f4039);
                    }
                });
            }
        });
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView, reason: avoid collision after fix types in other method */
    public android.widget.ImageView mo26107x519d71c1(android.content.Context context) {
        this.f12651xd6cfe882 = context;
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.f12652x35fb8acc = imageView;
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        this.f12649x6e061bca = new java.util.ArrayList<>();
        return this.f12652x35fb8acc;
    }
}
