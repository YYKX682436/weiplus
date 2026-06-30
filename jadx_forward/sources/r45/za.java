package r45;

/* loaded from: classes4.dex */
public class za extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473374d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473375e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f473376f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f473377g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ab f473378h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.za)) {
            return false;
        }
        r45.za zaVar = (r45.za) fVar;
        return n51.f.a(this.f473374d, zaVar.f473374d) && n51.f.a(this.f473375e, zaVar.f473375e) && n51.f.a(this.f473376f, zaVar.f473376f) && n51.f.a(this.f473377g, zaVar.f473377g) && n51.f.a(this.f473378h, zaVar.f473378h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f473374d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f473375e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f473376f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f473377g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            r45.ab abVar = this.f473378h;
            if (abVar != null) {
                fVar.i(5, abVar.mo75928xcd1e8d8());
                this.f473378h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f473374d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f473375e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f473376f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f473377g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            r45.ab abVar2 = this.f473378h;
            return abVar2 != null ? j17 + b36.f.i(5, abVar2.mo75928xcd1e8d8()) : j17;
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
        r45.za zaVar = (r45.za) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zaVar.f473374d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            zaVar.f473375e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            zaVar.f473376f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            zaVar.f473377g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.ab abVar3 = new r45.ab();
            if (bArr != null && bArr.length > 0) {
                abVar3.mo11468x92b714fd(bArr);
            }
            zaVar.f473378h = abVar3;
        }
        return 0;
    }
}
