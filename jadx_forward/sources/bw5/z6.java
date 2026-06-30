package bw5;

/* loaded from: classes8.dex */
public class z6 extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f117367e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f117368f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.t6 f117369g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f117366d = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f117370h = new boolean[6];

    static {
        new bw5.z6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.z6)) {
            return false;
        }
        bw5.z6 z6Var = (bw5.z6) fVar;
        return n51.f.a(this.f76492x92037252, z6Var.f76492x92037252) && n51.f.a(this.f117366d, z6Var.f117366d) && n51.f.a(this.f117367e, z6Var.f117367e) && n51.f.a(java.lang.Boolean.valueOf(this.f117368f), java.lang.Boolean.valueOf(z6Var.f117368f)) && n51.f.a(this.f117369g, z6Var.f117369g);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f117370h[1] ? this.f76492x92037252 : new r45.ie();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.z6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f117366d;
        boolean[] zArr = this.f117370h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f117367e;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.a(4, this.f117368f);
            }
            bw5.t6 t6Var = this.f117369g;
            if (t6Var != null && zArr[5]) {
                fVar.i(5, t6Var.mo75928xcd1e8d8());
                this.f117369g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            java.lang.String str2 = this.f117367e;
            if (str2 != null && zArr[3]) {
                g17 += b36.f.j(3, str2);
            }
            if (zArr[4]) {
                g17 += b36.f.a(4, this.f117368f);
            }
            bw5.t6 t6Var2 = this.f117369g;
            return (t6Var2 == null || !zArr[5]) ? g17 : g17 + b36.f.i(5, t6Var2.mo75928xcd1e8d8());
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
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.t9 t9Var = new bw5.t9();
                if (bArr2 != null && bArr2.length > 0) {
                    t9Var.mo11468x92b714fd(bArr2);
                }
                linkedList.add(t9Var);
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f117367e = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f117368f = aVar2.c(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.t6 t6Var3 = new bw5.t6();
            if (bArr3 != null && bArr3.length > 0) {
                t6Var3.mo11468x92b714fd(bArr3);
            }
            this.f117369g = t6Var3;
        }
        zArr[5] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.z6) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        this.f117370h[1] = true;
        return this;
    }
}
