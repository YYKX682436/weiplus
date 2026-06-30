package r45;

/* loaded from: classes12.dex */
public class jj6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ew4 f459416d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f459417e;

    /* renamed from: f, reason: collision with root package name */
    public int f459418f;

    /* renamed from: g, reason: collision with root package name */
    public int f459419g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f459420h;

    /* renamed from: i, reason: collision with root package name */
    public int f459421i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f459422m;

    /* renamed from: n, reason: collision with root package name */
    public int f459423n;

    /* renamed from: o, reason: collision with root package name */
    public int f459424o;

    /* renamed from: p, reason: collision with root package name */
    public long f459425p;

    /* renamed from: q, reason: collision with root package name */
    public r45.cx4 f459426q;

    /* renamed from: r, reason: collision with root package name */
    public int f459427r;

    /* renamed from: s, reason: collision with root package name */
    public int f459428s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jj6)) {
            return false;
        }
        r45.jj6 jj6Var = (r45.jj6) fVar;
        return n51.f.a(this.f459416d, jj6Var.f459416d) && n51.f.a(java.lang.Boolean.valueOf(this.f459417e), java.lang.Boolean.valueOf(jj6Var.f459417e)) && n51.f.a(java.lang.Integer.valueOf(this.f459418f), java.lang.Integer.valueOf(jj6Var.f459418f)) && n51.f.a(java.lang.Integer.valueOf(this.f459419g), java.lang.Integer.valueOf(jj6Var.f459419g)) && n51.f.a(java.lang.Boolean.valueOf(this.f459420h), java.lang.Boolean.valueOf(jj6Var.f459420h)) && n51.f.a(java.lang.Integer.valueOf(this.f459421i), java.lang.Integer.valueOf(jj6Var.f459421i)) && n51.f.a(this.f459422m, jj6Var.f459422m) && n51.f.a(java.lang.Integer.valueOf(this.f459423n), java.lang.Integer.valueOf(jj6Var.f459423n)) && n51.f.a(java.lang.Integer.valueOf(this.f459424o), java.lang.Integer.valueOf(jj6Var.f459424o)) && n51.f.a(java.lang.Long.valueOf(this.f459425p), java.lang.Long.valueOf(jj6Var.f459425p)) && n51.f.a(this.f459426q, jj6Var.f459426q) && n51.f.a(java.lang.Integer.valueOf(this.f459427r), java.lang.Integer.valueOf(jj6Var.f459427r)) && n51.f.a(java.lang.Integer.valueOf(this.f459428s), java.lang.Integer.valueOf(jj6Var.f459428s));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ew4 ew4Var = this.f459416d;
            if (ew4Var != null) {
                fVar.i(1, ew4Var.mo75928xcd1e8d8());
                this.f459416d.mo75956x3d5d1f78(fVar);
            }
            fVar.a(2, this.f459417e);
            fVar.e(3, this.f459418f);
            fVar.e(4, this.f459419g);
            fVar.a(5, this.f459420h);
            fVar.e(6, this.f459421i);
            java.lang.String str = this.f459422m;
            if (str != null) {
                fVar.j(7, str);
            }
            fVar.e(8, this.f459423n);
            fVar.e(9, this.f459424o);
            fVar.h(10, this.f459425p);
            r45.cx4 cx4Var = this.f459426q;
            if (cx4Var != null) {
                fVar.i(11, cx4Var.mo75928xcd1e8d8());
                this.f459426q.mo75956x3d5d1f78(fVar);
            }
            fVar.e(12, this.f459427r);
            fVar.e(13, this.f459428s);
            return 0;
        }
        if (i17 == 1) {
            r45.ew4 ew4Var2 = this.f459416d;
            int i18 = (ew4Var2 != null ? 0 + b36.f.i(1, ew4Var2.mo75928xcd1e8d8()) : 0) + b36.f.a(2, this.f459417e) + b36.f.e(3, this.f459418f) + b36.f.e(4, this.f459419g) + b36.f.a(5, this.f459420h) + b36.f.e(6, this.f459421i);
            java.lang.String str2 = this.f459422m;
            if (str2 != null) {
                i18 += b36.f.j(7, str2);
            }
            int e17 = i18 + b36.f.e(8, this.f459423n) + b36.f.e(9, this.f459424o) + b36.f.h(10, this.f459425p);
            r45.cx4 cx4Var2 = this.f459426q;
            if (cx4Var2 != null) {
                e17 += b36.f.i(11, cx4Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(12, this.f459427r) + b36.f.e(13, this.f459428s);
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
        r45.jj6 jj6Var = (r45.jj6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ew4 ew4Var3 = new r45.ew4();
                    if (bArr != null && bArr.length > 0) {
                        ew4Var3.mo11468x92b714fd(bArr);
                    }
                    jj6Var.f459416d = ew4Var3;
                }
                return 0;
            case 2:
                jj6Var.f459417e = aVar2.c(intValue);
                return 0;
            case 3:
                jj6Var.f459418f = aVar2.g(intValue);
                return 0;
            case 4:
                jj6Var.f459419g = aVar2.g(intValue);
                return 0;
            case 5:
                jj6Var.f459420h = aVar2.c(intValue);
                return 0;
            case 6:
                jj6Var.f459421i = aVar2.g(intValue);
                return 0;
            case 7:
                jj6Var.f459422m = aVar2.k(intValue);
                return 0;
            case 8:
                jj6Var.f459423n = aVar2.g(intValue);
                return 0;
            case 9:
                jj6Var.f459424o = aVar2.g(intValue);
                return 0;
            case 10:
                jj6Var.f459425p = aVar2.i(intValue);
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cx4 cx4Var3 = new r45.cx4();
                    if (bArr2 != null && bArr2.length > 0) {
                        cx4Var3.mo11468x92b714fd(bArr2);
                    }
                    jj6Var.f459426q = cx4Var3;
                }
                return 0;
            case 12:
                jj6Var.f459427r = aVar2.g(intValue);
                return 0;
            case 13:
                jj6Var.f459428s = aVar2.g(intValue);
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
            r45.ew4 ew4Var = this.f459416d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "response", ew4Var, false);
            eVar.d(jSONObject, "shouldMergeKeyBuf", java.lang.Boolean.valueOf(this.f459417e), false);
            eVar.d(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f459418f), false);
            eVar.d(jSONObject, "selector", java.lang.Integer.valueOf(this.f459419g), false);
            eVar.d(jSONObject, "isContinue", java.lang.Boolean.valueOf(this.f459420h), false);
            eVar.d(jSONObject, "minSyncHashCode", java.lang.Integer.valueOf(this.f459421i), false);
            eVar.d(jSONObject, "dataId", this.f459422m, false);
            eVar.d(jSONObject, "dataType", java.lang.Integer.valueOf(this.f459423n), false);
            eVar.d(jSONObject, "pushSyncFlag", java.lang.Integer.valueOf(this.f459424o), false);
            eVar.d(jSONObject, "recvTime", java.lang.Long.valueOf(this.f459425p), false);
            eVar.d(jSONObject, "notifySource", this.f459426q, false);
            eVar.d(jSONObject, "lightPushIndex", java.lang.Integer.valueOf(this.f459427r), false);
            eVar.d(jSONObject, "contSyncCnt", java.lang.Integer.valueOf(this.f459428s), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
