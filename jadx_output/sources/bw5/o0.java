package bw5;

/* loaded from: classes9.dex */
public class o0 extends com.tencent.mm.protobuf.f {

    /* renamed from: n, reason: collision with root package name */
    public static final bw5.o0 f30861n = new bw5.o0();

    /* renamed from: d, reason: collision with root package name */
    public long f30862d;

    /* renamed from: e, reason: collision with root package name */
    public long f30863e;

    /* renamed from: f, reason: collision with root package name */
    public float f30864f;

    /* renamed from: g, reason: collision with root package name */
    public long f30865g;

    /* renamed from: h, reason: collision with root package name */
    public long f30866h;

    /* renamed from: i, reason: collision with root package name */
    public long f30867i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f30868m = new boolean[7];

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.o0 parseFrom(byte[] bArr) {
        return (bw5.o0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.o0)) {
            return false;
        }
        bw5.o0 o0Var = (bw5.o0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f30862d), java.lang.Long.valueOf(o0Var.f30862d)) && n51.f.a(java.lang.Long.valueOf(this.f30863e), java.lang.Long.valueOf(o0Var.f30863e)) && n51.f.a(java.lang.Float.valueOf(this.f30864f), java.lang.Float.valueOf(o0Var.f30864f)) && n51.f.a(java.lang.Long.valueOf(this.f30865g), java.lang.Long.valueOf(o0Var.f30865g)) && n51.f.a(java.lang.Long.valueOf(this.f30866h), java.lang.Long.valueOf(o0Var.f30866h)) && n51.f.a(java.lang.Long.valueOf(this.f30867i), java.lang.Long.valueOf(o0Var.f30867i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.o0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30868m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f30862d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f30863e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f30864f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f30865g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f30866h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f30867i);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f30862d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f30863e);
            }
            if (zArr[3]) {
                h17 += b36.f.d(3, this.f30864f);
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f30865g);
            }
            if (zArr[5]) {
                h17 += b36.f.h(5, this.f30866h);
            }
            return zArr[6] ? h17 + b36.f.h(6, this.f30867i) : h17;
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
                this.f30862d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30863e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30864f = aVar2.f(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30865g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30866h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30867i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
