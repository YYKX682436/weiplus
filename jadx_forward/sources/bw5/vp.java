package bw5;

/* loaded from: classes2.dex */
public class vp extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public bw5.sc f115975d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f115976e;

    /* renamed from: f, reason: collision with root package name */
    public float f115977f;

    /* renamed from: g, reason: collision with root package name */
    public float f115978g;

    /* renamed from: h, reason: collision with root package name */
    public int f115979h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.hd f115980i;

    /* renamed from: m, reason: collision with root package name */
    public long f115981m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f115982n;

    /* renamed from: o, reason: collision with root package name */
    public int f115983o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f115984p;

    /* renamed from: q, reason: collision with root package name */
    public int f115985q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f115986r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f115987s = new boolean[14];

    static {
        new bw5.vp();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vp)) {
            return false;
        }
        bw5.vp vpVar = (bw5.vp) fVar;
        return n51.f.a(this.f76494x2de60e5e, vpVar.f76494x2de60e5e) && n51.f.a(this.f115975d, vpVar.f115975d) && n51.f.a(this.f115976e, vpVar.f115976e) && n51.f.a(java.lang.Float.valueOf(this.f115977f), java.lang.Float.valueOf(vpVar.f115977f)) && n51.f.a(java.lang.Float.valueOf(this.f115978g), java.lang.Float.valueOf(vpVar.f115978g)) && n51.f.a(java.lang.Integer.valueOf(this.f115979h), java.lang.Integer.valueOf(vpVar.f115979h)) && n51.f.a(this.f115980i, vpVar.f115980i) && n51.f.a(java.lang.Long.valueOf(this.f115981m), java.lang.Long.valueOf(vpVar.f115981m)) && n51.f.a(this.f115982n, vpVar.f115982n) && n51.f.a(java.lang.Integer.valueOf(this.f115983o), java.lang.Integer.valueOf(vpVar.f115983o)) && n51.f.a(this.f115984p, vpVar.f115984p) && n51.f.a(java.lang.Integer.valueOf(this.f115985q), java.lang.Integer.valueOf(vpVar.f115985q)) && n51.f.a(this.f115986r, vpVar.f115986r);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: getBaseRequest */
    public r45.he mo11508xa452ad48() {
        return this.f115987s[1] ? this.f76494x2de60e5e : new r45.he();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.vp();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f115987s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            bw5.sc scVar = this.f115975d;
            if (scVar != null && zArr[2]) {
                fVar.i(2, scVar.mo75928xcd1e8d8());
                this.f115975d.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f115976e;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            if (zArr[4]) {
                fVar.d(4, this.f115977f);
            }
            if (zArr[5]) {
                fVar.d(5, this.f115978g);
            }
            if (zArr[6]) {
                fVar.e(6, this.f115979h);
            }
            bw5.hd hdVar = this.f115980i;
            if (hdVar != null && zArr[7]) {
                fVar.i(7, hdVar.mo75928xcd1e8d8());
                this.f115980i.mo75956x3d5d1f78(fVar);
            }
            if (zArr[8]) {
                fVar.h(8, this.f115981m);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f115982n;
            if (gVar2 != null && zArr[9]) {
                fVar.b(9, gVar2);
            }
            if (zArr[10]) {
                fVar.e(10, this.f115983o);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f115984p;
            if (gVar3 != null && zArr[11]) {
                fVar.b(11, gVar3);
            }
            if (zArr[12]) {
                fVar.e(12, this.f115985q);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f115986r;
            if (gVar4 == null || !zArr[13]) {
                return 0;
            }
            fVar.b(13, gVar4);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 == null || !zArr[1]) ? 0 : 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8());
            bw5.sc scVar2 = this.f115975d;
            if (scVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, scVar2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f115976e;
            if (gVar5 != null && zArr[3]) {
                i18 += b36.f.b(3, gVar5);
            }
            if (zArr[4]) {
                i18 += b36.f.d(4, this.f115977f);
            }
            if (zArr[5]) {
                i18 += b36.f.d(5, this.f115978g);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f115979h);
            }
            bw5.hd hdVar2 = this.f115980i;
            if (hdVar2 != null && zArr[7]) {
                i18 += b36.f.i(7, hdVar2.mo75928xcd1e8d8());
            }
            if (zArr[8]) {
                i18 += b36.f.h(8, this.f115981m);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f115982n;
            if (gVar6 != null && zArr[9]) {
                i18 += b36.f.b(9, gVar6);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f115983o);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar7 = this.f115984p;
            if (gVar7 != null && zArr[11]) {
                i18 += b36.f.b(11, gVar7);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f115985q);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar8 = this.f115986r;
            return (gVar8 == null || !zArr[13]) ? i18 : i18 + b36.f.b(13, gVar8);
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    this.f76494x2de60e5e = heVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.sc scVar3 = new bw5.sc();
                    if (bArr2 != null && bArr2.length > 0) {
                        scVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f115975d = scVar3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f115976e = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f115977f = aVar2.f(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f115978g = aVar2.f(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f115979h = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.hd hdVar3 = new bw5.hd();
                    if (bArr3 != null && bArr3.length > 0) {
                        hdVar3.mo11468x92b714fd(bArr3);
                    }
                    this.f115980i = hdVar3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f115981m = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f115982n = aVar2.d(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f115983o = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f115984p = aVar2.d(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f115985q = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f115986r = aVar2.d(intValue);
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.vp) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: setBaseRequest */
    public r45.my3 mo11509x3ab820bc(r45.he heVar) {
        this.f76494x2de60e5e = heVar;
        this.f115987s[1] = true;
        return this;
    }
}
