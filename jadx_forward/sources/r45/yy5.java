package r45;

/* loaded from: classes12.dex */
public class yy5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473033d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473034e;

    /* renamed from: f, reason: collision with root package name */
    public int f473035f;

    /* renamed from: g, reason: collision with root package name */
    public r45.xy5 f473036g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f473037h;

    /* renamed from: i, reason: collision with root package name */
    public int f473038i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f473039m;

    /* renamed from: n, reason: collision with root package name */
    public int f473040n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f473041o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f473042p;

    /* renamed from: q, reason: collision with root package name */
    public long f473043q;

    /* renamed from: r, reason: collision with root package name */
    public int f473044r;

    /* renamed from: s, reason: collision with root package name */
    public int f473045s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yy5)) {
            return false;
        }
        r45.yy5 yy5Var = (r45.yy5) fVar;
        return n51.f.a(this.f76494x2de60e5e, yy5Var.f76494x2de60e5e) && n51.f.a(this.f473033d, yy5Var.f473033d) && n51.f.a(this.f473034e, yy5Var.f473034e) && n51.f.a(java.lang.Integer.valueOf(this.f473035f), java.lang.Integer.valueOf(yy5Var.f473035f)) && n51.f.a(this.f473036g, yy5Var.f473036g) && n51.f.a(this.f473037h, yy5Var.f473037h) && n51.f.a(java.lang.Integer.valueOf(this.f473038i), java.lang.Integer.valueOf(yy5Var.f473038i)) && n51.f.a(this.f473039m, yy5Var.f473039m) && n51.f.a(java.lang.Integer.valueOf(this.f473040n), java.lang.Integer.valueOf(yy5Var.f473040n)) && n51.f.a(this.f473041o, yy5Var.f473041o) && n51.f.a(this.f473042p, yy5Var.f473042p) && n51.f.a(java.lang.Long.valueOf(this.f473043q), java.lang.Long.valueOf(yy5Var.f473043q)) && n51.f.a(java.lang.Integer.valueOf(this.f473044r), java.lang.Integer.valueOf(yy5Var.f473044r)) && n51.f.a(java.lang.Integer.valueOf(this.f473045s), java.lang.Integer.valueOf(yy5Var.f473045s));
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
            java.lang.String str = this.f473033d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f473034e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f473035f);
            r45.xy5 xy5Var = this.f473036g;
            if (xy5Var != null) {
                fVar.i(5, xy5Var.mo75928xcd1e8d8());
                this.f473036g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f473037h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f473038i);
            java.lang.String str4 = this.f473039m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(12, this.f473040n);
            java.lang.String str5 = this.f473041o;
            if (str5 != null) {
                fVar.j(13, str5);
            }
            java.lang.String str6 = this.f473042p;
            if (str6 != null) {
                fVar.j(14, str6);
            }
            fVar.h(15, this.f473043q);
            fVar.e(16, this.f473044r);
            fVar.e(17, this.f473045s);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0 : 0;
            java.lang.String str7 = this.f473033d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f473034e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            int e17 = i18 + b36.f.e(4, this.f473035f);
            r45.xy5 xy5Var2 = this.f473036g;
            if (xy5Var2 != null) {
                e17 += b36.f.i(5, xy5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str9 = this.f473037h;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            int e18 = e17 + b36.f.e(7, this.f473038i);
            java.lang.String str10 = this.f473039m;
            if (str10 != null) {
                e18 += b36.f.j(8, str10);
            }
            int e19 = e18 + b36.f.e(12, this.f473040n);
            java.lang.String str11 = this.f473041o;
            if (str11 != null) {
                e19 += b36.f.j(13, str11);
            }
            java.lang.String str12 = this.f473042p;
            if (str12 != null) {
                e19 += b36.f.j(14, str12);
            }
            return e19 + b36.f.h(15, this.f473043q) + b36.f.e(16, this.f473044r) + b36.f.e(17, this.f473045s);
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
        r45.yy5 yy5Var = (r45.yy5) objArr[1];
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
                    yy5Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                yy5Var.f473033d = aVar2.k(intValue);
                return 0;
            case 3:
                yy5Var.f473034e = aVar2.k(intValue);
                return 0;
            case 4:
                yy5Var.f473035f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.xy5 xy5Var3 = new r45.xy5();
                    if (bArr2 != null && bArr2.length > 0) {
                        xy5Var3.mo11468x92b714fd(bArr2);
                    }
                    yy5Var.f473036g = xy5Var3;
                }
                return 0;
            case 6:
                yy5Var.f473037h = aVar2.k(intValue);
                return 0;
            case 7:
                yy5Var.f473038i = aVar2.g(intValue);
                return 0;
            case 8:
                yy5Var.f473039m = aVar2.k(intValue);
                return 0;
            case 9:
            case 10:
            case 11:
            default:
                return -1;
            case 12:
                yy5Var.f473040n = aVar2.g(intValue);
                return 0;
            case 13:
                yy5Var.f473041o = aVar2.k(intValue);
                return 0;
            case 14:
                yy5Var.f473042p = aVar2.k(intValue);
                return 0;
            case 15:
                yy5Var.f473043q = aVar2.i(intValue);
                return 0;
            case 16:
                yy5Var.f473044r = aVar2.g(intValue);
                return 0;
            case 17:
                yy5Var.f473045s = aVar2.g(intValue);
                return 0;
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
            eVar.d(jSONObject, "toUserName", this.f473033d, false);
            eVar.d(jSONObject, "clientMsgID", this.f473034e, false);
            eVar.d(jSONObject, "action", java.lang.Integer.valueOf(this.f473035f), false);
            eVar.d(jSONObject, "fileInfo", this.f473036g, false);
            eVar.d(jSONObject, "fileUploadToken", this.f473037h, false);
            eVar.d(jSONObject, "version", java.lang.Integer.valueOf(this.f473038i), false);
            eVar.d(jSONObject, "lanInfo", this.f473039m, false);
            eVar.d(jSONObject, "FileScene", java.lang.Integer.valueOf(this.f473040n), false);
            eVar.d(jSONObject, "thumburl", this.f473041o, false);
            eVar.d(jSONObject, "thumbaeskey", this.f473042p, false);
            eVar.d(jSONObject, "thumblength", java.lang.Long.valueOf(this.f473043q), false);
            eVar.d(jSONObject, "thumbheight", java.lang.Integer.valueOf(this.f473044r), false);
            eVar.d(jSONObject, "thumbwidth", java.lang.Integer.valueOf(this.f473045s), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
