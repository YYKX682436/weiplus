package bw5;

/* loaded from: classes2.dex */
public class s3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: g, reason: collision with root package name */
    public bw5.x3 f114311g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.z3 f114312h;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f114308d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f114309e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f114310f = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f114313i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f114314m = new boolean[7];

    static {
        new bw5.s3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.s3 mo11468x92b714fd(byte[] bArr) {
        return (bw5.s3) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.s3)) {
            return false;
        }
        bw5.s3 s3Var = (bw5.s3) fVar;
        return n51.f.a(this.f114308d, s3Var.f114308d) && n51.f.a(this.f114309e, s3Var.f114309e) && n51.f.a(this.f114310f, s3Var.f114310f) && n51.f.a(this.f114311g, s3Var.f114311g) && n51.f.a(this.f114312h, s3Var.f114312h) && n51.f.a(this.f114313i, s3Var.f114313i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.s3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f114313i;
        java.util.LinkedList linkedList2 = this.f114310f;
        java.util.LinkedList linkedList3 = this.f114309e;
        java.util.LinkedList linkedList4 = this.f114308d;
        boolean[] zArr = this.f114314m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList4);
            fVar.g(2, 8, linkedList3);
            fVar.g(3, 8, linkedList2);
            bw5.x3 x3Var = this.f114311g;
            if (x3Var != null && zArr[4]) {
                fVar.i(4, x3Var.mo75928xcd1e8d8());
                this.f114311g.mo75956x3d5d1f78(fVar);
            }
            bw5.z3 z3Var = this.f114312h;
            if (z3Var != null && zArr[5]) {
                fVar.i(5, z3Var.mo75928xcd1e8d8());
                this.f114312h.mo75956x3d5d1f78(fVar);
            }
            fVar.g(6, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList4) + 0 + b36.f.g(2, 8, linkedList3) + b36.f.g(3, 8, linkedList2);
            bw5.x3 x3Var2 = this.f114311g;
            if (x3Var2 != null && zArr[4]) {
                g17 += b36.f.i(4, x3Var2.mo75928xcd1e8d8());
            }
            bw5.z3 z3Var2 = this.f114312h;
            if (z3Var2 != null && zArr[5]) {
                g17 += b36.f.i(5, z3Var2.mo75928xcd1e8d8());
            }
            return g17 + b36.f.g(6, 8, linkedList);
        }
        if (i17 == 2) {
            linkedList4.clear();
            linkedList3.clear();
            linkedList2.clear();
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
                    bw5.t3 t3Var = new bw5.t3();
                    if (bArr != null && bArr.length > 0) {
                        t3Var.mo11468x92b714fd(bArr);
                    }
                    linkedList4.add(t3Var);
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.u3 u3Var = new bw5.u3();
                    if (bArr2 != null && bArr2.length > 0) {
                        u3Var.mo11468x92b714fd(bArr2);
                    }
                    linkedList3.add(u3Var);
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.c4 c4Var = new bw5.c4();
                    if (bArr3 != null && bArr3.length > 0) {
                        c4Var.mo11468x92b714fd(bArr3);
                    }
                    linkedList2.add(c4Var);
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.x3 x3Var3 = new bw5.x3();
                    if (bArr4 != null && bArr4.length > 0) {
                        x3Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f114311g = x3Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.z3 z3Var3 = new bw5.z3();
                    if (bArr5 != null && bArr5.length > 0) {
                        z3Var3.mo11468x92b714fd(bArr5);
                    }
                    this.f114312h = z3Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.r3 r3Var = new bw5.r3();
                    if (bArr6 != null && bArr6.length > 0) {
                        r3Var.mo11468x92b714fd(bArr6);
                    }
                    linkedList.add(r3Var);
                }
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
