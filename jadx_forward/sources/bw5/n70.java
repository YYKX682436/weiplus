package bw5;

/* loaded from: classes2.dex */
public class n70 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.bc0 f112064d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f112065e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.m70 f112066f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f112067g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f112068h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f112069i = new boolean[7];

    static {
        new bw5.n70();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.n70 mo11468x92b714fd(byte[] bArr) {
        return (bw5.n70) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.n70)) {
            return false;
        }
        bw5.n70 n70Var = (bw5.n70) fVar;
        return n51.f.a(this.f112064d, n70Var.f112064d) && n51.f.a(this.f112065e, n70Var.f112065e) && n51.f.a(this.f112066f, n70Var.f112066f) && n51.f.a(this.f112067g, n70Var.f112067g) && n51.f.a(this.f112068h, n70Var.f112068h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.n70();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f112068h;
        boolean[] zArr = this.f112069i;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.bc0 bc0Var = this.f112064d;
            if (bc0Var != null && zArr[2]) {
                fVar.i(2, bc0Var.mo75928xcd1e8d8());
                this.f112064d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f112065e;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            bw5.m70 m70Var = this.f112066f;
            if (m70Var != null && zArr[4]) {
                fVar.i(4, m70Var.mo75928xcd1e8d8());
                this.f112066f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f112067g;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            fVar.g(6, 2, linkedList);
            return 0;
        }
        if (i17 == 1) {
            bw5.bc0 bc0Var2 = this.f112064d;
            if (bc0Var2 != null && zArr[2]) {
                i18 = 0 + b36.f.i(2, bc0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f112065e;
            if (str3 != null && zArr[3]) {
                i18 += b36.f.j(3, str3);
            }
            bw5.m70 m70Var2 = this.f112066f;
            if (m70Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, m70Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f112067g;
            if (str4 != null && zArr[5]) {
                i18 += b36.f.j(5, str4);
            }
            return i18 + b36.f.g(6, 2, linkedList);
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
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.bc0 bc0Var3 = new bw5.bc0();
                if (bArr != null && bArr.length > 0) {
                    bc0Var3.mo11468x92b714fd(bArr);
                }
                this.f112064d = bc0Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f112065e = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            if (intValue == 5) {
                this.f112067g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            }
            if (intValue != 6) {
                return -1;
            }
            linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            zArr[6] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.m70 m70Var3 = new bw5.m70();
            if (bArr2 != null && bArr2.length > 0) {
                m70Var3.mo11468x92b714fd(bArr2);
            }
            this.f112066f = m70Var3;
        }
        zArr[4] = true;
        return 0;
    }
}
