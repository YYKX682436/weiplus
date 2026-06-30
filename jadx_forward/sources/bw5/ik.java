package bw5;

/* loaded from: classes2.dex */
public class ik extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.hk f110151d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.bk f110152e;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f110154g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f110155h;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f110153f = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f110156i = new boolean[6];

    static {
        new bw5.ik();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ik mo11468x92b714fd(byte[] bArr) {
        return (bw5.ik) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ik)) {
            return false;
        }
        bw5.ik ikVar = (bw5.ik) fVar;
        return n51.f.a(this.f110151d, ikVar.f110151d) && n51.f.a(this.f110152e, ikVar.f110152e) && n51.f.a(this.f110153f, ikVar.f110153f) && n51.f.a(this.f110154g, ikVar.f110154g) && n51.f.a(this.f110155h, ikVar.f110155h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ik();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f110153f;
        boolean[] zArr = this.f110156i;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.hk hkVar = this.f110151d;
            if (hkVar != null && zArr[1]) {
                fVar.i(1, hkVar.mo75928xcd1e8d8());
                this.f110151d.mo75956x3d5d1f78(fVar);
            }
            bw5.bk bkVar = this.f110152e;
            if (bkVar != null && zArr[2]) {
                fVar.i(2, bkVar.mo75928xcd1e8d8());
                this.f110152e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f110154g;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            java.lang.String str = this.f110155h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.hk hkVar2 = this.f110151d;
            if (hkVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, hkVar2.mo75928xcd1e8d8());
            }
            bw5.bk bkVar2 = this.f110152e;
            if (bkVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, bkVar2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f110154g;
            if (gVar2 != null && zArr[4]) {
                g17 += b36.f.b(4, gVar2);
            }
            java.lang.String str2 = this.f110155h;
            return (str2 == null || !zArr[5]) ? g17 : g17 + b36.f.j(5, str2);
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.hk hkVar3 = new bw5.hk();
                if (bArr != null && bArr.length > 0) {
                    hkVar3.mo11468x92b714fd(bArr);
                }
                this.f110151d = hkVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.bk bkVar3 = new bw5.bk();
                if (bArr2 != null && bArr2.length > 0) {
                    bkVar3.mo11468x92b714fd(bArr2);
                }
                this.f110152e = bkVar3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                this.f110154g = aVar2.d(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f110155h = aVar2.k(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.hk hkVar4 = new bw5.hk();
            if (bArr3 != null && bArr3.length > 0) {
                hkVar4.mo11468x92b714fd(bArr3);
            }
            linkedList.add(hkVar4);
        }
        zArr[3] = true;
        return 0;
    }
}
