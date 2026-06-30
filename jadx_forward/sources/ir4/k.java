package ir4;

/* loaded from: classes11.dex */
public final class k implements com.p314xaae8f345.mm.p2470x93e71c27.ui.j1, com.p314xaae8f345.mm.p2470x93e71c27.ui.k1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 f375806d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f375807e;

    public k(com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 wxAvatarDrawableLoader) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxAvatarDrawableLoader, "wxAvatarDrawableLoader");
        this.f375806d = wxAvatarDrawableLoader;
        this.f375807e = new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public android.graphics.Bitmap W0(java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        android.util.Pair b17 = b(tag);
        java.lang.Object second = b17.second;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(second, "second");
        if (((java.lang.Boolean) second).booleanValue()) {
            return Zg(tag, 0, 0, 0);
        }
        return this.f375806d.W0((java.lang.String) b17.first);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public void X9(com.p314xaae8f345.mm.p2470x93e71c27.ui.n1 drawable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
        if (drawable instanceof kv.e0) {
            java.lang.String str = drawable.f272434m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getTag(...)");
            android.util.Pair b17 = b(str);
            java.lang.Boolean bool = (java.lang.Boolean) b17.second;
            java.lang.String str2 = (java.lang.String) b17.first;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
            if (!bool.booleanValue()) {
                drawable.f272436o = new ir4.j(str2, drawable);
                this.f375806d.X9(drawable);
            } else {
                ((java.util.ArrayList) this.f375807e).add(new java.lang.ref.WeakReference(drawable));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public android.graphics.Bitmap Zg(java.lang.String tag, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.J4(tag)) {
            return this.f375806d.Zg(tag, i17, i18, i19);
        }
        hr4.p pVar = hr4.p.f365796a;
        kr4.e b17 = pVar.b(tag);
        if (b17 != null) {
            java.lang.String str = b17.f68899xf205f03e;
            vo0.d dVar = ir4.o.f375813a;
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ir4.o.f375813a.a(new ir4.e(str)).e();
            if (bitmap != null && !bitmap.isRecycled()) {
                return bitmap;
            }
        }
        pVar.a(tag, new ir4.i(this, tag));
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k1
    public boolean a(java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.J4(tag);
    }

    public final android.util.Pair b(java.lang.String str) {
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.J4(str) ? new android.util.Pair(str, java.lang.Boolean.TRUE) : new android.util.Pair(str, java.lang.Boolean.FALSE);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    /* renamed from: loadBitmap */
    public android.graphics.Bitmap mo560xd586ddb5(java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        android.util.Pair b17 = b(tag);
        java.lang.Object second = b17.second;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(second, "second");
        if (((java.lang.Boolean) second).booleanValue()) {
            return Zg(tag, 0, 0, 0);
        }
        return this.f375806d.mo560xd586ddb5((java.lang.String) b17.first);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public android.graphics.Bitmap uc() {
        android.graphics.Bitmap uc6 = this.f375806d.uc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uc6, "getDefaultBitmap(...)");
        return uc6;
    }
}
