package r45;

/* loaded from: classes4.dex */
public class pn extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f464737d;

    /* renamed from: e, reason: collision with root package name */
    public int f464738e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464739f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464740g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f464741h;

    /* renamed from: i, reason: collision with root package name */
    public int f464742i;

    /* renamed from: m, reason: collision with root package name */
    public int f464743m;

    /* renamed from: n, reason: collision with root package name */
    public int f464744n;

    /* renamed from: o, reason: collision with root package name */
    public r45.xn1 f464745o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pn)) {
            return false;
        }
        r45.pn pnVar = (r45.pn) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f464737d), java.lang.Long.valueOf(pnVar.f464737d)) && n51.f.a(java.lang.Integer.valueOf(this.f464738e), java.lang.Integer.valueOf(pnVar.f464738e)) && n51.f.a(this.f464739f, pnVar.f464739f) && n51.f.a(this.f464740g, pnVar.f464740g) && n51.f.a(this.f464741h, pnVar.f464741h) && n51.f.a(java.lang.Integer.valueOf(this.f464742i), java.lang.Integer.valueOf(pnVar.f464742i)) && n51.f.a(java.lang.Integer.valueOf(this.f464743m), java.lang.Integer.valueOf(pnVar.f464743m)) && n51.f.a(java.lang.Integer.valueOf(this.f464744n), java.lang.Integer.valueOf(pnVar.f464744n)) && n51.f.a(this.f464745o, pnVar.f464745o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f464737d);
            fVar.e(2, this.f464738e);
            java.lang.String str = this.f464739f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f464740g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f464741h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f464742i);
            fVar.e(7, this.f464743m);
            fVar.e(8, this.f464744n);
            r45.xn1 xn1Var = this.f464745o;
            if (xn1Var != null) {
                fVar.i(9, xn1Var.mo75928xcd1e8d8());
                this.f464745o.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f464737d) + 0 + b36.f.e(2, this.f464738e);
            java.lang.String str4 = this.f464739f;
            if (str4 != null) {
                h17 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f464740g;
            if (str5 != null) {
                h17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f464741h;
            if (str6 != null) {
                h17 += b36.f.j(5, str6);
            }
            int e17 = h17 + b36.f.e(6, this.f464742i) + b36.f.e(7, this.f464743m) + b36.f.e(8, this.f464744n);
            r45.xn1 xn1Var2 = this.f464745o;
            return xn1Var2 != null ? e17 + b36.f.i(9, xn1Var2.mo75928xcd1e8d8()) : e17;
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
        r45.pn pnVar = (r45.pn) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pnVar.f464737d = aVar2.i(intValue);
                return 0;
            case 2:
                pnVar.f464738e = aVar2.g(intValue);
                return 0;
            case 3:
                pnVar.f464739f = aVar2.k(intValue);
                return 0;
            case 4:
                pnVar.f464740g = aVar2.k(intValue);
                return 0;
            case 5:
                pnVar.f464741h = aVar2.k(intValue);
                return 0;
            case 6:
                pnVar.f464742i = aVar2.g(intValue);
                return 0;
            case 7:
                pnVar.f464743m = aVar2.g(intValue);
                return 0;
            case 8:
                pnVar.f464744n = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.xn1 xn1Var3 = new r45.xn1();
                    if (bArr != null && bArr.length > 0) {
                        xn1Var3.mo11468x92b714fd(bArr);
                    }
                    pnVar.f464745o = xn1Var3;
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
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f464737d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, dm.i4.f66865x76d1ec5a, valueOf, false);
            eVar.d(jSONObject, "type", java.lang.Integer.valueOf(this.f464738e), false);
            eVar.d(jSONObject, dm.i4.f66875xa013b0d5, this.f464739f, false);
            eVar.d(jSONObject, "nickname", this.f464740g, false);
            eVar.d(jSONObject, "msg", this.f464741h, false);
            eVar.d(jSONObject, "create_time", java.lang.Integer.valueOf(this.f464742i), false);
            eVar.d(jSONObject, "relation", java.lang.Integer.valueOf(this.f464743m), false);
            eVar.d(jSONObject, "del_flag", java.lang.Integer.valueOf(this.f464744n), false);
            eVar.d(jSONObject, "to_user_contact", this.f464745o, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
