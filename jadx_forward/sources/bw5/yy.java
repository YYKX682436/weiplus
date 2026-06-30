package bw5;

/* loaded from: classes2.dex */
public class yy extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ae f117260d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.fr f117261e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f117262f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f117263g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f117264h = new boolean[5];

    static {
        new bw5.yy();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.yy mo11468x92b714fd(byte[] bArr) {
        return (bw5.yy) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yy)) {
            return false;
        }
        bw5.yy yyVar = (bw5.yy) fVar;
        return n51.f.a(this.f117260d, yyVar.f117260d) && n51.f.a(this.f117261e, yyVar.f117261e) && n51.f.a(this.f117262f, yyVar.f117262f) && n51.f.a(this.f117263g, yyVar.f117263g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.yy();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f117264h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ae aeVar = this.f117260d;
            if (aeVar != null && zArr[1]) {
                fVar.i(1, aeVar.mo75928xcd1e8d8());
                this.f117260d.mo75956x3d5d1f78(fVar);
            }
            bw5.fr frVar = this.f117261e;
            if (frVar != null && zArr[2]) {
                fVar.i(2, frVar.mo75928xcd1e8d8());
                this.f117261e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f117262f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f117263g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ae aeVar2 = this.f117260d;
            if (aeVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, aeVar2.mo75928xcd1e8d8());
            }
            bw5.fr frVar2 = this.f117261e;
            if (frVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, frVar2.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f117262f;
            if (str3 != null && zArr[3]) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f117263g;
            return (str4 == null || !zArr[4]) ? i18 : i18 + b36.f.j(4, str4);
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.ae aeVar3 = new bw5.ae();
                if (bArr != null && bArr.length > 0) {
                    aeVar3.mo11468x92b714fd(bArr);
                }
                this.f117260d = aeVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f117262f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f117263g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.fr frVar3 = new bw5.fr();
            if (bArr2 != null && bArr2.length > 0) {
                frVar3.mo11468x92b714fd(bArr2);
            }
            this.f117261e = frVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
