package r45;

/* loaded from: classes8.dex */
public class jn6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459508d;

    /* renamed from: e, reason: collision with root package name */
    public long f459509e;

    /* renamed from: f, reason: collision with root package name */
    public int f459510f;

    /* renamed from: g, reason: collision with root package name */
    public int f459511g;

    /* renamed from: h, reason: collision with root package name */
    public int f459512h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f459513i = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jn6)) {
            return false;
        }
        r45.jn6 jn6Var = (r45.jn6) fVar;
        return n51.f.a(this.f459508d, jn6Var.f459508d) && n51.f.a(java.lang.Long.valueOf(this.f459509e), java.lang.Long.valueOf(jn6Var.f459509e)) && n51.f.a(java.lang.Integer.valueOf(this.f459510f), java.lang.Integer.valueOf(jn6Var.f459510f)) && n51.f.a(java.lang.Integer.valueOf(this.f459511g), java.lang.Integer.valueOf(jn6Var.f459511g)) && n51.f.a(java.lang.Integer.valueOf(this.f459512h), java.lang.Integer.valueOf(jn6Var.f459512h)) && n51.f.a(this.f459513i, jn6Var.f459513i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f459508d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f459509e);
            fVar.e(3, this.f459510f);
            fVar.e(4, this.f459511g);
            fVar.e(5, this.f459512h);
            fVar.g(6, 1, this.f459513i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f459508d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f459509e) + b36.f.e(3, this.f459510f) + b36.f.e(4, this.f459511g) + b36.f.e(5, this.f459512h) + b36.f.g(6, 1, this.f459513i);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f459513i.clear();
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
        r45.jn6 jn6Var = (r45.jn6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                jn6Var.f459508d = aVar2.k(intValue);
                return 0;
            case 2:
                jn6Var.f459509e = aVar2.i(intValue);
                return 0;
            case 3:
                jn6Var.f459510f = aVar2.g(intValue);
                return 0;
            case 4:
                jn6Var.f459511g = aVar2.g(intValue);
                return 0;
            case 5:
                jn6Var.f459512h = aVar2.g(intValue);
                return 0;
            case 6:
                jn6Var.f459513i.add(aVar2.k(intValue));
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
            java.lang.String str = this.f459508d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Content", str, false);
            eVar.d(jSONObject, "SaveTs", java.lang.Long.valueOf(this.f459509e), false);
            eVar.d(jSONObject, "DirectShowTs", java.lang.Integer.valueOf(this.f459510f), false);
            eVar.d(jSONObject, "ShowAndRefreshTs", java.lang.Integer.valueOf(this.f459511g), false);
            eVar.d(jSONObject, "Category", java.lang.Integer.valueOf(this.f459512h), false);
            eVar.d(jSONObject, "DocidList", this.f459513i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
