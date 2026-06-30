package bw5;

/* loaded from: classes2.dex */
public class ei extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f108454d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.ii f108455e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f108456f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f108457g = new boolean[4];

    static {
        new bw5.ei();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ei mo11468x92b714fd(byte[] bArr) {
        return (bw5.ei) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ei)) {
            return false;
        }
        bw5.ei eiVar = (bw5.ei) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f108454d), java.lang.Integer.valueOf(eiVar.f108454d)) && n51.f.a(this.f108455e, eiVar.f108455e) && n51.f.a(this.f108456f, eiVar.f108456f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ei();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f108456f;
        boolean[] zArr = this.f108457g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f108454d);
            }
            bw5.ii iiVar = this.f108455e;
            if (iiVar != null && zArr[2]) {
                fVar.i(2, iiVar.mo75928xcd1e8d8());
                this.f108455e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f108454d) : 0;
            bw5.ii iiVar2 = this.f108455e;
            if (iiVar2 != null && zArr[2]) {
                e17 += b36.f.i(2, iiVar2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.g(3, 8, linkedList);
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
            this.f108454d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.ii iiVar3 = new bw5.ii();
                if (bArr != null && bArr.length > 0) {
                    iiVar3.mo11468x92b714fd(bArr);
                }
                this.f108455e = iiVar3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.gi giVar = new bw5.gi();
            if (bArr2 != null && bArr2.length > 0) {
                giVar.mo11468x92b714fd(bArr2);
            }
            linkedList.add(giVar);
        }
        zArr[3] = true;
        return 0;
    }
}
