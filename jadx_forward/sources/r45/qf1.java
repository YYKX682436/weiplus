package r45;

/* loaded from: classes2.dex */
public class qf1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465461d;

    /* renamed from: e, reason: collision with root package name */
    public long f465462e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465463f;

    /* renamed from: g, reason: collision with root package name */
    public int f465464g;

    /* renamed from: h, reason: collision with root package name */
    public long f465465h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qf1)) {
            return false;
        }
        r45.qf1 qf1Var = (r45.qf1) fVar;
        return n51.f.a(this.f465461d, qf1Var.f465461d) && n51.f.a(java.lang.Long.valueOf(this.f465462e), java.lang.Long.valueOf(qf1Var.f465462e)) && n51.f.a(this.f465463f, qf1Var.f465463f) && n51.f.a(java.lang.Integer.valueOf(this.f465464g), java.lang.Integer.valueOf(qf1Var.f465464g)) && n51.f.a(java.lang.Long.valueOf(this.f465465h), java.lang.Long.valueOf(qf1Var.f465465h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f465461d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f465462e);
            java.lang.String str2 = this.f465463f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f465464g);
            fVar.h(5, this.f465465h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f465461d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.h(2, this.f465462e);
            java.lang.String str4 = this.f465463f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            return j17 + b36.f.e(4, this.f465464g) + b36.f.h(5, this.f465465h);
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
        r45.qf1 qf1Var = (r45.qf1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qf1Var.f465461d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            qf1Var.f465462e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            qf1Var.f465463f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            qf1Var.f465464g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        qf1Var.f465465h = aVar2.i(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f465461d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Nickname", str, false);
            eVar.d(jSONObject, "UpdateTime", java.lang.Long.valueOf(this.f465462e), false);
            eVar.d(jSONObject, "HeadImgUrl", this.f465463f, false);
            eVar.d(jSONObject, "SpamFlag", java.lang.Integer.valueOf(this.f465464g), false);
            eVar.d(jSONObject, "DeleteTime", java.lang.Long.valueOf(this.f465465h), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
