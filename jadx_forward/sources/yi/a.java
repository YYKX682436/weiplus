package yi;

/* loaded from: classes15.dex */
public class a extends yi.h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yi.b f543979b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yi.b bVar, yi.h hVar) {
        super(hVar);
        this.f543979b = bVar;
    }

    @Override // yi.h
    public void e(zi.b bVar, int i17, zi.b bVar2, byte[] bArr) {
        zi.b bVar3;
        zi.b bVar4;
        yi.b bVar5 = this.f543979b;
        try {
            if (bVar2.m179013xb2c87fbf(bVar5.f543980b.f543990f)) {
                java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
                zi.a[] aVarArr = bVar5.f543980b.f543998n;
                int length = aVarArr.length;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (i18 >= length) {
                        bVar3 = null;
                        break;
                    }
                    zi.a aVar = aVarArr[i18];
                    zi.b bVar6 = aVar.f554607b;
                    int i27 = aVar.f554606a;
                    zi.c a17 = zi.c.a(i27);
                    if (a17 == null) {
                        throw new java.lang.IllegalStateException("visit instance failed, lost type def of typeId: " + i27);
                    }
                    if (bVar5.f543980b.f543991g.m179013xb2c87fbf(bVar6)) {
                        bVar3 = (zi.b) aj.a.f(byteArrayInputStream, a17, bVar5.f543980b.f543996l);
                        break;
                    }
                    int i28 = bVar5.f543980b.f543996l;
                    int i29 = a17.f554613e;
                    if (i29 != 0) {
                        i28 = i29;
                    }
                    aj.a.g(byteArrayInputStream, i28);
                    i19 += i28;
                    i18++;
                }
                if (bVar3 != null && (bVar4 = (zi.b) ((java.util.HashMap) bVar5.f543980b.f543987c).get(bVar3)) != null && !bVar3.m179013xb2c87fbf(bVar4) && !bVar3.m179013xb2c87fbf(bVar5.f543980b.f543997m)) {
                    java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
                    wrap.position(i19);
                    wrap.put(bVar4.f554609a);
                }
            }
            super.e(bVar, i17, bVar2, bArr);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.h
    public void k(int i17, zi.b bVar, int i18, int i19, int i27, byte[] bArr) {
        yi.b bVar2 = this.f543979b;
        zi.b bVar3 = (zi.b) ((java.util.HashMap) bVar2.f543980b.f543987c).get(bVar);
        if ((bVar3 == null || !bVar.m179013xb2c87fbf(bVar3)) && !((java.util.HashSet) bVar2.f543980b.f543988d).contains(bVar)) {
            return;
        }
        super.k(i17, bVar, i18, i19, i27, bArr);
    }
}
