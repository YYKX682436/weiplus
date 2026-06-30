package bw5;

/* loaded from: classes2.dex */
public class fb0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public bw5.cb0 f108741e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f108742f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.db0 f108743g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.qb0 f108744h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f108745i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.eb0 f108746m;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f108740d = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f108747n = new boolean[8];

    static {
        new bw5.fb0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fb0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.fb0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fb0)) {
            return false;
        }
        bw5.fb0 fb0Var = (bw5.fb0) fVar;
        return n51.f.a(this.f108740d, fb0Var.f108740d) && n51.f.a(this.f108741e, fb0Var.f108741e) && n51.f.a(this.f108742f, fb0Var.f108742f) && n51.f.a(this.f108743g, fb0Var.f108743g) && n51.f.a(this.f108744h, fb0Var.f108744h) && n51.f.a(this.f108745i, fb0Var.f108745i) && n51.f.a(this.f108746m, fb0Var.f108746m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.fb0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f108740d;
        boolean[] zArr = this.f108747n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            bw5.cb0 cb0Var = this.f108741e;
            if (cb0Var != null && zArr[2]) {
                fVar.i(2, cb0Var.mo75928xcd1e8d8());
                this.f108741e.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f108742f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            bw5.db0 db0Var = this.f108743g;
            if (db0Var != null && zArr[4]) {
                fVar.i(4, db0Var.mo75928xcd1e8d8());
                this.f108743g.mo75956x3d5d1f78(fVar);
            }
            bw5.qb0 qb0Var = this.f108744h;
            if (qb0Var != null && zArr[5]) {
                fVar.i(5, qb0Var.mo75928xcd1e8d8());
                this.f108744h.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f108745i;
            if (gVar2 != null && zArr[6]) {
                fVar.b(6, gVar2);
            }
            bw5.eb0 eb0Var = this.f108746m;
            if (eb0Var != null && zArr[7]) {
                fVar.i(7, eb0Var.mo75928xcd1e8d8());
                this.f108746m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            bw5.cb0 cb0Var2 = this.f108741e;
            if (cb0Var2 != null && zArr[2]) {
                g17 += b36.f.i(2, cb0Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f108742f;
            if (gVar3 != null && zArr[3]) {
                g17 += b36.f.b(3, gVar3);
            }
            bw5.db0 db0Var2 = this.f108743g;
            if (db0Var2 != null && zArr[4]) {
                g17 += b36.f.i(4, db0Var2.mo75928xcd1e8d8());
            }
            bw5.qb0 qb0Var2 = this.f108744h;
            if (qb0Var2 != null && zArr[5]) {
                g17 += b36.f.i(5, qb0Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f108745i;
            if (gVar4 != null && zArr[6]) {
                g17 += b36.f.b(6, gVar4);
            }
            bw5.eb0 eb0Var2 = this.f108746m;
            return (eb0Var2 == null || !zArr[7]) ? g17 : g17 + b36.f.i(7, eb0Var2.mo75928xcd1e8d8());
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
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.ab0 ab0Var = new bw5.ab0();
                    if (bArr != null && bArr.length > 0) {
                        ab0Var.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(ab0Var);
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.cb0 cb0Var3 = new bw5.cb0();
                    if (bArr2 != null && bArr2.length > 0) {
                        cb0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f108741e = cb0Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f108742f = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.db0 db0Var3 = new bw5.db0();
                    if (bArr3 != null && bArr3.length > 0) {
                        db0Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f108743g = db0Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.qb0 qb0Var3 = new bw5.qb0();
                    if (bArr4 != null && bArr4.length > 0) {
                        qb0Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f108744h = qb0Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f108745i = aVar2.d(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.eb0 eb0Var3 = new bw5.eb0();
                    if (bArr5 != null && bArr5.length > 0) {
                        eb0Var3.mo11468x92b714fd(bArr5);
                    }
                    this.f108746m = eb0Var3;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
