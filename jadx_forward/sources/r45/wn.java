package r45;

/* loaded from: classes4.dex */
public class wn extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ch1 f470835d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f470836e;

    /* renamed from: f, reason: collision with root package name */
    public int f470837f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f470838g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f470839h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wn)) {
            return false;
        }
        r45.wn wnVar = (r45.wn) fVar;
        return n51.f.a(this.f470835d, wnVar.f470835d) && n51.f.a(java.lang.Boolean.valueOf(this.f470836e), java.lang.Boolean.valueOf(wnVar.f470836e)) && n51.f.a(java.lang.Integer.valueOf(this.f470837f), java.lang.Integer.valueOf(wnVar.f470837f)) && n51.f.a(java.lang.Boolean.valueOf(this.f470838g), java.lang.Boolean.valueOf(wnVar.f470838g)) && n51.f.a(java.lang.Boolean.valueOf(this.f470839h), java.lang.Boolean.valueOf(wnVar.f470839h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ch1 ch1Var = this.f470835d;
            if (ch1Var != null) {
                fVar.i(1, ch1Var.mo75928xcd1e8d8());
                this.f470835d.mo75956x3d5d1f78(fVar);
            }
            fVar.a(2, this.f470836e);
            fVar.e(3, this.f470837f);
            fVar.a(4, this.f470838g);
            fVar.a(5, this.f470839h);
            return 0;
        }
        if (i17 == 1) {
            r45.ch1 ch1Var2 = this.f470835d;
            return (ch1Var2 != null ? 0 + b36.f.i(1, ch1Var2.mo75928xcd1e8d8()) : 0) + b36.f.a(2, this.f470836e) + b36.f.e(3, this.f470837f) + b36.f.a(4, this.f470838g) + b36.f.a(5, this.f470839h);
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
        r45.wn wnVar = (r45.wn) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.ch1 ch1Var3 = new r45.ch1();
                if (bArr != null && bArr.length > 0) {
                    ch1Var3.mo11468x92b714fd(bArr);
                }
                wnVar.f470835d = ch1Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            wnVar.f470836e = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            wnVar.f470837f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            wnVar.f470838g = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        wnVar.f470839h = aVar2.c(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ch1 ch1Var = this.f470835d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, ya.b.f77502x92235c1b, ch1Var, false);
            eVar.d(jSONObject, "isLocal", java.lang.Boolean.valueOf(this.f470836e), false);
            eVar.d(jSONObject, "likeCount", java.lang.Integer.valueOf(this.f470837f), false);
            eVar.d(jSONObject, "selfLike", java.lang.Boolean.valueOf(this.f470838g), false);
            eVar.d(jSONObject, "selfOp", java.lang.Boolean.valueOf(this.f470839h), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
