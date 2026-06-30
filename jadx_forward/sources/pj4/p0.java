package pj4;

/* loaded from: classes11.dex */
public class p0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f436769d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f436770e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f436771f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f436772g;

    /* renamed from: h, reason: collision with root package name */
    public int f436773h;

    /* renamed from: i, reason: collision with root package name */
    public int f436774i;

    /* renamed from: m, reason: collision with root package name */
    public int f436775m;

    /* renamed from: n, reason: collision with root package name */
    public int f436776n;

    /* renamed from: o, reason: collision with root package name */
    public int f436777o;

    /* renamed from: p, reason: collision with root package name */
    public int f436778p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f436779q;

    /* renamed from: r, reason: collision with root package name */
    public long f436780r;

    /* renamed from: s, reason: collision with root package name */
    public long f436781s;

    /* renamed from: t, reason: collision with root package name */
    public long f436782t;

    /* renamed from: u, reason: collision with root package name */
    public int f436783u;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.p0)) {
            return false;
        }
        pj4.p0 p0Var = (pj4.p0) fVar;
        return n51.f.a(this.f436769d, p0Var.f436769d) && n51.f.a(this.f436770e, p0Var.f436770e) && n51.f.a(this.f436771f, p0Var.f436771f) && n51.f.a(this.f436772g, p0Var.f436772g) && n51.f.a(java.lang.Integer.valueOf(this.f436773h), java.lang.Integer.valueOf(p0Var.f436773h)) && n51.f.a(java.lang.Integer.valueOf(this.f436774i), java.lang.Integer.valueOf(p0Var.f436774i)) && n51.f.a(java.lang.Integer.valueOf(this.f436775m), java.lang.Integer.valueOf(p0Var.f436775m)) && n51.f.a(java.lang.Integer.valueOf(this.f436776n), java.lang.Integer.valueOf(p0Var.f436776n)) && n51.f.a(java.lang.Integer.valueOf(this.f436777o), java.lang.Integer.valueOf(p0Var.f436777o)) && n51.f.a(java.lang.Integer.valueOf(this.f436778p), java.lang.Integer.valueOf(p0Var.f436778p)) && n51.f.a(this.f436779q, p0Var.f436779q) && n51.f.a(java.lang.Long.valueOf(this.f436780r), java.lang.Long.valueOf(p0Var.f436780r)) && n51.f.a(java.lang.Long.valueOf(this.f436781s), java.lang.Long.valueOf(p0Var.f436781s)) && n51.f.a(java.lang.Long.valueOf(this.f436782t), java.lang.Long.valueOf(p0Var.f436782t)) && n51.f.a(java.lang.Integer.valueOf(this.f436783u), java.lang.Integer.valueOf(p0Var.f436783u));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f436769d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f436770e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f436771f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f436772g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f436773h);
            fVar.e(6, this.f436774i);
            fVar.e(7, this.f436775m);
            fVar.e(8, this.f436776n);
            fVar.e(9, this.f436777o);
            fVar.e(10, this.f436778p);
            java.lang.String str5 = this.f436779q;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            fVar.h(12, this.f436780r);
            fVar.h(13, this.f436781s);
            fVar.h(14, this.f436782t);
            fVar.e(15, this.f436783u);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f436769d;
            int j17 = str6 != null ? b36.f.j(1, str6) + 0 : 0;
            java.lang.String str7 = this.f436770e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f436771f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f436772g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int e17 = j17 + b36.f.e(5, this.f436773h) + b36.f.e(6, this.f436774i) + b36.f.e(7, this.f436775m) + b36.f.e(8, this.f436776n) + b36.f.e(9, this.f436777o) + b36.f.e(10, this.f436778p);
            java.lang.String str10 = this.f436779q;
            if (str10 != null) {
                e17 += b36.f.j(11, str10);
            }
            return e17 + b36.f.h(12, this.f436780r) + b36.f.h(13, this.f436781s) + b36.f.h(14, this.f436782t) + b36.f.e(15, this.f436783u);
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
        pj4.p0 p0Var = (pj4.p0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                p0Var.f436769d = aVar2.k(intValue);
                return 0;
            case 2:
                p0Var.f436770e = aVar2.k(intValue);
                return 0;
            case 3:
                p0Var.f436771f = aVar2.k(intValue);
                return 0;
            case 4:
                p0Var.f436772g = aVar2.k(intValue);
                return 0;
            case 5:
                p0Var.f436773h = aVar2.g(intValue);
                return 0;
            case 6:
                p0Var.f436774i = aVar2.g(intValue);
                return 0;
            case 7:
                p0Var.f436775m = aVar2.g(intValue);
                return 0;
            case 8:
                p0Var.f436776n = aVar2.g(intValue);
                return 0;
            case 9:
                p0Var.f436777o = aVar2.g(intValue);
                return 0;
            case 10:
                p0Var.f436778p = aVar2.g(intValue);
                return 0;
            case 11:
                p0Var.f436779q = aVar2.k(intValue);
                return 0;
            case 12:
                p0Var.f436780r = aVar2.i(intValue);
                return 0;
            case 13:
                p0Var.f436781s = aVar2.i(intValue);
                return 0;
            case 14:
                p0Var.f436782t = aVar2.i(intValue);
                return 0;
            case 15:
                p0Var.f436783u = aVar2.g(intValue);
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
            java.lang.String str = this.f436769d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, str, false);
            eVar.d(jSONObject, dm.i4.f66875xa013b0d5, this.f436770e, false);
            eVar.d(jSONObject, "sourceExtraInfo", this.f436771f, false);
            eVar.d(jSONObject, "currLikeIcon", this.f436772g, false);
            eVar.d(jSONObject, "currSameFriCnt", java.lang.Integer.valueOf(this.f436773h), false);
            eVar.d(jSONObject, "currChattingCnt", java.lang.Integer.valueOf(this.f436774i), false);
            eVar.d(jSONObject, "currScene", java.lang.Integer.valueOf(this.f436775m), false);
            eVar.d(jSONObject, "newMsgNum", java.lang.Integer.valueOf(this.f436776n), false);
            eVar.d(jSONObject, "listPos", java.lang.Integer.valueOf(this.f436777o), false);
            eVar.d(jSONObject, "isInPullDownMode", java.lang.Integer.valueOf(this.f436778p), false);
            eVar.d(jSONObject, "sourceFeedId", this.f436779q, false);
            eVar.d(jSONObject, "broadcastDuration", java.lang.Long.valueOf(this.f436780r), false);
            eVar.d(jSONObject, "broadcastCycle", java.lang.Long.valueOf(this.f436781s), false);
            eVar.d(jSONObject, "sameFriendPageSource", java.lang.Long.valueOf(this.f436782t), false);
            eVar.d(jSONObject, "hasExpandFoldButton", java.lang.Integer.valueOf(this.f436783u), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
