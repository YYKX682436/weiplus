package bw5;

/* loaded from: classes2.dex */
public class mh0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f30239d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30240e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f30241f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.x7 f30242g;

    /* renamed from: h, reason: collision with root package name */
    public int f30243h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f30244i = new boolean[6];

    static {
        new bw5.mh0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.mh0 parseFrom(byte[] bArr) {
        return (bw5.mh0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.mh0)) {
            return false;
        }
        bw5.mh0 mh0Var = (bw5.mh0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f30239d), java.lang.Long.valueOf(mh0Var.f30239d)) && n51.f.a(this.f30240e, mh0Var.f30240e) && n51.f.a(this.f30241f, mh0Var.f30241f) && n51.f.a(this.f30242g, mh0Var.f30242g) && n51.f.a(java.lang.Integer.valueOf(this.f30243h), java.lang.Integer.valueOf(mh0Var.f30243h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.mh0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30244i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f30239d);
            }
            java.lang.String str = this.f30240e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f30241f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            bw5.x7 x7Var = this.f30242g;
            if (x7Var != null && zArr[4]) {
                fVar.i(4, x7Var.computeSize());
                this.f30242g.writeFields(fVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f30243h);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f30239d) : 0;
            java.lang.String str3 = this.f30240e;
            if (str3 != null && zArr[2]) {
                h17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f30241f;
            if (str4 != null && zArr[3]) {
                h17 += b36.f.j(3, str4);
            }
            bw5.x7 x7Var2 = this.f30242g;
            if (x7Var2 != null && zArr[4]) {
                h17 += b36.f.i(4, x7Var2.computeSize());
            }
            return zArr[5] ? h17 + b36.f.e(5, this.f30243h) : h17;
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
            this.f30239d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f30240e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f30241f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            this.f30243h = aVar2.g(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.x7 x7Var3 = new bw5.x7();
            if (bArr != null && bArr.length > 0) {
                x7Var3.parseFrom(bArr);
            }
            this.f30242g = x7Var3;
        }
        zArr[4] = true;
        return 0;
    }
}
