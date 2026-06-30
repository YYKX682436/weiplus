package bw5;

/* loaded from: classes8.dex */
public class l70 extends r45.mr5 {

    /* renamed from: e, reason: collision with root package name */
    public int f111208e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f111207d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f111209f = new boolean[5];

    static {
        new bw5.l70();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.l70)) {
            return false;
        }
        bw5.l70 l70Var = (bw5.l70) fVar;
        return n51.f.a(this.f76494x2de60e5e, l70Var.f76494x2de60e5e) && n51.f.a(this.f111207d, l70Var.f111207d) && n51.f.a(java.lang.Integer.valueOf(this.f111208e), java.lang.Integer.valueOf(l70Var.f111208e));
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: getBaseRequest */
    public r45.he mo11508xa452ad48() {
        return this.f111209f[1] ? this.f76494x2de60e5e : new r45.he();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.l70();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f111207d;
        boolean[] zArr = this.f111209f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList);
            if (zArr[4]) {
                fVar.e(4, this.f111208e);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            return zArr[4] ? g17 + b36.f.e(4, this.f111208e) : g17;
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
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.mo11468x92b714fd(bArr);
                }
                this.f76494x2de60e5e = heVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f111208e = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.k70 k70Var = new bw5.k70();
            if (bArr2 != null && bArr2.length > 0) {
                k70Var.mo11468x92b714fd(bArr2);
            }
            linkedList.add(k70Var);
        }
        zArr[3] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.l70) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: setBaseRequest */
    public r45.my3 mo11509x3ab820bc(r45.he heVar) {
        this.f76494x2de60e5e = heVar;
        this.f111209f[1] = true;
        return this;
    }
}
