package bw5;

/* loaded from: classes2.dex */
public class mv extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30390d;

    /* renamed from: e, reason: collision with root package name */
    public int f30391e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f30392f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f30393g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f30394h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f30395i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.bf f30396m;

    /* renamed from: n, reason: collision with root package name */
    public long f30397n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f30398o = new boolean[9];

    static {
        new bw5.mv();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.mv parseFrom(byte[] bArr) {
        return (bw5.mv) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.mv)) {
            return false;
        }
        bw5.mv mvVar = (bw5.mv) fVar;
        return n51.f.a(this.f30390d, mvVar.f30390d) && n51.f.a(java.lang.Integer.valueOf(this.f30391e), java.lang.Integer.valueOf(mvVar.f30391e)) && n51.f.a(this.f30392f, mvVar.f30392f) && n51.f.a(this.f30393g, mvVar.f30393g) && n51.f.a(this.f30394h, mvVar.f30394h) && n51.f.a(this.f30395i, mvVar.f30395i) && n51.f.a(this.f30396m, mvVar.f30396m) && n51.f.a(java.lang.Long.valueOf(this.f30397n), java.lang.Long.valueOf(mvVar.f30397n));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.mv();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f30398o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f30390d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f30391e);
            }
            java.lang.String str2 = this.f30392f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f30393g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            com.tencent.mm.protobuf.g gVar = this.f30394h;
            if (gVar != null && zArr[5]) {
                fVar.b(5, gVar);
            }
            java.lang.String str4 = this.f30395i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            bw5.bf bfVar = this.f30396m;
            if (bfVar != null && zArr[7]) {
                fVar.i(7, bfVar.computeSize());
                this.f30396m.writeFields(fVar);
            }
            if (zArr[8]) {
                fVar.h(8, this.f30397n);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f30390d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f30391e);
            }
            java.lang.String str6 = this.f30392f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f30393g;
            if (str7 != null && zArr[4]) {
                i18 += b36.f.j(4, str7);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f30394h;
            if (gVar2 != null && zArr[5]) {
                i18 += b36.f.b(5, gVar2);
            }
            java.lang.String str8 = this.f30395i;
            if (str8 != null && zArr[6]) {
                i18 += b36.f.j(6, str8);
            }
            bw5.bf bfVar2 = this.f30396m;
            if (bfVar2 != null && zArr[7]) {
                i18 += b36.f.i(7, bfVar2.computeSize());
            }
            return zArr[8] ? i18 + b36.f.h(8, this.f30397n) : i18;
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
                this.f30390d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30391e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30392f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30393g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30394h = aVar2.d(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30395i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.bf bfVar3 = new bw5.bf();
                    if (bArr != null && bArr.length > 0) {
                        bfVar3.parseFrom(bArr);
                    }
                    this.f30396m = bfVar3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f30397n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
