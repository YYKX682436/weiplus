package bw5;

/* loaded from: classes2.dex */
public class iu extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f110236e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f110237f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.sp f110238g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.ps f110239h;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f110235d = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f110240i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f110241m = new boolean[7];

    static {
        new bw5.iu();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.iu mo11468x92b714fd(byte[] bArr) {
        return (bw5.iu) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.iu)) {
            return false;
        }
        bw5.iu iuVar = (bw5.iu) fVar;
        return n51.f.a(this.f110235d, iuVar.f110235d) && n51.f.a(this.f110236e, iuVar.f110236e) && n51.f.a(this.f110237f, iuVar.f110237f) && n51.f.a(this.f110238g, iuVar.f110238g) && n51.f.a(this.f110239h, iuVar.f110239h) && n51.f.a(this.f110240i, iuVar.f110240i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.iu();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f110240i;
        java.util.LinkedList linkedList2 = this.f110235d;
        boolean[] zArr = this.f110241m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, linkedList2);
            java.lang.String str = this.f110236e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f110237f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            bw5.sp spVar = this.f110238g;
            if (spVar != null && zArr[4]) {
                fVar.i(4, spVar.mo75928xcd1e8d8());
                this.f110238g.mo75956x3d5d1f78(fVar);
            }
            bw5.ps psVar = this.f110239h;
            if (psVar != null && zArr[5]) {
                fVar.i(5, psVar.mo75928xcd1e8d8());
                this.f110239h.mo75956x3d5d1f78(fVar);
            }
            fVar.g(6, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 1, linkedList2) + 0;
            java.lang.String str3 = this.f110236e;
            if (str3 != null && zArr[2]) {
                g17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f110237f;
            if (str4 != null && zArr[3]) {
                g17 += b36.f.j(3, str4);
            }
            bw5.sp spVar2 = this.f110238g;
            if (spVar2 != null && zArr[4]) {
                g17 += b36.f.i(4, spVar2.mo75928xcd1e8d8());
            }
            bw5.ps psVar2 = this.f110239h;
            if (psVar2 != null && zArr[5]) {
                g17 += b36.f.i(5, psVar2.mo75928xcd1e8d8());
            }
            return g17 + b36.f.g(6, 1, linkedList);
        }
        if (i17 == 2) {
            linkedList2.clear();
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
        switch (intValue) {
            case 1:
                linkedList2.add(aVar2.k(intValue));
                zArr[1] = true;
                return 0;
            case 2:
                this.f110236e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f110237f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.sp spVar3 = new bw5.sp();
                    if (bArr != null && bArr.length > 0) {
                        spVar3.mo11468x92b714fd(bArr);
                    }
                    this.f110238g = spVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.ps psVar3 = new bw5.ps();
                    if (bArr2 != null && bArr2.length > 0) {
                        psVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f110239h = psVar3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                linkedList.add(aVar2.k(intValue));
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
