package bw5;

/* loaded from: classes2.dex */
public class v6 extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f115695e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f115696f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f115694d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f115697g = new boolean[5];

    static {
        new bw5.v6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.v6)) {
            return false;
        }
        bw5.v6 v6Var = (bw5.v6) fVar;
        return n51.f.a(this.f76492x92037252, v6Var.f76492x92037252) && n51.f.a(this.f115694d, v6Var.f115694d) && n51.f.a(this.f115695e, v6Var.f115695e) && n51.f.a(java.lang.Boolean.valueOf(this.f115696f), java.lang.Boolean.valueOf(v6Var.f115696f));
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f115697g[1] ? this.f76492x92037252 : new r45.ie();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.v6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f115694d;
        boolean[] zArr = this.f115697g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f115695e;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            if (zArr[4]) {
                fVar.a(4, this.f115696f);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f115695e;
            if (gVar2 != null && zArr[3]) {
                g17 += b36.f.b(3, gVar2);
            }
            return zArr[4] ? g17 + b36.f.a(4, this.f115696f) : g17;
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
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr);
                }
                this.f76492x92037252 = ieVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f115695e = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f115696f = aVar2.c(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.q5 q5Var = new bw5.q5();
            if (bArr2 != null && bArr2.length > 0) {
                q5Var.mo11468x92b714fd(bArr2);
            }
            linkedList.add(q5Var);
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.v6) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        this.f115697g[1] = true;
        return this;
    }
}
