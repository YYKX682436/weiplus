package bw5;

/* loaded from: classes2.dex */
public class tq extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f115108d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f115110f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.yr f115111g;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f115109e = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f115112h = new boolean[54];

    static {
        new bw5.tq();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.tq mo11468x92b714fd(byte[] bArr) {
        return (bw5.tq) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tq)) {
            return false;
        }
        bw5.tq tqVar = (bw5.tq) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f115108d), java.lang.Integer.valueOf(tqVar.f115108d)) && n51.f.a(this.f115109e, tqVar.f115109e) && n51.f.a(this.f115110f, tqVar.f115110f) && n51.f.a(this.f115111g, tqVar.f115111g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.tq();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f115109e;
        boolean[] zArr = this.f115112h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f115108d);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f115110f;
            if (str != null && zArr[51]) {
                fVar.j(51, str);
            }
            bw5.yr yrVar = this.f115111g;
            if (yrVar != null && zArr[53]) {
                fVar.i(53, yrVar.mo75928xcd1e8d8());
                this.f115111g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = (zArr[1] ? 0 + b36.f.e(1, this.f115108d) : 0) + b36.f.g(2, 8, linkedList);
            java.lang.String str2 = this.f115110f;
            if (str2 != null && zArr[51]) {
                e17 += b36.f.j(51, str2);
            }
            bw5.yr yrVar2 = this.f115111g;
            return (yrVar2 == null || !zArr[53]) ? e17 : e17 + b36.f.i(53, yrVar2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            linkedList.clear();
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
            this.f115108d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.sq sqVar = new bw5.sq();
                if (bArr != null && bArr.length > 0) {
                    sqVar.mo11468x92b714fd(bArr);
                }
                linkedList.add(sqVar);
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 51) {
            this.f115110f = aVar2.k(intValue);
            zArr[51] = true;
            return 0;
        }
        if (intValue != 53) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.yr yrVar3 = new bw5.yr();
            if (bArr2 != null && bArr2.length > 0) {
                yrVar3.mo11468x92b714fd(bArr2);
            }
            this.f115111g = yrVar3;
        }
        zArr[53] = true;
        return 0;
    }
}
