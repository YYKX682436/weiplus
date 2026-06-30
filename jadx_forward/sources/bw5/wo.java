package bw5;

/* loaded from: classes2.dex */
public class wo extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.hp f116331d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f116332e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f116333f = new boolean[3];

    static {
        new bw5.wo();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wo mo11468x92b714fd(byte[] bArr) {
        return (bw5.wo) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wo)) {
            return false;
        }
        bw5.wo woVar = (bw5.wo) fVar;
        return n51.f.a(this.f116331d, woVar.f116331d) && n51.f.a(this.f116332e, woVar.f116332e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.wo();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f116333f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.hp hpVar = this.f116331d;
            if (hpVar != null && zArr[1]) {
                fVar.i(1, hpVar.mo75928xcd1e8d8());
                this.f116331d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f116332e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.hp hpVar2 = this.f116331d;
            if (hpVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, hpVar2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f116332e;
            return (str2 == null || !zArr[2]) ? i18 : i18 + b36.f.j(2, str2);
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
            if (intValue != 2) {
                return -1;
            }
            this.f116332e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.hp hpVar3 = new bw5.hp();
            if (bArr != null && bArr.length > 0) {
                hpVar3.mo11468x92b714fd(bArr);
            }
            this.f116331d = hpVar3;
        }
        zArr[1] = true;
        return 0;
    }
}
