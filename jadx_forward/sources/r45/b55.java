package r45;

/* loaded from: classes2.dex */
public class b55 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.e64 f452065d;

    /* renamed from: e, reason: collision with root package name */
    public r45.j30 f452066e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b55)) {
            return false;
        }
        r45.b55 b55Var = (r45.b55) fVar;
        return n51.f.a(this.f452065d, b55Var.f452065d) && n51.f.a(this.f452066e, b55Var.f452066e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.e64 e64Var = this.f452065d;
            if (e64Var != null) {
                fVar.i(1, e64Var.mo75928xcd1e8d8());
                this.f452065d.mo75956x3d5d1f78(fVar);
            }
            r45.j30 j30Var = this.f452066e;
            if (j30Var != null) {
                fVar.i(2, j30Var.mo75928xcd1e8d8());
                this.f452066e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.e64 e64Var2 = this.f452065d;
            int i18 = e64Var2 != null ? 0 + b36.f.i(1, e64Var2.mo75928xcd1e8d8()) : 0;
            r45.j30 j30Var2 = this.f452066e;
            return j30Var2 != null ? i18 + b36.f.i(2, j30Var2.mo75928xcd1e8d8()) : i18;
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
        r45.b55 b55Var = (r45.b55) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.e64 e64Var3 = new r45.e64();
                if (bArr != null && bArr.length > 0) {
                    e64Var3.mo11468x92b714fd(bArr);
                }
                b55Var.f452065d = e64Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.j30 j30Var3 = new r45.j30();
            if (bArr2 != null && bArr2.length > 0) {
                j30Var3.mo11468x92b714fd(bArr2);
            }
            b55Var.f452066e = j30Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.e64 e64Var = this.f452065d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Location", e64Var, false);
            eVar.d(jSONObject, "ChildMode", this.f452066e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
