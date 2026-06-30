package bw5;

/* loaded from: classes2.dex */
public class w30 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f34570d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.v30 f34571e;

    /* renamed from: f, reason: collision with root package name */
    public int f34572f;

    /* renamed from: g, reason: collision with root package name */
    public int f34573g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f34574h = new boolean[5];

    static {
        new bw5.w30();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.w30 parseFrom(byte[] bArr) {
        return (bw5.w30) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.w30)) {
            return false;
        }
        bw5.w30 w30Var = (bw5.w30) fVar;
        return n51.f.a(this.f34570d, w30Var.f34570d) && n51.f.a(this.f34571e, w30Var.f34571e) && n51.f.a(java.lang.Integer.valueOf(this.f34572f), java.lang.Integer.valueOf(w30Var.f34572f)) && n51.f.a(java.lang.Integer.valueOf(this.f34573g), java.lang.Integer.valueOf(w30Var.f34573g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.w30();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f34574h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f34570d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.v30 v30Var = this.f34571e;
            if (v30Var != null && zArr[2]) {
                fVar.i(2, v30Var.computeSize());
                this.f34571e.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f34572f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f34573g);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f34570d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            bw5.v30 v30Var2 = this.f34571e;
            if (v30Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, v30Var2.computeSize());
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f34572f);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f34573g) : i18;
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
            this.f34570d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f34572f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f34573g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.v30 v30Var3 = new bw5.v30();
            if (bArr != null && bArr.length > 0) {
                v30Var3.parseFrom(bArr);
            }
            this.f34571e = v30Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
