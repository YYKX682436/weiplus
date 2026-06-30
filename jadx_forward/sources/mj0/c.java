package mj0;

/* loaded from: classes8.dex */
public class c extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f408518d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f408519e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f408520f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f408521g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f408522h;

    /* renamed from: i, reason: collision with root package name */
    public int f408523i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f408524m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof mj0.c)) {
            return false;
        }
        mj0.c cVar = (mj0.c) fVar;
        return n51.f.a(this.f76494x2de60e5e, cVar.f76494x2de60e5e) && n51.f.a(this.f408518d, cVar.f408518d) && n51.f.a(this.f408519e, cVar.f408519e) && n51.f.a(this.f408520f, cVar.f408520f) && n51.f.a(this.f408521g, cVar.f408521g) && n51.f.a(this.f408522h, cVar.f408522h) && n51.f.a(java.lang.Integer.valueOf(this.f408523i), java.lang.Integer.valueOf(cVar.f408523i)) && n51.f.a(this.f408524m, cVar.f408524m);
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
            java.lang.String str = this.f408518d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f408519e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f408520f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f408521g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f408522h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f408523i);
            java.lang.String str6 = this.f408524m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str7 = this.f408518d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f408519e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f408520f;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f408521g;
            if (str10 != null) {
                i18 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f408522h;
            if (str11 != null) {
                i18 += b36.f.j(6, str11);
            }
            int e17 = i18 + b36.f.e(7, this.f408523i);
            java.lang.String str12 = this.f408524m;
            return str12 != null ? e17 + b36.f.j(8, str12) : e17;
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
        mj0.c cVar = (mj0.c) objArr[1];
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
                    cVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                cVar.f408518d = aVar2.k(intValue);
                return 0;
            case 3:
                cVar.f408519e = aVar2.k(intValue);
                return 0;
            case 4:
                cVar.f408520f = aVar2.k(intValue);
                return 0;
            case 5:
                cVar.f408521g = aVar2.k(intValue);
                return 0;
            case 6:
                cVar.f408522h = aVar2.k(intValue);
                return 0;
            case 7:
                cVar.f408523i = aVar2.g(intValue);
                return 0;
            case 8:
                cVar.f408524m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
