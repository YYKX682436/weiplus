package pj4;

/* loaded from: classes4.dex */
public class p extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f436766d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f436767e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f436768f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.p)) {
            return false;
        }
        pj4.p pVar = (pj4.p) fVar;
        return n51.f.a(this.f76492x92037252, pVar.f76492x92037252) && n51.f.a(this.f436766d, pVar.f436766d) && n51.f.a(this.f436767e, pVar.f436767e) && n51.f.a(this.f436768f, pVar.f436768f);
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
            java.lang.String str = this.f436766d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f436767e;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f436768f;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f436766d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f436767e;
            if (str5 != null) {
                i18 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f436768f;
            return str6 != null ? i18 + b36.f.j(6, str6) : i18;
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
        pj4.p pVar = (pj4.p) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                pVar.f436766d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 5) {
                pVar.f436767e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 6) {
                return -1;
            }
            pVar.f436768f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.ie ieVar3 = new r45.ie();
            if (bArr != null && bArr.length > 0) {
                ieVar3.mo11468x92b714fd(bArr);
            }
            pVar.f76492x92037252 = ieVar3;
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
            eVar.d(jSONObject, "text_status_id", this.f436766d, false);
            eVar.d(jSONObject, "text_status_ext_info", this.f436767e, false);
            eVar.d(jSONObject, "private_info", this.f436768f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
