package r45;

/* loaded from: classes2.dex */
public class qp extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f465687d;

    /* renamed from: e, reason: collision with root package name */
    public int f465688e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465689f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f465690g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f465691h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public int f465692i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f465693m;

    /* renamed from: n, reason: collision with root package name */
    public int f465694n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qp)) {
            return false;
        }
        r45.qp qpVar = (r45.qp) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f465687d), java.lang.Long.valueOf(qpVar.f465687d)) && n51.f.a(java.lang.Integer.valueOf(this.f465688e), java.lang.Integer.valueOf(qpVar.f465688e)) && n51.f.a(this.f465689f, qpVar.f465689f) && n51.f.a(this.f465690g, qpVar.f465690g) && n51.f.a(this.f465691h, qpVar.f465691h) && n51.f.a(java.lang.Integer.valueOf(this.f465692i), java.lang.Integer.valueOf(qpVar.f465692i)) && n51.f.a(this.f465693m, qpVar.f465693m) && n51.f.a(java.lang.Integer.valueOf(this.f465694n), java.lang.Integer.valueOf(qpVar.f465694n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f465691h;
        java.util.LinkedList linkedList2 = this.f465690g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f465687d);
            fVar.e(2, this.f465688e);
            java.lang.String str = this.f465689f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.g(4, 1, linkedList2);
            fVar.g(5, 8, linkedList);
            fVar.e(6, this.f465692i);
            java.lang.String str2 = this.f465693m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(8, this.f465694n);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f465687d) + 0 + b36.f.e(2, this.f465688e);
            java.lang.String str3 = this.f465689f;
            if (str3 != null) {
                h17 += b36.f.j(3, str3);
            }
            int g17 = h17 + b36.f.g(4, 1, linkedList2) + b36.f.g(5, 8, linkedList) + b36.f.e(6, this.f465692i);
            java.lang.String str4 = this.f465693m;
            if (str4 != null) {
                g17 += b36.f.j(7, str4);
            }
            return g17 + b36.f.e(8, this.f465694n);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.qp qpVar = (r45.qp) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qpVar.f465687d = aVar2.i(intValue);
                return 0;
            case 2:
                qpVar.f465688e = aVar2.g(intValue);
                return 0;
            case 3:
                qpVar.f465689f = aVar2.k(intValue);
                return 0;
            case 4:
                qpVar.f465690g.add(aVar2.k(intValue));
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.xp xpVar = new r45.xp();
                    if (bArr2 != null && bArr2.length > 0) {
                        xpVar.mo11468x92b714fd(bArr2);
                    }
                    qpVar.f465691h.add(xpVar);
                }
                return 0;
            case 6:
                qpVar.f465692i = aVar2.g(intValue);
                return 0;
            case 7:
                qpVar.f465693m = aVar2.k(intValue);
                return 0;
            case 8:
                qpVar.f465694n = aVar2.g(intValue);
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
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f465687d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BusinessType", valueOf, false);
            eVar.d(jSONObject, "ContinueFlag", java.lang.Integer.valueOf(this.f465688e), false);
            eVar.d(jSONObject, "Title", this.f465689f, false);
            eVar.d(jSONObject, "KeyWordList", this.f465690g, false);
            eVar.d(jSONObject, "ItemList", this.f465691h, false);
            eVar.d(jSONObject, "TotalCount", java.lang.Integer.valueOf(this.f465692i), false);
            eVar.d(jSONObject, "SearchID", this.f465693m, false);
            eVar.d(jSONObject, "Offset", java.lang.Integer.valueOf(this.f465694n), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
