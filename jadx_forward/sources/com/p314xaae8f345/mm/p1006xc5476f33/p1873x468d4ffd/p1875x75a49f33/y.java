package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* loaded from: classes10.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final int f230637d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f230638e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f230639f = false;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f230640g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Bitmap f230641h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4 f230642i;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4 c16538x58704dc4, int i17, android.widget.ImageView imageView, android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        this.f230642i = c16538x58704dc4;
        this.f230637d = i17;
        this.f230638e = new java.lang.ref.WeakReference(imageView);
        this.f230640g = n3Var;
        this.f230641h = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4 c16538x58704dc4 = this.f230642i;
        if (this.f230639f) {
            com.p314xaae8f345.mm.p872xbfc2bd01.u.f150514d.n(this.f230641h);
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f230638e;
        if (((android.widget.ImageView) weakReference.get()) == null) {
            com.p314xaae8f345.mm.p872xbfc2bd01.u.f150514d.n(this.f230641h);
            return;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.j a17 = c16538x58704dc4.f230417s.a();
            if (this.f230641h == null) {
                this.f230641h = com.p314xaae8f345.mm.p872xbfc2bd01.u.f150514d.m(new com.p314xaae8f345.mm.p872xbfc2bd01.t(a17.mo66869xc45b8c56(), a17.mo66868xad470497()));
            }
            a17.mo66872x71b25cc3(this.f230641h);
            if (!this.f230639f) {
                this.f230641h = a17.mo66867xb2c2d837(this.f230637d);
            }
            c16538x58704dc4.f230417s.c(a17);
            if (this.f230641h == null || this.f230639f || weakReference.get() == null) {
                com.p314xaae8f345.mm.p872xbfc2bd01.u.f150514d.n(this.f230641h);
            } else {
                this.f230640g.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.x(c16538x58704dc4, this.f230641h, (android.widget.ImageView) weakReference.get(), this));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RecyclerThumbSeekBar", "get bitmap error " + e17.getMessage());
            com.p314xaae8f345.mm.p872xbfc2bd01.u.f150514d.n(this.f230641h);
        }
    }
}
