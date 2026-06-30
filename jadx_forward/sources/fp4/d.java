package fp4;

/* loaded from: classes10.dex */
public class d extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f346888a = false;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f346889b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f346890c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd.C18799x4530423d f346891d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd.C18799x4530423d c18799x4530423d, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        this.f346891d = c18799x4530423d;
        this.f346889b = drawable;
        this.f346890c = drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable = this.f346888a ? this.f346889b : this.f346890c;
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
        this.f346889b.setAlpha(i17);
        this.f346890c.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f346889b.setColorFilter(colorFilter);
        this.f346890c.setColorFilter(colorFilter);
    }
}
