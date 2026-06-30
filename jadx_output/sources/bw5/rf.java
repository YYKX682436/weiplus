package bw5;

/* loaded from: classes2.dex */
public class rf extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f32502d;

    /* renamed from: e, reason: collision with root package name */
    public int f32503e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f32504f;

    /* renamed from: g, reason: collision with root package name */
    public int f32505g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f32506h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f32507i = new boolean[22];

    static {
        new bw5.rf();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.rf parseFrom(byte[] bArr) {
        return (bw5.rf) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.rf)) {
            return false;
        }
        bw5.rf rfVar = (bw5.rf) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f32502d), java.lang.Boolean.valueOf(rfVar.f32502d)) && n51.f.a(java.lang.Integer.valueOf(this.f32503e), java.lang.Integer.valueOf(rfVar.f32503e)) && n51.f.a(java.lang.Boolean.valueOf(this.f32504f), java.lang.Boolean.valueOf(rfVar.f32504f)) && n51.f.a(java.lang.Integer.valueOf(this.f32505g), java.lang.Integer.valueOf(rfVar.f32505g)) && n51.f.a(this.f32506h, rfVar.f32506h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.rf();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32507i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f32502d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f32503e);
            }
            if (zArr[11]) {
                fVar.a(11, this.f32504f);
            }
            if (zArr[12]) {
                fVar.e(12, this.f32505g);
            }
            com.tencent.mm.protobuf.g gVar = this.f32506h;
            if (gVar != null && zArr[21]) {
                fVar.b(21, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f32502d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f32503e);
            }
            if (zArr[11]) {
                a17 += b36.f.a(11, this.f32504f);
            }
            if (zArr[12]) {
                a17 += b36.f.e(12, this.f32505g);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f32506h;
            return (gVar2 == null || !zArr[21]) ? a17 : a17 + b36.f.b(21, gVar2);
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
            this.f32502d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f32503e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 11) {
            this.f32504f = aVar2.c(intValue);
            zArr[11] = true;
            return 0;
        }
        if (intValue == 12) {
            this.f32505g = aVar2.g(intValue);
            zArr[12] = true;
            return 0;
        }
        if (intValue != 21) {
            return -1;
        }
        this.f32506h = aVar2.d(intValue);
        zArr[21] = true;
        return 0;
    }
}
