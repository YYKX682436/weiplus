package vn2;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final vn2.i f519836a = new vn2.i();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f519837b = jz5.h.b(vn2.f.f519802d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f519838c = jz5.h.b(vn2.e.f519793d);

    static {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBitmapManager", "initMemoryTrim");
        ki.i.f389634c.c(new vn2.b());
    }

    public static final android.util.Size a(vn2.i iVar, android.graphics.Bitmap bitmap) {
        iVar.getClass();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > 240 && height > 240) {
            if (width > height) {
                int i17 = (int) (width / (height / 240));
                width = i17 - (i17 % 8);
                height = 240;
            } else {
                int i18 = (int) (height / (width / 240));
                height = i18 - (i18 % 8);
                width = 240;
            }
        }
        if (width <= 0 || height <= 0) {
            width = bitmap.getWidth();
            height = bitmap.getHeight();
        }
        return new android.util.Size(width, height);
    }

    public static final java.util.HashSet b(vn2.i iVar) {
        iVar.getClass();
        return (java.util.HashSet) ((jz5.n) f519838c).mo141623x754a37bb();
    }

    public static final void c(vn2.i iVar, java.lang.String str) {
        iVar.getClass();
        try {
            if (iVar.g().m77804x35e001() > 0) {
                iVar.g().d(-1);
            }
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "FinderBitmapManager-" + str);
        }
    }

    public static java.lang.Object d(vn2.i iVar, java.lang.String str, android.graphics.Bitmap bitmap, android.util.Size size, int i17, float f17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i18, java.lang.Object obj) {
        if ((i18 & 8) != 0) {
            i17 = 0;
        }
        if ((i18 & 16) != 0) {
            f17 = 20.0f;
        }
        iVar.getClass();
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        v65.n nVar = new v65.n(rVar);
        if (bitmap == null) {
            nVar.a(null);
        } else {
            try {
                um5.d dVar = new um5.d();
                dVar.b(bitmap);
                int width = size.getWidth();
                int height = size.getHeight();
                dVar.f510674b = width;
                dVar.f510675c = height;
                uq5.b b17 = dVar.f510677e.f510726b.b();
                b17.d(f17);
                b17.e(5.0f);
                dVar.a(new vn2.c(i17, nVar));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "genBlurBitmap failed: " + e17.getMessage());
                nVar.a(null);
            }
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    public final java.lang.Object e(mn2.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        v65.n nVar = new v65.n(rVar);
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(aVar);
        vn2.d dVar = new vn2.d(nVar);
        a17.getClass();
        a17.f529406d = dVar;
        a17.f();
        java.lang.Object j17 = rVar.j();
        pz5.a aVar2 = pz5.a.f440719d;
        return j17;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jz5.o f(r45.mb4 r15) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vn2.i.f(r45.mb4):jz5.o");
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 g() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) ((jz5.n) f519837b).mo141623x754a37bb();
    }
}
