package r45;

/* loaded from: classes2.dex */
public class xw5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f472091d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472092e;

    /* renamed from: f, reason: collision with root package name */
    public r45.e64 f472093f;

    /* renamed from: g, reason: collision with root package name */
    public int f472094g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f472095h = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xw5)) {
            return false;
        }
        r45.xw5 xw5Var = (r45.xw5) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f472091d), java.lang.Long.valueOf(xw5Var.f472091d)) && n51.f.a(this.f472092e, xw5Var.f472092e) && n51.f.a(this.f472093f, xw5Var.f472093f) && n51.f.a(java.lang.Integer.valueOf(this.f472094g), java.lang.Integer.valueOf(xw5Var.f472094g)) && n51.f.a(this.f472095h, xw5Var.f472095h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f472095h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f472091d);
            java.lang.String str = this.f472092e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.e64 e64Var = this.f472093f;
            if (e64Var != null) {
                fVar.i(3, e64Var.mo75928xcd1e8d8());
                this.f472093f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f472094g);
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f472091d) + 0;
            java.lang.String str2 = this.f472092e;
            if (str2 != null) {
                h17 += b36.f.j(2, str2);
            }
            r45.e64 e64Var2 = this.f472093f;
            if (e64Var2 != null) {
                h17 += b36.f.i(3, e64Var2.mo75928xcd1e8d8());
            }
            return h17 + b36.f.e(4, this.f472094g) + b36.f.g(5, 8, linkedList);
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
        r45.xw5 xw5Var = (r45.xw5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            xw5Var.f472091d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            xw5Var.f472092e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.e64 e64Var3 = new r45.e64();
                if (bArr2 != null && bArr2.length > 0) {
                    e64Var3.mo11468x92b714fd(bArr2);
                }
                xw5Var.f472093f = e64Var3;
            }
            return 0;
        }
        if (intValue == 4) {
            xw5Var.f472094g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.fw6 fw6Var = new r45.fw6();
            if (bArr3 != null && bArr3.length > 0) {
                fw6Var.mo11468x92b714fd(bArr3);
            }
            xw5Var.f472095h.add(fw6Var);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f472091d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BusinessType", valueOf, false);
            eVar.d(jSONObject, "KeyWord", this.f472092e, false);
            eVar.d(jSONObject, "Location", this.f472093f, false);
            eVar.d(jSONObject, "RequestSrc", java.lang.Integer.valueOf(this.f472094g), false);
            eVar.d(jSONObject, "MatchUserList", this.f472095h, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
