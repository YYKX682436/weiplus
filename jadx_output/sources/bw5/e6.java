package bw5;

/* loaded from: classes8.dex */
public class e6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f26741d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f26742e;

    /* renamed from: f, reason: collision with root package name */
    public long f26743f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f26744g = new boolean[4];

    static {
        new bw5.e6();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.e6)) {
            return false;
        }
        bw5.e6 e6Var = (bw5.e6) fVar;
        return n51.f.a(this.f26741d, e6Var.f26741d) && n51.f.a(this.f26742e, e6Var.f26742e) && n51.f.a(java.lang.Long.valueOf(this.f26743f), java.lang.Long.valueOf(e6Var.f26743f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.e6();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26744g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f26741d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f26742e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.h(3, this.f26743f);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f26741d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f26742e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            return zArr[3] ? i18 + b36.f.h(3, this.f26743f) : i18;
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
            this.f26741d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f26742e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f26743f = aVar2.i(intValue);
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.e6) super.parseFrom(bArr);
    }
}
