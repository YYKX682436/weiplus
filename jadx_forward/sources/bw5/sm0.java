package bw5;

/* loaded from: classes11.dex */
public class sm0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: u, reason: collision with root package name */
    public static final bw5.sm0 f114583u = new bw5.sm0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f114584d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f114585e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f114586f;

    /* renamed from: g, reason: collision with root package name */
    public long f114587g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f114588h;

    /* renamed from: i, reason: collision with root package name */
    public int f114589i;

    /* renamed from: m, reason: collision with root package name */
    public int f114590m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f114591n;

    /* renamed from: o, reason: collision with root package name */
    public int f114592o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.rn0 f114593p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.ol0 f114594q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.vm0 f114595r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.gi0 f114596s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f114597t = new boolean[14];

    public bw5.vm0 b() {
        return this.f114597t[12] ? this.f114595r : new bw5.vm0();
    }

    public bw5.gi0 c() {
        return this.f114597t[13] ? this.f114596s : new bw5.gi0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sm0)) {
            return false;
        }
        bw5.sm0 sm0Var = (bw5.sm0) fVar;
        return n51.f.a(this.f114584d, sm0Var.f114584d) && n51.f.a(this.f114585e, sm0Var.f114585e) && n51.f.a(this.f114586f, sm0Var.f114586f) && n51.f.a(java.lang.Long.valueOf(this.f114587g), java.lang.Long.valueOf(sm0Var.f114587g)) && n51.f.a(this.f114588h, sm0Var.f114588h) && n51.f.a(java.lang.Integer.valueOf(this.f114589i), java.lang.Integer.valueOf(sm0Var.f114589i)) && n51.f.a(java.lang.Integer.valueOf(this.f114590m), java.lang.Integer.valueOf(sm0Var.f114590m)) && n51.f.a(java.lang.Boolean.valueOf(this.f114591n), java.lang.Boolean.valueOf(sm0Var.f114591n)) && n51.f.a(java.lang.Integer.valueOf(this.f114592o), java.lang.Integer.valueOf(sm0Var.f114592o)) && n51.f.a(this.f114593p, sm0Var.f114593p) && n51.f.a(this.f114594q, sm0Var.f114594q) && n51.f.a(this.f114595r, sm0Var.f114595r) && n51.f.a(this.f114596s, sm0Var.f114596s);
    }

    public bw5.rn0 d() {
        return this.f114597t[10] ? this.f114593p : new bw5.rn0();
    }

    public java.lang.String e() {
        return this.f114597t[2] ? this.f114585e : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public bw5.sm0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.sm0) super.mo11468x92b714fd(bArr);
    }

    /* renamed from: getIconId */
    public java.lang.String m12978x1deb2e6a() {
        return this.f114597t[5] ? this.f114588h : "";
    }

    /* renamed from: getStatusId */
    public java.lang.String m12979xca73e223() {
        return this.f114597t[1] ? this.f114584d : "";
    }

    /* renamed from: getTopicId */
    public java.lang.String m12980xf9e58274() {
        return this.f114597t[3] ? this.f114586f : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.sm0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f114597t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f114584d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f114585e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f114586f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.h(4, this.f114587g);
            }
            java.lang.String str4 = this.f114588h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            if (zArr[6]) {
                fVar.e(6, this.f114589i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f114590m);
            }
            if (zArr[8]) {
                fVar.a(8, this.f114591n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f114592o);
            }
            bw5.rn0 rn0Var = this.f114593p;
            if (rn0Var != null && zArr[10]) {
                fVar.i(10, rn0Var.mo75928xcd1e8d8());
                this.f114593p.mo75956x3d5d1f78(fVar);
            }
            bw5.ol0 ol0Var = this.f114594q;
            if (ol0Var != null && zArr[11]) {
                fVar.i(11, ol0Var.mo75928xcd1e8d8());
                this.f114594q.mo75956x3d5d1f78(fVar);
            }
            bw5.vm0 vm0Var = this.f114595r;
            if (vm0Var != null && zArr[12]) {
                fVar.i(12, vm0Var.mo75928xcd1e8d8());
                this.f114595r.mo75956x3d5d1f78(fVar);
            }
            bw5.gi0 gi0Var = this.f114596s;
            if (gi0Var == null || !zArr[13]) {
                return 0;
            }
            fVar.i(13, gi0Var.mo75928xcd1e8d8());
            this.f114596s.mo75956x3d5d1f78(fVar);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f114584d;
            int j17 = (str5 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str5);
            java.lang.String str6 = this.f114585e;
            if (str6 != null && zArr[2]) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f114586f;
            if (str7 != null && zArr[3]) {
                j17 += b36.f.j(3, str7);
            }
            if (zArr[4]) {
                j17 += b36.f.h(4, this.f114587g);
            }
            java.lang.String str8 = this.f114588h;
            if (str8 != null && zArr[5]) {
                j17 += b36.f.j(5, str8);
            }
            if (zArr[6]) {
                j17 += b36.f.e(6, this.f114589i);
            }
            if (zArr[7]) {
                j17 += b36.f.e(7, this.f114590m);
            }
            if (zArr[8]) {
                j17 += b36.f.a(8, this.f114591n);
            }
            if (zArr[9]) {
                j17 += b36.f.e(9, this.f114592o);
            }
            bw5.rn0 rn0Var2 = this.f114593p;
            if (rn0Var2 != null && zArr[10]) {
                j17 += b36.f.i(10, rn0Var2.mo75928xcd1e8d8());
            }
            bw5.ol0 ol0Var2 = this.f114594q;
            if (ol0Var2 != null && zArr[11]) {
                j17 += b36.f.i(11, ol0Var2.mo75928xcd1e8d8());
            }
            bw5.vm0 vm0Var2 = this.f114595r;
            if (vm0Var2 != null && zArr[12]) {
                j17 += b36.f.i(12, vm0Var2.mo75928xcd1e8d8());
            }
            bw5.gi0 gi0Var2 = this.f114596s;
            return (gi0Var2 == null || !zArr[13]) ? j17 : j17 + b36.f.i(13, gi0Var2.mo75928xcd1e8d8());
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
                this.f114584d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f114585e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f114586f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f114587g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f114588h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f114589i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f114590m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f114591n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f114592o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.rn0 rn0Var3 = new bw5.rn0();
                    if (bArr != null && bArr.length > 0) {
                        rn0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f114593p = rn0Var3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    bw5.ol0 ol0Var3 = new bw5.ol0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ol0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f114594q = ol0Var3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    bw5.vm0 vm0Var3 = new bw5.vm0();
                    if (bArr3 != null && bArr3.length > 0) {
                        vm0Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f114595r = vm0Var3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j28.get(i28);
                    bw5.gi0 gi0Var3 = new bw5.gi0();
                    if (bArr4 != null && bArr4.length > 0) {
                        gi0Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f114596s = gi0Var3;
                }
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}
