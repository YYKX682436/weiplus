package bw5;

/* loaded from: classes4.dex */
public class yv extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f117240d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f117241e;

    /* renamed from: f, reason: collision with root package name */
    public int f117242f;

    /* renamed from: g, reason: collision with root package name */
    public int f117243g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f117244h;

    /* renamed from: i, reason: collision with root package name */
    public int f117245i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f117246m;

    /* renamed from: n, reason: collision with root package name */
    public int f117247n;

    /* renamed from: o, reason: collision with root package name */
    public int f117248o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f117249p = new boolean[10];

    static {
        new bw5.yv();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.yv mo11468x92b714fd(byte[] bArr) {
        return (bw5.yv) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yv)) {
            return false;
        }
        bw5.yv yvVar = (bw5.yv) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f117240d), java.lang.Integer.valueOf(yvVar.f117240d)) && n51.f.a(this.f117241e, yvVar.f117241e) && n51.f.a(java.lang.Integer.valueOf(this.f117242f), java.lang.Integer.valueOf(yvVar.f117242f)) && n51.f.a(java.lang.Integer.valueOf(this.f117243g), java.lang.Integer.valueOf(yvVar.f117243g)) && n51.f.a(this.f117244h, yvVar.f117244h) && n51.f.a(java.lang.Integer.valueOf(this.f117245i), java.lang.Integer.valueOf(yvVar.f117245i)) && n51.f.a(this.f117246m, yvVar.f117246m) && n51.f.a(java.lang.Integer.valueOf(this.f117247n), java.lang.Integer.valueOf(yvVar.f117247n)) && n51.f.a(java.lang.Integer.valueOf(this.f117248o), java.lang.Integer.valueOf(yvVar.f117248o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.yv();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f117249p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f117240d);
            }
            java.lang.String str = this.f117241e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f117242f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f117243g);
            }
            java.lang.String str2 = this.f117244h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            if (zArr[6]) {
                fVar.e(6, this.f117245i);
            }
            java.lang.String str3 = this.f117246m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            if (zArr[8]) {
                fVar.e(8, this.f117247n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f117248o);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f117240d) : 0;
            java.lang.String str4 = this.f117241e;
            if (str4 != null && zArr[2]) {
                e17 += b36.f.j(2, str4);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f117242f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f117243g);
            }
            java.lang.String str5 = this.f117244h;
            if (str5 != null && zArr[5]) {
                e17 += b36.f.j(5, str5);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f117245i);
            }
            java.lang.String str6 = this.f117246m;
            if (str6 != null && zArr[7]) {
                e17 += b36.f.j(7, str6);
            }
            if (zArr[8]) {
                e17 += b36.f.e(8, this.f117247n);
            }
            return zArr[9] ? e17 + b36.f.e(9, this.f117248o) : e17;
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f117240d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f117241e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f117242f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f117243g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f117244h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f117245i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f117246m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f117247n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f117248o = aVar2.g(intValue);
                zArr[9] = true;
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
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f117240d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "type", valueOf, false);
            eVar.d(jSONObject, "img_url", this.f117241e, false);
            eVar.d(jSONObject, "img_height", java.lang.Integer.valueOf(this.f117242f), false);
            eVar.d(jSONObject, "img_width", java.lang.Integer.valueOf(this.f117243g), false);
            eVar.d(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, this.f117244h, false);
            eVar.d(jSONObject, "text_font_size", java.lang.Integer.valueOf(this.f117245i), false);
            eVar.d(jSONObject, "text_color", this.f117246m, false);
            eVar.d(jSONObject, "space", java.lang.Integer.valueOf(this.f117247n), false);
            eVar.d(jSONObject, "position", java.lang.Integer.valueOf(this.f117248o), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
