package r45;

/* loaded from: classes9.dex */
public class vz extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f470214d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470215e;

    /* renamed from: f, reason: collision with root package name */
    public long f470216f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f470217g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f470218h;

    /* renamed from: i, reason: collision with root package name */
    public int f470219i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f470220m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f470221n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vz)) {
            return false;
        }
        r45.vz vzVar = (r45.vz) fVar;
        return n51.f.a(this.f76494x2de60e5e, vzVar.f76494x2de60e5e) && n51.f.a(this.f470214d, vzVar.f470214d) && n51.f.a(this.f470215e, vzVar.f470215e) && n51.f.a(java.lang.Long.valueOf(this.f470216f), java.lang.Long.valueOf(vzVar.f470216f)) && n51.f.a(this.f470217g, vzVar.f470217g) && n51.f.a(this.f470218h, vzVar.f470218h) && n51.f.a(java.lang.Integer.valueOf(this.f470219i), java.lang.Integer.valueOf(vzVar.f470219i)) && n51.f.a(this.f470220m, vzVar.f470220m) && n51.f.a(this.f470221n, vzVar.f470221n);
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
            java.lang.String str = this.f470214d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f470215e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.h(4, this.f470216f);
            java.lang.String str3 = this.f470217g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f470218h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f470219i);
            java.lang.String str5 = this.f470220m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f470221n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str7 = this.f470214d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f470215e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            int h17 = i18 + b36.f.h(4, this.f470216f);
            java.lang.String str9 = this.f470217g;
            if (str9 != null) {
                h17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f470218h;
            if (str10 != null) {
                h17 += b36.f.j(6, str10);
            }
            int e17 = h17 + b36.f.e(7, this.f470219i);
            java.lang.String str11 = this.f470220m;
            if (str11 != null) {
                e17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f470221n;
            return str12 != null ? e17 + b36.f.j(9, str12) : e17;
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
        r45.vz vzVar = (r45.vz) objArr[1];
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
                    vzVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                vzVar.f470214d = aVar2.k(intValue);
                return 0;
            case 3:
                vzVar.f470215e = aVar2.k(intValue);
                return 0;
            case 4:
                vzVar.f470216f = aVar2.i(intValue);
                return 0;
            case 5:
                vzVar.f470217g = aVar2.k(intValue);
                return 0;
            case 6:
                vzVar.f470218h = aVar2.k(intValue);
                return 0;
            case 7:
                vzVar.f470219i = aVar2.g(intValue);
                return 0;
            case 8:
                vzVar.f470220m = aVar2.k(intValue);
                return 0;
            case 9:
                vzVar.f470221n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.he heVar = this.f76494x2de60e5e;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BaseRequest", heVar, false);
            eVar.d(jSONObject, "FromUserName", this.f470214d, false);
            eVar.d(jSONObject, "ToUserName", this.f470215e, false);
            eVar.d(jSONObject, "FileSize", java.lang.Long.valueOf(this.f470216f), false);
            eVar.d(jSONObject, "AESKey", this.f470217g, false);
            eVar.d(jSONObject, "FileMd5", this.f470218h, false);
            eVar.d(jSONObject, "FileType", java.lang.Integer.valueOf(this.f470219i), false);
            eVar.d(jSONObject, "FileExt", this.f470220m, false);
            eVar.d(jSONObject, "FileName", this.f470221n, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
