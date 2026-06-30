package r45;

/* loaded from: classes11.dex */
public class ux6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f469255d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469256e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469257f;

    /* renamed from: g, reason: collision with root package name */
    public r45.du5 f469258g;

    /* renamed from: h, reason: collision with root package name */
    public r45.du5 f469259h;

    /* renamed from: i, reason: collision with root package name */
    public r45.du5 f469260i;

    /* renamed from: m, reason: collision with root package name */
    public r45.cu5 f469261m;

    /* renamed from: n, reason: collision with root package name */
    public int f469262n;

    /* renamed from: o, reason: collision with root package name */
    public r45.cu5 f469263o;

    /* renamed from: p, reason: collision with root package name */
    public r45.cu5 f469264p;

    public com.p314xaae8f345.mm.p944x882e457a.i b() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 384;
        lVar.f152199c = "/cgi-bin/micromsg-bin/newverifypasswd";
        lVar.f152197a = this;
        lVar.f152198b = new r45.vx6();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
        iVar.p(a17);
        return iVar;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ux6)) {
            return false;
        }
        r45.ux6 ux6Var = (r45.ux6) fVar;
        return n51.f.a(this.f76494x2de60e5e, ux6Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f469255d), java.lang.Integer.valueOf(ux6Var.f469255d)) && n51.f.a(this.f469256e, ux6Var.f469256e) && n51.f.a(this.f469257f, ux6Var.f469257f) && n51.f.a(this.f469258g, ux6Var.f469258g) && n51.f.a(this.f469259h, ux6Var.f469259h) && n51.f.a(this.f469260i, ux6Var.f469260i) && n51.f.a(this.f469261m, ux6Var.f469261m) && n51.f.a(java.lang.Integer.valueOf(this.f469262n), java.lang.Integer.valueOf(ux6Var.f469262n)) && n51.f.a(this.f469263o, ux6Var.f469263o) && n51.f.a(this.f469264p, ux6Var.f469264p);
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
            fVar.e(2, this.f469255d);
            java.lang.String str = this.f469256e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f469257f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            r45.du5 du5Var = this.f469258g;
            if (du5Var != null) {
                fVar.i(5, du5Var.mo75928xcd1e8d8());
                this.f469258g.mo75956x3d5d1f78(fVar);
            }
            r45.du5 du5Var2 = this.f469259h;
            if (du5Var2 != null) {
                fVar.i(6, du5Var2.mo75928xcd1e8d8());
                this.f469259h.mo75956x3d5d1f78(fVar);
            }
            r45.du5 du5Var3 = this.f469260i;
            if (du5Var3 != null) {
                fVar.i(7, du5Var3.mo75928xcd1e8d8());
                this.f469260i.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var = this.f469261m;
            if (cu5Var != null) {
                fVar.i(8, cu5Var.mo75928xcd1e8d8());
                this.f469261m.mo75956x3d5d1f78(fVar);
            }
            fVar.e(9, this.f469262n);
            r45.cu5 cu5Var2 = this.f469263o;
            if (cu5Var2 != null) {
                fVar.i(10, cu5Var2.mo75928xcd1e8d8());
                this.f469263o.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var3 = this.f469264p;
            if (cu5Var3 != null) {
                fVar.i(11, cu5Var3.mo75928xcd1e8d8());
                this.f469264p.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f469255d);
            java.lang.String str3 = this.f469256e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f469257f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            r45.du5 du5Var4 = this.f469258g;
            if (du5Var4 != null) {
                i18 += b36.f.i(5, du5Var4.mo75928xcd1e8d8());
            }
            r45.du5 du5Var5 = this.f469259h;
            if (du5Var5 != null) {
                i18 += b36.f.i(6, du5Var5.mo75928xcd1e8d8());
            }
            r45.du5 du5Var6 = this.f469260i;
            if (du5Var6 != null) {
                i18 += b36.f.i(7, du5Var6.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var4 = this.f469261m;
            if (cu5Var4 != null) {
                i18 += b36.f.i(8, cu5Var4.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(9, this.f469262n);
            r45.cu5 cu5Var5 = this.f469263o;
            if (cu5Var5 != null) {
                e17 += b36.f.i(10, cu5Var5.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var6 = this.f469264p;
            return cu5Var6 != null ? e17 + b36.f.i(11, cu5Var6.mo75928xcd1e8d8()) : e17;
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
        r45.ux6 ux6Var = (r45.ux6) objArr[1];
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
                    ux6Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                ux6Var.f469255d = aVar2.g(intValue);
                return 0;
            case 3:
                ux6Var.f469256e = aVar2.k(intValue);
                return 0;
            case 4:
                ux6Var.f469257f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.du5 du5Var7 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var7.b(bArr2);
                    }
                    ux6Var.f469258g = du5Var7;
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.du5 du5Var8 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var8.b(bArr3);
                    }
                    ux6Var.f469259h = du5Var8;
                }
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.du5 du5Var9 = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var9.b(bArr4);
                    }
                    ux6Var.f469260i = du5Var9;
                }
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var7 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var7.b(bArr5);
                    }
                    ux6Var.f469261m = cu5Var7;
                }
                return 0;
            case 9:
                ux6Var.f469262n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.cu5 cu5Var8 = new r45.cu5();
                    if (bArr6 != null && bArr6.length > 0) {
                        cu5Var8.b(bArr6);
                    }
                    ux6Var.f469263o = cu5Var8;
                }
                return 0;
            case 11:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.cu5 cu5Var9 = new r45.cu5();
                    if (bArr7 != null && bArr7.length > 0) {
                        cu5Var9.b(bArr7);
                    }
                    ux6Var.f469264p = cu5Var9;
                }
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
            eVar.d(jSONObject, "OpCode", java.lang.Integer.valueOf(this.f469255d), false);
            eVar.d(jSONObject, "Pwd1", this.f469256e, false);
            eVar.d(jSONObject, "Pwd2", this.f469257f, false);
            eVar.d(jSONObject, "ImgSid", this.f469258g, false);
            eVar.d(jSONObject, "ImgCode", this.f469259h, false);
            eVar.d(jSONObject, "ImgEncryptKey", this.f469260i, false);
            eVar.d(jSONObject, "KSid", this.f469261m, false);
            eVar.d(jSONObject, "Scence", java.lang.Integer.valueOf(this.f469262n), false);
            eVar.d(jSONObject, "WTLoginReqBuff", this.f469263o, false);
            eVar.d(jSONObject, "AutoAuthKey", this.f469264p, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
