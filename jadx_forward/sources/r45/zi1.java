package r45;

/* loaded from: classes4.dex */
public class zi1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f473616d;

    /* renamed from: e, reason: collision with root package name */
    public r45.qm1 f473617e;

    /* renamed from: f, reason: collision with root package name */
    public int f473618f;

    /* renamed from: g, reason: collision with root package name */
    public int f473619g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f473620h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f473621i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f473622m;

    /* renamed from: n, reason: collision with root package name */
    public int f473623n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zi1)) {
            return false;
        }
        r45.zi1 zi1Var = (r45.zi1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f473616d), java.lang.Long.valueOf(zi1Var.f473616d)) && n51.f.a(this.f473617e, zi1Var.f473617e) && n51.f.a(java.lang.Integer.valueOf(this.f473618f), java.lang.Integer.valueOf(zi1Var.f473618f)) && n51.f.a(java.lang.Integer.valueOf(this.f473619g), java.lang.Integer.valueOf(zi1Var.f473619g)) && n51.f.a(java.lang.Boolean.valueOf(this.f473620h), java.lang.Boolean.valueOf(zi1Var.f473620h)) && n51.f.a(java.lang.Boolean.valueOf(this.f473621i), java.lang.Boolean.valueOf(zi1Var.f473621i)) && n51.f.a(this.f473622m, zi1Var.f473622m) && n51.f.a(java.lang.Integer.valueOf(this.f473623n), java.lang.Integer.valueOf(zi1Var.f473623n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f473616d);
            r45.qm1 qm1Var = this.f473617e;
            if (qm1Var != null) {
                fVar.i(2, qm1Var.mo75928xcd1e8d8());
                this.f473617e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f473618f);
            fVar.e(4, this.f473619g);
            fVar.a(5, this.f473620h);
            fVar.a(6, this.f473621i);
            java.lang.String str = this.f473622m;
            if (str != null) {
                fVar.j(10, str);
            }
            fVar.e(11, this.f473623n);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f473616d) + 0;
            r45.qm1 qm1Var2 = this.f473617e;
            if (qm1Var2 != null) {
                h17 += b36.f.i(2, qm1Var2.mo75928xcd1e8d8());
            }
            int e17 = h17 + b36.f.e(3, this.f473618f) + b36.f.e(4, this.f473619g) + b36.f.a(5, this.f473620h) + b36.f.a(6, this.f473621i);
            java.lang.String str2 = this.f473622m;
            if (str2 != null) {
                e17 += b36.f.j(10, str2);
            }
            return e17 + b36.f.e(11, this.f473623n);
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
        r45.zi1 zi1Var = (r45.zi1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 10) {
            zi1Var.f473622m = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 11) {
            zi1Var.f473623n = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                zi1Var.f473616d = aVar2.i(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.qm1 qm1Var3 = new r45.qm1();
                    if (bArr != null && bArr.length > 0) {
                        qm1Var3.mo11468x92b714fd(bArr);
                    }
                    zi1Var.f473617e = qm1Var3;
                }
                return 0;
            case 3:
                zi1Var.f473618f = aVar2.g(intValue);
                return 0;
            case 4:
                zi1Var.f473619g = aVar2.g(intValue);
                return 0;
            case 5:
                zi1Var.f473620h = aVar2.c(intValue);
                return 0;
            case 6:
                zi1Var.f473621i = aVar2.c(intValue);
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
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f473616d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "msg_seq", valueOf, false);
            eVar.d(jSONObject, "box_id", this.f473617e, false);
            eVar.d(jSONObject, "op_type", java.lang.Integer.valueOf(this.f473618f), false);
            eVar.d(jSONObject, "total_like_num", java.lang.Integer.valueOf(this.f473619g), false);
            eVar.d(jSONObject, "is_show_like_num", java.lang.Boolean.valueOf(this.f473620h), false);
            eVar.d(jSONObject, "is_self_like", java.lang.Boolean.valueOf(this.f473621i), false);
            eVar.d(jSONObject, "local_cli_msg_id", this.f473622m, false);
            eVar.d(jSONObject, "original_comment_msg_type", java.lang.Integer.valueOf(this.f473623n), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
