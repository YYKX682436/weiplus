package r45;

/* loaded from: classes15.dex */
public class sn6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f467400d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467401e;

    /* renamed from: f, reason: collision with root package name */
    public int f467402f;

    /* renamed from: g, reason: collision with root package name */
    public int f467403g;

    /* renamed from: h, reason: collision with root package name */
    public int f467404h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f467405i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public boolean f467406m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f467407n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sn6)) {
            return false;
        }
        r45.sn6 sn6Var = (r45.sn6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f467400d), java.lang.Integer.valueOf(sn6Var.f467400d)) && n51.f.a(this.f467401e, sn6Var.f467401e) && n51.f.a(java.lang.Integer.valueOf(this.f467402f), java.lang.Integer.valueOf(sn6Var.f467402f)) && n51.f.a(java.lang.Integer.valueOf(this.f467403g), java.lang.Integer.valueOf(sn6Var.f467403g)) && n51.f.a(java.lang.Integer.valueOf(this.f467404h), java.lang.Integer.valueOf(sn6Var.f467404h)) && n51.f.a(this.f467405i, sn6Var.f467405i) && n51.f.a(java.lang.Boolean.valueOf(this.f467406m), java.lang.Boolean.valueOf(sn6Var.f467406m)) && n51.f.a(java.lang.Boolean.valueOf(this.f467407n), java.lang.Boolean.valueOf(sn6Var.f467407n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f467405i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f467400d);
            java.lang.String str = this.f467401e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f467402f);
            fVar.e(4, this.f467403g);
            fVar.e(5, this.f467404h);
            fVar.g(6, 8, linkedList);
            fVar.a(7, this.f467406m);
            fVar.a(8, this.f467407n);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f467400d) + 0;
            java.lang.String str2 = this.f467401e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.e(3, this.f467402f) + b36.f.e(4, this.f467403g) + b36.f.e(5, this.f467404h) + b36.f.g(6, 8, linkedList) + b36.f.a(7, this.f467406m) + b36.f.a(8, this.f467407n);
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
        r45.sn6 sn6Var = (r45.sn6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                sn6Var.f467400d = aVar2.g(intValue);
                return 0;
            case 2:
                sn6Var.f467401e = aVar2.k(intValue);
                return 0;
            case 3:
                sn6Var.f467402f = aVar2.g(intValue);
                return 0;
            case 4:
                sn6Var.f467403g = aVar2.g(intValue);
                return 0;
            case 5:
                sn6Var.f467404h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.xn6 xn6Var = new r45.xn6();
                    if (bArr2 != null && bArr2.length > 0) {
                        xn6Var.mo11468x92b714fd(bArr2);
                    }
                    sn6Var.f467405i.add(xn6Var);
                }
                return 0;
            case 7:
                sn6Var.f467406m = aVar2.c(intValue);
                return 0;
            case 8:
                sn6Var.f467407n = aVar2.c(intValue);
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
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f467400d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "videoSecondType", valueOf, false);
            eVar.d(jSONObject, "originVideoId", this.f467401e, false);
            eVar.d(jSONObject, "insertPos", java.lang.Integer.valueOf(this.f467402f), false);
            eVar.d(jSONObject, "requestDuration", java.lang.Integer.valueOf(this.f467403g), false);
            eVar.d(jSONObject, "requestPercent", java.lang.Integer.valueOf(this.f467404h), false);
            eVar.d(jSONObject, "secondVideoInfoList", this.f467405i, false);
            eVar.d(jSONObject, "isRequest", java.lang.Boolean.valueOf(this.f467406m), false);
            eVar.d(jSONObject, "isShow", java.lang.Boolean.valueOf(this.f467407n), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
