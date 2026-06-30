package pj4;

/* loaded from: classes10.dex */
public class c0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f436536d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f436537e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f436538f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f436539g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f436540h;

    /* renamed from: i, reason: collision with root package name */
    public int f436541i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f436542m = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.c0)) {
            return false;
        }
        pj4.c0 c0Var = (pj4.c0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f436536d), java.lang.Integer.valueOf(c0Var.f436536d)) && n51.f.a(this.f436537e, c0Var.f436537e) && n51.f.a(this.f436538f, c0Var.f436538f) && n51.f.a(this.f436539g, c0Var.f436539g) && n51.f.a(this.f436540h, c0Var.f436540h) && n51.f.a(java.lang.Integer.valueOf(this.f436541i), java.lang.Integer.valueOf(c0Var.f436541i)) && n51.f.a(this.f436542m, c0Var.f436542m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f436536d);
            java.lang.String str = this.f436537e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f436538f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f436539g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f436540h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f436541i);
            fVar.g(21, 8, this.f436542m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f436536d) + 0;
            java.lang.String str5 = this.f436537e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f436538f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f436539g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f436540h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            return e17 + b36.f.e(6, this.f436541i) + b36.f.g(21, 8, this.f436542m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f436542m.clear();
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
        pj4.c0 c0Var = (pj4.c0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 21) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                pj4.j0 j0Var = new pj4.j0();
                if (bArr2 != null && bArr2.length > 0) {
                    j0Var.mo11468x92b714fd(bArr2);
                }
                c0Var.f436542m.add(j0Var);
            }
            return 0;
        }
        switch (intValue) {
            case 1:
                c0Var.f436536d = aVar2.g(intValue);
                return 0;
            case 2:
                c0Var.f436537e = aVar2.k(intValue);
                return 0;
            case 3:
                c0Var.f436538f = aVar2.k(intValue);
                return 0;
            case 4:
                c0Var.f436539g = aVar2.k(intValue);
                return 0;
            case 5:
                c0Var.f436540h = aVar2.k(intValue);
                return 0;
            case 6:
                c0Var.f436541i = aVar2.g(intValue);
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
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f436536d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "uin", valueOf, false);
            eVar.d(jSONObject, "sourceId", this.f436537e, false);
            eVar.d(jSONObject, "sourceActivityId", this.f436538f, false);
            eVar.d(jSONObject, "sourceName", this.f436539g, false);
            eVar.d(jSONObject, "sourceIcon", this.f436540h, false);
            eVar.d(jSONObject, "createTime", java.lang.Integer.valueOf(this.f436541i), false);
            eVar.d(jSONObject, "jumps", this.f436542m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
