package com.p314xaae8f345.mm.p1006xc5476f33.p2443x6bc77ff.ui.p2444xd1075a44;

/* renamed from: com.tencent.mm.plugin.welab.ui.widget.WelabRoundCornerImageView */
/* loaded from: classes4.dex */
public class C19513x2ed8bedc extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public float f269643d;

    public C19513x2ed8bedc(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: getDisplayingBitmap */
    public android.graphics.Bitmap m74959xc2288ca5() {
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable == null || !(drawable instanceof f3.j)) {
            return null;
        }
        return ((f3.j) drawable).f340779a;
    }

    /* renamed from: setCornerRadiusPercent */
    public void m74960x9f2c333c(float f17) {
        this.f269643d = f17;
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled() || bitmap.getWidth() < 0 || bitmap.getHeight() < 0) {
            super.setImageBitmap(bitmap);
        } else {
            if (this.f269643d <= 0.0f) {
                super.setImageBitmap(bitmap);
                return;
            }
            f3.i iVar = new f3.i(getResources(), bitmap);
            iVar.c(java.lang.Math.min(bitmap.getWidth() * this.f269643d, bitmap.getHeight() * this.f269643d));
            super.setImageDrawable(iVar);
        }
    }

    public C19513x2ed8bedc(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
