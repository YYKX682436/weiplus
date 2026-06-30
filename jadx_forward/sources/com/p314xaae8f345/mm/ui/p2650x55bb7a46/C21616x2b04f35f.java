package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* renamed from: com.tencent.mm.ui.chatting.ChattingImageBGView */
/* loaded from: classes5.dex */
public class C21616x2b04f35f extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f279753d;

    /* renamed from: e, reason: collision with root package name */
    public int f279754e;

    public C21616x2b04f35f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f279754e = 0;
        setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int i28;
        super.onLayout(z17, i17, i18, i19, i27);
        if (!z17 || this.f279754e == (i28 = i19 - i17)) {
            return;
        }
        this.f279754e = i28;
        post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.e5(this));
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        this.f279753d = bitmap;
        super.setImageBitmap(bitmap);
        post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.e5(this));
    }

    public C21616x2b04f35f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f279754e = 0;
        setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
    }
}
