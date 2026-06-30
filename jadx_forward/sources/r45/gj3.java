package r45;

/* loaded from: classes4.dex */
public class gj3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f456831d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f456832e;

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f456833f;

    /* renamed from: g, reason: collision with root package name */
    public int f456834g;

    /* renamed from: h, reason: collision with root package name */
    public int f456835h;

    /* renamed from: i, reason: collision with root package name */
    public int f456836i;

    /* renamed from: m, reason: collision with root package name */
    public r45.cu5 f456837m;

    /* renamed from: n, reason: collision with root package name */
    public long f456838n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gj3)) {
            return false;
        }
        r45.gj3 gj3Var = (r45.gj3) fVar;
        return n51.f.a(this.f76492x92037252, gj3Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f456831d), java.lang.Integer.valueOf(gj3Var.f456831d)) && n51.f.a(this.f456832e, gj3Var.f456832e) && n51.f.a(this.f456833f, gj3Var.f456833f) && n51.f.a(java.lang.Integer.valueOf(this.f456834g), java.lang.Integer.valueOf(gj3Var.f456834g)) && n51.f.a(java.lang.Integer.valueOf(this.f456835h), java.lang.Integer.valueOf(gj3Var.f456835h)) && n51.f.a(java.lang.Integer.valueOf(this.f456836i), java.lang.Integer.valueOf(gj3Var.f456836i)) && n51.f.a(this.f456837m, gj3Var.f456837m) && n51.f.a(java.lang.Long.valueOf(this.f456838n), java.lang.Long.valueOf(gj3Var.f456838n));
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
            fVar.e(2, this.f456831d);
            r45.du5 du5Var = this.f456832e;
            if (du5Var != null) {
                fVar.i(3, du5Var.mo75928xcd1e8d8());
                this.f456832e.mo75956x3d5d1f78(fVar);
            }
            r45.du5 du5Var2 = this.f456833f;
            if (du5Var2 != null) {
                fVar.i(4, du5Var2.mo75928xcd1e8d8());
                this.f456833f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f456834g);
            fVar.e(6, this.f456835h);
            fVar.e(7, this.f456836i);
            r45.cu5 cu5Var = this.f456837m;
            if (cu5Var != null) {
                fVar.i(8, cu5Var.mo75928xcd1e8d8());
                this.f456837m.mo75956x3d5d1f78(fVar);
            }
            fVar.h(9, this.f456838n);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f456831d);
            r45.du5 du5Var3 = this.f456832e;
            if (du5Var3 != null) {
                i18 += b36.f.i(3, du5Var3.mo75928xcd1e8d8());
            }
            r45.du5 du5Var4 = this.f456833f;
            if (du5Var4 != null) {
                i18 += b36.f.i(4, du5Var4.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(5, this.f456834g) + b36.f.e(6, this.f456835h) + b36.f.e(7, this.f456836i);
            r45.cu5 cu5Var2 = this.f456837m;
            if (cu5Var2 != null) {
                e17 += b36.f.i(8, cu5Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.h(9, this.f456838n);
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
        r45.gj3 gj3Var = (r45.gj3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    gj3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                gj3Var.f456831d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.du5 du5Var5 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var5.b(bArr2);
                    }
                    gj3Var.f456832e = du5Var5;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.du5 du5Var6 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var6.b(bArr3);
                    }
                    gj3Var.f456833f = du5Var6;
                }
                return 0;
            case 5:
                gj3Var.f456834g = aVar2.g(intValue);
                return 0;
            case 6:
                gj3Var.f456835h = aVar2.g(intValue);
                return 0;
            case 7:
                gj3Var.f456836i = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var3.b(bArr4);
                    }
                    gj3Var.f456837m = cu5Var3;
                }
                return 0;
            case 9:
                gj3Var.f456838n = aVar2.i(intValue);
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
            r45.ie ieVar = this.f76492x92037252;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BaseResponse", ieVar, false);
            eVar.d(jSONObject, "MsgId", java.lang.Integer.valueOf(this.f456831d), false);
            eVar.d(jSONObject, "FromUserName", this.f456832e, false);
            eVar.d(jSONObject, "ToUserName", this.f456833f, false);
            eVar.d(jSONObject, "TotalLen", java.lang.Integer.valueOf(this.f456834g), false);
            eVar.d(jSONObject, "StartPos", java.lang.Integer.valueOf(this.f456835h), false);
            eVar.d(jSONObject, "DataLen", java.lang.Integer.valueOf(this.f456836i), false);
            eVar.d(jSONObject, "Data", this.f456837m, false);
            eVar.d(jSONObject, "NewMsgId", java.lang.Long.valueOf(this.f456838n), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
