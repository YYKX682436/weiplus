package bw5;

/* loaded from: classes2.dex */
public class iq extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public bw5.eq f110202e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.cq f110203f;

    /* renamed from: h, reason: collision with root package name */
    public bw5.hq f110205h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.bq f110206i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f110201d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f110204g = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f110207m = new boolean[9];

    static {
        new bw5.iq();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.iq mo11468x92b714fd(byte[] bArr) {
        return (bw5.iq) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.iq)) {
            return false;
        }
        bw5.iq iqVar = (bw5.iq) fVar;
        return n51.f.a(this.f110201d, iqVar.f110201d) && n51.f.a(this.f110202e, iqVar.f110202e) && n51.f.a(this.f110203f, iqVar.f110203f) && n51.f.a(this.f110204g, iqVar.f110204g) && n51.f.a(this.f110205h, iqVar.f110205h) && n51.f.a(this.f110206i, iqVar.f110206i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.iq();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f110204g;
        java.util.LinkedList linkedList2 = this.f110201d;
        boolean[] zArr = this.f110207m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList2);
            bw5.eq eqVar = this.f110202e;
            if (eqVar != null && zArr[2]) {
                fVar.i(2, eqVar.mo75928xcd1e8d8());
                this.f110202e.mo75956x3d5d1f78(fVar);
            }
            bw5.cq cqVar = this.f110203f;
            if (cqVar != null && zArr[3]) {
                fVar.i(3, cqVar.mo75928xcd1e8d8());
                this.f110203f.mo75956x3d5d1f78(fVar);
            }
            fVar.g(6, 8, linkedList);
            bw5.hq hqVar = this.f110205h;
            if (hqVar != null && zArr[7]) {
                fVar.e(7, hqVar.f109858d);
            }
            bw5.bq bqVar = this.f110206i;
            if (bqVar != null && zArr[8]) {
                fVar.e(8, bqVar.f107321d);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList2) + 0;
            bw5.eq eqVar2 = this.f110202e;
            if (eqVar2 != null && zArr[2]) {
                g17 += b36.f.i(2, eqVar2.mo75928xcd1e8d8());
            }
            bw5.cq cqVar2 = this.f110203f;
            if (cqVar2 != null && zArr[3]) {
                g17 += b36.f.i(3, cqVar2.mo75928xcd1e8d8());
            }
            int g18 = g17 + b36.f.g(6, 8, linkedList);
            bw5.hq hqVar2 = this.f110205h;
            if (hqVar2 != null && zArr[7]) {
                g18 += b36.f.e(7, hqVar2.f109858d);
            }
            bw5.bq bqVar2 = this.f110206i;
            return (bqVar2 == null || !zArr[8]) ? g18 : g18 + b36.f.e(8, bqVar2.f107321d);
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
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.fq fqVar = new bw5.fq();
                if (bArr != null && bArr.length > 0) {
                    fqVar.mo11468x92b714fd(bArr);
                }
                linkedList2.add(fqVar);
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                bw5.eq eqVar3 = new bw5.eq();
                if (bArr2 != null && bArr2.length > 0) {
                    eqVar3.mo11468x92b714fd(bArr2);
                }
                this.f110202e = eqVar3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr3 = (byte[]) j19.get(i27);
                bw5.cq cqVar3 = new bw5.cq();
                if (bArr3 != null && bArr3.length > 0) {
                    cqVar3.mo11468x92b714fd(bArr3);
                }
                this.f110203f = cqVar3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue == 6) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i28 = 0; i28 < size4; i28++) {
                byte[] bArr4 = (byte[]) j27.get(i28);
                bw5.fq fqVar2 = new bw5.fq();
                if (bArr4 != null && bArr4.length > 0) {
                    fqVar2.mo11468x92b714fd(bArr4);
                }
                linkedList.add(fqVar2);
            }
            zArr[6] = true;
            return 0;
        }
        bw5.hq hqVar3 = null;
        bw5.bq bqVar3 = null;
        if (intValue == 7) {
            int g19 = aVar2.g(intValue);
            if (g19 == 0) {
                hqVar3 = bw5.hq.FinderMVType_FixClip;
            } else if (g19 == 1) {
                hqVar3 = bw5.hq.FinderMVType_FlexClip;
            }
            this.f110205h = hqVar3;
            zArr[7] = true;
            return 0;
        }
        if (intValue != 8) {
            return -1;
        }
        int g27 = aVar2.g(intValue);
        if (g27 == 0) {
            bqVar3 = bw5.bq.FinderMVDraftJumpPage_Edit;
        } else if (g27 == 1) {
            bqVar3 = bw5.bq.FinderMVDraftJumpPage_Preview;
        }
        this.f110206i = bqVar3;
        zArr[8] = true;
        return 0;
    }
}
