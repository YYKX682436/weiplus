package bw5;

/* loaded from: classes2.dex */
public class x30 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f116472d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f116473e;

    /* renamed from: f, reason: collision with root package name */
    public int f116474f;

    /* renamed from: g, reason: collision with root package name */
    public int f116475g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f116476h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f116477i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f116478m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f116479n;

    /* renamed from: o, reason: collision with root package name */
    public long f116480o;

    /* renamed from: p, reason: collision with root package name */
    public long f116481p;

    /* renamed from: q, reason: collision with root package name */
    public long f116482q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f116483r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f116484s = new boolean[13];

    static {
        new bw5.x30();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.x30 mo11468x92b714fd(byte[] bArr) {
        return (bw5.x30) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.x30)) {
            return false;
        }
        bw5.x30 x30Var = (bw5.x30) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f116472d), java.lang.Integer.valueOf(x30Var.f116472d)) && n51.f.a(this.f116473e, x30Var.f116473e) && n51.f.a(java.lang.Integer.valueOf(this.f116474f), java.lang.Integer.valueOf(x30Var.f116474f)) && n51.f.a(java.lang.Integer.valueOf(this.f116475g), java.lang.Integer.valueOf(x30Var.f116475g)) && n51.f.a(this.f116476h, x30Var.f116476h) && n51.f.a(this.f116477i, x30Var.f116477i) && n51.f.a(this.f116478m, x30Var.f116478m) && n51.f.a(this.f116479n, x30Var.f116479n) && n51.f.a(java.lang.Long.valueOf(this.f116480o), java.lang.Long.valueOf(x30Var.f116480o)) && n51.f.a(java.lang.Long.valueOf(this.f116481p), java.lang.Long.valueOf(x30Var.f116481p)) && n51.f.a(java.lang.Long.valueOf(this.f116482q), java.lang.Long.valueOf(x30Var.f116482q)) && n51.f.a(this.f116483r, x30Var.f116483r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.x30();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f116484s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f116472d);
            }
            java.lang.String str = this.f116473e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f116474f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f116475g);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f116476h;
            if (gVar != null && zArr[5]) {
                fVar.b(5, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f116477i;
            if (gVar2 != null && zArr[6]) {
                fVar.b(6, gVar2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f116478m;
            if (gVar3 != null && zArr[7]) {
                fVar.b(7, gVar3);
            }
            java.lang.String str2 = this.f116479n;
            if (str2 != null && zArr[8]) {
                fVar.j(8, str2);
            }
            if (zArr[9]) {
                fVar.h(9, this.f116480o);
            }
            if (zArr[10]) {
                fVar.h(10, this.f116481p);
            }
            if (zArr[11]) {
                fVar.h(11, this.f116482q);
            }
            java.lang.String str3 = this.f116483r;
            if (str3 == null || !zArr[12]) {
                return 0;
            }
            fVar.j(12, str3);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f116472d) : 0;
            java.lang.String str4 = this.f116473e;
            if (str4 != null && zArr[2]) {
                e17 += b36.f.j(2, str4);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f116474f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f116475g);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f116476h;
            if (gVar4 != null && zArr[5]) {
                e17 += b36.f.b(5, gVar4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f116477i;
            if (gVar5 != null && zArr[6]) {
                e17 += b36.f.b(6, gVar5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f116478m;
            if (gVar6 != null && zArr[7]) {
                e17 += b36.f.b(7, gVar6);
            }
            java.lang.String str5 = this.f116479n;
            if (str5 != null && zArr[8]) {
                e17 += b36.f.j(8, str5);
            }
            if (zArr[9]) {
                e17 += b36.f.h(9, this.f116480o);
            }
            if (zArr[10]) {
                e17 += b36.f.h(10, this.f116481p);
            }
            if (zArr[11]) {
                e17 += b36.f.h(11, this.f116482q);
            }
            java.lang.String str6 = this.f116483r;
            return (str6 == null || !zArr[12]) ? e17 : e17 + b36.f.j(12, str6);
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
                this.f116472d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f116473e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f116474f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f116475g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f116476h = aVar2.d(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f116477i = aVar2.d(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f116478m = aVar2.d(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f116479n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f116480o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f116481p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f116482q = aVar2.i(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f116483r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}
