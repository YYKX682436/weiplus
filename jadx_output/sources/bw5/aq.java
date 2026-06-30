package bw5;

/* loaded from: classes2.dex */
public class aq extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f25302d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f25303e;

    /* renamed from: f, reason: collision with root package name */
    public int f25304f;

    /* renamed from: g, reason: collision with root package name */
    public long f25305g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f25306h = new boolean[5];

    static {
        new bw5.aq();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.aq parseFrom(byte[] bArr) {
        return (bw5.aq) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.aq)) {
            return false;
        }
        bw5.aq aqVar = (bw5.aq) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f25302d), java.lang.Long.valueOf(aqVar.f25302d)) && n51.f.a(this.f25303e, aqVar.f25303e) && n51.f.a(java.lang.Integer.valueOf(this.f25304f), java.lang.Integer.valueOf(aqVar.f25304f)) && n51.f.a(java.lang.Long.valueOf(this.f25305g), java.lang.Long.valueOf(aqVar.f25305g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.aq();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25306h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f25302d);
            }
            java.lang.String str = this.f25303e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f25304f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f25305g);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f25302d) : 0;
            java.lang.String str2 = this.f25303e;
            if (str2 != null && zArr[2]) {
                h17 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                h17 += b36.f.e(3, this.f25304f);
            }
            return zArr[4] ? h17 + b36.f.h(4, this.f25305g) : h17;
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
            this.f25302d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f25303e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f25304f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f25305g = aVar2.i(intValue);
        zArr[4] = true;
        return 0;
    }
}
