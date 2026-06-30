package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* loaded from: classes10.dex */
public class l1 extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f230586a = false;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f230587b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f230588c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a f230589d;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a c16543xabefc23a, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        this.f230589d = c16543xabefc23a;
        this.f230587b = drawable;
        this.f230588c = drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable = this.f230586a ? this.f230587b : this.f230588c;
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
        this.f230587b.setAlpha(i17);
        this.f230588c.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f230587b.setColorFilter(colorFilter);
        this.f230588c.setColorFilter(colorFilter);
    }
}
