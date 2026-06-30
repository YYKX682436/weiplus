package bw5;

/* loaded from: classes2.dex */
public class uz extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f34078d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f34079e;

    /* renamed from: f, reason: collision with root package name */
    public int f34080f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f34081g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f34082h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f34083i = new boolean[6];

    static {
        new bw5.uz();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.uz parseFrom(byte[] bArr) {
        return (bw5.uz) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.uz)) {
            return false;
        }
        bw5.uz uzVar = (bw5.uz) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f34078d), java.lang.Long.valueOf(uzVar.f34078d)) && n51.f.a(this.f34079e, uzVar.f34079e) && n51.f.a(java.lang.Integer.valueOf(this.f34080f), java.lang.Integer.valueOf(uzVar.f34080f)) && n51.f.a(this.f34081g, uzVar.f34081g) && n51.f.a(this.f34082h, uzVar.f34082h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.uz();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34083i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f34078d);
            }
            java.lang.String str = this.f34079e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f34080f);
            }
            java.lang.String str2 = this.f34081g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f34082h;
            if (gVar != null && zArr[5]) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f34078d) : 0;
            java.lang.String str3 = this.f34079e;
            if (str3 != null && zArr[2]) {
                h17 += b36.f.j(2, str3);
            }
            if (zArr[3]) {
                h17 += b36.f.e(3, this.f34080f);
            }
            java.lang.String str4 = this.f34081g;
            if (str4 != null && zArr[4]) {
                h17 += b36.f.j(4, str4);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f34082h;
            return (gVar2 == null || !zArr[5]) ? h17 : h17 + b36.f.b(5, gVar2);
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
            this.f34078d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f34079e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f34080f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f34081g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f34082h = aVar2.d(intValue);
        zArr[5] = true;
        return 0;
    }
}
