package bw5;

/* loaded from: classes2.dex */
public class he extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ge f109710d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.fe f109711e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f109712f = new boolean[3];

    static {
        new bw5.he();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.he mo11468x92b714fd(byte[] bArr) {
        return (bw5.he) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.he)) {
            return false;
        }
        bw5.he heVar = (bw5.he) fVar;
        return n51.f.a(this.f109710d, heVar.f109710d) && n51.f.a(this.f109711e, heVar.f109711e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.he();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109712f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ge geVar = this.f109710d;
            if (geVar != null && zArr[1]) {
                fVar.i(1, geVar.mo75928xcd1e8d8());
                this.f109710d.mo75956x3d5d1f78(fVar);
            }
            bw5.fe feVar = this.f109711e;
            if (feVar != null && zArr[2]) {
                fVar.i(2, feVar.mo75928xcd1e8d8());
                this.f109711e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ge geVar2 = this.f109710d;
            if (geVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, geVar2.mo75928xcd1e8d8());
            }
            bw5.fe feVar2 = this.f109711e;
            return (feVar2 == null || !zArr[2]) ? i18 : i18 + b36.f.i(2, feVar2.mo75928xcd1e8d8());
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
                bw5.ge geVar3 = new bw5.ge();
                if (bArr != null && bArr.length > 0) {
                    geVar3.mo11468x92b714fd(bArr);
                }
                this.f109710d = geVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.fe feVar3 = new bw5.fe();
            if (bArr2 != null && bArr2.length > 0) {
                feVar3.mo11468x92b714fd(bArr2);
            }
            this.f109711e = feVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
