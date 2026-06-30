package bw5;

/* loaded from: classes2.dex */
public class sn extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f33065d;

    /* renamed from: e, reason: collision with root package name */
    public long f33066e;

    /* renamed from: f, reason: collision with root package name */
    public long f33067f;

    /* renamed from: g, reason: collision with root package name */
    public long f33068g;

    /* renamed from: h, reason: collision with root package name */
    public int f33069h;

    /* renamed from: i, reason: collision with root package name */
    public int f33070i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f33071m = new boolean[7];

    static {
        new bw5.sn();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.sn parseFrom(byte[] bArr) {
        return (bw5.sn) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sn)) {
            return false;
        }
        bw5.sn snVar = (bw5.sn) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f33065d), java.lang.Long.valueOf(snVar.f33065d)) && n51.f.a(java.lang.Long.valueOf(this.f33066e), java.lang.Long.valueOf(snVar.f33066e)) && n51.f.a(java.lang.Long.valueOf(this.f33067f), java.lang.Long.valueOf(snVar.f33067f)) && n51.f.a(java.lang.Long.valueOf(this.f33068g), java.lang.Long.valueOf(snVar.f33068g)) && n51.f.a(java.lang.Integer.valueOf(this.f33069h), java.lang.Integer.valueOf(snVar.f33069h)) && n51.f.a(java.lang.Integer.valueOf(this.f33070i), java.lang.Integer.valueOf(snVar.f33070i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.sn();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33071m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f33065d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f33066e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f33067f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f33068g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f33069h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f33070i);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f33065d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f33066e);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f33067f);
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f33068g);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f33069h);
            }
            return zArr[6] ? h17 + b36.f.e(6, this.f33070i) : h17;
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
                this.f33065d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f33066e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f33067f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33068g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33069h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f33070i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
