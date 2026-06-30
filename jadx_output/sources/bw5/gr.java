package bw5;

/* loaded from: classes2.dex */
public class gr extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f27968d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f27969e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.ae f27970f;

    /* renamed from: g, reason: collision with root package name */
    public long f27971g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f27972h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f27973i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f27974m = new boolean[7];

    static {
        new bw5.gr();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gr parseFrom(byte[] bArr) {
        return (bw5.gr) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gr)) {
            return false;
        }
        bw5.gr grVar = (bw5.gr) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f27968d), java.lang.Long.valueOf(grVar.f27968d)) && n51.f.a(this.f27969e, grVar.f27969e) && n51.f.a(this.f27970f, grVar.f27970f) && n51.f.a(java.lang.Long.valueOf(this.f27971g), java.lang.Long.valueOf(grVar.f27971g)) && n51.f.a(this.f27972h, grVar.f27972h) && n51.f.a(this.f27973i, grVar.f27973i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.gr();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27974m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f27968d);
            }
            com.tencent.mm.protobuf.g gVar = this.f27969e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            bw5.ae aeVar = this.f27970f;
            if (aeVar != null && zArr[3]) {
                fVar.i(3, aeVar.computeSize());
                this.f27970f.writeFields(fVar);
            }
            if (zArr[4]) {
                fVar.h(4, this.f27971g);
            }
            java.lang.String str = this.f27972h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f27973i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f27968d) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f27969e;
            if (gVar2 != null && zArr[2]) {
                h17 += b36.f.b(2, gVar2);
            }
            bw5.ae aeVar2 = this.f27970f;
            if (aeVar2 != null && zArr[3]) {
                h17 += b36.f.i(3, aeVar2.computeSize());
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f27971g);
            }
            java.lang.String str3 = this.f27972h;
            if (str3 != null && zArr[5]) {
                h17 += b36.f.j(5, str3);
            }
            java.lang.String str4 = this.f27973i;
            return (str4 == null || !zArr[6]) ? h17 : h17 + b36.f.j(6, str4);
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
                this.f27968d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27969e = aVar2.d(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.ae aeVar3 = new bw5.ae();
                    if (bArr != null && bArr.length > 0) {
                        aeVar3.parseFrom(bArr);
                    }
                    this.f27970f = aeVar3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f27971g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f27972h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27973i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
