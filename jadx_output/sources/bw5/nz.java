package bw5;

/* loaded from: classes2.dex */
public class nz extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f30851d;

    /* renamed from: e, reason: collision with root package name */
    public long f30852e;

    /* renamed from: f, reason: collision with root package name */
    public long f30853f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f30854g = new boolean[4];

    static {
        new bw5.nz();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.nz parseFrom(byte[] bArr) {
        return (bw5.nz) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.nz)) {
            return false;
        }
        bw5.nz nzVar = (bw5.nz) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f30851d), java.lang.Integer.valueOf(nzVar.f30851d)) && n51.f.a(java.lang.Long.valueOf(this.f30852e), java.lang.Long.valueOf(nzVar.f30852e)) && n51.f.a(java.lang.Long.valueOf(this.f30853f), java.lang.Long.valueOf(nzVar.f30853f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.nz();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30854g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f30851d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f30852e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f30853f);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f30851d) : 0;
            if (zArr[2]) {
                e17 += b36.f.h(2, this.f30852e);
            }
            return zArr[3] ? e17 + b36.f.h(3, this.f30853f) : e17;
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
            this.f30851d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f30852e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f30853f = aVar2.i(intValue);
        zArr[3] = true;
        return 0;
    }
}
