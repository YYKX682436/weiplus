package bw5;

/* loaded from: classes2.dex */
public class te extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f33408d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33409e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f33410f;

    /* renamed from: g, reason: collision with root package name */
    public long f33411g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f33412h = new boolean[5];

    static {
        new bw5.te();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.te parseFrom(byte[] bArr) {
        return (bw5.te) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.te)) {
            return false;
        }
        bw5.te teVar = (bw5.te) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f33408d), java.lang.Long.valueOf(teVar.f33408d)) && n51.f.a(this.f33409e, teVar.f33409e) && n51.f.a(this.f33410f, teVar.f33410f) && n51.f.a(java.lang.Long.valueOf(this.f33411g), java.lang.Long.valueOf(teVar.f33411g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.te();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33412h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f33408d);
            }
            java.lang.String str = this.f33409e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f33410f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.h(4, this.f33411g);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f33408d) : 0;
            java.lang.String str3 = this.f33409e;
            if (str3 != null && zArr[2]) {
                h17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f33410f;
            if (str4 != null && zArr[3]) {
                h17 += b36.f.j(3, str4);
            }
            return zArr[4] ? h17 + b36.f.h(4, this.f33411g) : h17;
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
            this.f33408d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f33409e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f33410f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f33411g = aVar2.i(intValue);
        zArr[4] = true;
        return 0;
    }
}
