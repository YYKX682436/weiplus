package bw5;

/* loaded from: classes2.dex */
public class tp extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f33566d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33567e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f33568f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f33569g = new boolean[4];

    static {
        new bw5.tp();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.tp parseFrom(byte[] bArr) {
        return (bw5.tp) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tp)) {
            return false;
        }
        bw5.tp tpVar = (bw5.tp) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f33566d), java.lang.Long.valueOf(tpVar.f33566d)) && n51.f.a(this.f33567e, tpVar.f33567e) && n51.f.a(this.f33568f, tpVar.f33568f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.tp();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33569g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f33566d);
            }
            java.lang.String str = this.f33567e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f33568f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f33566d) : 0;
            java.lang.String str3 = this.f33567e;
            if (str3 != null && zArr[2]) {
                h17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f33568f;
            return (str4 == null || !zArr[3]) ? h17 : h17 + b36.f.j(3, str4);
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
            this.f33566d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f33567e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f33568f = aVar2.k(intValue);
        zArr[3] = true;
        return 0;
    }
}
