package r45;

/* loaded from: classes4.dex */
public class em extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f455129d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455130e;

    /* renamed from: f, reason: collision with root package name */
    public int f455131f;

    /* renamed from: g, reason: collision with root package name */
    public int f455132g;

    /* renamed from: h, reason: collision with root package name */
    public r45.im f455133h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.em)) {
            return false;
        }
        r45.em emVar = (r45.em) fVar;
        return n51.f.a(this.f76494x2de60e5e, emVar.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f455129d), java.lang.Integer.valueOf(emVar.f455129d)) && n51.f.a(this.f455130e, emVar.f455130e) && n51.f.a(java.lang.Integer.valueOf(this.f455131f), java.lang.Integer.valueOf(emVar.f455131f)) && n51.f.a(java.lang.Integer.valueOf(this.f455132g), java.lang.Integer.valueOf(emVar.f455132g)) && n51.f.a(this.f455133h, emVar.f455133h);
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
            fVar.e(2, this.f455129d);
            java.lang.String str = this.f455130e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f455131f);
            fVar.e(5, this.f455132g);
            r45.im imVar = this.f455133h;
            if (imVar != null) {
                fVar.i(6, imVar.mo75928xcd1e8d8());
                this.f455133h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f455129d);
            java.lang.String str2 = this.f455130e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            int e17 = i18 + b36.f.e(4, this.f455131f) + b36.f.e(5, this.f455132g);
            r45.im imVar2 = this.f455133h;
            return imVar2 != null ? e17 + b36.f.i(6, imVar2.mo75928xcd1e8d8()) : e17;
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
        r45.em emVar = (r45.em) objArr[1];
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
                    emVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                emVar.f455129d = aVar2.g(intValue);
                return 0;
            case 3:
                emVar.f455130e = aVar2.k(intValue);
                return 0;
            case 4:
                emVar.f455131f = aVar2.g(intValue);
                return 0;
            case 5:
                emVar.f455132g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.im imVar3 = new r45.im();
                    if (bArr2 != null && bArr2.length > 0) {
                        imVar3.mo11468x92b714fd(bArr2);
                    }
                    emVar.f455133h = imVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
