package r45;

/* loaded from: classes2.dex */
public class gu5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f457065d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457066e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f457067f;

    /* renamed from: g, reason: collision with root package name */
    public int f457068g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gu5)) {
            return false;
        }
        r45.gu5 gu5Var = (r45.gu5) fVar;
        return n51.f.a(this.f457065d, gu5Var.f457065d) && n51.f.a(this.f457066e, gu5Var.f457066e) && n51.f.a(this.f457067f, gu5Var.f457067f) && n51.f.a(java.lang.Integer.valueOf(this.f457068g), java.lang.Integer.valueOf(gu5Var.f457068g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f457065d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f457066e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f457067f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f457068g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f457065d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f457066e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f457067f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.f457068g);
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
        r45.gu5 gu5Var = (r45.gu5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gu5Var.f457065d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            gu5Var.f457066e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            gu5Var.f457067f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        gu5Var.f457068g = aVar2.g(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f457065d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Name", str, false);
            eVar.d(jSONObject, "Uuid", this.f457066e, false);
            eVar.d(jSONObject, "DeviceType", this.f457067f, false);
            eVar.d(jSONObject, "CreateTime", java.lang.Integer.valueOf(this.f457068g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
