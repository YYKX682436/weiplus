package r45;

/* loaded from: classes7.dex */
public class i87 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f458353d;

    /* renamed from: e, reason: collision with root package name */
    public long f458354e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i87)) {
            return false;
        }
        r45.i87 i87Var = (r45.i87) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f458353d), java.lang.Long.valueOf(i87Var.f458353d)) && n51.f.a(java.lang.Long.valueOf(this.f458354e), java.lang.Long.valueOf(i87Var.f458354e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f458353d);
            fVar.h(2, this.f458354e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f458353d) + 0 + b36.f.h(2, this.f458354e);
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
        r45.i87 i87Var = (r45.i87) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            i87Var.f458353d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        i87Var.f458354e = aVar2.i(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f458353d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "file_index", valueOf, false);
            eVar.d(jSONObject, "receive_size", java.lang.Long.valueOf(this.f458354e), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
