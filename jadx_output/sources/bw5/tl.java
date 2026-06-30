package bw5;

/* loaded from: classes2.dex */
public class tl extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f33501d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33502e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f33503f;

    /* renamed from: g, reason: collision with root package name */
    public int f33504g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f33505h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f33506i = new boolean[6];

    static {
        new bw5.tl();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.tl parseFrom(byte[] bArr) {
        return (bw5.tl) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tl)) {
            return false;
        }
        bw5.tl tlVar = (bw5.tl) fVar;
        return n51.f.a(this.f33501d, tlVar.f33501d) && n51.f.a(this.f33502e, tlVar.f33502e) && n51.f.a(this.f33503f, tlVar.f33503f) && n51.f.a(java.lang.Integer.valueOf(this.f33504g), java.lang.Integer.valueOf(tlVar.f33504g)) && n51.f.a(java.lang.Boolean.valueOf(this.f33505h), java.lang.Boolean.valueOf(tlVar.f33505h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.tl();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f33506i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f33501d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f33502e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f33503f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f33504g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f33505h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f33501d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f33502e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f33503f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f33504g);
            }
            return zArr[5] ? i18 + b36.f.a(5, this.f33505h) : i18;
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
            this.f33501d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f33502e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f33503f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f33504g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f33505h = aVar2.c(intValue);
        zArr[5] = true;
        return 0;
    }
}
