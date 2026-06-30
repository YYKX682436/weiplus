package pj4;

/* loaded from: classes8.dex */
public class y extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f436870d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f436871e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f436872f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f436873g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.y)) {
            return false;
        }
        pj4.y yVar = (pj4.y) fVar;
        return n51.f.a(this.f436870d, yVar.f436870d) && n51.f.a(this.f436871e, yVar.f436871e) && n51.f.a(this.f436872f, yVar.f436872f) && n51.f.a(this.f436873g, yVar.f436873g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f436873g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f436870d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f436871e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f436872f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.g(4, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f436870d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f436871e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f436872f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.g(4, 1, linkedList);
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
        pj4.y yVar = (pj4.y) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            yVar.f436870d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            yVar.f436871e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            yVar.f436872f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        yVar.f436873g.add(aVar2.k(intValue));
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f436870d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "status_id", str, false);
            eVar.d(jSONObject, "status_word", this.f436871e, false);
            eVar.d(jSONObject, "status_description", this.f436872f, false);
            eVar.d(jSONObject, "status_tags", this.f436873g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
