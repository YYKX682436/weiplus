package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* loaded from: classes10.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final int f230534d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f230535e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f230536f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ref.WeakReference f230537g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f230538h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16539x811795fe f230539i;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16539x811795fe c16539x811795fe, int i17, android.widget.ImageView imageView, android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 handler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        this.f230539i = c16539x811795fe;
        this.f230534d = i17;
        this.f230535e = bitmap;
        this.f230536f = handler;
        this.f230537g = new java.lang.ref.WeakReference(imageView);
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16539x811795fe c16539x811795fe = this.f230539i;
        if (this.f230538h) {
            com.p314xaae8f345.mm.p872xbfc2bd01.u.f150514d.n(this.f230535e);
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f230537g;
        if (((android.widget.ImageView) weakReference.get()) == null) {
            com.p314xaae8f345.mm.p872xbfc2bd01.u.f150514d.n(this.f230535e);
            return;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.j a17 = c16539x811795fe.f230435u.a();
            if (this.f230535e == null) {
                this.f230535e = com.p314xaae8f345.mm.p872xbfc2bd01.u.f150514d.m(new com.p314xaae8f345.mm.p872xbfc2bd01.t(a17.mo66869xc45b8c56(), a17.mo66868xad470497()));
            }
            a17.mo66872x71b25cc3(this.f230535e);
            if (!this.f230538h) {
                this.f230535e = a17.mo66867xb2c2d837(this.f230534d);
            }
            c16539x811795fe.f230435u.c(a17);
            if (this.f230535e == null || this.f230538h || weakReference.get() == null) {
                com.p314xaae8f345.mm.p872xbfc2bd01.u.f150514d.n(this.f230535e);
            } else {
                this.f230536f.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.c0(c16539x811795fe, this.f230535e, (android.widget.ImageView) weakReference.get(), this));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RecyclerThumbSeekBar", "get bitmap error " + e17.getMessage());
            com.p314xaae8f345.mm.p872xbfc2bd01.u.f150514d.n(this.f230535e);
        }
    }
}
