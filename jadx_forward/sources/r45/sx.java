package r45;

/* loaded from: classes2.dex */
public class sx extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467530d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467531e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f467532f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f467533g;

    /* renamed from: h, reason: collision with root package name */
    public long f467534h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f467535i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sx)) {
            return false;
        }
        r45.sx sxVar = (r45.sx) fVar;
        return n51.f.a(this.f76494x2de60e5e, sxVar.f76494x2de60e5e) && n51.f.a(this.f467530d, sxVar.f467530d) && n51.f.a(this.f467531e, sxVar.f467531e) && n51.f.a(this.f467532f, sxVar.f467532f) && n51.f.a(this.f467533g, sxVar.f467533g) && n51.f.a(java.lang.Long.valueOf(this.f467534h), java.lang.Long.valueOf(sxVar.f467534h)) && n51.f.a(this.f467535i, sxVar.f467535i);
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
            java.lang.String str = this.f467530d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f467531e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f467532f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f467533g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.h(6, this.f467534h);
            java.lang.String str5 = this.f467535i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str6 = this.f467530d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f467531e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f467532f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f467533g;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            int h17 = i18 + b36.f.h(6, this.f467534h);
            java.lang.String str10 = this.f467535i;
            return str10 != null ? h17 + b36.f.j(7, str10) : h17;
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
        r45.sx sxVar = (r45.sx) objArr[1];
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
                    sxVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                sxVar.f467530d = aVar2.k(intValue);
                return 0;
            case 3:
                sxVar.f467531e = aVar2.k(intValue);
                return 0;
            case 4:
                sxVar.f467532f = aVar2.k(intValue);
                return 0;
            case 5:
                sxVar.f467533g = aVar2.k(intValue);
                return 0;
            case 6:
                sxVar.f467534h = aVar2.i(intValue);
                return 0;
            case 7:
                sxVar.f467535i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
