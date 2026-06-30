package bw5;

/* loaded from: classes2.dex */
public class ps extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f31816d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f31817e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f31818f;

    /* renamed from: g, reason: collision with root package name */
    public int f31819g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.ef f31820h;

    /* renamed from: i, reason: collision with root package name */
    public long f31821i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f31822m;

    /* renamed from: n, reason: collision with root package name */
    public int f31823n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f31824o;

    /* renamed from: p, reason: collision with root package name */
    public int f31825p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f31826q = new boolean[12];

    static {
        new bw5.ps();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ps parseFrom(byte[] bArr) {
        return (bw5.ps) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ps)) {
            return false;
        }
        bw5.ps psVar = (bw5.ps) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f31816d), java.lang.Long.valueOf(psVar.f31816d)) && n51.f.a(this.f31817e, psVar.f31817e) && n51.f.a(this.f31818f, psVar.f31818f) && n51.f.a(java.lang.Integer.valueOf(this.f31819g), java.lang.Integer.valueOf(psVar.f31819g)) && n51.f.a(this.f31820h, psVar.f31820h) && n51.f.a(java.lang.Long.valueOf(this.f31821i), java.lang.Long.valueOf(psVar.f31821i)) && n51.f.a(this.f31822m, psVar.f31822m) && n51.f.a(java.lang.Integer.valueOf(this.f31823n), java.lang.Integer.valueOf(psVar.f31823n)) && n51.f.a(this.f31824o, psVar.f31824o) && n51.f.a(java.lang.Integer.valueOf(this.f31825p), java.lang.Integer.valueOf(psVar.f31825p));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ps();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31826q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f31816d);
            }
            java.lang.String str = this.f31817e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f31818f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f31819g);
            }
            bw5.ef efVar = this.f31820h;
            if (efVar != null && zArr[5]) {
                fVar.i(5, efVar.computeSize());
                this.f31820h.writeFields(fVar);
            }
            if (zArr[6]) {
                fVar.h(6, this.f31821i);
            }
            java.lang.String str3 = this.f31822m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            if (zArr[8]) {
                fVar.e(8, this.f31823n);
            }
            java.lang.String str4 = this.f31824o;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            if (zArr[11]) {
                fVar.e(11, this.f31825p);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f31816d) : 0;
            java.lang.String str5 = this.f31817e;
            if (str5 != null && zArr[2]) {
                h17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f31818f;
            if (str6 != null && zArr[3]) {
                h17 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f31819g);
            }
            bw5.ef efVar2 = this.f31820h;
            if (efVar2 != null && zArr[5]) {
                h17 += b36.f.i(5, efVar2.computeSize());
            }
            if (zArr[6]) {
                h17 += b36.f.h(6, this.f31821i);
            }
            java.lang.String str7 = this.f31822m;
            if (str7 != null && zArr[7]) {
                h17 += b36.f.j(7, str7);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f31823n);
            }
            java.lang.String str8 = this.f31824o;
            if (str8 != null && zArr[9]) {
                h17 += b36.f.j(9, str8);
            }
            return zArr[11] ? h17 + b36.f.e(11, this.f31825p) : h17;
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
                this.f31816d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f31817e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f31818f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f31819g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.ef efVar3 = new bw5.ef();
                    if (bArr != null && bArr.length > 0) {
                        efVar3.parseFrom(bArr);
                    }
                    this.f31820h = efVar3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f31821i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f31822m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f31823n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f31824o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
            default:
                return -1;
            case 11:
                this.f31825p = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
        }
    }
}
