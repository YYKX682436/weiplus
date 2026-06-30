package bw5;

/* loaded from: classes2.dex */
public class cl extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f26127d;

    /* renamed from: e, reason: collision with root package name */
    public long f26128e;

    /* renamed from: f, reason: collision with root package name */
    public int f26129f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f26130g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.bl f26131h;

    /* renamed from: i, reason: collision with root package name */
    public long f26132i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f26133m;

    /* renamed from: n, reason: collision with root package name */
    public long f26134n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f26135o;

    /* renamed from: p, reason: collision with root package name */
    public int f26136p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f26137q;

    /* renamed from: r, reason: collision with root package name */
    public int f26138r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f26139s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f26140t = new boolean[14];

    static {
        new bw5.cl();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.cl parseFrom(byte[] bArr) {
        return (bw5.cl) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.cl)) {
            return false;
        }
        bw5.cl clVar = (bw5.cl) fVar;
        return n51.f.a(this.f26127d, clVar.f26127d) && n51.f.a(java.lang.Long.valueOf(this.f26128e), java.lang.Long.valueOf(clVar.f26128e)) && n51.f.a(java.lang.Integer.valueOf(this.f26129f), java.lang.Integer.valueOf(clVar.f26129f)) && n51.f.a(java.lang.Boolean.valueOf(this.f26130g), java.lang.Boolean.valueOf(clVar.f26130g)) && n51.f.a(this.f26131h, clVar.f26131h) && n51.f.a(java.lang.Long.valueOf(this.f26132i), java.lang.Long.valueOf(clVar.f26132i)) && n51.f.a(java.lang.Boolean.valueOf(this.f26133m), java.lang.Boolean.valueOf(clVar.f26133m)) && n51.f.a(java.lang.Long.valueOf(this.f26134n), java.lang.Long.valueOf(clVar.f26134n)) && n51.f.a(this.f26135o, clVar.f26135o) && n51.f.a(java.lang.Integer.valueOf(this.f26136p), java.lang.Integer.valueOf(clVar.f26136p)) && n51.f.a(this.f26137q, clVar.f26137q) && n51.f.a(java.lang.Integer.valueOf(this.f26138r), java.lang.Integer.valueOf(clVar.f26138r)) && n51.f.a(this.f26139s, clVar.f26139s);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.cl();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26140t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f26127d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f26128e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f26129f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f26130g);
            }
            bw5.bl blVar = this.f26131h;
            if (blVar != null && zArr[5]) {
                fVar.i(5, blVar.computeSize());
                this.f26131h.writeFields(fVar);
            }
            if (zArr[6]) {
                fVar.h(6, this.f26132i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f26133m);
            }
            if (zArr[8]) {
                fVar.h(8, this.f26134n);
            }
            java.lang.String str2 = this.f26135o;
            if (str2 != null && zArr[9]) {
                fVar.j(9, str2);
            }
            if (zArr[10]) {
                fVar.e(10, this.f26136p);
            }
            java.lang.String str3 = this.f26137q;
            if (str3 != null && zArr[11]) {
                fVar.j(11, str3);
            }
            if (zArr[12]) {
                fVar.e(12, this.f26138r);
            }
            java.lang.String str4 = this.f26139s;
            if (str4 == null || !zArr[13]) {
                return 0;
            }
            fVar.j(13, str4);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f26127d;
            int j17 = (str5 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str5);
            if (zArr[2]) {
                j17 += b36.f.h(2, this.f26128e);
            }
            if (zArr[3]) {
                j17 += b36.f.e(3, this.f26129f);
            }
            if (zArr[4]) {
                j17 += b36.f.a(4, this.f26130g);
            }
            bw5.bl blVar2 = this.f26131h;
            if (blVar2 != null && zArr[5]) {
                j17 += b36.f.i(5, blVar2.computeSize());
            }
            if (zArr[6]) {
                j17 += b36.f.h(6, this.f26132i);
            }
            if (zArr[7]) {
                j17 += b36.f.a(7, this.f26133m);
            }
            if (zArr[8]) {
                j17 += b36.f.h(8, this.f26134n);
            }
            java.lang.String str6 = this.f26135o;
            if (str6 != null && zArr[9]) {
                j17 += b36.f.j(9, str6);
            }
            if (zArr[10]) {
                j17 += b36.f.e(10, this.f26136p);
            }
            java.lang.String str7 = this.f26137q;
            if (str7 != null && zArr[11]) {
                j17 += b36.f.j(11, str7);
            }
            if (zArr[12]) {
                j17 += b36.f.e(12, this.f26138r);
            }
            java.lang.String str8 = this.f26139s;
            return (str8 == null || !zArr[13]) ? j17 : j17 + b36.f.j(13, str8);
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
                this.f26127d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f26128e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26129f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f26130g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.bl blVar3 = new bw5.bl();
                    if (bArr != null && bArr.length > 0) {
                        blVar3.parseFrom(bArr);
                    }
                    this.f26131h = blVar3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f26132i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f26133m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f26134n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f26135o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f26136p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f26137q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f26138r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f26139s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}
