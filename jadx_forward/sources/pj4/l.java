package pj4;

/* loaded from: classes2.dex */
public class l extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f436695d;

    /* renamed from: e, reason: collision with root package name */
    public long f436696e;

    /* renamed from: f, reason: collision with root package name */
    public int f436697f;

    /* renamed from: g, reason: collision with root package name */
    public long f436698g;

    /* renamed from: h, reason: collision with root package name */
    public int f436699h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f436700i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f436701m = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.l)) {
            return false;
        }
        pj4.l lVar = (pj4.l) fVar;
        return n51.f.a(this.f436695d, lVar.f436695d) && n51.f.a(java.lang.Long.valueOf(this.f436696e), java.lang.Long.valueOf(lVar.f436696e)) && n51.f.a(java.lang.Integer.valueOf(this.f436697f), java.lang.Integer.valueOf(lVar.f436697f)) && n51.f.a(java.lang.Long.valueOf(this.f436698g), java.lang.Long.valueOf(lVar.f436698g)) && n51.f.a(java.lang.Integer.valueOf(this.f436699h), java.lang.Integer.valueOf(lVar.f436699h)) && n51.f.a(this.f436700i, lVar.f436700i) && n51.f.a(this.f436701m, lVar.f436701m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f436701m;
        java.util.LinkedList linkedList2 = this.f436700i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f436695d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f436696e);
            fVar.e(3, this.f436697f);
            fVar.h(4, this.f436698g);
            fVar.e(5, this.f436699h);
            fVar.g(6, 8, linkedList2);
            fVar.g(7, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f436695d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f436696e) + b36.f.e(3, this.f436697f) + b36.f.h(4, this.f436698g) + b36.f.e(5, this.f436699h) + b36.f.g(6, 8, linkedList2) + b36.f.g(7, 1, linkedList);
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
        pj4.l lVar = (pj4.l) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lVar.f436695d = aVar2.k(intValue);
                return 0;
            case 2:
                lVar.f436696e = aVar2.i(intValue);
                return 0;
            case 3:
                lVar.f436697f = aVar2.g(intValue);
                return 0;
            case 4:
                lVar.f436698g = aVar2.i(intValue);
                return 0;
            case 5:
                lVar.f436699h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    pj4.k kVar = new pj4.k();
                    if (bArr2 != null && bArr2.length > 0) {
                        kVar.mo11468x92b714fd(bArr2);
                    }
                    lVar.f436700i.add(kVar);
                }
                return 0;
            case 7:
                lVar.f436701m.add(aVar2.k(intValue));
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
            java.lang.String str = this.f436695d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "hb_id", str, false);
            eVar.d(jSONObject, "total_amt", java.lang.Long.valueOf(this.f436696e), false);
            eVar.d(jSONObject, "total_num", java.lang.Integer.valueOf(this.f436697f), false);
            eVar.d(jSONObject, "recv_amt", java.lang.Long.valueOf(this.f436698g), false);
            eVar.d(jSONObject, "recv_num", java.lang.Integer.valueOf(this.f436699h), false);
            eVar.d(jSONObject, "recv_records", this.f436700i, false);
            eVar.d(jSONObject, "exclusive_username", this.f436701m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
