package bw5;

/* loaded from: classes2.dex */
public class um extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ql f33973d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.tm f33974e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f33975f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f33976g;

    /* renamed from: h, reason: collision with root package name */
    public long f33977h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f33978i;

    /* renamed from: m, reason: collision with root package name */
    public int f33979m;

    /* renamed from: n, reason: collision with root package name */
    public int f33980n;

    /* renamed from: o, reason: collision with root package name */
    public int f33981o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f33982p = new boolean[10];

    static {
        new bw5.um();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.um parseFrom(byte[] bArr) {
        return (bw5.um) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.um)) {
            return false;
        }
        bw5.um umVar = (bw5.um) fVar;
        return n51.f.a(this.f33973d, umVar.f33973d) && n51.f.a(this.f33974e, umVar.f33974e) && n51.f.a(this.f33975f, umVar.f33975f) && n51.f.a(this.f33976g, umVar.f33976g) && n51.f.a(java.lang.Long.valueOf(this.f33977h), java.lang.Long.valueOf(umVar.f33977h)) && n51.f.a(this.f33978i, umVar.f33978i) && n51.f.a(java.lang.Integer.valueOf(this.f33979m), java.lang.Integer.valueOf(umVar.f33979m)) && n51.f.a(java.lang.Integer.valueOf(this.f33980n), java.lang.Integer.valueOf(umVar.f33980n)) && n51.f.a(java.lang.Integer.valueOf(this.f33981o), java.lang.Integer.valueOf(umVar.f33981o));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.um();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f33982p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ql qlVar = this.f33973d;
            if (qlVar != null && zArr[1]) {
                fVar.i(1, qlVar.computeSize());
                this.f33973d.writeFields(fVar);
            }
            bw5.tm tmVar = this.f33974e;
            if (tmVar != null && zArr[2]) {
                fVar.e(2, tmVar.f33515d);
            }
            java.lang.String str = this.f33975f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f33976g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.h(5, this.f33977h);
            }
            java.lang.String str3 = this.f33978i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            if (zArr[7]) {
                fVar.e(7, this.f33979m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f33980n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f33981o);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ql qlVar2 = this.f33973d;
            if (qlVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, qlVar2.computeSize());
            }
            bw5.tm tmVar2 = this.f33974e;
            if (tmVar2 != null && zArr[2]) {
                i18 += b36.f.e(2, tmVar2.f33515d);
            }
            java.lang.String str4 = this.f33975f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f33976g;
            if (str5 != null && zArr[4]) {
                i18 += b36.f.j(4, str5);
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f33977h);
            }
            java.lang.String str6 = this.f33978i;
            if (str6 != null && zArr[6]) {
                i18 += b36.f.j(6, str6);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f33979m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f33980n);
            }
            return zArr[9] ? i18 + b36.f.e(9, this.f33981o) : i18;
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.ql qlVar3 = new bw5.ql();
                    if (bArr != null && bArr.length > 0) {
                        qlVar3.parseFrom(bArr);
                    }
                    this.f33973d = qlVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                int g17 = aVar2.g(intValue);
                this.f33974e = g17 != 1 ? g17 != 2 ? null : bw5.tm.Video : bw5.tm.Audio;
                zArr[2] = true;
                return 0;
            case 3:
                this.f33975f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33976g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33977h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f33978i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f33979m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f33980n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f33981o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
