package bw5;

/* loaded from: classes2.dex */
public class ej extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f26931d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f26932e;

    /* renamed from: f, reason: collision with root package name */
    public int f26933f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f26934g = new boolean[4];

    static {
        new bw5.ej();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ej parseFrom(byte[] bArr) {
        return (bw5.ej) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ej)) {
            return false;
        }
        bw5.ej ejVar = (bw5.ej) fVar;
        return n51.f.a(this.f26931d, ejVar.f26931d) && n51.f.a(this.f26932e, ejVar.f26932e) && n51.f.a(java.lang.Integer.valueOf(this.f26933f), java.lang.Integer.valueOf(ejVar.f26933f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ej();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26934g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f26931d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f26932e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f26933f);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f26931d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f26932e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            return zArr[3] ? i18 + b36.f.e(3, this.f26933f) : i18;
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
            this.f26931d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f26932e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f26933f = aVar2.g(intValue);
        zArr[3] = true;
        return 0;
    }
}
