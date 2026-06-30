package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* loaded from: classes10.dex */
public class c extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f230523a = false;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f230524b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f230525c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16531xba313450 f230526d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16531xba313450 c16531xba313450, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        this.f230526d = c16531xba313450;
        this.f230524b = drawable;
        this.f230525c = drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable = this.f230523a ? this.f230524b : this.f230525c;
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
        this.f230524b.setAlpha(i17);
        this.f230525c.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f230524b.setColorFilter(colorFilter);
        this.f230525c.setColorFilter(colorFilter);
    }
}
