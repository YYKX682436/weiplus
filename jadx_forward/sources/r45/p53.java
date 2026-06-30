package r45;

/* loaded from: classes4.dex */
public class p53 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f464294d;

    /* renamed from: e, reason: collision with root package name */
    public int f464295e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f464296f;

    /* renamed from: g, reason: collision with root package name */
    public int f464297g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p53)) {
            return false;
        }
        r45.p53 p53Var = (r45.p53) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f464294d), java.lang.Integer.valueOf(p53Var.f464294d)) && n51.f.a(java.lang.Integer.valueOf(this.f464295e), java.lang.Integer.valueOf(p53Var.f464295e)) && n51.f.a(this.f464296f, p53Var.f464296f) && n51.f.a(java.lang.Integer.valueOf(this.f464297g), java.lang.Integer.valueOf(p53Var.f464297g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f464294d);
            fVar.e(2, this.f464295e);
            r45.cu5 cu5Var = this.f464296f;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.mo75928xcd1e8d8());
                this.f464296f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f464297g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f464294d) + 0 + b36.f.e(2, this.f464295e);
            r45.cu5 cu5Var2 = this.f464296f;
            if (cu5Var2 != null) {
                e17 += b36.f.i(3, cu5Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(4, this.f464297g);
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
        r45.p53 p53Var = (r45.p53) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            p53Var.f464294d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            p53Var.f464295e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            p53Var.f464297g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr != null && bArr.length > 0) {
                cu5Var3.b(bArr);
            }
            p53Var.f464296f = cu5Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f464294d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "FunctionId", valueOf, false);
            eVar.d(jSONObject, "SwitchValue", java.lang.Integer.valueOf(this.f464295e), false);
            eVar.d(jSONObject, "Ticket", this.f464296f, false);
            eVar.d(jSONObject, "TicketType", java.lang.Integer.valueOf(this.f464297g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
