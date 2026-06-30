package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes15.dex */
public class j4 extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f233411a = false;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f233412b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f233413c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16705xabefc23a f233414d;

    public j4(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16705xabefc23a c16705xabefc23a, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        this.f233414d = c16705xabefc23a;
        this.f233412b = drawable;
        this.f233413c = drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable = this.f233411a ? this.f233412b : this.f233413c;
        if (!getBounds().equals(drawable.getBounds())) {
            drawable.setBounds(getBounds());
        }
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f233412b.setAlpha(i17);
        this.f233413c.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f233412b.setColorFilter(colorFilter);
        this.f233413c.setColorFilter(colorFilter);
    }
}
