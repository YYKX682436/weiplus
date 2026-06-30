package r45;

/* loaded from: classes4.dex */
public class wz6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.y80 f471140d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f471141e = true;

    /* renamed from: f, reason: collision with root package name */
    public r45.bz6 f471142f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f471143g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wz6)) {
            return false;
        }
        r45.wz6 wz6Var = (r45.wz6) fVar;
        return n51.f.a(this.f471140d, wz6Var.f471140d) && n51.f.a(java.lang.Boolean.valueOf(this.f471141e), java.lang.Boolean.valueOf(wz6Var.f471141e)) && n51.f.a(this.f471142f, wz6Var.f471142f) && n51.f.a(this.f471143g, wz6Var.f471143g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.y80 y80Var = this.f471140d;
            if (y80Var != null) {
                fVar.i(1, y80Var.mo75928xcd1e8d8());
                this.f471140d.mo75956x3d5d1f78(fVar);
            }
            fVar.a(2, this.f471141e);
            r45.bz6 bz6Var = this.f471142f;
            if (bz6Var != null) {
                fVar.i(3, bz6Var.mo75928xcd1e8d8());
                this.f471142f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f471143g;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.y80 y80Var2 = this.f471140d;
            int i18 = (y80Var2 != null ? 0 + b36.f.i(1, y80Var2.mo75928xcd1e8d8()) : 0) + b36.f.a(2, this.f471141e);
            r45.bz6 bz6Var2 = this.f471142f;
            if (bz6Var2 != null) {
                i18 += b36.f.i(3, bz6Var2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f471143g;
            return str2 != null ? i18 + b36.f.j(4, str2) : i18;
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
        r45.wz6 wz6Var = (r45.wz6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.y80 y80Var3 = new r45.y80();
                if (bArr != null && bArr.length > 0) {
                    y80Var3.mo11468x92b714fd(bArr);
                }
                wz6Var.f471140d = y80Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            wz6Var.f471141e = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            wz6Var.f471143g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.bz6 bz6Var3 = new r45.bz6();
            if (bArr2 != null && bArr2.length > 0) {
                bz6Var3.mo11468x92b714fd(bArr2);
            }
            wz6Var.f471142f = bz6Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.y80 y80Var = this.f471140d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "ContentId", y80Var, false);
            eVar.d(jSONObject, "Valid", java.lang.Boolean.valueOf(this.f471141e), false);
            eVar.d(jSONObject, "VideoCdnInfo", this.f471142f, false);
            eVar.d(jSONObject, "VideoApi", this.f471143g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
