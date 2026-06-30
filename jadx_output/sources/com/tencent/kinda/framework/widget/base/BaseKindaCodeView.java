package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public abstract class BaseKindaCodeView extends com.tencent.kinda.framework.widget.base.MMKView<android.widget.ImageView> {
    private java.util.ArrayList<android.graphics.Bitmap> mCodeBitmaps;
    private java.lang.String mCodeStringValue;
    protected android.content.Context mContext;
    private android.widget.ImageView mIvCodeView;

    /* JADX INFO: Access modifiers changed from: private */
    public void recycleBmpList() {
        if (this.mCodeBitmaps.size() >= 2) {
            for (int size = this.mCodeBitmaps.size() - 1; size > 1; size--) {
                com.tencent.mm.wallet_core.ui.r1.n0(this.mCodeBitmaps.remove(size));
            }
        }
    }

    public java.lang.String getCode() {
        return this.mCodeStringValue;
    }

    public abstract android.graphics.Bitmap getNewBitmap(java.lang.String str);

    public void setCode(final java.lang.String str) {
        this.mCodeStringValue = str;
        ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.BaseKindaCodeView.1
            @Override // java.lang.Runnable
            public void run() {
                final android.graphics.Bitmap newBitmap = com.tencent.kinda.framework.widget.base.BaseKindaCodeView.this.getNewBitmap(str);
                ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.BaseKindaCodeView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.tencent.kinda.framework.widget.base.BaseKindaCodeView.this.mIvCodeView != null) {
                            android.graphics.Bitmap bitmap = newBitmap;
                            if (bitmap == null || bitmap.isRecycled()) {
                                com.tencent.kinda.framework.widget.base.BaseKindaCodeView.this.mIvCodeView.setImageBitmap(null);
                            } else {
                                com.tencent.kinda.framework.widget.base.BaseKindaCodeView.this.mIvCodeView.setImageBitmap(newBitmap);
                            }
                        }
                        com.tencent.kinda.framework.widget.base.BaseKindaCodeView.this.recycleBmpList();
                        com.tencent.kinda.framework.widget.base.BaseKindaCodeView.this.mCodeBitmaps.add(newBitmap);
                    }
                });
            }
        });
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public android.widget.ImageView createView(android.content.Context context) {
        this.mContext = context;
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.mIvCodeView = imageView;
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        this.mCodeBitmaps = new java.util.ArrayList<>();
        return this.mIvCodeView;
    }
}
