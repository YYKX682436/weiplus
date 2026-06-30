package r45;

/* loaded from: classes15.dex */
public class mn6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f462230d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f462231e;

    /* renamed from: f, reason: collision with root package name */
    public int f462232f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f462233g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f462234h;

    /* renamed from: i, reason: collision with root package name */
    public int f462235i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f462236m;

    /* renamed from: n, reason: collision with root package name */
    public int f462237n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f462238o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f462239p;

    /* renamed from: q, reason: collision with root package name */
    public int f462240q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mn6)) {
            return false;
        }
        r45.mn6 mn6Var = (r45.mn6) fVar;
        return n51.f.a(this.f462230d, mn6Var.f462230d) && n51.f.a(this.f462231e, mn6Var.f462231e) && n51.f.a(java.lang.Integer.valueOf(this.f462232f), java.lang.Integer.valueOf(mn6Var.f462232f)) && n51.f.a(this.f462233g, mn6Var.f462233g) && n51.f.a(this.f462234h, mn6Var.f462234h) && n51.f.a(java.lang.Integer.valueOf(this.f462235i), java.lang.Integer.valueOf(mn6Var.f462235i)) && n51.f.a(this.f462236m, mn6Var.f462236m) && n51.f.a(java.lang.Integer.valueOf(this.f462237n), java.lang.Integer.valueOf(mn6Var.f462237n)) && n51.f.a(this.f462238o, mn6Var.f462238o) && n51.f.a(this.f462239p, mn6Var.f462239p) && n51.f.a(java.lang.Integer.valueOf(this.f462240q), java.lang.Integer.valueOf(mn6Var.f462240q));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f462230d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f462231e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f462232f);
            java.lang.String str3 = this.f462233g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f462234h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f462235i);
            java.lang.String str5 = this.f462236m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f462237n);
            java.lang.String str6 = this.f462238o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f462239p;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            fVar.e(11, this.f462240q);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f462230d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f462231e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            int e17 = j17 + b36.f.e(3, this.f462232f);
            java.lang.String str10 = this.f462233g;
            if (str10 != null) {
                e17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f462234h;
            if (str11 != null) {
                e17 += b36.f.j(5, str11);
            }
            int e18 = e17 + b36.f.e(6, this.f462235i);
            java.lang.String str12 = this.f462236m;
            if (str12 != null) {
                e18 += b36.f.j(7, str12);
            }
            int e19 = e18 + b36.f.e(8, this.f462237n);
            java.lang.String str13 = this.f462238o;
            if (str13 != null) {
                e19 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f462239p;
            if (str14 != null) {
                e19 += b36.f.j(10, str14);
            }
            return e19 + b36.f.e(11, this.f462240q);
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
        r45.mn6 mn6Var = (r45.mn6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                mn6Var.f462230d = aVar2.k(intValue);
                return 0;
            case 2:
                mn6Var.f462231e = aVar2.k(intValue);
                return 0;
            case 3:
                mn6Var.f462232f = aVar2.g(intValue);
                return 0;
            case 4:
                mn6Var.f462233g = aVar2.k(intValue);
                return 0;
            case 5:
                mn6Var.f462234h = aVar2.k(intValue);
                return 0;
            case 6:
                mn6Var.f462235i = aVar2.g(intValue);
                return 0;
            case 7:
                mn6Var.f462236m = aVar2.k(intValue);
                return 0;
            case 8:
                mn6Var.f462237n = aVar2.g(intValue);
                return 0;
            case 9:
                mn6Var.f462238o = aVar2.k(intValue);
                return 0;
            case 10:
                mn6Var.f462239p = aVar2.k(intValue);
                return 0;
            case 11:
                mn6Var.f462240q = aVar2.g(intValue);
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
            java.lang.String str = this.f462230d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "DocId", str, false);
            eVar.d(jSONObject, "CommentId", this.f462231e, false);
            eVar.d(jSONObject, "OpType", java.lang.Integer.valueOf(this.f462232f), false);
            eVar.d(jSONObject, "RequestId", this.f462233g, false);
            eVar.d(jSONObject, "Content", this.f462234h, false);
            eVar.d(jSONObject, "Scene", java.lang.Integer.valueOf(this.f462235i), false);
            eVar.d(jSONObject, "SearchId", this.f462236m, false);
            eVar.d(jSONObject, "SubScene", java.lang.Integer.valueOf(this.f462237n), false);
            eVar.d(jSONObject, "Vid", this.f462238o, false);
            eVar.d(jSONObject, "ByPass", this.f462239p, false);
            eVar.d(jSONObject, "Source", java.lang.Integer.valueOf(this.f462240q), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
