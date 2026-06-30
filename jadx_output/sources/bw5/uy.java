package bw5;

/* loaded from: classes2.dex */
public class uy extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f34074d;

    /* renamed from: e, reason: collision with root package name */
    public int f34075e;

    /* renamed from: f, reason: collision with root package name */
    public int f34076f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f34077g = new boolean[4];

    static {
        new bw5.uy();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.uy parseFrom(byte[] bArr) {
        return (bw5.uy) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.uy)) {
            return false;
        }
        bw5.uy uyVar = (bw5.uy) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f34074d), java.lang.Boolean.valueOf(uyVar.f34074d)) && n51.f.a(java.lang.Integer.valueOf(this.f34075e), java.lang.Integer.valueOf(uyVar.f34075e)) && n51.f.a(java.lang.Integer.valueOf(this.f34076f), java.lang.Integer.valueOf(uyVar.f34076f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.uy();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34077g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f34074d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f34075e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f34076f);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f34074d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f34075e);
            }
            return zArr[3] ? a17 + b36.f.e(3, this.f34076f) : a17;
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
            this.f34074d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f34075e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f34076f = aVar2.g(intValue);
        zArr[3] = true;
        return 0;
    }
}
