package r45;

/* loaded from: classes9.dex */
public class i10 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458190d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458191e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f458192f;

    /* renamed from: g, reason: collision with root package name */
    public int f458193g;

    public com.p314xaae8f345.mm.p944x882e457a.i b() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 939;
        lVar.f152199c = "/cgi-bin/micromsg-bin/checkmd5";
        lVar.f152197a = this;
        lVar.f152198b = new r45.j10();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
        iVar.p(a17);
        return iVar;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i10)) {
            return false;
        }
        r45.i10 i10Var = (r45.i10) fVar;
        return n51.f.a(this.f76494x2de60e5e, i10Var.f76494x2de60e5e) && n51.f.a(this.f458190d, i10Var.f458190d) && n51.f.a(this.f458191e, i10Var.f458191e) && n51.f.a(this.f458192f, i10Var.f458192f) && n51.f.a(java.lang.Integer.valueOf(this.f458193g), java.lang.Integer.valueOf(i10Var.f458193g));
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
            java.lang.String str = this.f458190d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f458191e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f458192f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f458193g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f458190d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f458191e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f458192f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            return i18 + b36.f.e(5, this.f458193g);
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
        r45.i10 i10Var = (r45.i10) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.mo11468x92b714fd(bArr);
                }
                i10Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            i10Var.f458190d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            i10Var.f458191e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            i10Var.f458192f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        i10Var.f458193g = aVar2.g(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public org.json.JSONObject mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.he heVar = this.f76494x2de60e5e;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BaseRequest", heVar, false);
            eVar.d(jSONObject, "fileid", this.f458190d, false);
            eVar.d(jSONObject, "md5", this.f458191e, false);
            eVar.d(jSONObject, "newmd5", this.f458192f, false);
            eVar.d(jSONObject, "crc32", java.lang.Integer.valueOf(this.f458193g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
