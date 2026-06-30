package bw5;

/* loaded from: classes2.dex */
public class w1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f34555d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f34556e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.am f34557f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f34558g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.am f34559h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f34560i = new boolean[6];

    static {
        new bw5.w1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.w1 parseFrom(byte[] bArr) {
        return (bw5.w1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.w1)) {
            return false;
        }
        bw5.w1 w1Var = (bw5.w1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f34555d), java.lang.Integer.valueOf(w1Var.f34555d)) && n51.f.a(this.f34556e, w1Var.f34556e) && n51.f.a(this.f34557f, w1Var.f34557f) && n51.f.a(this.f34558g, w1Var.f34558g) && n51.f.a(this.f34559h, w1Var.f34559h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.w1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34560i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f34555d);
            }
            java.lang.String str = this.f34556e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            bw5.am amVar = this.f34557f;
            if (amVar != null && zArr[3]) {
                fVar.i(3, amVar.computeSize());
                this.f34557f.writeFields(fVar);
            }
            java.lang.String str2 = this.f34558g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            bw5.am amVar2 = this.f34559h;
            if (amVar2 != null && zArr[5]) {
                fVar.i(5, amVar2.computeSize());
                this.f34559h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f34555d) : 0;
            java.lang.String str3 = this.f34556e;
            if (str3 != null && zArr[2]) {
                e17 += b36.f.j(2, str3);
            }
            bw5.am amVar3 = this.f34557f;
            if (amVar3 != null && zArr[3]) {
                e17 += b36.f.i(3, amVar3.computeSize());
            }
            java.lang.String str4 = this.f34558g;
            if (str4 != null && zArr[4]) {
                e17 += b36.f.j(4, str4);
            }
            bw5.am amVar4 = this.f34559h;
            return (amVar4 == null || !zArr[5]) ? e17 : e17 + b36.f.i(5, amVar4.computeSize());
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
            this.f34555d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f34556e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.am amVar5 = new bw5.am();
                if (bArr != null && bArr.length > 0) {
                    amVar5.parseFrom(bArr);
                }
                this.f34557f = amVar5;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f34558g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.am amVar6 = new bw5.am();
            if (bArr2 != null && bArr2.length > 0) {
                amVar6.parseFrom(bArr2);
            }
            this.f34559h = amVar6;
        }
        zArr[5] = true;
        return 0;
    }
}
