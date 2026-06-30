package pj4;

/* loaded from: classes8.dex */
public class x extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f436855d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f436856e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f436857f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f436858g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f436859h;

    /* renamed from: i, reason: collision with root package name */
    public int f436860i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.x)) {
            return false;
        }
        pj4.x xVar = (pj4.x) fVar;
        return n51.f.a(this.f436855d, xVar.f436855d) && n51.f.a(this.f436856e, xVar.f436856e) && n51.f.a(java.lang.Integer.valueOf(this.f436857f), java.lang.Integer.valueOf(xVar.f436857f)) && n51.f.a(this.f436858g, xVar.f436858g) && n51.f.a(this.f436859h, xVar.f436859h) && n51.f.a(java.lang.Integer.valueOf(this.f436860i), java.lang.Integer.valueOf(xVar.f436860i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f436856e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f436855d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            fVar.e(3, this.f436857f);
            java.lang.String str2 = this.f436858g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f436859h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f436860i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f436855d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.g(2, 8, linkedList) + b36.f.e(3, this.f436857f);
            java.lang.String str5 = this.f436858g;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f436859h;
            if (str6 != null) {
                j17 += b36.f.j(5, str6);
            }
            return j17 + b36.f.e(6, this.f436860i);
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
        pj4.x xVar = (pj4.x) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xVar.f436855d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    pj4.g0 g0Var = new pj4.g0();
                    if (bArr2 != null && bArr2.length > 0) {
                        g0Var.mo11468x92b714fd(bArr2);
                    }
                    xVar.f436856e.add(g0Var);
                }
                return 0;
            case 3:
                xVar.f436857f = aVar2.g(intValue);
                return 0;
            case 4:
                xVar.f436858g = aVar2.k(intValue);
                return 0;
            case 5:
                xVar.f436859h = aVar2.k(intValue);
                return 0;
            case 6:
                xVar.f436860i = aVar2.g(intValue);
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
            java.lang.String str = this.f436855d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "iconId", str, false);
            eVar.d(jSONObject, "iconActions", this.f436856e, false);
            eVar.d(jSONObject, "character_set_type", java.lang.Integer.valueOf(this.f436857f), false);
            eVar.d(jSONObject, "cluster_id", this.f436858g, false);
            eVar.d(jSONObject, "cluster_present_type", this.f436859h, false);
            eVar.d(jSONObject, "cluster_present_version", java.lang.Integer.valueOf(this.f436860i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
