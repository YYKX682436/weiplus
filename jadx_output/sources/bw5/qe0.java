package bw5;

/* loaded from: classes9.dex */
public class qe0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.q5 f32059d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.pe0 f32060e;

    /* renamed from: f, reason: collision with root package name */
    public int f32061f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f32062g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f32063h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.a9 f32064i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.a9 f32065m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f32066n = new boolean[8];

    static {
        new bw5.qe0();
    }

    public bw5.pe0 b() {
        return this.f32066n[2] ? this.f32060e : new bw5.pe0();
    }

    public bw5.q5 c() {
        return this.f32066n[1] ? this.f32059d : new bw5.q5();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qe0)) {
            return false;
        }
        bw5.qe0 qe0Var = (bw5.qe0) fVar;
        return n51.f.a(this.f32059d, qe0Var.f32059d) && n51.f.a(this.f32060e, qe0Var.f32060e) && n51.f.a(java.lang.Integer.valueOf(this.f32061f), java.lang.Integer.valueOf(qe0Var.f32061f)) && n51.f.a(java.lang.Boolean.valueOf(this.f32062g), java.lang.Boolean.valueOf(qe0Var.f32062g)) && n51.f.a(this.f32063h, qe0Var.f32063h) && n51.f.a(this.f32064i, qe0Var.f32064i) && n51.f.a(this.f32065m, qe0Var.f32065m);
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public bw5.qe0 parseFrom(byte[] bArr) {
        return (bw5.qe0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.qe0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f32066n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.q5 q5Var = this.f32059d;
            if (q5Var != null && zArr[1]) {
                fVar.i(1, q5Var.computeSize());
                this.f32059d.writeFields(fVar);
            }
            bw5.pe0 pe0Var = this.f32060e;
            if (pe0Var != null && zArr[2]) {
                fVar.i(2, pe0Var.computeSize());
                this.f32060e.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f32061f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f32062g);
            }
            java.lang.String str = this.f32063h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            bw5.a9 a9Var = this.f32064i;
            if (a9Var != null && zArr[6]) {
                fVar.i(6, a9Var.computeSize());
                this.f32064i.writeFields(fVar);
            }
            bw5.a9 a9Var2 = this.f32065m;
            if (a9Var2 != null && zArr[7]) {
                fVar.i(7, a9Var2.computeSize());
                this.f32065m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.q5 q5Var2 = this.f32059d;
            if (q5Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, q5Var2.computeSize());
            }
            bw5.pe0 pe0Var2 = this.f32060e;
            if (pe0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, pe0Var2.computeSize());
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f32061f);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f32062g);
            }
            java.lang.String str2 = this.f32063h;
            if (str2 != null && zArr[5]) {
                i18 += b36.f.j(5, str2);
            }
            bw5.a9 a9Var3 = this.f32064i;
            if (a9Var3 != null && zArr[6]) {
                i18 += b36.f.i(6, a9Var3.computeSize());
            }
            bw5.a9 a9Var4 = this.f32065m;
            return (a9Var4 == null || !zArr[7]) ? i18 : i18 + b36.f.i(7, a9Var4.computeSize());
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
                    bw5.q5 q5Var3 = new bw5.q5();
                    if (bArr != null && bArr.length > 0) {
                        q5Var3.parseFrom(bArr);
                    }
                    this.f32059d = q5Var3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.pe0 pe0Var3 = new bw5.pe0();
                    if (bArr2 != null && bArr2.length > 0) {
                        pe0Var3.parseFrom(bArr2);
                    }
                    this.f32060e = pe0Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f32061f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f32062g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f32063h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.a9 a9Var5 = new bw5.a9();
                    if (bArr3 != null && bArr3.length > 0) {
                        a9Var5.parseFrom(bArr3);
                    }
                    this.f32064i = a9Var5;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.a9 a9Var6 = new bw5.a9();
                    if (bArr4 != null && bArr4.length > 0) {
                        a9Var6.parseFrom(bArr4);
                    }
                    this.f32065m = a9Var6;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
