package d8;

/* loaded from: classes7.dex */
public class e implements e8.b {

    /* renamed from: a, reason: collision with root package name */
    public int f308430a = 2048;

    /* renamed from: b, reason: collision with root package name */
    public int f308431b = 2048;

    /* renamed from: c, reason: collision with root package name */
    public final d8.i f308432c;

    /* renamed from: d, reason: collision with root package name */
    public com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.EnumC1595xee8a129 f308433d;

    /* renamed from: e, reason: collision with root package name */
    public e8.d f308434e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f308435f;

    public e() {
        d8.i iVar = new d8.i();
        this.f308432c = iVar;
        this.f308435f = false;
        ((java.util.HashMap) iVar.f308436a).put(com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.EnumC1595xee8a129.Native, new com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p175x2eaf0c.a());
    }

    public d8.l a(d8.i iVar, e8.a aVar) {
        return new d8.l(iVar, aVar);
    }

    public void b(d8.l lVar, java.lang.String str, java.io.InputStream inputStream, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab c1592x888963ab, f8.d dVar) {
        boolean z17;
        boolean z18;
        e8.c cVar;
        e8.c cVar2;
        long j17;
        com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.InterfaceC1596x8c44c2d8 b17;
        f8.c cVar3 = dVar.f341605a;
        e8.c cVar4 = e8.c.NATIVE_DECODE_ERROR;
        e8.c cVar5 = e8.c.OUT_OF_MEMORY;
        e8.c cVar6 = e8.c.IO_ERROR;
        e8.a aVar = lVar.f308442d;
        if (inputStream != null) {
            com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.EnumC1595xee8a129 enumC1595xee8a129 = lVar.f308439a;
            d8.i iVar = lVar.f308443e;
            if (enumC1595xee8a129 != null) {
                int hashCode = lVar.hashCode();
                com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.EnumC1595xee8a129 enumC1595xee8a1292 = lVar.f308439a;
                java.util.Map map = (java.util.Map) iVar.f308437b.get(hashCode);
                if (map == null || map.get(enumC1595xee8a1292) == null) {
                    java.util.HashMap hashMap = (java.util.HashMap) iVar.f308436a;
                    b17 = hashMap.get(enumC1595xee8a1292) != null ? ((f8.b) hashMap.get(enumC1595xee8a1292)).b() : null;
                } else {
                    b17 = ((f8.b) map.get(enumC1595xee8a1292)).b();
                }
                lVar.f308440b = b17;
            } else {
                int hashCode2 = lVar.hashCode();
                android.graphics.Bitmap.Config config = c1592x888963ab.f5274xfeabaa0f;
                java.util.Map map2 = (java.util.Map) iVar.f308437b.get(hashCode2);
                com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.InterfaceC1596x8c44c2d8 a17 = map2 != null ? iVar.a(inputStream, config, cVar3, map2) : null;
                if (a17 == null) {
                    a17 = iVar.a(inputStream, config, cVar3, iVar.f308436a);
                }
                lVar.f308440b = a17;
            }
            try {
                lVar.f308440b.mo17129xb55d491c(inputStream, c1592x888963ab, cVar3);
                z18 = lVar.f308440b.mo17132xed95cea1() != null;
                z17 = false;
            } catch (java.io.IOException e17) {
                g8.g.c("Ni.BitmapWrapper", e17, "hy: decodeInputStream", new java.lang.Object[0]);
                lVar.f308441c.a(str, cVar6, aVar);
                lVar.f308440b.mo17133x408b7293();
                z18 = false;
                z17 = true;
            } catch (java.lang.OutOfMemoryError e18) {
                g8.g.c("Ni.BitmapWrapper", e18, "hy: decodeInputStream", new java.lang.Object[0]);
                lVar.f308441c.a(str, cVar5, aVar);
                lVar.f308440b.mo17133x408b7293();
                z18 = false;
                z17 = true;
            } catch (java.lang.Throwable th6) {
                g8.g.c("Ni.BitmapWrapper", th6, "hy: decode image exception", new java.lang.Object[0]);
                lVar.f308441c.a(str, cVar4, aVar);
                lVar.f308440b.mo17133x408b7293();
                z17 = false;
                z18 = false;
            }
            try {
                if (z17) {
                    inputStream.close();
                } else {
                    try {
                        cVar = cVar5;
                        cVar2 = cVar6;
                        j17 = inputStream.available();
                    } catch (java.io.IOException | java.lang.IllegalStateException e19) {
                        cVar = cVar5;
                        cVar2 = cVar6;
                        g8.g.c("Ni.BitmapWrapper", e19, "hy: get stream len failed!", new java.lang.Object[0]);
                        j17 = 0;
                    }
                    if (!z18 && lVar.f308440b.mo17131xfb85f7b0() == com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.EnumC1595xee8a129.Native) {
                        e8.c cVar7 = cVar;
                        g8.g.b("Ni.BitmapWrapper", "hy: decode switch to legacy mode!", new java.lang.Object[0]);
                        com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.InterfaceC1596x8c44c2d8 b18 = ((f8.b) ((java.util.HashMap) iVar.f308436a).get(com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.EnumC1595xee8a129.Legacy)).b();
                        lVar.f308440b = b18;
                        try {
                            b18.mo17129xb55d491c(inputStream, c1592x888963ab, cVar3);
                        } catch (java.io.IOException e27) {
                            g8.g.c("Ni.BitmapWrapper", e27, "hy: IOException when use legacy", new java.lang.Object[0]);
                            lVar.f308441c.a(str, cVar2, aVar);
                        } catch (java.lang.OutOfMemoryError e28) {
                            g8.g.c("Ni.BitmapWrapper", e28, "hy: decodeInputStream", new java.lang.Object[0]);
                            lVar.f308441c.a(str, cVar7, aVar);
                        } catch (java.lang.Throwable th7) {
                            g8.g.c("Ni.BitmapWrapper", th7, "hy: decode image exception", new java.lang.Object[0]);
                            lVar.f308441c.a(str, cVar4, aVar);
                        }
                    }
                    aVar.f331514a = j17;
                    aVar.f331515b = lVar.f308440b.mo17130xa63469d1();
                    lVar.f308441c.a(str, e8.c.OK, aVar);
                    if (lVar.f308440b.mo17131xfb85f7b0() == com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.EnumC1595xee8a129.Legacy) {
                        lVar.f308441c.a(str, e8.c.LEGACY_MODE, aVar);
                    }
                    if (lVar.f308440b.mo17132xed95cea1() == null) {
                        lVar.f308440b.mo17133x408b7293();
                        lVar.f308440b = null;
                    }
                    inputStream.close();
                }
            } catch (java.io.IOException | java.lang.IllegalStateException unused) {
            }
        }
    }
}
