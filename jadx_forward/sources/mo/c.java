package mo;

/* loaded from: classes8.dex */
public class c extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f411784d;

    /* renamed from: e, reason: collision with root package name */
    public long f411785e;

    /* renamed from: f, reason: collision with root package name */
    public long f411786f;

    /* renamed from: g, reason: collision with root package name */
    public long f411787g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof mo.c)) {
            return false;
        }
        mo.c cVar = (mo.c) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f411784d), java.lang.Long.valueOf(cVar.f411784d)) && n51.f.a(java.lang.Long.valueOf(this.f411785e), java.lang.Long.valueOf(cVar.f411785e)) && n51.f.a(java.lang.Long.valueOf(this.f411786f), java.lang.Long.valueOf(cVar.f411786f)) && n51.f.a(java.lang.Long.valueOf(this.f411787g), java.lang.Long.valueOf(cVar.f411787g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f411784d);
            fVar.h(2, this.f411785e);
            fVar.h(3, this.f411786f);
            fVar.h(4, this.f411787g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f411784d) + 0 + b36.f.h(2, this.f411785e) + b36.f.h(3, this.f411786f) + b36.f.h(4, this.f411787g);
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
        mo.c cVar = (mo.c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cVar.f411784d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            cVar.f411785e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            cVar.f411786f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        cVar.f411787g = aVar2.i(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f411784d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "firstSeq", valueOf, false);
            eVar.d(jSONObject, "lastSeq", java.lang.Long.valueOf(this.f411785e), false);
            eVar.d(jSONObject, "firstCreateTime", java.lang.Long.valueOf(this.f411786f), false);
            eVar.d(jSONObject, "lastCreateTime", java.lang.Long.valueOf(this.f411787g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
