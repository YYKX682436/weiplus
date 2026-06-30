package bw5;

/* loaded from: classes11.dex */
public class fr0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.dr0 f27492d;

    /* renamed from: e, reason: collision with root package name */
    public int f27493e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.lp0 f27494f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.op0 f27495g;

    /* renamed from: h, reason: collision with root package name */
    public long f27496h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.eq0 f27497i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.uq0 f27498m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f27499n = new boolean[8];

    static {
        new bw5.fr0();
    }

    public bw5.lp0 b() {
        return this.f27499n[3] ? this.f27494f : new bw5.lp0();
    }

    public bw5.dr0 c() {
        return this.f27499n[1] ? this.f27492d : new bw5.dr0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fr0)) {
            return false;
        }
        bw5.fr0 fr0Var = (bw5.fr0) fVar;
        return n51.f.a(this.f27492d, fr0Var.f27492d) && n51.f.a(java.lang.Integer.valueOf(this.f27493e), java.lang.Integer.valueOf(fr0Var.f27493e)) && n51.f.a(this.f27494f, fr0Var.f27494f) && n51.f.a(this.f27495g, fr0Var.f27495g) && n51.f.a(java.lang.Long.valueOf(this.f27496h), java.lang.Long.valueOf(fr0Var.f27496h)) && n51.f.a(this.f27497i, fr0Var.f27497i) && n51.f.a(this.f27498m, fr0Var.f27498m);
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public bw5.fr0 parseFrom(byte[] bArr) {
        return (bw5.fr0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.fr0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f27499n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.dr0 dr0Var = this.f27492d;
            if (dr0Var != null && zArr[1]) {
                fVar.i(1, dr0Var.computeSize());
                this.f27492d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f27493e);
            }
            bw5.lp0 lp0Var = this.f27494f;
            if (lp0Var != null && zArr[3]) {
                fVar.i(3, lp0Var.computeSize());
                this.f27494f.writeFields(fVar);
            }
            bw5.op0 op0Var = this.f27495g;
            if (op0Var != null && zArr[4]) {
                fVar.i(4, op0Var.computeSize());
                this.f27495g.writeFields(fVar);
            }
            if (zArr[5]) {
                fVar.h(5, this.f27496h);
            }
            bw5.eq0 eq0Var = this.f27497i;
            if (eq0Var != null && zArr[6]) {
                fVar.e(6, eq0Var.f27025d);
            }
            bw5.uq0 uq0Var = this.f27498m;
            if (uq0Var != null && zArr[7]) {
                fVar.i(7, uq0Var.computeSize());
                this.f27498m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.dr0 dr0Var2 = this.f27492d;
            if (dr0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, dr0Var2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f27493e);
            }
            bw5.lp0 lp0Var2 = this.f27494f;
            if (lp0Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, lp0Var2.computeSize());
            }
            bw5.op0 op0Var2 = this.f27495g;
            if (op0Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, op0Var2.computeSize());
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f27496h);
            }
            bw5.eq0 eq0Var2 = this.f27497i;
            if (eq0Var2 != null && zArr[6]) {
                i18 += b36.f.e(6, eq0Var2.f27025d);
            }
            bw5.uq0 uq0Var2 = this.f27498m;
            return (uq0Var2 == null || !zArr[7]) ? i18 : i18 + b36.f.i(7, uq0Var2.computeSize());
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
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
                    bw5.dr0 dr0Var3 = new bw5.dr0();
                    if (bArr != null && bArr.length > 0) {
                        dr0Var3.parseFrom(bArr);
                    }
                    this.f27492d = dr0Var3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f27493e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.lp0 lp0Var3 = new bw5.lp0();
                    if (bArr2 != null && bArr2.length > 0) {
                        lp0Var3.parseFrom(bArr2);
                    }
                    this.f27494f = lp0Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.op0 op0Var3 = new bw5.op0();
                    if (bArr3 != null && bArr3.length > 0) {
                        op0Var3.parseFrom(bArr3);
                    }
                    this.f27495g = op0Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f27496h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27497i = bw5.eq0.a(aVar2.g(intValue));
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.uq0 uq0Var3 = new bw5.uq0();
                    if (bArr4 != null && bArr4.length > 0) {
                        uq0Var3.parseFrom(bArr4);
                    }
                    this.f27498m = uq0Var3;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
