package r45;

/* loaded from: classes2.dex */
public class mb1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461852d;

    /* renamed from: e, reason: collision with root package name */
    public r45.kv0 f461853e;

    /* renamed from: f, reason: collision with root package name */
    public int f461854f;

    /* renamed from: g, reason: collision with root package name */
    public int f461855g;

    /* renamed from: h, reason: collision with root package name */
    public long f461856h;

    /* renamed from: i, reason: collision with root package name */
    public long f461857i;

    /* renamed from: m, reason: collision with root package name */
    public r45.y13 f461858m;

    /* renamed from: n, reason: collision with root package name */
    public long f461859n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mb1)) {
            return false;
        }
        r45.mb1 mb1Var = (r45.mb1) fVar;
        return n51.f.a(this.f76494x2de60e5e, mb1Var.f76494x2de60e5e) && n51.f.a(this.f461852d, mb1Var.f461852d) && n51.f.a(this.f461853e, mb1Var.f461853e) && n51.f.a(java.lang.Integer.valueOf(this.f461854f), java.lang.Integer.valueOf(mb1Var.f461854f)) && n51.f.a(java.lang.Integer.valueOf(this.f461855g), java.lang.Integer.valueOf(mb1Var.f461855g)) && n51.f.a(java.lang.Long.valueOf(this.f461856h), java.lang.Long.valueOf(mb1Var.f461856h)) && n51.f.a(java.lang.Long.valueOf(this.f461857i), java.lang.Long.valueOf(mb1Var.f461857i)) && n51.f.a(this.f461858m, mb1Var.f461858m) && n51.f.a(java.lang.Long.valueOf(this.f461859n), java.lang.Long.valueOf(mb1Var.f461859n));
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
            java.lang.String str = this.f461852d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.kv0 kv0Var = this.f461853e;
            if (kv0Var != null) {
                fVar.i(3, kv0Var.mo75928xcd1e8d8());
                this.f461853e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f461854f);
            fVar.e(5, this.f461855g);
            fVar.h(62, this.f461856h);
            fVar.h(72, this.f461857i);
            r45.y13 y13Var = this.f461858m;
            if (y13Var != null) {
                fVar.i(8, y13Var.mo75928xcd1e8d8());
                this.f461858m.mo75956x3d5d1f78(fVar);
            }
            fVar.h(9, this.f461859n);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f461852d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            r45.kv0 kv0Var2 = this.f461853e;
            if (kv0Var2 != null) {
                i18 += b36.f.i(3, kv0Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(4, this.f461854f) + b36.f.e(5, this.f461855g) + b36.f.h(62, this.f461856h) + b36.f.h(72, this.f461857i);
            r45.y13 y13Var2 = this.f461858m;
            if (y13Var2 != null) {
                e17 += b36.f.i(8, y13Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.h(9, this.f461859n);
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
        r45.mb1 mb1Var = (r45.mb1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.mo11468x92b714fd(bArr);
                }
                mb1Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            mb1Var.f461852d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.kv0 kv0Var3 = new r45.kv0();
                if (bArr2 != null && bArr2.length > 0) {
                    kv0Var3.mo11468x92b714fd(bArr2);
                }
                mb1Var.f461853e = kv0Var3;
            }
            return 0;
        }
        if (intValue == 4) {
            mb1Var.f461854f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 5) {
            mb1Var.f461855g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 8) {
            if (intValue == 9) {
                mb1Var.f461859n = aVar2.i(intValue);
                return 0;
            }
            if (intValue == 62) {
                mb1Var.f461856h = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 72) {
                return -1;
            }
            mb1Var.f461857i = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.y13 y13Var3 = new r45.y13();
            if (bArr3 != null && bArr3.length > 0) {
                y13Var3.mo11468x92b714fd(bArr3);
            }
            mb1Var.f461858m = y13Var3;
        }
        return 0;
    }
}
