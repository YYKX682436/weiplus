package l01;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final bm5.x0 f396271g = new bm5.x0(new l01.C29057x2d183f());

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f396272a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f396273b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f396274c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final l01.v f396276e = new l01.n();

    /* renamed from: f, reason: collision with root package name */
    public final l01.s f396277f = new l01.k(null);

    /* renamed from: d, reason: collision with root package name */
    public final l01.p f396275d = new l01.p(new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("AppBrandSimpleImageLoaderDiskIOHandlerThread"), null);

    public b(l01.c cVar) {
    }

    public static java.lang.String h(java.lang.String str, l01.r rVar, l01.q qVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        if (rVar != null) {
            sb6.append("|transformation:");
            sb6.append(rVar.key());
        }
        if (qVar != null) {
            sb6.append("|decoder:");
            sb6.append(qVar.key());
        }
        return sb6.toString();
    }

    public static java.lang.String j(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        return kk.k.g(str.getBytes());
    }

    public java.lang.String a(android.widget.ImageView imageView, java.lang.String str, int i17, l01.r rVar) {
        if (imageView == null) {
            return null;
        }
        return b(imageView, str, imageView.getContext().getResources().getDrawable(i17), rVar);
    }

    public java.lang.String b(android.widget.ImageView imageView, java.lang.String str, android.graphics.drawable.Drawable drawable, l01.r rVar) {
        return d(imageView, str, drawable, rVar, null, null, null);
    }

    public java.lang.String c(android.widget.ImageView imageView, java.lang.String str, android.graphics.drawable.Drawable drawable, l01.r rVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        return d(imageView, str, drawable, rVar, null, null, n3Var);
    }

    public java.lang.String d(android.widget.ImageView imageView, java.lang.String str, android.graphics.drawable.Drawable drawable, l01.r rVar, l01.q qVar, l01.e0 e0Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        if (imageView == null) {
            return null;
        }
        java.util.Map map = this.f396274c;
        java.lang.String str2 = (java.lang.String) ((java.util.concurrent.ConcurrentHashMap) map).remove(java.lang.Integer.valueOf(imageView.hashCode()));
        if (str2 != null) {
            e((l01.u) ((java.util.concurrent.ConcurrentHashMap) this.f396273b).get(str2));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            }
            return null;
        }
        l01.g gVar = new l01.g(this, imageView, this, str, e0Var, drawable);
        java.lang.String l17 = l(gVar, str, null, rVar, qVar, n3Var);
        if (!gVar.f396324g) {
            ((java.util.concurrent.ConcurrentHashMap) map).put(java.lang.Integer.valueOf(imageView.hashCode()), i(gVar) + l17);
        }
        return l17;
    }

    public void e(l01.u uVar) {
        if (uVar == null) {
            return;
        }
        java.lang.String str = (java.lang.String) ((java.util.concurrent.ConcurrentHashMap) this.f396272a).remove(uVar);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        ((java.util.concurrent.ConcurrentHashMap) this.f396273b).remove(str);
    }

    public android.graphics.Bitmap f(java.lang.String str, l01.q qVar) {
        java.io.InputStream inputStream;
        java.io.InputStream E;
        java.io.InputStream inputStream2 = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        java.lang.String h17 = h(str, null, qVar);
        l01.v vVar = this.f396276e;
        android.graphics.Bitmap a17 = ((l01.n) vVar).a(h17);
        if (a17 != null) {
            return a17;
        }
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                throw new java.lang.IllegalArgumentException();
            }
            j(str);
            if (str.startsWith("file://") || str.startsWith("wcf://")) {
                try {
                    E = com.p314xaae8f345.mm.vfs.w6.E(str);
                } catch (java.io.FileNotFoundException unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AppBrandSimpleImageLoader", "findCachedLocal: load from local file, file not found ");
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    return null;
                }
            } else {
                E = ((l01.k) this.f396277f).b(j(str));
            }
            if (E == null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(E);
                return null;
            }
            try {
                android.graphics.Bitmap a18 = qVar != null ? qVar.a(E) : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y1.a().Lh(E);
                if (a18 != null) {
                    ((l01.n) vVar).b(h17, a18);
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(E);
                return a18;
            } catch (java.lang.Exception e17) {
                inputStream = E;
                e = e17;
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.AppBrandSimpleImageLoader", e, "findCachedLocal", new java.lang.Object[0]);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
                    return null;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    inputStream2 = inputStream;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream2);
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                inputStream2 = E;
                th = th7;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream2);
                throw th;
            }
        } catch (java.lang.Exception e18) {
            e = e18;
            inputStream = null;
        } catch (java.lang.Throwable th8) {
            th = th8;
        }
    }

    public final byte[] g(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        try {
            l01.s sVar = this.f396277f;
            if (android.text.TextUtils.isEmpty(str)) {
                throw new java.lang.IllegalArgumentException();
            }
            java.io.InputStream b17 = ((l01.k) sVar).b(j(str));
            if (b17 == null) {
                if (b17 != null) {
                    b17.close();
                }
                return null;
            }
            try {
                byte[] c17 = s46.d.c(b17);
                if (b17 != null) {
                    b17.close();
                }
                return c17;
            } finally {
            }
        } catch (java.io.IOException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AppBrandSimpleImageLoader", "findCachedLocal: load from local file, file not found, url=%s", str);
            return null;
        }
    }

    public final java.lang.String i(l01.u uVar) {
        return uVar.key() + "@" + uVar.hashCode();
    }

    public java.lang.String k(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        return n(new l01.l(), str, null, null);
    }

    public java.lang.String l(l01.u uVar, java.lang.String str, java.util.Map map, l01.r rVar, l01.q qVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        if (uVar == null) {
            return null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            uVar.b();
            return null;
        }
        try {
            if ("null".equals(android.net.Uri.parse(str).getHost())) {
                uVar.b();
                return null;
            }
        } catch (java.lang.Exception unused) {
        }
        l01.c0 c0Var = new l01.c0(str, map, rVar, this, this.f396276e, this.f396277f, qVar, i(uVar), n3Var);
        java.lang.String e17 = c0Var.e();
        l01.c cVar = new l01.c(this, e17, uVar, str, c0Var);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            cVar.run();
        } else if (n3Var != null) {
            n3Var.mo50293x3498a0(cVar);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(cVar);
        }
        return e17;
    }

    public java.lang.String m(l01.u uVar, java.lang.String str, l01.r rVar) {
        return n(uVar, str, rVar, null);
    }

    public java.lang.String n(l01.u uVar, java.lang.String str, l01.r rVar, l01.q qVar) {
        return l(uVar, str, null, rVar, qVar, null);
    }

    public void o(java.lang.String str, l01.t tVar) {
        byte[] g17 = g(str);
        if (g17 == null || g17.length == 0) {
            l(new l01.i(this, str, tVar), str, null, null, null, null);
        } else if (tVar != null) {
            tVar.a(g17);
        }
    }

    public java.lang.String p(java.lang.String str, java.util.Map map, r.a aVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            if (aVar != null) {
                aVar.mo1850x58b836e(null);
            }
            return null;
        }
        l01.h0 h0Var = new l01.h0(str, null);
        this.f396275d.f396317a.mo50293x3498a0(new l01.f(this, this, h0Var, aVar, str, map));
        return h0Var.f396306b;
    }
}
