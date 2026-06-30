package bw5;

/* loaded from: classes2.dex */
public class dd extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f26436d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26437e;

    /* renamed from: f, reason: collision with root package name */
    public long f26438f;

    /* renamed from: g, reason: collision with root package name */
    public long f26439g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f26440h = new boolean[5];

    static {
        new bw5.dd();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.dd parseFrom(byte[] bArr) {
        return (bw5.dd) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.dd)) {
            return false;
        }
        bw5.dd ddVar = (bw5.dd) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f26436d), java.lang.Integer.valueOf(ddVar.f26436d)) && n51.f.a(java.lang.Boolean.valueOf(this.f26437e), java.lang.Boolean.valueOf(ddVar.f26437e)) && n51.f.a(java.lang.Long.valueOf(this.f26438f), java.lang.Long.valueOf(ddVar.f26438f)) && n51.f.a(java.lang.Long.valueOf(this.f26439g), java.lang.Long.valueOf(ddVar.f26439g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.dd();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26440h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f26436d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f26437e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f26438f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f26439g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f26436d) : 0;
            if (zArr[2]) {
                e17 += b36.f.a(2, this.f26437e);
            }
            if (zArr[3]) {
                e17 += b36.f.h(3, this.f26438f);
            }
            return zArr[4] ? e17 + b36.f.h(4, this.f26439g) : e17;
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
            this.f26436d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f26437e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f26438f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f26439g = aVar2.i(intValue);
        zArr[4] = true;
        return 0;
    }
}
