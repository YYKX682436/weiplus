package yi;

/* loaded from: classes15.dex */
public class k extends yi.h {

    /* renamed from: b, reason: collision with root package name */
    public final int f544004b;

    /* renamed from: c, reason: collision with root package name */
    public final int f544005c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yi.l f544006d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yi.l lVar, int i17, int i18, long j17) {
        super(null);
        this.f544006d = lVar;
        this.f544004b = i17;
        this.f544005c = i18;
    }

    @Override // yi.h
    public void a() {
        yi.l lVar = this.f544006d;
        try {
            lVar.f544007b.write(this.f544004b);
            aj.a.i(lVar.f544007b, this.f544005c);
            aj.a.i(lVar.f544007b, lVar.f544009d.size());
            lVar.f544007b.write(lVar.f544009d.toByteArray());
            lVar.f544009d.reset();
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.h
    public void b(int i17, zi.b bVar) {
        yi.l lVar = this.f544006d;
        try {
            lVar.f544009d.write(i17);
            lVar.f544009d.write(bVar.f554609a);
            if (i17 == 1) {
                aj.a.h(lVar.f544009d, lVar.f544008c);
            }
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.h
    public void c(zi.b bVar, int i17, zi.b bVar2, zi.b bVar3, int i18, zi.a[] aVarArr, zi.a[] aVarArr2) {
        yi.l lVar = this.f544006d;
        try {
            lVar.f544009d.write(32);
            java.io.ByteArrayOutputStream byteArrayOutputStream = lVar.f544009d;
            byteArrayOutputStream.write(bVar.f554609a);
            aj.a.i(byteArrayOutputStream, i17);
            byteArrayOutputStream.write(bVar2.f554609a);
            byteArrayOutputStream.write(bVar3.f554609a);
            aj.a.h(byteArrayOutputStream, lVar.f544008c << 2);
            aj.a.i(byteArrayOutputStream, i18);
            aj.a.k(byteArrayOutputStream, 0);
            aj.a.k(byteArrayOutputStream, aVarArr.length);
            for (zi.a aVar : aVarArr) {
                byteArrayOutputStream.write(aVar.f554607b.f554609a);
                byteArrayOutputStream.write(aVar.f554606a);
                aj.a.l(byteArrayOutputStream, aVar.f554608c);
            }
            aj.a.k(byteArrayOutputStream, aVarArr2.length);
            for (zi.a aVar2 : aVarArr2) {
                byteArrayOutputStream.write(aVar2.f554607b.f554609a);
                byteArrayOutputStream.write(aVar2.f554606a);
            }
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.h
    public void d(int i17, zi.b bVar) {
        yi.l lVar = this.f544006d;
        try {
            lVar.f544009d.write(254);
            aj.a.i(lVar.f544009d, i17);
            lVar.f544009d.write(bVar.f554609a);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.h
    public void e(zi.b bVar, int i17, zi.b bVar2, byte[] bArr) {
        yi.l lVar = this.f544006d;
        try {
            lVar.f544009d.write(33);
            lVar.f544009d.write(bVar.f554609a);
            aj.a.i(lVar.f544009d, i17);
            lVar.f544009d.write(bVar2.f554609a);
            aj.a.i(lVar.f544009d, bArr.length);
            lVar.f544009d.write(bArr);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.h
    public void f(zi.b bVar, int i17, int i18) {
        yi.l lVar = this.f544006d;
        try {
            lVar.f544009d.write(3);
            lVar.f544009d.write(bVar.f554609a);
            aj.a.i(lVar.f544009d, i17);
            aj.a.i(lVar.f544009d, i18);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.h
    public void g(zi.b bVar, int i17, int i18) {
        yi.l lVar = this.f544006d;
        try {
            lVar.f544009d.write(2);
            lVar.f544009d.write(bVar.f554609a);
            aj.a.i(lVar.f544009d, i17);
            aj.a.i(lVar.f544009d, i18);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.h
    public void h(zi.b bVar, int i17, int i18) {
        yi.l lVar = this.f544006d;
        try {
            lVar.f544009d.write(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50673x992affbf);
            lVar.f544009d.write(bVar.f554609a);
            aj.a.i(lVar.f544009d, i17);
            aj.a.i(lVar.f544009d, i18);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.h
    public void i(zi.b bVar, int i17) {
        yi.l lVar = this.f544006d;
        try {
            lVar.f544009d.write(4);
            lVar.f544009d.write(bVar.f554609a);
            aj.a.i(lVar.f544009d, i17);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.h
    public void j(zi.b bVar, int i17, int i18, zi.b bVar2, byte[] bArr) {
        yi.l lVar = this.f544006d;
        try {
            lVar.f544009d.write(34);
            lVar.f544009d.write(bVar.f554609a);
            aj.a.i(lVar.f544009d, i17);
            aj.a.i(lVar.f544009d, i18);
            lVar.f544009d.write(bVar2.f554609a);
            lVar.f544009d.write(bArr, 0, i18 * lVar.f544008c);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.h
    public void k(int i17, zi.b bVar, int i18, int i19, int i27, byte[] bArr) {
        yi.l lVar = this.f544006d;
        try {
            lVar.f544009d.write(i17);
            lVar.f544009d.write(bVar.f554609a);
            aj.a.i(lVar.f544009d, i18);
            aj.a.i(lVar.f544009d, i19);
            lVar.f544009d.write(i27);
            zi.c a17 = zi.c.a(i27);
            int i28 = lVar.f544008c;
            int i29 = a17.f554613e;
            if (i29 != 0) {
                i28 = i29;
            }
            lVar.f544009d.write(bArr, 0, i19 * i28);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.h
    public void l(zi.b bVar, int i17) {
        yi.l lVar = this.f544006d;
        try {
            lVar.f544009d.write(6);
            lVar.f544009d.write(bVar.f554609a);
            aj.a.i(lVar.f544009d, i17);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.h
    public void m(zi.b bVar, int i17, int i18) {
        yi.l lVar = this.f544006d;
        try {
            lVar.f544009d.write(8);
            lVar.f544009d.write(bVar.f554609a);
            aj.a.i(lVar.f544009d, i17);
            aj.a.i(lVar.f544009d, i18);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }
}
