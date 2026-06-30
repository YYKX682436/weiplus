package r45;

/* loaded from: classes2.dex */
public class op extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f463934d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f463935e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f463936f;

    /* renamed from: g, reason: collision with root package name */
    public r45.rp f463937g;

    /* renamed from: h, reason: collision with root package name */
    public r45.sp f463938h;

    /* renamed from: i, reason: collision with root package name */
    public r45.jp f463939i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.op)) {
            return false;
        }
        r45.op opVar = (r45.op) fVar;
        return n51.f.a(this.f463934d, opVar.f463934d) && n51.f.a(this.f463935e, opVar.f463935e) && n51.f.a(this.f463936f, opVar.f463936f) && n51.f.a(this.f463937g, opVar.f463937g) && n51.f.a(this.f463938h, opVar.f463938h) && n51.f.a(this.f463939i, opVar.f463939i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f463934d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f463935e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f463936f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            r45.rp rpVar = this.f463937g;
            if (rpVar != null) {
                fVar.i(4, rpVar.mo75928xcd1e8d8());
                this.f463937g.mo75956x3d5d1f78(fVar);
            }
            r45.sp spVar = this.f463938h;
            if (spVar != null) {
                fVar.i(5, spVar.mo75928xcd1e8d8());
                this.f463938h.mo75956x3d5d1f78(fVar);
            }
            r45.jp jpVar = this.f463939i;
            if (jpVar != null) {
                fVar.i(6, jpVar.mo75928xcd1e8d8());
                this.f463939i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f463934d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f463935e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f463936f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            r45.rp rpVar2 = this.f463937g;
            if (rpVar2 != null) {
                j17 += b36.f.i(4, rpVar2.mo75928xcd1e8d8());
            }
            r45.sp spVar2 = this.f463938h;
            if (spVar2 != null) {
                j17 += b36.f.i(5, spVar2.mo75928xcd1e8d8());
            }
            r45.jp jpVar2 = this.f463939i;
            return jpVar2 != null ? j17 + b36.f.i(6, jpVar2.mo75928xcd1e8d8()) : j17;
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
        r45.op opVar = (r45.op) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                opVar.f463934d = aVar2.k(intValue);
                return 0;
            case 2:
                opVar.f463935e = aVar2.k(intValue);
                return 0;
            case 3:
                opVar.f463936f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.rp rpVar3 = new r45.rp();
                    if (bArr != null && bArr.length > 0) {
                        rpVar3.mo11468x92b714fd(bArr);
                    }
                    opVar.f463937g = rpVar3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.sp spVar3 = new r45.sp();
                    if (bArr2 != null && bArr2.length > 0) {
                        spVar3.mo11468x92b714fd(bArr2);
                    }
                    opVar.f463938h = spVar3;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    r45.jp jpVar3 = new r45.jp();
                    if (bArr3 != null && bArr3.length > 0) {
                        jpVar3.mo11468x92b714fd(bArr3);
                    }
                    opVar.f463939i = jpVar3;
                }
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
            java.lang.String str = this.f463934d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Title", str, false);
            eVar.d(jSONObject, "Desc", this.f463935e, false);
            eVar.d(jSONObject, "ThumbUrl", this.f463936f, false);
            eVar.d(jSONObject, "DetailInfo", this.f463937g, false);
            eVar.d(jSONObject, "ExtendInfo", this.f463938h, false);
            eVar.d(jSONObject, "ActionInfo", this.f463939i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
