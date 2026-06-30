package pj4;

/* loaded from: classes4.dex */
public class a0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f436490d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f436491e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f436492f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f436493g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f436494h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.a0)) {
            return false;
        }
        pj4.a0 a0Var = (pj4.a0) fVar;
        return n51.f.a(this.f436490d, a0Var.f436490d) && n51.f.a(this.f436491e, a0Var.f436491e) && n51.f.a(this.f436492f, a0Var.f436492f) && n51.f.a(java.lang.Boolean.valueOf(this.f436493g), java.lang.Boolean.valueOf(a0Var.f436493g)) && n51.f.a(java.lang.Boolean.valueOf(this.f436494h), java.lang.Boolean.valueOf(a0Var.f436494h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f436490d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f436491e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f436492f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.a(4, this.f436493g);
            fVar.a(5, this.f436494h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f436490d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f436491e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f436492f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.a(4, this.f436493g) + b36.f.a(5, this.f436494h);
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
        pj4.a0 a0Var = (pj4.a0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            a0Var.f436490d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            a0Var.f436491e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            a0Var.f436492f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            a0Var.f436493g = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        a0Var.f436494h = aVar2.c(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f436490d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "emojiMd5", str, false);
            eVar.d(jSONObject, "cdnUrl", this.f436491e, false);
            eVar.d(jSONObject, "emojiPath", this.f436492f, false);
            eVar.d(jSONObject, "isLoadedEmoji", java.lang.Boolean.valueOf(this.f436493g), false);
            eVar.d(jSONObject, "isNeedEmoji", java.lang.Boolean.valueOf(this.f436494h), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
