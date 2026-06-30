package r45;

/* loaded from: classes8.dex */
public class xi0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f471648d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f471649e;

    /* renamed from: f, reason: collision with root package name */
    public int f471650f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f471651g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f471652h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f471653i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f471654m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f471655n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f471656o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f471657p;

    /* renamed from: q, reason: collision with root package name */
    public int f471658q;

    /* renamed from: r, reason: collision with root package name */
    public int f471659r;

    /* renamed from: s, reason: collision with root package name */
    public int f471660s;

    /* renamed from: t, reason: collision with root package name */
    public int f471661t;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xi0)) {
            return false;
        }
        r45.xi0 xi0Var = (r45.xi0) fVar;
        return n51.f.a(this.f471648d, xi0Var.f471648d) && n51.f.a(this.f471649e, xi0Var.f471649e) && n51.f.a(java.lang.Integer.valueOf(this.f471650f), java.lang.Integer.valueOf(xi0Var.f471650f)) && n51.f.a(this.f471651g, xi0Var.f471651g) && n51.f.a(this.f471652h, xi0Var.f471652h) && n51.f.a(this.f471653i, xi0Var.f471653i) && n51.f.a(this.f471654m, xi0Var.f471654m) && n51.f.a(this.f471655n, xi0Var.f471655n) && n51.f.a(this.f471656o, xi0Var.f471656o) && n51.f.a(this.f471657p, xi0Var.f471657p) && n51.f.a(java.lang.Integer.valueOf(this.f471658q), java.lang.Integer.valueOf(xi0Var.f471658q)) && n51.f.a(java.lang.Integer.valueOf(this.f471659r), java.lang.Integer.valueOf(xi0Var.f471659r)) && n51.f.a(java.lang.Integer.valueOf(this.f471660s), java.lang.Integer.valueOf(xi0Var.f471660s)) && n51.f.a(java.lang.Integer.valueOf(this.f471661t), java.lang.Integer.valueOf(xi0Var.f471661t));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f471654m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f471648d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f471649e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f471650f);
            java.lang.String str3 = this.f471651g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f471652h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f471653i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.g(7, 8, linkedList);
            java.lang.String str6 = this.f471655n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f471656o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f471657p;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            fVar.e(11, this.f471658q);
            fVar.e(12, this.f471659r);
            fVar.e(13, this.f471660s);
            fVar.e(14, this.f471661t);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f471648d;
            int j17 = str9 != null ? b36.f.j(1, str9) + 0 : 0;
            java.lang.String str10 = this.f471649e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            int e17 = j17 + b36.f.e(3, this.f471650f);
            java.lang.String str11 = this.f471651g;
            if (str11 != null) {
                e17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f471652h;
            if (str12 != null) {
                e17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f471653i;
            if (str13 != null) {
                e17 += b36.f.j(6, str13);
            }
            int g17 = e17 + b36.f.g(7, 8, linkedList);
            java.lang.String str14 = this.f471655n;
            if (str14 != null) {
                g17 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f471656o;
            if (str15 != null) {
                g17 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f471657p;
            if (str16 != null) {
                g17 += b36.f.j(10, str16);
            }
            return g17 + b36.f.e(11, this.f471658q) + b36.f.e(12, this.f471659r) + b36.f.e(13, this.f471660s) + b36.f.e(14, this.f471661t);
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
        r45.xi0 xi0Var = (r45.xi0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xi0Var.f471648d = aVar2.k(intValue);
                return 0;
            case 2:
                xi0Var.f471649e = aVar2.k(intValue);
                return 0;
            case 3:
                xi0Var.f471650f = aVar2.g(intValue);
                return 0;
            case 4:
                xi0Var.f471651g = aVar2.k(intValue);
                return 0;
            case 5:
                xi0Var.f471652h = aVar2.k(intValue);
                return 0;
            case 6:
                xi0Var.f471653i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.x50 x50Var = new r45.x50();
                    if (bArr2 != null && bArr2.length > 0) {
                        x50Var.mo11468x92b714fd(bArr2);
                    }
                    xi0Var.f471654m.add(x50Var);
                }
                return 0;
            case 8:
                xi0Var.f471655n = aVar2.k(intValue);
                return 0;
            case 9:
                xi0Var.f471656o = aVar2.k(intValue);
                return 0;
            case 10:
                xi0Var.f471657p = aVar2.k(intValue);
                return 0;
            case 11:
                xi0Var.f471658q = aVar2.g(intValue);
                return 0;
            case 12:
                xi0Var.f471659r = aVar2.g(intValue);
                return 0;
            case 13:
                xi0Var.f471660s = aVar2.g(intValue);
                return 0;
            case 14:
                xi0Var.f471661t = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public org.json.JSONObject mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f471648d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "searchId", str, false);
            eVar.d(jSONObject, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, this.f471649e, false);
            eVar.d(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f471650f), false);
            eVar.d(jSONObject, "url", this.f471651g, false);
            eVar.d(jSONObject, "requestId", this.f471652h, false);
            eVar.d(jSONObject, "keyword", this.f471653i, false);
            eVar.d(jSONObject, "extReqParams", this.f471654m, false);
            eVar.d(jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, this.f471655n, false);
            eVar.d(jSONObject, "talker", this.f471656o, false);
            eVar.d(jSONObject, "toSendText", this.f471657p, false);
            eVar.d(jSONObject, "enterScene", java.lang.Integer.valueOf(this.f471658q), false);
            eVar.d(jSONObject, "needShowKeyboard", java.lang.Integer.valueOf(this.f471659r), false);
            eVar.d(jSONObject, "forceDarkMode", java.lang.Integer.valueOf(this.f471660s), false);
            eVar.d(jSONObject, "hideJumpMoreEntrance", java.lang.Integer.valueOf(this.f471661t), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
