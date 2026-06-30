package r45;

/* loaded from: classes2.dex */
public class dm extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ks5 f454091d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f454092e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dm)) {
            return false;
        }
        r45.dm dmVar = (r45.dm) fVar;
        return n51.f.a(this.f454091d, dmVar.f454091d) && n51.f.a(this.f454092e, dmVar.f454092e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ks5 ks5Var = this.f454091d;
            if (ks5Var != null) {
                fVar.i(1, ks5Var.mo75928xcd1e8d8());
                this.f454091d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f454092e;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ks5 ks5Var2 = this.f454091d;
            int i18 = ks5Var2 != null ? 0 + b36.f.i(1, ks5Var2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f454092e;
            return str2 != null ? i18 + b36.f.j(2, str2) : i18;
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
        r45.dm dmVar = (r45.dm) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            dmVar.f454092e = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.ks5 ks5Var3 = new r45.ks5();
            if (bArr != null && bArr.length > 0) {
                ks5Var3.mo11468x92b714fd(bArr);
            }
            dmVar.f454091d = ks5Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ks5 ks5Var = this.f454091d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "CommContent", ks5Var, false);
            eVar.d(jSONObject, "BizUserAttrInfo", this.f454092e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
