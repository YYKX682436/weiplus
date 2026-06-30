package r45;

/* loaded from: classes2.dex */
public class c55 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f452829d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452830e;

    /* renamed from: f, reason: collision with root package name */
    public int f452831f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c55)) {
            return false;
        }
        r45.c55 c55Var = (r45.c55) fVar;
        return n51.f.a(this.f76492x92037252, c55Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f452829d), java.lang.Integer.valueOf(c55Var.f452829d)) && n51.f.a(this.f452830e, c55Var.f452830e) && n51.f.a(java.lang.Integer.valueOf(this.f452831f), java.lang.Integer.valueOf(c55Var.f452831f));
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
            fVar.e(2, this.f452829d);
            java.lang.String str = this.f452830e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f452831f);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f452829d);
            java.lang.String str2 = this.f452830e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.e(4, this.f452831f);
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
        r45.c55 c55Var = (r45.c55) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                c55Var.f452829d = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 3) {
                c55Var.f452830e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            c55Var.f452831f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.ie ieVar3 = new r45.ie();
            if (bArr != null && bArr.length > 0) {
                ieVar3.mo11468x92b714fd(bArr);
            }
            c55Var.f76492x92037252 = ieVar3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ie ieVar = this.f76492x92037252;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BaseResponse", ieVar, false);
            eVar.d(jSONObject, "CacheExpireTime", java.lang.Integer.valueOf(this.f452829d), false);
            eVar.d(jSONObject, "PassKey", this.f452830e, false);
            eVar.d(jSONObject, "PassKeyValidTime", java.lang.Integer.valueOf(this.f452831f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
