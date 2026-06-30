package pj4;

/* loaded from: classes8.dex */
public class z1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f436894d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f436895e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f436896f;

    /* renamed from: g, reason: collision with root package name */
    public int f436897g;

    /* renamed from: h, reason: collision with root package name */
    public int f436898h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f436899i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.z1)) {
            return false;
        }
        pj4.z1 z1Var = (pj4.z1) fVar;
        return n51.f.a(this.f76494x2de60e5e, z1Var.f76494x2de60e5e) && n51.f.a(this.f436894d, z1Var.f436894d) && n51.f.a(this.f436895e, z1Var.f436895e) && n51.f.a(this.f436896f, z1Var.f436896f) && n51.f.a(java.lang.Integer.valueOf(this.f436897g), java.lang.Integer.valueOf(z1Var.f436897g)) && n51.f.a(java.lang.Integer.valueOf(this.f436898h), java.lang.Integer.valueOf(z1Var.f436898h)) && n51.f.a(this.f436899i, z1Var.f436899i);
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
            java.lang.String str = this.f436894d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f436895e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f436896f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f436897g);
            fVar.e(6, this.f436898h);
            java.lang.String str4 = this.f436899i;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str5 = this.f436894d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f436895e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f436896f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            int e17 = i18 + b36.f.e(5, this.f436897g) + b36.f.e(6, this.f436898h);
            java.lang.String str8 = this.f436899i;
            return str8 != null ? e17 + b36.f.j(8, str8) : e17;
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
        pj4.z1 z1Var = (pj4.z1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    z1Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                z1Var.f436894d = aVar2.k(intValue);
                return 0;
            case 3:
                z1Var.f436895e = aVar2.k(intValue);
                return 0;
            case 4:
                z1Var.f436896f = aVar2.k(intValue);
                return 0;
            case 5:
                z1Var.f436897g = aVar2.g(intValue);
                return 0;
            case 6:
                z1Var.f436898h = aVar2.g(intValue);
                return 0;
            case 7:
            default:
                return -1;
            case 8:
                z1Var.f436899i = aVar2.k(intValue);
                return 0;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.he heVar = this.f76494x2de60e5e;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BaseRequest", heVar, false);
            eVar.d(jSONObject, "topic_id", this.f436894d, false);
            eVar.d(jSONObject, "text_status_id", this.f436895e, false);
            eVar.d(jSONObject, dm.i4.f66875xa013b0d5, this.f436896f, false);
            eVar.d(jSONObject, "delete_flag", java.lang.Integer.valueOf(this.f436897g), false);
            eVar.d(jSONObject, "type", java.lang.Integer.valueOf(this.f436898h), false);
            eVar.d(jSONObject, com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26768x16959c15.Columns.f56764x64cb2a26, this.f436899i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
