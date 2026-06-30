package r45;

/* loaded from: classes4.dex */
public class w75 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f470479d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f470480e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w75)) {
            return false;
        }
        r45.w75 w75Var = (r45.w75) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f470479d), java.lang.Boolean.valueOf(w75Var.f470479d)) && n51.f.a(java.lang.Boolean.valueOf(this.f470480e), java.lang.Boolean.valueOf(w75Var.f470480e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f470479d);
            fVar.a(2, this.f470480e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f470479d) + 0 + b36.f.a(2, this.f470480e);
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
        r45.w75 w75Var = (r45.w75) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            w75Var.f470479d = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        w75Var.f470480e = aVar2.c(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f470479d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "is_sender", valueOf, false);
            eVar.d(jSONObject, "is_hello", java.lang.Boolean.valueOf(this.f470480e), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
