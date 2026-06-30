package r45;

/* loaded from: classes4.dex */
public class yc4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.wc4 f472495d;

    /* renamed from: e, reason: collision with root package name */
    public r45.st4 f472496e;

    /* renamed from: f, reason: collision with root package name */
    public int f472497f;

    /* renamed from: g, reason: collision with root package name */
    public int f472498g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yc4)) {
            return false;
        }
        r45.yc4 yc4Var = (r45.yc4) fVar;
        return n51.f.a(this.f76492x92037252, yc4Var.f76492x92037252) && n51.f.a(this.f472495d, yc4Var.f472495d) && n51.f.a(this.f472496e, yc4Var.f472496e) && n51.f.a(java.lang.Integer.valueOf(this.f472497f), java.lang.Integer.valueOf(yc4Var.f472497f)) && n51.f.a(java.lang.Integer.valueOf(this.f472498g), java.lang.Integer.valueOf(yc4Var.f472498g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            r45.wc4 wc4Var = this.f472495d;
            if (wc4Var != null) {
                fVar.i(2, wc4Var.mo75928xcd1e8d8());
                this.f472495d.mo75956x3d5d1f78(fVar);
            }
            r45.st4 st4Var = this.f472496e;
            if (st4Var != null) {
                fVar.i(3, st4Var.mo75928xcd1e8d8());
                this.f472496e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f472497f);
            fVar.e(5, this.f472498g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.wc4 wc4Var2 = this.f472495d;
            if (wc4Var2 != null) {
                i18 += b36.f.i(2, wc4Var2.mo75928xcd1e8d8());
            }
            r45.st4 st4Var2 = this.f472496e;
            if (st4Var2 != null) {
                i18 += b36.f.i(3, st4Var2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.e(4, this.f472497f) + b36.f.e(5, this.f472498g);
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
        r45.yc4 yc4Var = (r45.yc4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr);
                }
                yc4Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.wc4 wc4Var3 = new r45.wc4();
                if (bArr2 != null && bArr2.length > 0) {
                    wc4Var3.mo11468x92b714fd(bArr2);
                }
                yc4Var.f472495d = wc4Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                yc4Var.f472497f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            yc4Var.f472498g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.st4 st4Var3 = new r45.st4();
            if (bArr3 != null && bArr3.length > 0) {
                st4Var3.mo11468x92b714fd(bArr3);
            }
            yc4Var.f472496e = st4Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ie ieVar = this.f76492x92037252;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BaseResponse", ieVar, false);
            eVar.d(jSONObject, "dict", this.f472495d, false);
            eVar.d(jSONObject, "network_dict", this.f472496e, false);
            eVar.d(jSONObject, "timeval_sec", java.lang.Integer.valueOf(this.f472497f), false);
            eVar.d(jSONObject, "second_box_height", java.lang.Integer.valueOf(this.f472498g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
