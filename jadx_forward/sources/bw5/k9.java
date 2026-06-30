package bw5;

/* loaded from: classes8.dex */
public class k9 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.j9 f110829d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f110830e;

    /* renamed from: g, reason: collision with root package name */
    public int f110832g;

    /* renamed from: h, reason: collision with root package name */
    public int f110833h;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f110831f = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final android.util.ArrayMap f110834i = new android.util.ArrayMap();

    static {
        new bw5.k9();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.k9 mo11468x92b714fd(byte[] bArr) {
        return (bw5.k9) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.k9)) {
            return false;
        }
        bw5.k9 k9Var = (bw5.k9) fVar;
        return n51.f.a(this.f110829d, k9Var.f110829d) && n51.f.a(this.f110830e, k9Var.f110830e) && n51.f.a(this.f110831f, k9Var.f110831f) && n51.f.a(java.lang.Integer.valueOf(this.f110832g), java.lang.Integer.valueOf(k9Var.f110832g)) && n51.f.a(java.lang.Integer.valueOf(this.f110833h), java.lang.Integer.valueOf(k9Var.f110833h));
    }

    /* renamed from: hasFieldNumber */
    public boolean m12305x6e095e9(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f110834i.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.k9();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f110831f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f110829d != null && m12305x6e095e9(1)) {
                fVar.e(1, this.f110829d.f110410d);
            }
            if (this.f110830e != null && m12305x6e095e9(2)) {
                fVar.b(2, this.f110830e);
            }
            fVar.g(3, 8, linkedList);
            if (m12305x6e095e9(4)) {
                fVar.e(4, this.f110832g);
            }
            if (m12305x6e095e9(100)) {
                fVar.e(100, this.f110833h);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.f110829d != null && m12305x6e095e9(1)) {
                i18 = 0 + b36.f.e(1, this.f110829d.f110410d);
            }
            if (this.f110830e != null && m12305x6e095e9(2)) {
                i18 += b36.f.b(2, this.f110830e);
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            if (m12305x6e095e9(4)) {
                g17 += b36.f.e(4, this.f110832g);
            }
            return m12305x6e095e9(100) ? g17 + b36.f.e(100, this.f110833h) : g17;
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
        android.util.ArrayMap arrayMap = this.f110834i;
        if (intValue == 1) {
            this.f110829d = bw5.j9.a(aVar2.g(intValue));
            arrayMap.put(1, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 2) {
            this.f110830e = aVar2.d(intValue);
            arrayMap.put(2, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                this.f110832g = aVar2.g(intValue);
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            }
            if (intValue != 100) {
                return -1;
            }
            this.f110833h = aVar2.g(intValue);
            arrayMap.put(100, java.lang.Boolean.TRUE);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.m9 m9Var = new bw5.m9();
            if (bArr != null && bArr.length > 0) {
                m9Var.mo11468x92b714fd(bArr);
            }
            linkedList.add(m9Var);
        }
        arrayMap.put(3, java.lang.Boolean.TRUE);
        return 0;
    }
}
