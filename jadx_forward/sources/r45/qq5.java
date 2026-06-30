package r45;

/* loaded from: classes8.dex */
public class qq5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f465738d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465739e;

    /* renamed from: f, reason: collision with root package name */
    public r45.uq5 f465740f;

    /* renamed from: g, reason: collision with root package name */
    public int f465741g;

    /* renamed from: h, reason: collision with root package name */
    public long f465742h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f465743i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public long f465744m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qq5)) {
            return false;
        }
        r45.qq5 qq5Var = (r45.qq5) fVar;
        return n51.f.a(this.f76494x2de60e5e, qq5Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f465738d), java.lang.Integer.valueOf(qq5Var.f465738d)) && n51.f.a(this.f465739e, qq5Var.f465739e) && n51.f.a(this.f465740f, qq5Var.f465740f) && n51.f.a(java.lang.Integer.valueOf(this.f465741g), java.lang.Integer.valueOf(qq5Var.f465741g)) && n51.f.a(java.lang.Long.valueOf(this.f465742h), java.lang.Long.valueOf(qq5Var.f465742h)) && n51.f.a(this.f465743i, qq5Var.f465743i) && n51.f.a(java.lang.Long.valueOf(this.f465744m), java.lang.Long.valueOf(qq5Var.f465744m));
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
            fVar.e(2, this.f465738d);
            java.lang.String str = this.f465739e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.uq5 uq5Var = this.f465740f;
            if (uq5Var != null) {
                fVar.i(4, uq5Var.mo75928xcd1e8d8());
                this.f465740f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f465741g);
            fVar.h(6, this.f465742h);
            fVar.g(7, 8, this.f465743i);
            fVar.h(8, this.f465744m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f465738d);
            java.lang.String str2 = this.f465739e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            r45.uq5 uq5Var2 = this.f465740f;
            if (uq5Var2 != null) {
                i18 += b36.f.i(4, uq5Var2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.e(5, this.f465741g) + b36.f.h(6, this.f465742h) + b36.f.g(7, 8, this.f465743i) + b36.f.h(8, this.f465744m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f465743i.clear();
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
        r45.qq5 qq5Var = (r45.qq5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    qq5Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                qq5Var.f465738d = aVar2.g(intValue);
                return 0;
            case 3:
                qq5Var.f465739e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.uq5 uq5Var3 = new r45.uq5();
                    if (bArr3 != null && bArr3.length > 0) {
                        uq5Var3.mo11468x92b714fd(bArr3);
                    }
                    qq5Var.f465740f = uq5Var3;
                }
                return 0;
            case 5:
                qq5Var.f465741g = aVar2.g(intValue);
                return 0;
            case 6:
                qq5Var.f465742h = aVar2.i(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.pq5 pq5Var = new r45.pq5();
                    if (bArr4 != null && bArr4.length > 0) {
                        pq5Var.mo11468x92b714fd(bArr4);
                    }
                    qq5Var.f465743i.add(pq5Var);
                }
                return 0;
            case 8:
                qq5Var.f465744m = aVar2.i(intValue);
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
            r45.he heVar = this.f76494x2de60e5e;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BaseRequest", heVar, false);
            eVar.d(jSONObject, "business_id", java.lang.Integer.valueOf(this.f465738d), false);
            eVar.d(jSONObject, "version", this.f465739e, false);
            eVar.d(jSONObject, "report_time", this.f465740f, false);
            eVar.d(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52918x89383abf, java.lang.Integer.valueOf(this.f465741g), false);
            eVar.d(jSONObject, "user_mode_flag", java.lang.Long.valueOf(this.f465742h), false);
            eVar.d(jSONObject, "item_data_list", this.f465743i, false);
            eVar.d(jSONObject, "item_confs_version", java.lang.Long.valueOf(this.f465744m), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
