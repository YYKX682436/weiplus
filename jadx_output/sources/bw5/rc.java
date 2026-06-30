package bw5;

/* loaded from: classes2.dex */
public class rc extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32485d;

    /* renamed from: e, reason: collision with root package name */
    public float f32486e;

    /* renamed from: f, reason: collision with root package name */
    public float f32487f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f32488g;

    /* renamed from: h, reason: collision with root package name */
    public long f32489h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f32490i = new boolean[6];

    static {
        new bw5.rc();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.rc parseFrom(byte[] bArr) {
        return (bw5.rc) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.rc)) {
            return false;
        }
        bw5.rc rcVar = (bw5.rc) fVar;
        return n51.f.a(this.f32485d, rcVar.f32485d) && n51.f.a(java.lang.Float.valueOf(this.f32486e), java.lang.Float.valueOf(rcVar.f32486e)) && n51.f.a(java.lang.Float.valueOf(this.f32487f), java.lang.Float.valueOf(rcVar.f32487f)) && n51.f.a(this.f32488g, rcVar.f32488g) && n51.f.a(java.lang.Long.valueOf(this.f32489h), java.lang.Long.valueOf(rcVar.f32489h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.rc();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f32490i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f32485d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.d(2, this.f32486e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f32487f);
            }
            java.lang.String str2 = this.f32488g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.h(5, this.f32489h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f32485d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (zArr[2]) {
                i18 += b36.f.d(2, this.f32486e);
            }
            if (zArr[3]) {
                i18 += b36.f.d(3, this.f32487f);
            }
            java.lang.String str4 = this.f32488g;
            if (str4 != null && zArr[4]) {
                i18 += b36.f.j(4, str4);
            }
            return zArr[5] ? i18 + b36.f.h(5, this.f32489h) : i18;
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
            this.f32485d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f32486e = aVar2.f(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f32487f = aVar2.f(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f32488g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f32489h = aVar2.i(intValue);
        zArr[5] = true;
        return 0;
    }
}
