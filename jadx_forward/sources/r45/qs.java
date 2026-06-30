package r45;

/* loaded from: classes4.dex */
public class qs extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465768d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465769e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465770f;

    /* renamed from: g, reason: collision with root package name */
    public int f465771g;

    /* renamed from: h, reason: collision with root package name */
    public long f465772h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f465773i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f465774m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f465775n;

    /* renamed from: o, reason: collision with root package name */
    public int f465776o;

    /* renamed from: p, reason: collision with root package name */
    public int f465777p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qs)) {
            return false;
        }
        r45.qs qsVar = (r45.qs) fVar;
        return n51.f.a(this.f76492x92037252, qsVar.f76492x92037252) && n51.f.a(this.f465768d, qsVar.f465768d) && n51.f.a(this.f465769e, qsVar.f465769e) && n51.f.a(this.f465770f, qsVar.f465770f) && n51.f.a(java.lang.Integer.valueOf(this.f465771g), java.lang.Integer.valueOf(qsVar.f465771g)) && n51.f.a(java.lang.Long.valueOf(this.f465772h), java.lang.Long.valueOf(qsVar.f465772h)) && n51.f.a(this.f465773i, qsVar.f465773i) && n51.f.a(this.f465774m, qsVar.f465774m) && n51.f.a(this.f465775n, qsVar.f465775n) && n51.f.a(java.lang.Integer.valueOf(this.f465776o), java.lang.Integer.valueOf(qsVar.f465776o)) && n51.f.a(java.lang.Integer.valueOf(this.f465777p), java.lang.Integer.valueOf(qsVar.f465777p));
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
            java.lang.String str = this.f465768d;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f465769e;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f465770f;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(9, this.f465771g);
            fVar.h(10, this.f465772h);
            java.lang.String str4 = this.f465773i;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            java.lang.String str5 = this.f465774m;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            java.lang.String str6 = this.f465775n;
            if (str6 != null) {
                fVar.j(13, str6);
            }
            fVar.e(14, this.f465776o);
            fVar.e(15, this.f465777p);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str7 = this.f465768d;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f465769e;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f465770f;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            int e17 = i18 + b36.f.e(9, this.f465771g) + b36.f.h(10, this.f465772h);
            java.lang.String str10 = this.f465773i;
            if (str10 != null) {
                e17 += b36.f.j(11, str10);
            }
            java.lang.String str11 = this.f465774m;
            if (str11 != null) {
                e17 += b36.f.j(12, str11);
            }
            java.lang.String str12 = this.f465775n;
            if (str12 != null) {
                e17 += b36.f.j(13, str12);
            }
            return e17 + b36.f.e(14, this.f465776o) + b36.f.e(15, this.f465777p);
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
        r45.qs qsVar = (r45.qs) objArr[1];
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
                qsVar.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 3) {
            qsVar.f465768d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            qsVar.f465769e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 5) {
            qsVar.f465770f = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 9:
                qsVar.f465771g = aVar2.g(intValue);
                return 0;
            case 10:
                qsVar.f465772h = aVar2.i(intValue);
                return 0;
            case 11:
                qsVar.f465773i = aVar2.k(intValue);
                return 0;
            case 12:
                qsVar.f465774m = aVar2.k(intValue);
                return 0;
            case 13:
                qsVar.f465775n = aVar2.k(intValue);
                return 0;
            case 14:
                qsVar.f465776o = aVar2.g(intValue);
                return 0;
            case 15:
                qsVar.f465777p = aVar2.g(intValue);
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
            eVar.d(jSONObject, "ClientImgId", this.f465768d, false);
            eVar.d(jSONObject, "FromUserName", this.f465769e, false);
            eVar.d(jSONObject, "ToUserName", this.f465770f, false);
            eVar.d(jSONObject, "CreateTime", java.lang.Integer.valueOf(this.f465771g), false);
            eVar.d(jSONObject, "NewMsgId", java.lang.Long.valueOf(this.f465772h), false);
            eVar.d(jSONObject, "AESKey", this.f465773i, false);
            eVar.d(jSONObject, "FileId", this.f465774m, false);
            eVar.d(jSONObject, "MsgSource", this.f465775n, false);
            eVar.d(jSONObject, "ActionFlag", java.lang.Integer.valueOf(this.f465776o), false);
            eVar.d(jSONObject, "NoCommit", java.lang.Integer.valueOf(this.f465777p), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
