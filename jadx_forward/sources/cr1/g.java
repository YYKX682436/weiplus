package cr1;

/* loaded from: classes11.dex */
public final class g implements com.p314xaae8f345.mm.p2470x93e71c27.ui.j1, com.p314xaae8f345.mm.p2470x93e71c27.ui.k1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 f303374d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f303375e;

    public g(com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 wxAvatarDrawableLoader) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxAvatarDrawableLoader, "wxAvatarDrawableLoader");
        this.f303374d = wxAvatarDrawableLoader;
        this.f303375e = new java.util.ArrayList();
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
        return this.f303374d.W0((java.lang.String) b17.first);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public void X9(com.p314xaae8f345.mm.p2470x93e71c27.ui.n1 drawable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
        if (!(drawable instanceof kv.e0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("BizFans.BizFansAvatarInterceptor", "[watch] drawable is not IAvatarStorage.IOnAvatarChanged, tag=" + drawable.f272434m);
            return;
        }
        java.lang.String str = drawable.f272434m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getTag(...)");
        android.util.Pair b17 = b(str);
        java.lang.Boolean bool = (java.lang.Boolean) b17.second;
        java.lang.String str2 = (java.lang.String) b17.first;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        if (!bool.booleanValue()) {
            drawable.f272436o = new cr1.f(str2, drawable);
            this.f303374d.X9(drawable);
            return;
        }
        synchronized (this.f303375e) {
            ((java.util.ArrayList) this.f303375e).add(new java.lang.ref.WeakReference(drawable));
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public android.graphics.Bitmap Zg(java.lang.String tag, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.E3(tag) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.G3(tag)) {
            return this.f303374d.Zg(tag, i17, i18, i19);
        }
        int i27 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.G3(tag) ? 5 : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizFans.BizFansAvatarInterceptor", "[loadHdBitmap] biz fans session detected, tag=" + tag + ", serviceType=" + i27);
        i95.m c17 = i95.n0.c(zq1.u.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        hr1.a eb6 = zq1.u.eb((zq1.u) c17, tag, i27, 0, 4, null);
        if (eb6 != null) {
            java.lang.String str = eb6.f66207xff000111;
            vo0.d dVar = cr1.k.f303381a;
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) cr1.k.f303381a.a(new cr1.a(str)).e();
            if (bitmap != null && !bitmap.isRecycled()) {
                return bitmap;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizFans.BizFansAvatarInterceptor", "[loadHdBitmap] local contact not found, will fetch from network, tag=".concat(tag));
        }
        zq1.u uVar = (zq1.u) i95.n0.c(zq1.u.class);
        cr1.e eVar = new cr1.e(tag, this);
        br1.m mVar = (br1.m) uVar;
        mVar.getClass();
        boolean z17 = tag.length() == 0;
        java.lang.String str2 = mVar.f105155d;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "getContact error, openid is null");
            br1.w.c(eVar, false, i27, null, 4, null);
            return null;
        }
        hr1.a eb7 = zq1.u.eb(mVar, tag, i27, 0, 4, null);
        if (eb7 != null) {
            eVar.b(true, i27, eb7);
            return null;
        }
        if (tag.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "getSvrContact error, openid is null");
            br1.w.c(eVar, false, 0, null, 4, null);
            return null;
        }
        int i28 = r26.i0.n(tag, "@picfansmsg", false) ? 5 : 0;
        if (mVar.Ni(i28).a(tag, i28, java.lang.Boolean.TRUE)) {
            mVar.Di().putIfAbsent(tag, eVar);
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "getSvrContact error, enqueue openId failed: ".concat(tag));
        br1.w.c(eVar, false, i28, null, 4, null);
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k1
    public boolean a(java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        java.lang.Boolean bool = (java.lang.Boolean) b(tag).second;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        return bool.booleanValue();
    }

    public final android.util.Pair b(java.lang.String str) {
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.E3(str) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.G3(str)) {
            java.lang.String str2 = yq1.u0.Zi().z0(str).f66480x114ef53e;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.length() > 0) {
                return new android.util.Pair(str2, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p2621x8fb0427b.z3.G3(str2)));
            }
            java.lang.String str3 = yq1.u0.Ni().y0(str).f66480x114ef53e;
            java.lang.String str4 = str3 != null ? str3 : "";
            return new android.util.Pair(str4, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p2621x8fb0427b.z3.E3(str4)));
        }
        return new android.util.Pair(str, java.lang.Boolean.TRUE);
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
        return this.f303374d.mo560xd586ddb5((java.lang.String) b17.first);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public android.graphics.Bitmap uc() {
        android.graphics.Bitmap uc6 = this.f303374d.uc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uc6, "getDefaultBitmap(...)");
        return uc6;
    }
}
