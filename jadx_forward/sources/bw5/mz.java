package bw5;

/* loaded from: classes8.dex */
public class mz extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f111955d;

    /* renamed from: e, reason: collision with root package name */
    public long f111956e;

    /* renamed from: f, reason: collision with root package name */
    public long f111957f;

    /* renamed from: h, reason: collision with root package name */
    public int f111959h;

    /* renamed from: i, reason: collision with root package name */
    public int f111960i;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f111958g = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f111961m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final android.util.ArrayMap f111962n = new android.util.ArrayMap();

    static {
        new bw5.mz();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.mz mo11468x92b714fd(byte[] bArr) {
        return (bw5.mz) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.mz)) {
            return false;
        }
        bw5.mz mzVar = (bw5.mz) fVar;
        return n51.f.a(this.f111955d, mzVar.f111955d) && n51.f.a(java.lang.Long.valueOf(this.f111956e), java.lang.Long.valueOf(mzVar.f111956e)) && n51.f.a(java.lang.Long.valueOf(this.f111957f), java.lang.Long.valueOf(mzVar.f111957f)) && n51.f.a(this.f111958g, mzVar.f111958g) && n51.f.a(java.lang.Integer.valueOf(this.f111959h), java.lang.Integer.valueOf(mzVar.f111959h)) && n51.f.a(java.lang.Integer.valueOf(this.f111960i), java.lang.Integer.valueOf(mzVar.f111960i)) && n51.f.a(this.f111961m, mzVar.f111961m);
    }

    /* renamed from: hasFieldNumber */
    public boolean m12536x6e095e9(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f111962n.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.mz();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f111961m;
        java.util.LinkedList linkedList2 = this.f111958g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f111955d != null && m12536x6e095e9(1)) {
                fVar.j(1, this.f111955d);
            }
            if (m12536x6e095e9(2)) {
                fVar.h(2, this.f111956e);
            }
            if (m12536x6e095e9(3)) {
                fVar.h(3, this.f111957f);
            }
            fVar.g(4, 8, linkedList2);
            if (m12536x6e095e9(5)) {
                fVar.e(5, this.f111959h);
            }
            if (m12536x6e095e9(6)) {
                fVar.e(6, this.f111960i);
            }
            fVar.g(100, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            if (this.f111955d != null && m12536x6e095e9(1)) {
                i18 = 0 + b36.f.j(1, this.f111955d);
            }
            if (m12536x6e095e9(2)) {
                i18 += b36.f.h(2, this.f111956e);
            }
            if (m12536x6e095e9(3)) {
                i18 += b36.f.h(3, this.f111957f);
            }
            int g17 = i18 + b36.f.g(4, 8, linkedList2);
            if (m12536x6e095e9(5)) {
                g17 += b36.f.e(5, this.f111959h);
            }
            if (m12536x6e095e9(6)) {
                g17 += b36.f.e(6, this.f111960i);
            }
            return g17 + b36.f.g(100, 8, linkedList);
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
        android.util.ArrayMap arrayMap = this.f111962n;
        if (intValue == 100) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.oz ozVar = new bw5.oz();
                if (bArr != null && bArr.length > 0) {
                    ozVar.mo11468x92b714fd(bArr);
                }
                linkedList.add(ozVar);
            }
            arrayMap.put(100, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f111955d = aVar2.k(intValue);
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                this.f111956e = aVar2.i(intValue);
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                this.f111957f = aVar2.i(intValue);
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.qz qzVar = new bw5.qz();
                    if (bArr2 != null && bArr2.length > 0) {
                        qzVar.mo11468x92b714fd(bArr2);
                    }
                    linkedList2.add(qzVar);
                }
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                this.f111959h = aVar2.g(intValue);
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                this.f111960i = aVar2.g(intValue);
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }
}
