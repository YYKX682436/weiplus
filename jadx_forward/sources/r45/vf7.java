package r45;

/* loaded from: classes4.dex */
public class vf7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469726d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469727e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469728f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f469729g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vf7)) {
            return false;
        }
        r45.vf7 vf7Var = (r45.vf7) fVar;
        return n51.f.a(this.f469726d, vf7Var.f469726d) && n51.f.a(this.f469727e, vf7Var.f469727e) && n51.f.a(this.f469728f, vf7Var.f469728f) && n51.f.a(this.f469729g, vf7Var.f469729g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f469729g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f469726d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f469727e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f469728f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f469726d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f469727e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f469728f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.g(4, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.vf7 vf7Var = (r45.vf7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            vf7Var.f469726d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            vf7Var.f469727e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            vf7Var.f469728f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.kv5 kv5Var = new r45.kv5();
            if (bArr2 != null && bArr2.length > 0) {
                kv5Var.mo11468x92b714fd(bArr2);
            }
            vf7Var.f469729g.add(kv5Var);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f469726d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "appid", str, false);
            eVar.d(jSONObject, "nick_name", this.f469727e, false);
            eVar.d(jSONObject, "icon_url", this.f469728f, false);
            eVar.d(jSONObject, "scope_item_list", this.f469729g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
