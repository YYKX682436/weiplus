package r45;

/* loaded from: classes9.dex */
public class yr4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472857d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472858e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f472859f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f472860g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yr4)) {
            return false;
        }
        r45.yr4 yr4Var = (r45.yr4) fVar;
        return n51.f.a(this.f76492x92037252, yr4Var.f76492x92037252) && n51.f.a(this.f472857d, yr4Var.f472857d) && n51.f.a(this.f472858e, yr4Var.f472858e) && n51.f.a(this.f472859f, yr4Var.f472859f) && n51.f.a(this.f472860g, yr4Var.f472860g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f472857d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f472858e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f472859f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f472860g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str5 = this.f472857d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f472858e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f472859f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f472860g;
            return str8 != null ? i18 + b36.f.j(5, str8) : i18;
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
        r45.yr4 yr4Var = (r45.yr4) objArr[1];
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
                yr4Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            yr4Var.f472857d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            yr4Var.f472858e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            yr4Var.f472859f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        yr4Var.f472860g = aVar2.k(intValue);
        return 0;
    }
}
