package r45;

/* loaded from: classes8.dex */
public class my6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f462463d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f462464e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ny6 f462465f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f462466g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f462467h;

    /* renamed from: i, reason: collision with root package name */
    public long f462468i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.my6)) {
            return false;
        }
        r45.my6 my6Var = (r45.my6) fVar;
        return n51.f.a(this.f76492x92037252, my6Var.f76492x92037252) && n51.f.a(this.f462463d, my6Var.f462463d) && n51.f.a(this.f462464e, my6Var.f462464e) && n51.f.a(this.f462465f, my6Var.f462465f) && n51.f.a(this.f462466g, my6Var.f462466g) && n51.f.a(this.f462467h, my6Var.f462467h) && n51.f.a(java.lang.Long.valueOf(this.f462468i), java.lang.Long.valueOf(my6Var.f462468i));
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
            java.lang.String str = this.f462463d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f462464e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.ny6 ny6Var = this.f462465f;
            if (ny6Var != null) {
                fVar.i(4, ny6Var.mo75928xcd1e8d8());
                this.f462465f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f462466g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f462467h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.h(7, this.f462468i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str5 = this.f462463d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f462464e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            r45.ny6 ny6Var2 = this.f462465f;
            if (ny6Var2 != null) {
                i18 += b36.f.i(4, ny6Var2.mo75928xcd1e8d8());
            }
            java.lang.String str7 = this.f462466g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f462467h;
            if (str8 != null) {
                i18 += b36.f.j(6, str8);
            }
            return i18 + b36.f.h(7, this.f462468i);
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
        r45.my6 my6Var = (r45.my6) objArr[1];
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
                    my6Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                my6Var.f462463d = aVar2.k(intValue);
                return 0;
            case 3:
                my6Var.f462464e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ny6 ny6Var3 = new r45.ny6();
                    if (bArr2 != null && bArr2.length > 0) {
                        ny6Var3.mo11468x92b714fd(bArr2);
                    }
                    my6Var.f462465f = ny6Var3;
                }
                return 0;
            case 5:
                my6Var.f462466g = aVar2.k(intValue);
                return 0;
            case 6:
                my6Var.f462467h = aVar2.k(intValue);
                return 0;
            case 7:
                my6Var.f462468i = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
