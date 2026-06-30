package bw5;

/* loaded from: classes2.dex */
public class qt extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32280d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f32281e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f32282f;

    /* renamed from: g, reason: collision with root package name */
    public float f32283g;

    /* renamed from: h, reason: collision with root package name */
    public float f32284h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f32285i = new boolean[6];

    static {
        new bw5.qt();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.qt parseFrom(byte[] bArr) {
        return (bw5.qt) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qt)) {
            return false;
        }
        bw5.qt qtVar = (bw5.qt) fVar;
        return n51.f.a(this.f32280d, qtVar.f32280d) && n51.f.a(java.lang.Boolean.valueOf(this.f32281e), java.lang.Boolean.valueOf(qtVar.f32281e)) && n51.f.a(java.lang.Boolean.valueOf(this.f32282f), java.lang.Boolean.valueOf(qtVar.f32282f)) && n51.f.a(java.lang.Float.valueOf(this.f32283g), java.lang.Float.valueOf(qtVar.f32283g)) && n51.f.a(java.lang.Float.valueOf(this.f32284h), java.lang.Float.valueOf(qtVar.f32284h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.qt();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f32285i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f32280d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.a(2, this.f32281e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f32282f);
            }
            if (zArr[4]) {
                fVar.d(4, this.f32283g);
            }
            if (zArr[5]) {
                fVar.d(5, this.f32284h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f32280d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.a(2, this.f32281e);
            }
            if (zArr[3]) {
                i18 += b36.f.a(3, this.f32282f);
            }
            if (zArr[4]) {
                i18 += b36.f.d(4, this.f32283g);
            }
            return zArr[5] ? i18 + b36.f.d(5, this.f32284h) : i18;
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
            this.f32280d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f32281e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f32282f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f32283g = aVar2.f(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f32284h = aVar2.f(intValue);
        zArr[5] = true;
        return 0;
    }
}
