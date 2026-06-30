package r45;

/* loaded from: classes2.dex */
public class sx5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467542d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467543e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f467544f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public r45.e64 f467545g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sx5)) {
            return false;
        }
        r45.sx5 sx5Var = (r45.sx5) fVar;
        return n51.f.a(this.f467542d, sx5Var.f467542d) && n51.f.a(this.f467543e, sx5Var.f467543e) && n51.f.a(this.f467544f, sx5Var.f467544f) && n51.f.a(this.f467545g, sx5Var.f467545g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f467544f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f467542d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f467543e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, linkedList);
            r45.e64 e64Var = this.f467545g;
            if (e64Var != null) {
                fVar.i(4, e64Var.mo75928xcd1e8d8());
                this.f467545g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f467542d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f467543e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            int g17 = j17 + b36.f.g(3, 8, linkedList);
            r45.e64 e64Var2 = this.f467545g;
            return e64Var2 != null ? g17 + b36.f.i(4, e64Var2.mo75928xcd1e8d8()) : g17;
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
        r45.sx5 sx5Var = (r45.sx5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            sx5Var.f467542d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            sx5Var.f467543e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j18.get(i18);
                r45.x50 x50Var = new r45.x50();
                if (bArr2 != null && bArr2.length > 0) {
                    x50Var.mo11468x92b714fd(bArr2);
                }
                sx5Var.f467544f.add(x50Var);
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j19.get(i19);
            r45.e64 e64Var3 = new r45.e64();
            if (bArr3 != null && bArr3.length > 0) {
                e64Var3.mo11468x92b714fd(bArr3);
            }
            sx5Var.f467545g = e64Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f467542d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "commReq", str, false);
            eVar.d(jSONObject, "requestId", this.f467543e, false);
            eVar.d(jSONObject, "ExtReqParams", this.f467544f, false);
            eVar.d(jSONObject, "Location", this.f467545g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
