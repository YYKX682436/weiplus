package l01;

/* loaded from: classes7.dex */
public final class c0 implements l01.o {

    /* renamed from: d, reason: collision with root package name */
    public final l01.h0 f396283d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f396284e;

    /* renamed from: f, reason: collision with root package name */
    public final l01.r f396285f;

    /* renamed from: g, reason: collision with root package name */
    public final l01.b f396286g;

    /* renamed from: h, reason: collision with root package name */
    public final l01.v f396287h;

    /* renamed from: i, reason: collision with root package name */
    public final l01.s f396288i;

    /* renamed from: m, reason: collision with root package name */
    public final l01.q f396289m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f396290n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f396291o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f396292p = true;

    public c0(java.lang.String str, java.util.Map map, l01.r rVar, l01.b bVar, l01.v vVar, l01.s sVar, l01.q qVar, java.lang.String str2, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        this.f396283d = new l01.h0(str, null);
        this.f396284e = map;
        this.f396285f = rVar;
        this.f396286g = bVar;
        this.f396287h = vVar;
        this.f396288i = sVar;
        this.f396289m = qVar;
        this.f396290n = str2;
        this.f396291o = n3Var;
    }

    public static void d(l01.h0 h0Var, java.util.Map map, l01.s sVar) {
        try {
            java.io.InputStream a17 = l01.h0.a(h0Var, map);
            try {
                if (a17 != null) {
                    java.io.OutputStream c17 = ((l01.k) sVar).c(h0Var.f396306b);
                    try {
                        if (c17 != null) {
                            int i17 = s46.d.f484537a;
                            byte[] bArr = new byte[16384];
                            while (true) {
                                int read = a17.read(bArr);
                                if (-1 == read) {
                                    break;
                                } else {
                                    c17.write(bArr, 0, read);
                                }
                            }
                            c17.flush();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandSimpleImageLoader.LoadTask", "doNetworkDownload, imageURL: %s, downloaded", h0Var);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AppBrandSimpleImageLoader.LoadTask", "doNetworkDownload URL.openWrite, get NULL output, url=%s", h0Var);
                        }
                        if (c17 != null) {
                            c17.close();
                        }
                    } finally {
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AppBrandSimpleImageLoader.LoadTask", "doNetworkDownload URL.openRead, get NULL input, url=%s", h0Var);
                }
                if (a17 != null) {
                    a17.close();
                }
            } finally {
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AppBrandSimpleImageLoader.LoadTask", "doNetworkDownload URL.openRead failed, url=%s, e=%s", h0Var, e17);
            ((l01.k) sVar).a(h0Var.f396306b);
        }
    }

    @Override // l01.o
    public void a() {
        android.graphics.Bitmap a17 = ((l01.n) this.f396287h).a(e());
        if (a17 != null && !a17.isRecycled()) {
            e();
            l01.x xVar = new l01.x(this, a17);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f396291o;
            if (n3Var != null) {
                n3Var.mo50293x3498a0(xVar);
                return;
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(xVar);
                return;
            }
        }
        l01.b bVar = this.f396286g;
        l01.p pVar = bVar.f396275d;
        l01.h0 h0Var = this.f396283d;
        boolean d17 = pVar.d(h0Var.f396306b);
        l01.p pVar2 = bVar.f396275d;
        java.lang.String str = h0Var.f396306b;
        if (d17) {
            pVar2.a(str, this);
            return;
        }
        pVar2.getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            ((java.util.HashMap) pVar2.f396319c).put(str, java.lang.Boolean.TRUE);
        }
        c();
    }

    @Override // l01.o
    public void b() {
        l01.b bVar = this.f396286g;
        l01.u uVar = (l01.u) ((java.util.concurrent.ConcurrentHashMap) bVar.f396273b).remove(this.f396290n + e());
        if (uVar != null) {
            ((java.util.concurrent.ConcurrentHashMap) bVar.f396272a).remove(uVar);
        }
    }

    public final void c() {
        java.util.List list;
        java.util.List list2;
        l01.h0 h0Var = this.f396283d;
        l01.b bVar = this.f396286g;
        try {
            android.graphics.Bitmap f17 = f();
            if (f17 == null || f17.isRecycled()) {
                return;
            }
            bVar.f396275d.e(h0Var.f396306b);
            l01.p pVar = bVar.f396275d;
            pVar.getClass();
            java.lang.String str = h0Var.f396306b;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (list2 = (java.util.List) ((java.util.HashMap) pVar.f396318b).get(str)) != null) {
                list2.remove(this);
            }
            h(f17);
            pVar.c(str);
        } catch (l01.m0 e17) {
            bVar.f396275d.e(h0Var.f396306b);
            l01.p pVar2 = bVar.f396275d;
            java.lang.String str2 = h0Var.f396306b;
            pVar2.b(str2);
            h(null);
            if (e17 instanceof l01.j0) {
                ((l01.k) bVar.f396277f).a(str2);
            }
        } catch (java.io.IOException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.AppBrandSimpleImageLoader.LoadTask", e18, " doIOJobImpl, io exp ", new java.lang.Object[0]);
            bVar.f396275d.e(h0Var.f396306b);
            l01.p pVar3 = bVar.f396275d;
            pVar3.getClass();
            java.lang.String str3 = h0Var.f396306b;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) && (list = (java.util.List) ((java.util.HashMap) pVar3.f396318b).get(str3)) != null) {
                list.remove(this);
            }
            pVar3.c(str3);
            if (e18 instanceof java.io.FileNotFoundException) {
                h(null);
            }
        }
    }

    public final java.lang.String e() {
        return l01.b.h(this.f396283d.f396305a, this.f396285f, this.f396289m);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap f() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l01.c0.f():android.graphics.Bitmap");
    }

    public final void g(android.graphics.Bitmap bitmap) {
        l01.b bVar = this.f396286g;
        l01.u uVar = (l01.u) ((java.util.concurrent.ConcurrentHashMap) bVar.f396273b).remove(this.f396290n + e());
        if (uVar != null) {
            uVar.mo1040x5481b993(bitmap);
            ((java.util.concurrent.ConcurrentHashMap) bVar.f396272a).remove(uVar);
        }
    }

    public final void h(android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            bitmap.isRecycled();
        }
        l01.v vVar = this.f396287h;
        l01.r rVar = this.f396285f;
        if (rVar != null && bitmap != null && !bitmap.isRecycled()) {
            android.graphics.Bitmap c17 = rVar.c(bitmap);
            if (c17 != bitmap) {
                ((l01.n) vVar).getClass();
                bitmap.isRecycled();
            }
            bitmap = c17;
        }
        ((l01.n) vVar).b(e(), bitmap);
        if (bitmap != null) {
            bitmap.isRecycled();
        }
        l01.z zVar = new l01.z(this, bitmap);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f396291o;
        if (n3Var != null) {
            n3Var.mo50293x3498a0(zVar);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(zVar);
        }
    }
}
