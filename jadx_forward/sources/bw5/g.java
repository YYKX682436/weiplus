package bw5;

/* loaded from: classes7.dex */
public class g extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f109117d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.j f109118e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f109119f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.h f109120g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f109121h = new boolean[5];

    static {
        new bw5.g();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.g mo11468x92b714fd(byte[] bArr) {
        return (bw5.g) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.g)) {
            return false;
        }
        bw5.g gVar = (bw5.g) fVar;
        return n51.f.a(this.f109117d, gVar.f109117d) && n51.f.a(this.f109118e, gVar.f109118e) && n51.f.a(this.f109119f, gVar.f109119f) && n51.f.a(this.f109120g, gVar.f109120g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.g();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f109121h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f109117d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.j jVar = this.f109118e;
            if (jVar != null && zArr[2]) {
                fVar.e(2, jVar.f110277d);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f109119f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            bw5.h hVar = this.f109120g;
            if (hVar != null && zArr[4]) {
                fVar.i(4, hVar.mo75928xcd1e8d8());
                this.f109120g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f109117d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            bw5.j jVar2 = this.f109118e;
            if (jVar2 != null && zArr[2]) {
                i18 += b36.f.e(2, jVar2.f110277d);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f109119f;
            if (gVar2 != null && zArr[3]) {
                i18 += b36.f.b(3, gVar2);
            }
            bw5.h hVar2 = this.f109120g;
            return (hVar2 == null || !zArr[4]) ? i18 : i18 + b36.f.i(4, hVar2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f109117d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            int g17 = aVar2.g(intValue);
            this.f109118e = g17 != 0 ? g17 != 1 ? null : bw5.j.AIGenerationBillTypeAIMusicGeneration : bw5.j.AIGenerationBillTypeDefault;
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f109119f = aVar2.d(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.h hVar3 = new bw5.h();
            if (bArr != null && bArr.length > 0) {
                hVar3.mo11468x92b714fd(bArr);
            }
            this.f109120g = hVar3;
        }
        zArr[4] = true;
        return 0;
    }
}
