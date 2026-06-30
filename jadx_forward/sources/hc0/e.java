package hc0;

@j95.b
/* loaded from: classes8.dex */
public final class e extends i95.w implements ic0.e {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f361809d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f361810e;

    /* renamed from: f, reason: collision with root package name */
    public final kk.l f361811f = new kk.l(15);

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public android.graphics.Bitmap W0(java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public void X9(com.p314xaae8f345.mm.p2470x93e71c27.ui.n1 drawable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
        if (drawable instanceof kv.e0) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().d((kv.e0) drawable);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public android.graphics.Bitmap Zg(java.lang.String tag, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    /* renamed from: loadBitmap */
    public android.graphics.Bitmap mo560xd586ddb5(java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        kk.l lVar = this.f361811f;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) lVar.get(tag);
        if (weakReference != null && weakReference.get() != null) {
            java.lang.Object obj = weakReference.get();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type android.graphics.Bitmap");
            if (!((android.graphics.Bitmap) obj).isRecycled() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(weakReference.get(), uc())) {
                return (android.graphics.Bitmap) weakReference.get();
            }
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p943x351df9c2.g.a(tag);
        if (a17 != null && !a17.isRecycled()) {
            android.graphics.Bitmap s07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(a17, false, a17.getWidth() / 2);
            lVar.j(tag, new java.lang.ref.WeakReference(s07));
            return s07;
        }
        if (this.f361810e == null && uc() != null) {
            try {
                android.graphics.Bitmap bitmap = this.f361809d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap);
                this.f361810e = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(bitmap, false, bitmap.getWidth() / 2);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RadarAvatarBitmapLoaderService", e17, "", new java.lang.Object[0]);
            }
        }
        return this.f361810e;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public android.graphics.Bitmap uc() {
        if (this.f361809d == null) {
            try {
                this.f361809d = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets().open("avatar/default_nor_avatar.png"), i65.a.g(null));
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RadarAvatarBitmapLoaderService", e17, "", new java.lang.Object[0]);
            }
        }
        return this.f361809d;
    }
}
