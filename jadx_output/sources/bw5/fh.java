package bw5;

/* loaded from: classes2.dex */
public class fh extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f27271d;

    /* renamed from: e, reason: collision with root package name */
    public int f27272e;

    /* renamed from: f, reason: collision with root package name */
    public long f27273f;

    /* renamed from: g, reason: collision with root package name */
    public long f27274g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f27275h = new boolean[5];

    static {
        new bw5.fh();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fh parseFrom(byte[] bArr) {
        return (bw5.fh) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fh)) {
            return false;
        }
        bw5.fh fhVar = (bw5.fh) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f27271d), java.lang.Integer.valueOf(fhVar.f27271d)) && n51.f.a(java.lang.Integer.valueOf(this.f27272e), java.lang.Integer.valueOf(fhVar.f27272e)) && n51.f.a(java.lang.Long.valueOf(this.f27273f), java.lang.Long.valueOf(fhVar.f27273f)) && n51.f.a(java.lang.Long.valueOf(this.f27274g), java.lang.Long.valueOf(fhVar.f27274g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.fh();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27275h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f27271d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f27272e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f27273f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f27274g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f27271d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f27272e);
            }
            if (zArr[3]) {
                e17 += b36.f.h(3, this.f27273f);
            }
            return zArr[4] ? e17 + b36.f.h(4, this.f27274g) : e17;
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
            this.f27271d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f27272e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f27273f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f27274g = aVar2.i(intValue);
        zArr[4] = true;
        return 0;
    }
}
