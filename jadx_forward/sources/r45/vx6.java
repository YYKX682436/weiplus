package r45;

/* loaded from: classes11.dex */
public class vx6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f470181d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f470182e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f470183f;

    /* renamed from: g, reason: collision with root package name */
    public r45.du5 f470184g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f470185h;

    /* renamed from: i, reason: collision with root package name */
    public r45.cu5 f470186i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f470187m;

    /* renamed from: n, reason: collision with root package name */
    public r45.cu5 f470188n;

    /* renamed from: o, reason: collision with root package name */
    public r45.cu5 f470189o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vx6)) {
            return false;
        }
        r45.vx6 vx6Var = (r45.vx6) fVar;
        return n51.f.a(this.f76492x92037252, vx6Var.f76492x92037252) && n51.f.a(this.f470181d, vx6Var.f470181d) && n51.f.a(this.f470182e, vx6Var.f470182e) && n51.f.a(this.f470183f, vx6Var.f470183f) && n51.f.a(this.f470184g, vx6Var.f470184g) && n51.f.a(this.f470185h, vx6Var.f470185h) && n51.f.a(this.f470186i, vx6Var.f470186i) && n51.f.a(this.f470187m, vx6Var.f470187m) && n51.f.a(this.f470188n, vx6Var.f470188n) && n51.f.a(this.f470189o, vx6Var.f470189o);
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
            r45.du5 du5Var = this.f470181d;
            if (du5Var != null) {
                fVar.i(2, du5Var.mo75928xcd1e8d8());
                this.f470181d.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var = this.f470182e;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.mo75928xcd1e8d8());
                this.f470182e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f470183f;
            if (str != null) {
                fVar.j(4, str);
            }
            r45.du5 du5Var2 = this.f470184g;
            if (du5Var2 != null) {
                fVar.i(5, du5Var2.mo75928xcd1e8d8());
                this.f470184g.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var2 = this.f470185h;
            if (cu5Var2 != null) {
                fVar.i(6, cu5Var2.mo75928xcd1e8d8());
                this.f470185h.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var3 = this.f470186i;
            if (cu5Var3 != null) {
                fVar.i(7, cu5Var3.mo75928xcd1e8d8());
                this.f470186i.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f470187m;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            r45.cu5 cu5Var4 = this.f470188n;
            if (cu5Var4 != null) {
                fVar.i(9, cu5Var4.mo75928xcd1e8d8());
                this.f470188n.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var5 = this.f470189o;
            if (cu5Var5 != null) {
                fVar.i(10, cu5Var5.mo75928xcd1e8d8());
                this.f470189o.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.du5 du5Var3 = this.f470181d;
            if (du5Var3 != null) {
                i18 += b36.f.i(2, du5Var3.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var6 = this.f470182e;
            if (cu5Var6 != null) {
                i18 += b36.f.i(3, cu5Var6.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f470183f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            r45.du5 du5Var4 = this.f470184g;
            if (du5Var4 != null) {
                i18 += b36.f.i(5, du5Var4.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var7 = this.f470185h;
            if (cu5Var7 != null) {
                i18 += b36.f.i(6, cu5Var7.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var8 = this.f470186i;
            if (cu5Var8 != null) {
                i18 += b36.f.i(7, cu5Var8.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f470187m;
            if (str4 != null) {
                i18 += b36.f.j(8, str4);
            }
            r45.cu5 cu5Var9 = this.f470188n;
            if (cu5Var9 != null) {
                i18 += b36.f.i(9, cu5Var9.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var10 = this.f470189o;
            return cu5Var10 != null ? i18 + b36.f.i(10, cu5Var10.mo75928xcd1e8d8()) : i18;
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
        r45.vx6 vx6Var = (r45.vx6) objArr[1];
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
                    vx6Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.du5 du5Var5 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var5.b(bArr2);
                    }
                    vx6Var.f470181d = du5Var5;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var11 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var11.b(bArr3);
                    }
                    vx6Var.f470182e = cu5Var11;
                }
                return 0;
            case 4:
                vx6Var.f470183f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.du5 du5Var6 = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var6.b(bArr4);
                    }
                    vx6Var.f470184g = du5Var6;
                }
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var12 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var12.b(bArr5);
                    }
                    vx6Var.f470185h = cu5Var12;
                }
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.cu5 cu5Var13 = new r45.cu5();
                    if (bArr6 != null && bArr6.length > 0) {
                        cu5Var13.b(bArr6);
                    }
                    vx6Var.f470186i = cu5Var13;
                }
                return 0;
            case 8:
                vx6Var.f470187m = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.cu5 cu5Var14 = new r45.cu5();
                    if (bArr7 != null && bArr7.length > 0) {
                        cu5Var14.b(bArr7);
                    }
                    vx6Var.f470188n = cu5Var14;
                }
                return 0;
            case 10:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    r45.cu5 cu5Var15 = new r45.cu5();
                    if (bArr8 != null && bArr8.length > 0) {
                        cu5Var15.b(bArr8);
                    }
                    vx6Var.f470189o = cu5Var15;
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
            r45.ie ieVar = this.f76492x92037252;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BaseResponse", ieVar, false);
            eVar.d(jSONObject, "ImgSid", this.f470181d, false);
            eVar.d(jSONObject, "ImgBuf", this.f470182e, false);
            eVar.d(jSONObject, "Ticket", this.f470183f, false);
            eVar.d(jSONObject, "ImgEncryptKey", this.f470184g, false);
            eVar.d(jSONObject, "A2Key", this.f470185h, false);
            eVar.d(jSONObject, "KSid", this.f470186i, false);
            eVar.d(jSONObject, "AuthKey", this.f470187m, false);
            eVar.d(jSONObject, "WTLoginRspBuff", this.f470188n, false);
            eVar.d(jSONObject, "AutoAuthKey", this.f470189o, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
