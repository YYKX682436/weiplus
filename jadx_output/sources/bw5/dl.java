package bw5;

/* loaded from: classes2.dex */
public class dl extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f26519d;

    /* renamed from: e, reason: collision with root package name */
    public long f26520e;

    /* renamed from: f, reason: collision with root package name */
    public long f26521f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f26522g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f26523h = new boolean[5];

    static {
        new bw5.dl();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.dl parseFrom(byte[] bArr) {
        return (bw5.dl) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.dl)) {
            return false;
        }
        bw5.dl dlVar = (bw5.dl) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f26519d), java.lang.Integer.valueOf(dlVar.f26519d)) && n51.f.a(java.lang.Long.valueOf(this.f26520e), java.lang.Long.valueOf(dlVar.f26520e)) && n51.f.a(java.lang.Long.valueOf(this.f26521f), java.lang.Long.valueOf(dlVar.f26521f)) && n51.f.a(this.f26522g, dlVar.f26522g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.dl();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26523h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f26519d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f26520e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f26521f);
            }
            java.lang.String str = this.f26522g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f26519d) : 0;
            if (zArr[2]) {
                e17 += b36.f.h(2, this.f26520e);
            }
            if (zArr[3]) {
                e17 += b36.f.h(3, this.f26521f);
            }
            java.lang.String str2 = this.f26522g;
            return (str2 == null || !zArr[4]) ? e17 : e17 + b36.f.j(4, str2);
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
            this.f26519d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f26520e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f26521f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f26522g = aVar2.k(intValue);
        zArr[4] = true;
        return 0;
    }
}
