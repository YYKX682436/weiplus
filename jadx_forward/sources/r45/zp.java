package r45;

/* loaded from: classes2.dex */
public class zp extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f473792d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473793e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zp)) {
            return false;
        }
        r45.zp zpVar = (r45.zp) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f473792d), java.lang.Long.valueOf(zpVar.f473792d)) && n51.f.a(this.f473793e, zpVar.f473793e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f473792d);
            java.lang.String str = this.f473793e;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f473792d) + 0;
            java.lang.String str2 = this.f473793e;
            return str2 != null ? h17 + b36.f.j(2, str2) : h17;
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
        r45.zp zpVar = (r45.zp) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zpVar.f473792d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        zpVar.f473793e = aVar2.k(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f473792d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Id", valueOf, false);
            eVar.d(jSONObject, "ObjectDesc", this.f473793e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
