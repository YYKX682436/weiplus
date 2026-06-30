package bw5;

/* loaded from: classes4.dex */
public class zr extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f117699d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.sg0 f117700e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.pg0 f117701f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.rg0 f117702g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.qg0 f117703h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f117704i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f117705m = new boolean[7];

    static {
        new bw5.zr();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.zr mo11468x92b714fd(byte[] bArr) {
        return (bw5.zr) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zr)) {
            return false;
        }
        bw5.zr zrVar = (bw5.zr) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f117699d), java.lang.Integer.valueOf(zrVar.f117699d)) && n51.f.a(this.f117700e, zrVar.f117700e) && n51.f.a(this.f117701f, zrVar.f117701f) && n51.f.a(this.f117702g, zrVar.f117702g) && n51.f.a(this.f117703h, zrVar.f117703h) && n51.f.a(this.f117704i, zrVar.f117704i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.zr();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f117704i;
        boolean[] zArr = this.f117705m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f117699d);
            }
            bw5.sg0 sg0Var = this.f117700e;
            if (sg0Var != null && zArr[2]) {
                fVar.i(2, sg0Var.mo75928xcd1e8d8());
                this.f117700e.mo75956x3d5d1f78(fVar);
            }
            bw5.pg0 pg0Var = this.f117701f;
            if (pg0Var != null && zArr[3]) {
                fVar.i(3, pg0Var.mo75928xcd1e8d8());
                this.f117701f.mo75956x3d5d1f78(fVar);
            }
            bw5.rg0 rg0Var = this.f117702g;
            if (rg0Var != null && zArr[4]) {
                fVar.i(4, rg0Var.mo75928xcd1e8d8());
                this.f117702g.mo75956x3d5d1f78(fVar);
            }
            bw5.qg0 qg0Var = this.f117703h;
            if (qg0Var != null && zArr[5]) {
                fVar.i(5, qg0Var.mo75928xcd1e8d8());
                this.f117703h.mo75956x3d5d1f78(fVar);
            }
            fVar.g(6, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f117699d) : 0;
            bw5.sg0 sg0Var2 = this.f117700e;
            if (sg0Var2 != null && zArr[2]) {
                e17 += b36.f.i(2, sg0Var2.mo75928xcd1e8d8());
            }
            bw5.pg0 pg0Var2 = this.f117701f;
            if (pg0Var2 != null && zArr[3]) {
                e17 += b36.f.i(3, pg0Var2.mo75928xcd1e8d8());
            }
            bw5.rg0 rg0Var2 = this.f117702g;
            if (rg0Var2 != null && zArr[4]) {
                e17 += b36.f.i(4, rg0Var2.mo75928xcd1e8d8());
            }
            bw5.qg0 qg0Var2 = this.f117703h;
            if (qg0Var2 != null && zArr[5]) {
                e17 += b36.f.i(5, qg0Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.g(6, 8, linkedList);
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
                this.f117699d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.sg0 sg0Var3 = new bw5.sg0();
                    if (bArr != null && bArr.length > 0) {
                        sg0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f117700e = sg0Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.pg0 pg0Var3 = new bw5.pg0();
                    if (bArr2 != null && bArr2.length > 0) {
                        pg0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f117701f = pg0Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.rg0 rg0Var3 = new bw5.rg0();
                    if (bArr3 != null && bArr3.length > 0) {
                        rg0Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f117702g = rg0Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.qg0 qg0Var3 = new bw5.qg0();
                    if (bArr4 != null && bArr4.length > 0) {
                        qg0Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f117703h = qg0Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.tg0 tg0Var = new bw5.tg0();
                    if (bArr5 != null && bArr5.length > 0) {
                        tg0Var.mo11468x92b714fd(bArr5);
                    }
                    linkedList.add(tg0Var);
                }
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
