package yi;

/* loaded from: classes15.dex */
public class e extends yi.h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yi.f f543983b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yi.f fVar, yi.h hVar) {
        super(hVar);
        this.f543983b = fVar;
    }

    @Override // yi.h
    public void e(zi.b bVar, int i17, zi.b bVar2, byte[] bArr) {
        yi.f fVar = this.f543983b;
        try {
            zi.b bVar3 = fVar.f543984b.f543990f;
            yi.g gVar = fVar.f543984b;
            zi.b bVar4 = null;
            if (bVar3 == null || !bVar3.m179013xb2c87fbf(bVar2)) {
                zi.b bVar5 = gVar.f543994j;
                if (bVar5 == null || !bVar5.m179013xb2c87fbf(bVar2)) {
                    return;
                }
                java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
                zi.a[] aVarArr = gVar.f543999o;
                int length = aVarArr.length;
                while (r0 < length) {
                    zi.a aVar = aVarArr[r0];
                    zi.b bVar6 = aVar.f554607b;
                    int i18 = aVar.f554606a;
                    zi.c a17 = zi.c.a(i18);
                    if (a17 == null) {
                        throw new java.lang.IllegalStateException("visit string instance failed, lost type def of typeId: " + i18);
                    }
                    if (!gVar.f543995k.m179013xb2c87fbf(bVar6)) {
                        if (bVar4 != null) {
                            break;
                        }
                        int i19 = gVar.f543996l;
                        int i27 = a17.f554613e;
                        if (i27 != 0) {
                            i19 = i27;
                        }
                        aj.a.g(byteArrayInputStream, i19);
                    } else {
                        bVar4 = (zi.b) aj.a.f(byteArrayInputStream, a17, gVar.f543996l);
                    }
                    r0++;
                }
                byteArrayInputStream.close();
                if (bVar4 == null || bVar4.m179013xb2c87fbf(gVar.f543997m)) {
                    return;
                }
                ((java.util.HashSet) gVar.f543988d).add(bVar4);
                return;
            }
            java.io.ByteArrayInputStream byteArrayInputStream2 = new java.io.ByteArrayInputStream(bArr);
            java.lang.Boolean bool = null;
            for (zi.a aVar2 : gVar.f543998n) {
                zi.b bVar7 = aVar2.f554607b;
                int i28 = aVar2.f554606a;
                zi.c a18 = zi.c.a(i28);
                if (a18 == null) {
                    throw new java.lang.IllegalStateException("visit bmp instance failed, lost type def of typeId: " + i28);
                }
                if (gVar.f543991g.m179013xb2c87fbf(bVar7)) {
                    bVar4 = (zi.b) aj.a.f(byteArrayInputStream2, a18, gVar.f543996l);
                } else if (!gVar.f543992h.m179013xb2c87fbf(bVar7)) {
                    if (bVar4 != null && bool != null) {
                        break;
                    }
                    int i29 = gVar.f543996l;
                    int i37 = a18.f554613e;
                    if (i37 != 0) {
                        i29 = i37;
                    }
                    aj.a.g(byteArrayInputStream2, i29);
                } else {
                    bool = (java.lang.Boolean) aj.a.f(byteArrayInputStream2, a18, gVar.f543996l);
                }
            }
            byteArrayInputStream2.close();
            r0 = (bool == null || !bool.booleanValue()) ? 1 : 0;
            if (bVar4 == null || r0 == 0 || bVar4.m179013xb2c87fbf(gVar.f543997m)) {
                return;
            }
            ((java.util.HashSet) gVar.f543985a).add(bVar4);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.h
    public void k(int i17, zi.b bVar, int i18, int i19, int i27, byte[] bArr) {
        ((java.util.HashMap) this.f543983b.f543984b.f543986b).put(bVar, bArr);
    }
}
