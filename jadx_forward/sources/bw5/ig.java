package bw5;

/* loaded from: classes2.dex */
public class ig extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public int f110105e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f110106f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f110107g;

    /* renamed from: h, reason: collision with root package name */
    public int f110108h;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f110104d = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f110109i = new boolean[7];

    static {
        new bw5.ig();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ig)) {
            return false;
        }
        bw5.ig igVar = (bw5.ig) fVar;
        return n51.f.a(this.f76492x92037252, igVar.f76492x92037252) && n51.f.a(this.f110104d, igVar.f110104d) && n51.f.a(java.lang.Integer.valueOf(this.f110105e), java.lang.Integer.valueOf(igVar.f110105e)) && n51.f.a(this.f110106f, igVar.f110106f) && n51.f.a(this.f110107g, igVar.f110107g) && n51.f.a(java.lang.Integer.valueOf(this.f110108h), java.lang.Integer.valueOf(igVar.f110108h));
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f110109i[1] ? this.f76492x92037252 : new r45.ie();
    }

    /* renamed from: getLastBuffer */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m12152x44e5026c() {
        return this.f110109i[4] ? this.f110106f : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ig();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f110104d;
        int i18 = 0;
        boolean[] zArr = this.f110109i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            if (zArr[3]) {
                fVar.e(3, this.f110105e);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f110106f;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            java.lang.String str = this.f110107g;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            if (zArr[6]) {
                fVar.e(6, this.f110108h);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f110105e);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f110106f;
            if (gVar2 != null && zArr[4]) {
                g17 += b36.f.b(4, gVar2);
            }
            java.lang.String str2 = this.f110107g;
            if (str2 != null && zArr[5]) {
                g17 += b36.f.j(5, str2);
            }
            return zArr[6] ? g17 + b36.f.e(6, this.f110108h) : g17;
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
                    bw5.hg hgVar = new bw5.hg();
                    if (bArr2 != null && bArr2.length > 0) {
                        hgVar.mo11468x92b714fd(bArr2);
                    }
                    linkedList.add(hgVar);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f110105e = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f110106f = aVar2.d(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f110107g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f110108h = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.ig) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        this.f110109i[1] = true;
        return this;
    }
}
