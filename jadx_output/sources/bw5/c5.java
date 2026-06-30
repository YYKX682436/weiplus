package bw5;

/* loaded from: classes2.dex */
public class c5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f25924d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.od f25925e;

    /* renamed from: f, reason: collision with root package name */
    public int f25926f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f25927g = new boolean[4];

    static {
        new bw5.c5();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.c5 parseFrom(byte[] bArr) {
        return (bw5.c5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.c5)) {
            return false;
        }
        bw5.c5 c5Var = (bw5.c5) fVar;
        return n51.f.a(this.f25924d, c5Var.f25924d) && n51.f.a(this.f25925e, c5Var.f25925e) && n51.f.a(java.lang.Integer.valueOf(this.f25926f), java.lang.Integer.valueOf(c5Var.f25926f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.c5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25927g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f25924d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.od odVar = this.f25925e;
            if (odVar != null && zArr[2]) {
                fVar.i(2, odVar.computeSize());
                this.f25925e.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f25926f);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f25924d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            bw5.od odVar2 = this.f25925e;
            if (odVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, odVar2.computeSize());
            }
            return zArr[3] ? i18 + b36.f.e(3, this.f25926f) : i18;
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
            this.f25924d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f25926f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.od odVar3 = new bw5.od();
            if (bArr != null && bArr.length > 0) {
                odVar3.parseFrom(bArr);
            }
            this.f25925e = odVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
