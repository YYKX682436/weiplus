package bw5;

/* loaded from: classes2.dex */
public class ux extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f34069d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f34070e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f34071f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f34072g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f34073h = new boolean[5];

    static {
        new bw5.ux();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ux parseFrom(byte[] bArr) {
        return (bw5.ux) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ux)) {
            return false;
        }
        bw5.ux uxVar = (bw5.ux) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f34069d), java.lang.Boolean.valueOf(uxVar.f34069d)) && n51.f.a(this.f34070e, uxVar.f34070e) && n51.f.a(java.lang.Boolean.valueOf(this.f34071f), java.lang.Boolean.valueOf(uxVar.f34071f)) && n51.f.a(java.lang.Boolean.valueOf(this.f34072g), java.lang.Boolean.valueOf(uxVar.f34072g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ux();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34073h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f34069d);
            }
            java.lang.String str = this.f34070e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.a(3, this.f34071f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f34072g);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f34069d) : 0;
            java.lang.String str2 = this.f34070e;
            if (str2 != null && zArr[2]) {
                a17 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                a17 += b36.f.a(3, this.f34071f);
            }
            return zArr[4] ? a17 + b36.f.a(4, this.f34072g) : a17;
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
            this.f34069d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f34070e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f34071f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f34072g = aVar2.c(intValue);
        zArr[4] = true;
        return 0;
    }
}
