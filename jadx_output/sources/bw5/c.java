package bw5;

/* loaded from: classes2.dex */
public class c extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f25866d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f25867e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f25868f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f25869g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f25870h = new boolean[5];

    static {
        new bw5.c();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.c parseFrom(byte[] bArr) {
        return (bw5.c) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.c)) {
            return false;
        }
        bw5.c cVar = (bw5.c) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f25866d), java.lang.Integer.valueOf(cVar.f25866d)) && n51.f.a(this.f25867e, cVar.f25867e) && n51.f.a(this.f25868f, cVar.f25868f) && n51.f.a(java.lang.Boolean.valueOf(this.f25869g), java.lang.Boolean.valueOf(cVar.f25869g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.c();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25870h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f25866d);
            }
            java.lang.String str = this.f25867e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f25868f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.a(4, this.f25869g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f25866d) : 0;
            java.lang.String str3 = this.f25867e;
            if (str3 != null && zArr[2]) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f25868f;
            if (str4 != null && zArr[3]) {
                e17 += b36.f.j(3, str4);
            }
            return zArr[4] ? e17 + b36.f.a(4, this.f25869g) : e17;
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
            this.f25866d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f25867e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f25868f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f25869g = aVar2.c(intValue);
        zArr[4] = true;
        return 0;
    }
}
