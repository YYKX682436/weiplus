package bw5;

/* loaded from: classes2.dex */
public class ss extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f33125d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33126e;

    /* renamed from: f, reason: collision with root package name */
    public int f33127f;

    /* renamed from: g, reason: collision with root package name */
    public int f33128g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f33129h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f33130i = new boolean[6];

    static {
        new bw5.ss();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ss parseFrom(byte[] bArr) {
        return (bw5.ss) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ss)) {
            return false;
        }
        bw5.ss ssVar = (bw5.ss) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f33125d), java.lang.Long.valueOf(ssVar.f33125d)) && n51.f.a(this.f33126e, ssVar.f33126e) && n51.f.a(java.lang.Integer.valueOf(this.f33127f), java.lang.Integer.valueOf(ssVar.f33127f)) && n51.f.a(java.lang.Integer.valueOf(this.f33128g), java.lang.Integer.valueOf(ssVar.f33128g)) && n51.f.a(this.f33129h, ssVar.f33129h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ss();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33130i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f33125d);
            }
            java.lang.String str = this.f33126e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f33127f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f33128g);
            }
            com.tencent.mm.protobuf.g gVar = this.f33129h;
            if (gVar != null && zArr[5]) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f33125d) : 0;
            java.lang.String str2 = this.f33126e;
            if (str2 != null && zArr[2]) {
                h17 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                h17 += b36.f.e(3, this.f33127f);
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f33128g);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f33129h;
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
            this.f33125d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f33126e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f33127f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f33128g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f33129h = aVar2.d(intValue);
        zArr[5] = true;
        return 0;
    }
}
