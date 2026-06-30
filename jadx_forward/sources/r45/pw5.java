package r45;

/* loaded from: classes8.dex */
public class pw5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464965d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464966e;

    /* renamed from: f, reason: collision with root package name */
    public int f464967f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464968g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f464969h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f464970i;

    /* renamed from: m, reason: collision with root package name */
    public int f464971m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f464972n = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pw5)) {
            return false;
        }
        r45.pw5 pw5Var = (r45.pw5) fVar;
        return n51.f.a(this.f464965d, pw5Var.f464965d) && n51.f.a(this.f464966e, pw5Var.f464966e) && n51.f.a(java.lang.Integer.valueOf(this.f464967f), java.lang.Integer.valueOf(pw5Var.f464967f)) && n51.f.a(this.f464968g, pw5Var.f464968g) && n51.f.a(this.f464969h, pw5Var.f464969h) && n51.f.a(this.f464970i, pw5Var.f464970i) && n51.f.a(java.lang.Integer.valueOf(this.f464971m), java.lang.Integer.valueOf(pw5Var.f464971m)) && n51.f.a(this.f464972n, pw5Var.f464972n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f464972n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f464965d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f464966e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f464967f);
            java.lang.String str3 = this.f464968g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f464969h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f464970i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f464971m);
            fVar.g(8, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f464965d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f464966e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            int e17 = j17 + b36.f.e(3, this.f464967f);
            java.lang.String str8 = this.f464968g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f464969h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f464970i;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            return e17 + b36.f.e(7, this.f464971m) + b36.f.g(8, 8, linkedList);
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
        r45.pw5 pw5Var = (r45.pw5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pw5Var.f464965d = aVar2.k(intValue);
                return 0;
            case 2:
                pw5Var.f464966e = aVar2.k(intValue);
                return 0;
            case 3:
                pw5Var.f464967f = aVar2.g(intValue);
                return 0;
            case 4:
                pw5Var.f464968g = aVar2.k(intValue);
                return 0;
            case 5:
                pw5Var.f464969h = aVar2.k(intValue);
                return 0;
            case 6:
                pw5Var.f464970i = aVar2.k(intValue);
                return 0;
            case 7:
                pw5Var.f464971m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.qw5 qw5Var = new r45.qw5();
                    if (bArr2 != null && bArr2.length > 0) {
                        qw5Var.mo11468x92b714fd(bArr2);
                    }
                    pw5Var.f464972n.add(qw5Var);
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
            java.lang.String str = this.f464965d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Title", str, false);
            eVar.d(jSONObject, "Tid", this.f464966e, false);
            eVar.d(jSONObject, "FeedType", java.lang.Integer.valueOf(this.f464967f), false);
            eVar.d(jSONObject, "NickName", this.f464968g, false);
            eVar.d(jSONObject, "Avatar", this.f464969h, false);
            eVar.d(jSONObject, "NonceID", this.f464970i, false);
            eVar.d(jSONObject, "MediaCount", java.lang.Integer.valueOf(this.f464971m), false);
            eVar.d(jSONObject, "MediaList", this.f464972n, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
