package r45;

/* loaded from: classes2.dex */
public class n77 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public double f462675d;

    /* renamed from: e, reason: collision with root package name */
    public double f462676e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f462677f;

    /* renamed from: g, reason: collision with root package name */
    public int f462678g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f462679h;

    /* renamed from: i, reason: collision with root package name */
    public int f462680i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f462681m = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n77)) {
            return false;
        }
        r45.n77 n77Var = (r45.n77) fVar;
        return n51.f.a(this.f76494x2de60e5e, n77Var.f76494x2de60e5e) && n51.f.a(java.lang.Double.valueOf(this.f462675d), java.lang.Double.valueOf(n77Var.f462675d)) && n51.f.a(java.lang.Double.valueOf(this.f462676e), java.lang.Double.valueOf(n77Var.f462676e)) && n51.f.a(this.f462677f, n77Var.f462677f) && n51.f.a(java.lang.Integer.valueOf(this.f462678g), java.lang.Integer.valueOf(n77Var.f462678g)) && n51.f.a(this.f462679h, n77Var.f462679h) && n51.f.a(java.lang.Integer.valueOf(this.f462680i), java.lang.Integer.valueOf(n77Var.f462680i)) && n51.f.a(this.f462681m, n77Var.f462681m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.c(2, this.f462675d);
            fVar.c(3, this.f462676e);
            java.lang.String str = this.f462677f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f462678g);
            java.lang.String str2 = this.f462679h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f462680i);
            fVar.g(8, 8, this.f462681m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.c(2, this.f462675d) + b36.f.c(3, this.f462676e);
            java.lang.String str3 = this.f462677f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            int e17 = i18 + b36.f.e(5, this.f462678g);
            java.lang.String str4 = this.f462679h;
            if (str4 != null) {
                e17 += b36.f.j(6, str4);
            }
            return e17 + b36.f.e(7, this.f462680i) + b36.f.g(8, 8, this.f462681m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f462681m.clear();
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
        r45.n77 n77Var = (r45.n77) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    n77Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                n77Var.f462675d = aVar2.e(intValue);
                return 0;
            case 3:
                n77Var.f462676e = aVar2.e(intValue);
                return 0;
            case 4:
                n77Var.f462677f = aVar2.k(intValue);
                return 0;
            case 5:
                n77Var.f462678g = aVar2.g(intValue);
                return 0;
            case 6:
                n77Var.f462679h = aVar2.k(intValue);
                return 0;
            case 7:
                n77Var.f462680i = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.tw6 tw6Var = new r45.tw6();
                    if (bArr3 != null && bArr3.length > 0) {
                        tw6Var.mo11468x92b714fd(bArr3);
                    }
                    n77Var.f462681m.add(tw6Var);
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
            r45.he heVar = this.f76494x2de60e5e;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BaseRequest", heVar, false);
            eVar.d(jSONObject, "locationX", java.lang.Double.valueOf(this.f462675d), false);
            eVar.d(jSONObject, "locationY", java.lang.Double.valueOf(this.f462676e), false);
            eVar.d(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54533x39493ff5, this.f462677f, false);
            eVar.d(jSONObject, "h5Version", java.lang.Integer.valueOf(this.f462678g), false);
            eVar.d(jSONObject, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, this.f462679h, false);
            eVar.d(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f462680i), false);
            eVar.d(jSONObject, "ExtReqParams", this.f462681m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
