package r45;

/* loaded from: classes7.dex */
public class c87 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f452910d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f452911e;

    /* renamed from: f, reason: collision with root package name */
    public int f452912f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c87)) {
            return false;
        }
        r45.c87 c87Var = (r45.c87) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f452910d), java.lang.Boolean.valueOf(c87Var.f452910d)) && n51.f.a(java.lang.Boolean.valueOf(this.f452911e), java.lang.Boolean.valueOf(c87Var.f452911e)) && n51.f.a(java.lang.Integer.valueOf(this.f452912f), java.lang.Integer.valueOf(c87Var.f452912f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f452910d);
            fVar.a(2, this.f452911e);
            fVar.e(3, this.f452912f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f452910d) + 0 + b36.f.a(2, this.f452911e) + b36.f.e(3, this.f452912f);
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
        r45.c87 c87Var = (r45.c87) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c87Var.f452910d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            c87Var.f452911e = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        c87Var.f452912f = aVar2.g(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f452910d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "accept", valueOf, false);
            eVar.d(jSONObject, "needChooseDestination", java.lang.Boolean.valueOf(this.f452911e), false);
            eVar.d(jSONObject, "failReason", java.lang.Integer.valueOf(this.f452912f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
