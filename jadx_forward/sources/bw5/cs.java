package bw5;

/* loaded from: classes2.dex */
public class cs extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.fr f107745d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f107746e;

    /* renamed from: f, reason: collision with root package name */
    public int f107747f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f107748g = new boolean[4];

    static {
        new bw5.cs();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.cs mo11468x92b714fd(byte[] bArr) {
        return (bw5.cs) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.cs)) {
            return false;
        }
        bw5.cs csVar = (bw5.cs) fVar;
        return n51.f.a(this.f107745d, csVar.f107745d) && n51.f.a(this.f107746e, csVar.f107746e) && n51.f.a(java.lang.Integer.valueOf(this.f107747f), java.lang.Integer.valueOf(csVar.f107747f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.cs();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107748g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.fr frVar = this.f107745d;
            if (frVar != null && zArr[1]) {
                fVar.i(1, frVar.mo75928xcd1e8d8());
                this.f107745d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f107746e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f107747f);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.fr frVar2 = this.f107745d;
            if (frVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, frVar2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f107746e;
            if (str2 != null && zArr[2]) {
                i18 += b36.f.j(2, str2);
            }
            return zArr[3] ? i18 + b36.f.e(3, this.f107747f) : i18;
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f107746e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f107747f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.fr frVar3 = new bw5.fr();
            if (bArr != null && bArr.length > 0) {
                frVar3.mo11468x92b714fd(bArr);
            }
            this.f107745d = frVar3;
        }
        zArr[1] = true;
        return 0;
    }
}
