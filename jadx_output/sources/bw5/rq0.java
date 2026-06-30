package bw5;

/* loaded from: classes14.dex */
public class rq0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f32653d;

    /* renamed from: e, reason: collision with root package name */
    public float f32654e;

    /* renamed from: f, reason: collision with root package name */
    public float f32655f;

    /* renamed from: g, reason: collision with root package name */
    public float f32656g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f32657h = new boolean[5];

    static {
        new bw5.rq0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.rq0 parseFrom(byte[] bArr) {
        return (bw5.rq0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.rq0)) {
            return false;
        }
        bw5.rq0 rq0Var = (bw5.rq0) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f32653d), java.lang.Float.valueOf(rq0Var.f32653d)) && n51.f.a(java.lang.Float.valueOf(this.f32654e), java.lang.Float.valueOf(rq0Var.f32654e)) && n51.f.a(java.lang.Float.valueOf(this.f32655f), java.lang.Float.valueOf(rq0Var.f32655f)) && n51.f.a(java.lang.Float.valueOf(this.f32656g), java.lang.Float.valueOf(rq0Var.f32656g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.rq0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32657h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f32653d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f32654e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f32655f);
            }
            if (zArr[4]) {
                fVar.d(4, this.f32656g);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f32653d) : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f32654e);
            }
            if (zArr[3]) {
                d17 += b36.f.d(3, this.f32655f);
            }
            return zArr[4] ? d17 + b36.f.d(4, this.f32656g) : d17;
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
            this.f32653d = aVar2.f(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f32654e = aVar2.f(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f32655f = aVar2.f(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f32656g = aVar2.f(intValue);
        zArr[4] = true;
        return 0;
    }
}
