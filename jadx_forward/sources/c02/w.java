package c02;

/* loaded from: classes4.dex */
public class w extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f119169d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f119170e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f119171f;

    /* renamed from: g, reason: collision with root package name */
    public int f119172g;

    /* renamed from: h, reason: collision with root package name */
    public int f119173h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof c02.w)) {
            return false;
        }
        c02.w wVar = (c02.w) fVar;
        return n51.f.a(this.f76494x2de60e5e, wVar.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f119169d), java.lang.Integer.valueOf(wVar.f119169d)) && n51.f.a(this.f119170e, wVar.f119170e) && n51.f.a(this.f119171f, wVar.f119171f) && n51.f.a(java.lang.Integer.valueOf(this.f119172g), java.lang.Integer.valueOf(wVar.f119172g)) && n51.f.a(java.lang.Integer.valueOf(this.f119173h), java.lang.Integer.valueOf(wVar.f119173h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f119169d);
            java.lang.String str = this.f119170e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f119171f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f119172g);
            fVar.e(6, this.f119173h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f119169d);
            java.lang.String str3 = this.f119170e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f119171f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            return i18 + b36.f.e(5, this.f119172g) + b36.f.e(6, this.f119173h);
        }
        if (i17 == 2) {
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
        c02.w wVar = (c02.w) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    wVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                wVar.f119169d = aVar2.g(intValue);
                return 0;
            case 3:
                wVar.f119170e = aVar2.k(intValue);
                return 0;
            case 4:
                wVar.f119171f = aVar2.k(intValue);
                return 0;
            case 5:
                wVar.f119172g = aVar2.g(intValue);
                return 0;
            case 6:
                wVar.f119173h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
