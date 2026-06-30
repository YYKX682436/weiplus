package r45;

/* loaded from: classes4.dex */
public class wq extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f470915d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f470916e;

    /* renamed from: f, reason: collision with root package name */
    public int f470917f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wq)) {
            return false;
        }
        r45.wq wqVar = (r45.wq) fVar;
        return n51.f.a(this.f470915d, wqVar.f470915d) && n51.f.a(this.f470916e, wqVar.f470916e) && n51.f.a(java.lang.Integer.valueOf(this.f470917f), java.lang.Integer.valueOf(wqVar.f470917f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f470915d;
            if (str != null) {
                fVar.j(1, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f470916e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f470917f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f470915d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f470916e;
            if (gVar2 != null) {
                j17 += b36.f.b(2, gVar2);
            }
            return j17 + b36.f.e(3, this.f470917f);
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
        r45.wq wqVar = (r45.wq) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wqVar.f470915d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            wqVar.f470916e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        wqVar.f470917f = aVar2.g(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f470915d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "key", str, false);
            eVar.d(jSONObject, "buff", this.f470916e, false);
            eVar.d(jSONObject, "sub_type", java.lang.Integer.valueOf(this.f470917f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
