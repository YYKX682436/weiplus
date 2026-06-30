package bw5;

/* loaded from: classes2.dex */
public class qo extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f32203d;

    /* renamed from: e, reason: collision with root package name */
    public int f32204e;

    /* renamed from: f, reason: collision with root package name */
    public int f32205f;

    /* renamed from: g, reason: collision with root package name */
    public int f32206g;

    /* renamed from: h, reason: collision with root package name */
    public int f32207h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f32208i = new boolean[6];

    static {
        new bw5.qo();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.qo parseFrom(byte[] bArr) {
        return (bw5.qo) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qo)) {
            return false;
        }
        bw5.qo qoVar = (bw5.qo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f32203d), java.lang.Integer.valueOf(qoVar.f32203d)) && n51.f.a(java.lang.Integer.valueOf(this.f32204e), java.lang.Integer.valueOf(qoVar.f32204e)) && n51.f.a(java.lang.Integer.valueOf(this.f32205f), java.lang.Integer.valueOf(qoVar.f32205f)) && n51.f.a(java.lang.Integer.valueOf(this.f32206g), java.lang.Integer.valueOf(qoVar.f32206g)) && n51.f.a(java.lang.Integer.valueOf(this.f32207h), java.lang.Integer.valueOf(qoVar.f32207h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.qo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32208i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f32203d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f32204e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f32205f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f32206g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f32207h);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f32203d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f32204e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f32205f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f32206g);
            }
            return zArr[5] ? e17 + b36.f.e(5, this.f32207h) : e17;
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
            this.f32203d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f32204e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f32205f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f32206g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f32207h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }
}
