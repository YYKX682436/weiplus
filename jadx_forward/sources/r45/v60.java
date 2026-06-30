package r45;

/* loaded from: classes11.dex */
public class v60 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469465d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469466e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469467f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469468g;

    /* renamed from: h, reason: collision with root package name */
    public int f469469h;

    /* renamed from: i, reason: collision with root package name */
    public int f469470i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v60)) {
            return false;
        }
        r45.v60 v60Var = (r45.v60) fVar;
        return n51.f.a(this.f469465d, v60Var.f469465d) && n51.f.a(this.f469466e, v60Var.f469466e) && n51.f.a(this.f469467f, v60Var.f469467f) && n51.f.a(this.f469468g, v60Var.f469468g) && n51.f.a(java.lang.Integer.valueOf(this.f469469h), java.lang.Integer.valueOf(v60Var.f469469h)) && n51.f.a(java.lang.Integer.valueOf(this.f469470i), java.lang.Integer.valueOf(v60Var.f469470i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f469465d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f469466e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f469467f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f469468g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f469469h);
            fVar.e(6, this.f469470i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f469465d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f469466e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f469467f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f469468g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            return j17 + b36.f.e(5, this.f469469h) + b36.f.e(6, this.f469470i);
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
        r45.v60 v60Var = (r45.v60) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                v60Var.f469465d = aVar2.k(intValue);
                return 0;
            case 2:
                v60Var.f469466e = aVar2.k(intValue);
                return 0;
            case 3:
                v60Var.f469467f = aVar2.k(intValue);
                return 0;
            case 4:
                v60Var.f469468g = aVar2.k(intValue);
                return 0;
            case 5:
                v60Var.f469469h = aVar2.g(intValue);
                return 0;
            case 6:
                v60Var.f469470i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public org.json.JSONObject mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f469465d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Url", str, false);
            eVar.d(jSONObject, "AESKey", this.f469466e, false);
            eVar.d(jSONObject, "MD5", this.f469467f, false);
            eVar.d(jSONObject, "FileId", this.f469468g, false);
            eVar.d(jSONObject, "MidSize", java.lang.Integer.valueOf(this.f469469h), false);
            eVar.d(jSONObject, "ThumbSize", java.lang.Integer.valueOf(this.f469470i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
