package pj4;

/* loaded from: classes8.dex */
public class q1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f436798d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f436799e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f436800f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.q1)) {
            return false;
        }
        pj4.q1 q1Var = (pj4.q1) fVar;
        return n51.f.a(this.f436798d, q1Var.f436798d) && n51.f.a(this.f436799e, q1Var.f436799e) && n51.f.a(this.f436800f, q1Var.f436800f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f436799e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f436798d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str2 = this.f436800f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f436798d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.g(2, 8, linkedList);
            java.lang.String str4 = this.f436800f;
            return str4 != null ? j17 + b36.f.j(3, str4) : j17;
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
        pj4.q1 q1Var = (pj4.q1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            q1Var.f436798d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            q1Var.f436800f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            pj4.f0 f0Var = new pj4.f0();
            if (bArr2 != null && bArr2.length > 0) {
                f0Var.mo11468x92b714fd(bArr2);
            }
            q1Var.f436799e.add(f0Var);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f436798d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "groupId", str, false);
            eVar.d(jSONObject, "iconGroupDescriptions", this.f436799e, false);
            eVar.d(jSONObject, "url", this.f436800f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
