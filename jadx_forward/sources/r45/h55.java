package r45;

/* loaded from: classes2.dex */
public class h55 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f457390d;

    /* renamed from: e, reason: collision with root package name */
    public r45.fi6 f457391e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f457392f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f457393g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f457394h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f457395i;

    /* renamed from: m, reason: collision with root package name */
    public r45.fi6 f457396m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f457397n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h55)) {
            return false;
        }
        r45.h55 h55Var = (r45.h55) fVar;
        return n51.f.a(this.f76492x92037252, h55Var.f76492x92037252) && n51.f.a(this.f457390d, h55Var.f457390d) && n51.f.a(this.f457391e, h55Var.f457391e) && n51.f.a(this.f457392f, h55Var.f457392f) && n51.f.a(this.f457393g, h55Var.f457393g) && n51.f.a(this.f457394h, h55Var.f457394h) && n51.f.a(this.f457395i, h55Var.f457395i) && n51.f.a(this.f457396m, h55Var.f457396m) && n51.f.a(this.f457397n, h55Var.f457397n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f457392f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f457390d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.fi6 fi6Var = this.f457391e;
            if (fi6Var != null) {
                fVar.i(3, fi6Var.mo75928xcd1e8d8());
                this.f457391e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(4, 8, linkedList);
            java.lang.String str2 = this.f457393g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f457394h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f457395i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            r45.fi6 fi6Var2 = this.f457396m;
            if (fi6Var2 != null) {
                fVar.i(8, fi6Var2.mo75928xcd1e8d8());
                this.f457396m.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str5 = this.f457397n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str6 = this.f457390d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            r45.fi6 fi6Var3 = this.f457391e;
            if (fi6Var3 != null) {
                i18 += b36.f.i(3, fi6Var3.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(4, 8, linkedList);
            java.lang.String str7 = this.f457393g;
            if (str7 != null) {
                g17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f457394h;
            if (str8 != null) {
                g17 += b36.f.j(6, str8);
            }
            java.lang.String str9 = this.f457395i;
            if (str9 != null) {
                g17 += b36.f.j(7, str9);
            }
            r45.fi6 fi6Var4 = this.f457396m;
            if (fi6Var4 != null) {
                g17 += b36.f.i(8, fi6Var4.mo75928xcd1e8d8());
            }
            java.lang.String str10 = this.f457397n;
            return str10 != null ? g17 + b36.f.j(9, str10) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.h55 h55Var = (r45.h55) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    h55Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                h55Var.f457390d = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.fi6 fi6Var5 = new r45.fi6();
                    if (bArr3 != null && bArr3.length > 0) {
                        fi6Var5.mo11468x92b714fd(bArr3);
                    }
                    h55Var.f457391e = fi6Var5;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.wp wpVar = new r45.wp();
                    if (bArr4 != null && bArr4.length > 0) {
                        wpVar.mo11468x92b714fd(bArr4);
                    }
                    h55Var.f457392f.add(wpVar);
                }
                return 0;
            case 5:
                h55Var.f457393g = aVar2.k(intValue);
                return 0;
            case 6:
                h55Var.f457394h = aVar2.k(intValue);
                return 0;
            case 7:
                h55Var.f457395i = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.fi6 fi6Var6 = new r45.fi6();
                    if (bArr5 != null && bArr5.length > 0) {
                        fi6Var6.mo11468x92b714fd(bArr5);
                    }
                    h55Var.f457396m = fi6Var6;
                }
                return 0;
            case 9:
                h55Var.f457397n = aVar2.k(intValue);
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
            eVar.d(jSONObject, "SearchId", this.f457390d, false);
            eVar.d(jSONObject, "SugResult", this.f457391e, false);
            eVar.d(jSONObject, "BusinessResults", this.f457392f, false);
            eVar.d(jSONObject, "MoreText", this.f457393g, false);
            eVar.d(jSONObject, "GuideText", this.f457394h, false);
            eVar.d(jSONObject, "PardusInfo", this.f457395i, false);
            eVar.d(jSONObject, "RelatedResult", this.f457396m, false);
            eVar.d(jSONObject, "JsonResult", this.f457397n, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
