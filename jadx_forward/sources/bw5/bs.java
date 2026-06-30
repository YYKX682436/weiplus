package bw5;

/* loaded from: classes2.dex */
public class bs extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.pj f107346d;

    /* renamed from: e, reason: collision with root package name */
    public long f107347e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f107348f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f107349g;

    /* renamed from: h, reason: collision with root package name */
    public long f107350h;

    /* renamed from: i, reason: collision with root package name */
    public long f107351i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.pj f107352m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f107354o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f107355p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f107356q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f107357r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f107358s;

    /* renamed from: t, reason: collision with root package name */
    public int f107359t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f107360u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.hh0 f107361v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.as f107362w;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f107353n = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final boolean[] f107363x = new boolean[19];

    static {
        new bw5.bs();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.bs mo11468x92b714fd(byte[] bArr) {
        return (bw5.bs) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bs)) {
            return false;
        }
        bw5.bs bsVar = (bw5.bs) fVar;
        return n51.f.a(this.f107346d, bsVar.f107346d) && n51.f.a(java.lang.Long.valueOf(this.f107347e), java.lang.Long.valueOf(bsVar.f107347e)) && n51.f.a(this.f107348f, bsVar.f107348f) && n51.f.a(this.f107349g, bsVar.f107349g) && n51.f.a(java.lang.Long.valueOf(this.f107350h), java.lang.Long.valueOf(bsVar.f107350h)) && n51.f.a(java.lang.Long.valueOf(this.f107351i), java.lang.Long.valueOf(bsVar.f107351i)) && n51.f.a(this.f107352m, bsVar.f107352m) && n51.f.a(this.f107353n, bsVar.f107353n) && n51.f.a(this.f107354o, bsVar.f107354o) && n51.f.a(java.lang.Boolean.valueOf(this.f107355p), java.lang.Boolean.valueOf(bsVar.f107355p)) && n51.f.a(java.lang.Boolean.valueOf(this.f107356q), java.lang.Boolean.valueOf(bsVar.f107356q)) && n51.f.a(java.lang.Boolean.valueOf(this.f107357r), java.lang.Boolean.valueOf(bsVar.f107357r)) && n51.f.a(java.lang.Boolean.valueOf(this.f107358s), java.lang.Boolean.valueOf(bsVar.f107358s)) && n51.f.a(java.lang.Integer.valueOf(this.f107359t), java.lang.Integer.valueOf(bsVar.f107359t)) && n51.f.a(java.lang.Boolean.valueOf(this.f107360u), java.lang.Boolean.valueOf(bsVar.f107360u)) && n51.f.a(this.f107361v, bsVar.f107361v) && n51.f.a(this.f107362w, bsVar.f107362w);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.bs();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f107353n;
        int i18 = 0;
        boolean[] zArr = this.f107363x;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.pj pjVar = this.f107346d;
            if (pjVar != null && zArr[1]) {
                fVar.i(1, pjVar.mo75928xcd1e8d8());
                this.f107346d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.h(2, this.f107347e);
            }
            java.lang.String str = this.f107348f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f107349g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.h(5, this.f107350h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f107351i);
            }
            bw5.pj pjVar2 = this.f107352m;
            if (pjVar2 != null && zArr[7]) {
                fVar.i(7, pjVar2.mo75928xcd1e8d8());
                this.f107352m.mo75956x3d5d1f78(fVar);
            }
            fVar.g(8, 8, linkedList);
            java.lang.String str3 = this.f107354o;
            if (str3 != null && zArr[9]) {
                fVar.j(9, str3);
            }
            if (zArr[10]) {
                fVar.a(10, this.f107355p);
            }
            if (zArr[11]) {
                fVar.a(11, this.f107356q);
            }
            if (zArr[12]) {
                fVar.a(12, this.f107357r);
            }
            if (zArr[13]) {
                fVar.a(13, this.f107358s);
            }
            if (zArr[15]) {
                fVar.e(15, this.f107359t);
            }
            if (zArr[16]) {
                fVar.a(16, this.f107360u);
            }
            bw5.hh0 hh0Var = this.f107361v;
            if (hh0Var != null && zArr[17]) {
                fVar.i(17, hh0Var.mo75928xcd1e8d8());
                this.f107361v.mo75956x3d5d1f78(fVar);
            }
            bw5.as asVar = this.f107362w;
            if (asVar != null && zArr[18]) {
                fVar.i(18, asVar.mo75928xcd1e8d8());
                this.f107362w.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.pj pjVar3 = this.f107346d;
            if (pjVar3 != null && zArr[1]) {
                i18 = b36.f.i(1, pjVar3.mo75928xcd1e8d8()) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f107347e);
            }
            java.lang.String str4 = this.f107348f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f107349g;
            if (str5 != null && zArr[4]) {
                i18 += b36.f.j(4, str5);
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f107350h);
            }
            if (zArr[6]) {
                i18 += b36.f.h(6, this.f107351i);
            }
            bw5.pj pjVar4 = this.f107352m;
            if (pjVar4 != null && zArr[7]) {
                i18 += b36.f.i(7, pjVar4.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(8, 8, linkedList);
            java.lang.String str6 = this.f107354o;
            if (str6 != null && zArr[9]) {
                g17 += b36.f.j(9, str6);
            }
            if (zArr[10]) {
                g17 += b36.f.a(10, this.f107355p);
            }
            if (zArr[11]) {
                g17 += b36.f.a(11, this.f107356q);
            }
            if (zArr[12]) {
                g17 += b36.f.a(12, this.f107357r);
            }
            if (zArr[13]) {
                g17 += b36.f.a(13, this.f107358s);
            }
            if (zArr[15]) {
                g17 += b36.f.e(15, this.f107359t);
            }
            if (zArr[16]) {
                g17 += b36.f.a(16, this.f107360u);
            }
            bw5.hh0 hh0Var2 = this.f107361v;
            if (hh0Var2 != null && zArr[17]) {
                g17 += b36.f.i(17, hh0Var2.mo75928xcd1e8d8());
            }
            bw5.as asVar2 = this.f107362w;
            return (asVar2 == null || !zArr[18]) ? g17 : g17 + b36.f.i(18, asVar2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            linkedList.clear();
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
                    bw5.pj pjVar5 = new bw5.pj();
                    if (bArr != null && bArr.length > 0) {
                        pjVar5.mo11468x92b714fd(bArr);
                    }
                    this.f107346d = pjVar5;
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f107347e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f107348f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f107349g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f107350h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f107351i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.pj pjVar6 = new bw5.pj();
                    if (bArr2 != null && bArr2.length > 0) {
                        pjVar6.mo11468x92b714fd(bArr2);
                    }
                    this.f107352m = pjVar6;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.pj pjVar7 = new bw5.pj();
                    if (bArr3 != null && bArr3.length > 0) {
                        pjVar7.mo11468x92b714fd(bArr3);
                    }
                    linkedList.add(pjVar7);
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f107354o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f107355p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f107356q = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f107357r = aVar2.c(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f107358s = aVar2.c(intValue);
                zArr[13] = true;
                return 0;
            case 14:
            default:
                return -1;
            case 15:
                this.f107359t = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f107360u = aVar2.c(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.hh0 hh0Var3 = new bw5.hh0();
                    if (bArr4 != null && bArr4.length > 0) {
                        hh0Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f107361v = hh0Var3;
                }
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.as asVar3 = new bw5.as();
                    if (bArr5 != null && bArr5.length > 0) {
                        asVar3.mo11468x92b714fd(bArr5);
                    }
                    this.f107362w = asVar3;
                }
                zArr[18] = true;
                return 0;
        }
    }
}
