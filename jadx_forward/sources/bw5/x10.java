package bw5;

/* loaded from: classes2.dex */
public class x10 extends r45.js5 {

    /* renamed from: h, reason: collision with root package name */
    public static final bw5.x10 f116440h = new bw5.x10();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f116442e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.x7 f116443f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f116441d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f116444g = new boolean[5];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.x10)) {
            return false;
        }
        bw5.x10 x10Var = (bw5.x10) fVar;
        return n51.f.a(this.f76492x92037252, x10Var.f76492x92037252) && n51.f.a(this.f116441d, x10Var.f116441d) && n51.f.a(this.f116442e, x10Var.f116442e) && n51.f.a(this.f116443f, x10Var.f116443f);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f116444g[1] ? this.f76492x92037252 : new r45.ie();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.x10();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f116441d;
        boolean[] zArr = this.f116444g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f116442e;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            bw5.x7 x7Var = this.f116443f;
            if (x7Var != null && zArr[4]) {
                fVar.i(4, x7Var.mo75928xcd1e8d8());
                this.f116443f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            java.lang.String str2 = this.f116442e;
            if (str2 != null && zArr[3]) {
                g17 += b36.f.j(3, str2);
            }
            bw5.x7 x7Var2 = this.f116443f;
            return (x7Var2 == null || !zArr[4]) ? g17 : g17 + b36.f.i(4, x7Var2.mo75928xcd1e8d8());
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
                bw5.w10 w10Var = new bw5.w10();
                if (bArr2 != null && bArr2.length > 0) {
                    w10Var.mo11468x92b714fd(bArr2);
                }
                linkedList.add(w10Var);
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f116442e = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.x7 x7Var3 = new bw5.x7();
            if (bArr3 != null && bArr3.length > 0) {
                x7Var3.mo11468x92b714fd(bArr3);
            }
            this.f116443f = x7Var3;
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.x10) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        this.f116444g[1] = true;
        return this;
    }
}
