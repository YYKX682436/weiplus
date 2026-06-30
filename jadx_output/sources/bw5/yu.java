package bw5;

/* loaded from: classes2.dex */
public class yu extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.pj f35701d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f35702e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f35703f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f35704g;

    /* renamed from: h, reason: collision with root package name */
    public int f35705h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f35706i = new boolean[6];

    static {
        new bw5.yu();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.yu parseFrom(byte[] bArr) {
        return (bw5.yu) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yu)) {
            return false;
        }
        bw5.yu yuVar = (bw5.yu) fVar;
        return n51.f.a(this.f35701d, yuVar.f35701d) && n51.f.a(this.f35702e, yuVar.f35702e) && n51.f.a(java.lang.Boolean.valueOf(this.f35703f), java.lang.Boolean.valueOf(yuVar.f35703f)) && n51.f.a(this.f35704g, yuVar.f35704g) && n51.f.a(java.lang.Integer.valueOf(this.f35705h), java.lang.Integer.valueOf(yuVar.f35705h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.yu();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f35706i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.pj pjVar = this.f35701d;
            if (pjVar != null && zArr[1]) {
                fVar.i(1, pjVar.computeSize());
                this.f35701d.writeFields(fVar);
            }
            java.lang.String str = this.f35702e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.a(3, this.f35703f);
            }
            java.lang.String str2 = this.f35704g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f35705h);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.pj pjVar2 = this.f35701d;
            if (pjVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, pjVar2.computeSize());
            }
            java.lang.String str3 = this.f35702e;
            if (str3 != null && zArr[2]) {
                i18 += b36.f.j(2, str3);
            }
            if (zArr[3]) {
                i18 += b36.f.a(3, this.f35703f);
            }
            java.lang.String str4 = this.f35704g;
            if (str4 != null && zArr[4]) {
                i18 += b36.f.j(4, str4);
            }
            return zArr[5] ? i18 + b36.f.e(5, this.f35705h) : i18;
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.pj pjVar3 = new bw5.pj();
                if (bArr != null && bArr.length > 0) {
                    pjVar3.parseFrom(bArr);
                }
                this.f35701d = pjVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f35702e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f35703f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f35704g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f35705h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }
}
