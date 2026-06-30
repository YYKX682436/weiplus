package bw5;

/* loaded from: classes2.dex */
public class fx extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f27555d;

    /* renamed from: e, reason: collision with root package name */
    public long f27556e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f27557f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f27558g = new boolean[4];

    static {
        new bw5.fx();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fx parseFrom(byte[] bArr) {
        return (bw5.fx) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fx)) {
            return false;
        }
        bw5.fx fxVar = (bw5.fx) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f27555d), java.lang.Long.valueOf(fxVar.f27555d)) && n51.f.a(java.lang.Long.valueOf(this.f27556e), java.lang.Long.valueOf(fxVar.f27556e)) && n51.f.a(this.f27557f, fxVar.f27557f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.fx();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27558g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f27555d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f27556e);
            }
            java.lang.String str = this.f27557f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f27555d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f27556e);
            }
            java.lang.String str2 = this.f27557f;
            return (str2 == null || !zArr[3]) ? h17 : h17 + b36.f.j(3, str2);
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
            this.f27555d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f27556e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f27557f = aVar2.k(intValue);
        zArr[3] = true;
        return 0;
    }
}
