package bw5;

/* loaded from: classes2.dex */
public class b70 extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f107086e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f107087f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f107088g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f107089h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.m40 f107090i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f107085d = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f107091m = new boolean[8];

    static {
        new bw5.b70();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.b70 mo11468x92b714fd(byte[] bArr) {
        return (bw5.b70) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.b70)) {
            return false;
        }
        bw5.b70 b70Var = (bw5.b70) fVar;
        return n51.f.a(this.f76492x92037252, b70Var.f76492x92037252) && n51.f.a(this.f107085d, b70Var.f107085d) && n51.f.a(this.f107086e, b70Var.f107086e) && n51.f.a(java.lang.Boolean.valueOf(this.f107087f), java.lang.Boolean.valueOf(b70Var.f107087f)) && n51.f.a(java.lang.Boolean.valueOf(this.f107088g), java.lang.Boolean.valueOf(b70Var.f107088g)) && n51.f.a(this.f107089h, b70Var.f107089h) && n51.f.a(this.f107090i, b70Var.f107090i);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f107091m[1] ? this.f76492x92037252 : new r45.ie();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.b70();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f107085d;
        int i18 = 0;
        boolean[] zArr = this.f107091m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f107086e;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            if (zArr[4]) {
                fVar.a(4, this.f107087f);
            }
            if (zArr[5]) {
                fVar.a(5, this.f107088g);
            }
            java.lang.String str = this.f107089h;
            if (str != null && zArr[6]) {
                fVar.j(6, str);
            }
            bw5.m40 m40Var = this.f107090i;
            if (m40Var != null && zArr[7]) {
                fVar.i(7, m40Var.mo75928xcd1e8d8());
                this.f107090i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f107086e;
            if (gVar2 != null && zArr[3]) {
                g17 += b36.f.b(3, gVar2);
            }
            if (zArr[4]) {
                g17 += b36.f.a(4, this.f107087f);
            }
            if (zArr[5]) {
                g17 += b36.f.a(5, this.f107088g);
            }
            java.lang.String str2 = this.f107089h;
            if (str2 != null && zArr[6]) {
                g17 += b36.f.j(6, str2);
            }
            bw5.m40 m40Var2 = this.f107090i;
            return (m40Var2 == null || !zArr[7]) ? g17 : g17 + b36.f.i(7, m40Var2.mo75928xcd1e8d8());
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
        switch (intValue) {
            case 1:
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
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.x40 x40Var = new bw5.x40();
                    if (bArr2 != null && bArr2.length > 0) {
                        x40Var.mo11468x92b714fd(bArr2);
                    }
                    linkedList.add(x40Var);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f107086e = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f107087f = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f107088g = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f107089h = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.m40 m40Var3 = new bw5.m40();
                    if (bArr3 != null && bArr3.length > 0) {
                        m40Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f107090i = m40Var3;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        this.f107091m[1] = true;
        return this;
    }
}
