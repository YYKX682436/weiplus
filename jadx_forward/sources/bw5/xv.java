package bw5;

/* loaded from: classes4.dex */
public class xv extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f116804d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f116805e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f116806f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.x7 f116807g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f116808h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f116809i = new boolean[6];

    static {
        new bw5.xv();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.xv)) {
            return false;
        }
        bw5.xv xvVar = (bw5.xv) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f116804d), java.lang.Integer.valueOf(xvVar.f116804d)) && n51.f.a(this.f116805e, xvVar.f116805e) && n51.f.a(this.f116806f, xvVar.f116806f) && n51.f.a(this.f116807g, xvVar.f116807g) && n51.f.a(java.lang.Boolean.valueOf(this.f116808h), java.lang.Boolean.valueOf(xvVar.f116808h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.xv();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f116809i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f116804d);
            }
            java.lang.String str = this.f116805e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f116806f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            bw5.x7 x7Var = this.f116807g;
            if (x7Var != null && zArr[4]) {
                fVar.i(4, x7Var.mo75928xcd1e8d8());
                this.f116807g.mo75956x3d5d1f78(fVar);
            }
            if (zArr[5]) {
                fVar.a(5, this.f116808h);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f116804d) : 0;
            java.lang.String str3 = this.f116805e;
            if (str3 != null && zArr[2]) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f116806f;
            if (str4 != null && zArr[3]) {
                e17 += b36.f.j(3, str4);
            }
            bw5.x7 x7Var2 = this.f116807g;
            if (x7Var2 != null && zArr[4]) {
                e17 += b36.f.i(4, x7Var2.mo75928xcd1e8d8());
            }
            return zArr[5] ? e17 + b36.f.a(5, this.f116808h) : e17;
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f116804d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f116805e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f116806f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            this.f116808h = aVar2.c(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.x7 x7Var3 = new bw5.x7();
            if (bArr != null && bArr.length > 0) {
                x7Var3.mo11468x92b714fd(bArr);
            }
            this.f116807g = x7Var3;
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.xv) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f116804d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "business_type", valueOf, false);
            eVar.d(jSONObject, "wording", this.f116805e, false);
            eVar.d(jSONObject, "sub_wording", this.f116806f, false);
            eVar.d(jSONObject, "jump_info", this.f116807g, false);
            eVar.d(jSONObject, "need_refresh_when_exit", java.lang.Boolean.valueOf(this.f116808h), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
