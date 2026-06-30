package r45;

/* loaded from: classes4.dex */
public class io5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f458751d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f458752e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f458753f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f458754g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.io5)) {
            return false;
        }
        r45.io5 io5Var = (r45.io5) fVar;
        return n51.f.a(this.f76494x2de60e5e, io5Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f458751d), java.lang.Integer.valueOf(io5Var.f458751d)) && n51.f.a(this.f458752e, io5Var.f458752e) && n51.f.a(this.f458753f, io5Var.f458753f) && n51.f.a(this.f458754g, io5Var.f458754g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f458751d);
            fVar.g(3, 3, this.f458752e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f458753f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f458754g;
            if (gVar2 != null) {
                fVar.b(5, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f458751d) + b36.f.g(3, 3, this.f458752e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f458753f;
            if (gVar3 != null) {
                i18 += b36.f.b(4, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f458754g;
            return gVar4 != null ? i18 + b36.f.b(5, gVar4) : i18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f458752e.clear();
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
        r45.io5 io5Var = (r45.io5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.mo11468x92b714fd(bArr2);
                }
                io5Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            io5Var.f458751d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            io5Var.f458752e.add(java.lang.Long.valueOf(aVar2.i(intValue)));
            return 0;
        }
        if (intValue == 4) {
            io5Var.f458753f = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        io5Var.f458754g = aVar2.d(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.he heVar = this.f76494x2de60e5e;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BaseRequest", heVar, false);
            eVar.d(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f458751d), false);
            eVar.d(jSONObject, "selector", this.f458752e, false);
            eVar.d(jSONObject, "cli_sync_key_buff", this.f458753f, false);
            eVar.d(jSONObject, "migrate_sync_key_buff", this.f458754g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
