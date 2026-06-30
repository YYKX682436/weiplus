package bw5;

/* loaded from: classes4.dex */
public class tg0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f33425d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.sg0 f33426e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.pg0 f33427f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.rg0 f33428g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.qg0 f33429h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f33430i;

    /* renamed from: m, reason: collision with root package name */
    public long f33431m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f33432n = new boolean[22];

    static {
        new bw5.tg0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.tg0 parseFrom(byte[] bArr) {
        return (bw5.tg0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tg0)) {
            return false;
        }
        bw5.tg0 tg0Var = (bw5.tg0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f33425d), java.lang.Integer.valueOf(tg0Var.f33425d)) && n51.f.a(this.f33426e, tg0Var.f33426e) && n51.f.a(this.f33427f, tg0Var.f33427f) && n51.f.a(this.f33428g, tg0Var.f33428g) && n51.f.a(this.f33429h, tg0Var.f33429h) && n51.f.a(this.f33430i, tg0Var.f33430i) && n51.f.a(java.lang.Long.valueOf(this.f33431m), java.lang.Long.valueOf(tg0Var.f33431m));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.tg0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33432n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f33425d);
            }
            bw5.sg0 sg0Var = this.f33426e;
            if (sg0Var != null && zArr[2]) {
                fVar.i(2, sg0Var.computeSize());
                this.f33426e.writeFields(fVar);
            }
            bw5.pg0 pg0Var = this.f33427f;
            if (pg0Var != null && zArr[3]) {
                fVar.i(3, pg0Var.computeSize());
                this.f33427f.writeFields(fVar);
            }
            bw5.rg0 rg0Var = this.f33428g;
            if (rg0Var != null && zArr[4]) {
                fVar.i(4, rg0Var.computeSize());
                this.f33428g.writeFields(fVar);
            }
            bw5.qg0 qg0Var = this.f33429h;
            if (qg0Var != null && zArr[5]) {
                fVar.i(5, qg0Var.computeSize());
                this.f33429h.writeFields(fVar);
            }
            java.lang.String str = this.f33430i;
            if (str != null && zArr[20]) {
                fVar.j(20, str);
            }
            if (zArr[21]) {
                fVar.h(21, this.f33431m);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f33425d) : 0;
            bw5.sg0 sg0Var2 = this.f33426e;
            if (sg0Var2 != null && zArr[2]) {
                e17 += b36.f.i(2, sg0Var2.computeSize());
            }
            bw5.pg0 pg0Var2 = this.f33427f;
            if (pg0Var2 != null && zArr[3]) {
                e17 += b36.f.i(3, pg0Var2.computeSize());
            }
            bw5.rg0 rg0Var2 = this.f33428g;
            if (rg0Var2 != null && zArr[4]) {
                e17 += b36.f.i(4, rg0Var2.computeSize());
            }
            bw5.qg0 qg0Var2 = this.f33429h;
            if (qg0Var2 != null && zArr[5]) {
                e17 += b36.f.i(5, qg0Var2.computeSize());
            }
            java.lang.String str2 = this.f33430i;
            if (str2 != null && zArr[20]) {
                e17 += b36.f.j(20, str2);
            }
            return zArr[21] ? e17 + b36.f.h(21, this.f33431m) : e17;
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
        if (intValue == 1) {
            this.f33425d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.sg0 sg0Var3 = new bw5.sg0();
                if (bArr != null && bArr.length > 0) {
                    sg0Var3.parseFrom(bArr);
                }
                this.f33426e = sg0Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                bw5.pg0 pg0Var3 = new bw5.pg0();
                if (bArr2 != null && bArr2.length > 0) {
                    pg0Var3.parseFrom(bArr2);
                }
                this.f33427f = pg0Var3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr3 = (byte[]) j19.get(i27);
                bw5.rg0 rg0Var3 = new bw5.rg0();
                if (bArr3 != null && bArr3.length > 0) {
                    rg0Var3.parseFrom(bArr3);
                }
                this.f33428g = rg0Var3;
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            if (intValue == 20) {
                this.f33430i = aVar2.k(intValue);
                zArr[20] = true;
                return 0;
            }
            if (intValue != 21) {
                return -1;
            }
            this.f33431m = aVar2.i(intValue);
            zArr[21] = true;
            return 0;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i28 = 0; i28 < size4; i28++) {
            byte[] bArr4 = (byte[]) j27.get(i28);
            bw5.qg0 qg0Var3 = new bw5.qg0();
            if (bArr4 != null && bArr4.length > 0) {
                qg0Var3.parseFrom(bArr4);
            }
            this.f33429h = qg0Var3;
        }
        zArr[5] = true;
        return 0;
    }
}
