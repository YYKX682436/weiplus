package bw5;

/* loaded from: classes4.dex */
public class rx extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f114230d;

    /* renamed from: f, reason: collision with root package name */
    public bw5.qx f114232f;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f114231e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f114233g = new boolean[4];

    static {
        new bw5.rx();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.rx mo11468x92b714fd(byte[] bArr) {
        return (bw5.rx) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.rx)) {
            return false;
        }
        bw5.rx rxVar = (bw5.rx) fVar;
        return n51.f.a(this.f114230d, rxVar.f114230d) && n51.f.a(this.f114231e, rxVar.f114231e) && n51.f.a(this.f114232f, rxVar.f114232f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.rx();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f114231e;
        boolean[] zArr = this.f114233g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f114230d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            bw5.qx qxVar = this.f114232f;
            if (qxVar != null && zArr[3]) {
                fVar.i(3, qxVar.mo75928xcd1e8d8());
                this.f114232f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f114230d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            bw5.qx qxVar2 = this.f114232f;
            return (qxVar2 == null || !zArr[3]) ? g17 : g17 + b36.f.i(3, qxVar2.mo75928xcd1e8d8());
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
            this.f114230d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.hy hyVar = new bw5.hy();
                if (bArr != null && bArr.length > 0) {
                    hyVar.mo11468x92b714fd(bArr);
                }
                linkedList.add(hyVar);
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.qx qxVar3 = new bw5.qx();
            if (bArr2 != null && bArr2.length > 0) {
                qxVar3.mo11468x92b714fd(bArr2);
            }
            this.f114232f = qxVar3;
        }
        zArr[3] = true;
        return 0;
    }
}
