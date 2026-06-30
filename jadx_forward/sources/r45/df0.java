package r45;

/* loaded from: classes4.dex */
public class df0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f453905d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ef0 f453906e;

    /* renamed from: f, reason: collision with root package name */
    public int f453907f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ef0 f453908g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.df0)) {
            return false;
        }
        r45.df0 df0Var = (r45.df0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f453905d), java.lang.Integer.valueOf(df0Var.f453905d)) && n51.f.a(this.f453906e, df0Var.f453906e) && n51.f.a(java.lang.Integer.valueOf(this.f453907f), java.lang.Integer.valueOf(df0Var.f453907f)) && n51.f.a(this.f453908g, df0Var.f453908g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f453905d);
            r45.ef0 ef0Var = this.f453906e;
            if (ef0Var != null) {
                fVar.i(2, ef0Var.mo75928xcd1e8d8());
                this.f453906e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f453907f);
            r45.ef0 ef0Var2 = this.f453908g;
            if (ef0Var2 != null) {
                fVar.i(4, ef0Var2.mo75928xcd1e8d8());
                this.f453908g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f453905d) + 0;
            r45.ef0 ef0Var3 = this.f453906e;
            if (ef0Var3 != null) {
                e17 += b36.f.i(2, ef0Var3.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(3, this.f453907f);
            r45.ef0 ef0Var4 = this.f453908g;
            return ef0Var4 != null ? e18 + b36.f.i(4, ef0Var4.mo75928xcd1e8d8()) : e18;
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
        r45.df0 df0Var = (r45.df0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            df0Var.f453905d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.ef0 ef0Var5 = new r45.ef0();
                if (bArr != null && bArr.length > 0) {
                    ef0Var5.mo11468x92b714fd(bArr);
                }
                df0Var.f453906e = ef0Var5;
            }
            return 0;
        }
        if (intValue == 3) {
            df0Var.f453907f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.ef0 ef0Var6 = new r45.ef0();
            if (bArr2 != null && bArr2.length > 0) {
                ef0Var6.mo11468x92b714fd(bArr2);
            }
            df0Var.f453908g = ef0Var6;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f453905d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "NightSetting", valueOf, false);
            eVar.d(jSONObject, "NightTime", this.f453906e, false);
            eVar.d(jSONObject, "AllDaySetting", java.lang.Integer.valueOf(this.f453907f), false);
            eVar.d(jSONObject, "AllDayTime", this.f453908g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
