package bw5;

/* loaded from: classes2.dex */
public class hk extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f28251d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f28252e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.ae f28253f;

    /* renamed from: g, reason: collision with root package name */
    public int f28254g;

    /* renamed from: h, reason: collision with root package name */
    public int f28255h;

    /* renamed from: i, reason: collision with root package name */
    public long f28256i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f28257m = new boolean[7];

    static {
        new bw5.hk();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.hk parseFrom(byte[] bArr) {
        return (bw5.hk) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hk)) {
            return false;
        }
        bw5.hk hkVar = (bw5.hk) fVar;
        return n51.f.a(this.f28251d, hkVar.f28251d) && n51.f.a(this.f28252e, hkVar.f28252e) && n51.f.a(this.f28253f, hkVar.f28253f) && n51.f.a(java.lang.Integer.valueOf(this.f28254g), java.lang.Integer.valueOf(hkVar.f28254g)) && n51.f.a(java.lang.Integer.valueOf(this.f28255h), java.lang.Integer.valueOf(hkVar.f28255h)) && n51.f.a(java.lang.Long.valueOf(this.f28256i), java.lang.Long.valueOf(hkVar.f28256i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.hk();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f28257m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f28251d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f28252e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            bw5.ae aeVar = this.f28253f;
            if (aeVar != null && zArr[3]) {
                fVar.i(3, aeVar.computeSize());
                this.f28253f.writeFields(fVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f28254g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f28255h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f28256i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f28251d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f28252e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            bw5.ae aeVar2 = this.f28253f;
            if (aeVar2 != null && zArr[3]) {
                i18 += b36.f.i(3, aeVar2.computeSize());
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f28254g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f28255h);
            }
            return zArr[6] ? i18 + b36.f.h(6, this.f28256i) : i18;
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
        switch (intValue) {
            case 1:
                this.f28251d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f28252e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.ae aeVar3 = new bw5.ae();
                    if (bArr != null && bArr.length > 0) {
                        aeVar3.parseFrom(bArr);
                    }
                    this.f28253f = aeVar3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f28254g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f28255h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f28256i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
