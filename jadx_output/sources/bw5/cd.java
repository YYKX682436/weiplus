package bw5;

/* loaded from: classes4.dex */
public class cd extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f26051d;

    /* renamed from: e, reason: collision with root package name */
    public float f26052e;

    /* renamed from: f, reason: collision with root package name */
    public float f26053f;

    /* renamed from: g, reason: collision with root package name */
    public float f26054g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f26055h = new boolean[5];

    static {
        new bw5.cd();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.cd parseFrom(byte[] bArr) {
        return (bw5.cd) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.cd)) {
            return false;
        }
        bw5.cd cdVar = (bw5.cd) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f26051d), java.lang.Float.valueOf(cdVar.f26051d)) && n51.f.a(java.lang.Float.valueOf(this.f26052e), java.lang.Float.valueOf(cdVar.f26052e)) && n51.f.a(java.lang.Float.valueOf(this.f26053f), java.lang.Float.valueOf(cdVar.f26053f)) && n51.f.a(java.lang.Float.valueOf(this.f26054g), java.lang.Float.valueOf(cdVar.f26054g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.cd();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26055h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f26051d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f26052e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f26053f);
            }
            if (zArr[4]) {
                fVar.d(4, this.f26054g);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f26051d) : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f26052e);
            }
            if (zArr[3]) {
                d17 += b36.f.d(3, this.f26053f);
            }
            return zArr[4] ? d17 + b36.f.d(4, this.f26054g) : d17;
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
            this.f26051d = aVar2.f(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f26052e = aVar2.f(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f26053f = aVar2.f(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f26054g = aVar2.f(intValue);
        zArr[4] = true;
        return 0;
    }
}
