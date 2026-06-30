package r45;

/* loaded from: classes9.dex */
public class ye extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f472538d;

    /* renamed from: f, reason: collision with root package name */
    public int f472540f;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f472542h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f472544m;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f472539e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f472541g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f472543i = new java.util.LinkedList();

    static {
        new r45.ye();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ye)) {
            return false;
        }
        r45.ye yeVar = (r45.ye) fVar;
        return n51.f.a(this.f76492x92037252, yeVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f472538d), java.lang.Integer.valueOf(yeVar.f472538d)) && n51.f.a(this.f472539e, yeVar.f472539e) && n51.f.a(java.lang.Integer.valueOf(this.f472540f), java.lang.Integer.valueOf(yeVar.f472540f)) && n51.f.a(this.f472541g, yeVar.f472541g) && n51.f.a(this.f472542h, yeVar.f472542h) && n51.f.a(this.f472543i, yeVar.f472543i) && n51.f.a(this.f472544m, yeVar.f472544m);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f76492x92037252;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.ye();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f472543i;
        java.util.LinkedList linkedList2 = this.f472541g;
        java.util.LinkedList linkedList3 = this.f472539e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f472538d);
            fVar.g(3, 1, linkedList3);
            fVar.e(4, this.f472540f);
            fVar.g(5, 8, linkedList2);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f472542h;
            if (gVar != null) {
                fVar.b(6, gVar);
            }
            fVar.g(7, 7, linkedList);
            java.lang.String str = this.f472544m;
            if (str != null) {
                fVar.j(8, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f472538d) + b36.f.g(3, 1, linkedList3) + b36.f.e(4, this.f472540f) + b36.f.g(5, 8, linkedList2);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f472542h;
            if (gVar2 != null) {
                i18 += b36.f.b(6, gVar2);
            }
            int g17 = i18 + b36.f.g(7, 7, linkedList);
            java.lang.String str2 = this.f472544m;
            return str2 != null ? g17 + b36.f.j(8, str2) : g17;
        }
        if (i17 == 2) {
            linkedList3.clear();
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
                return 0;
            case 2:
                this.f472538d = aVar2.g(intValue);
                return 0;
            case 3:
                linkedList3.add(aVar2.k(intValue));
                return 0;
            case 4:
                this.f472540f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ri0 ri0Var = new r45.ri0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ri0Var.mo11468x92b714fd(bArr2);
                    }
                    linkedList2.add(ri0Var);
                }
                return 0;
            case 6:
                this.f472542h = aVar2.d(intValue);
                return 0;
            case 7:
                linkedList.add(java.lang.Boolean.valueOf(aVar2.c(intValue)));
                return 0;
            case 8:
                this.f472544m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (r45.ye) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        return this;
    }
}
