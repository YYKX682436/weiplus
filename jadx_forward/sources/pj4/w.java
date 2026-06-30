package pj4;

/* loaded from: classes7.dex */
public class w extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f436844d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f436845e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f436846f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f436847g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f436848h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f436849i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.w)) {
            return false;
        }
        pj4.w wVar = (pj4.w) fVar;
        return n51.f.a(this.f436844d, wVar.f436844d) && n51.f.a(this.f436845e, wVar.f436845e) && n51.f.a(this.f436846f, wVar.f436846f) && n51.f.a(this.f436847g, wVar.f436847g) && n51.f.a(this.f436848h, wVar.f436848h) && n51.f.a(this.f436849i, wVar.f436849i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f436844d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f436845e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f436846f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f436847g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f436848h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f436849i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f436844d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f436845e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f436846f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f436847g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f436848h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f436849i;
            return str12 != null ? j17 + b36.f.j(6, str12) : j17;
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
        pj4.w wVar = (pj4.w) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                wVar.f436844d = aVar2.k(intValue);
                return 0;
            case 2:
                wVar.f436845e = aVar2.k(intValue);
                return 0;
            case 3:
                wVar.f436846f = aVar2.k(intValue);
                return 0;
            case 4:
                wVar.f436847g = aVar2.k(intValue);
                return 0;
            case 5:
                wVar.f436848h = aVar2.k(intValue);
                return 0;
            case 6:
                wVar.f436849i = aVar2.k(intValue);
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
            java.lang.String str = this.f436844d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "statusDesc", str, false);
            eVar.d(jSONObject, "statusIconId", this.f436845e, false);
            eVar.d(jSONObject, "sourceJumpType", this.f436846f, false);
            eVar.d(jSONObject, "sourceWeAppUserName", this.f436847g, false);
            eVar.d(jSONObject, "sourceWeAppPagePath", this.f436848h, false);
            eVar.d(jSONObject, "sourceH5Url", this.f436849i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
