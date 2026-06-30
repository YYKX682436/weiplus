package bw5;

/* loaded from: classes2.dex */
public class ds extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f26602d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f26603e;

    /* renamed from: f, reason: collision with root package name */
    public long f26604f;

    /* renamed from: g, reason: collision with root package name */
    public long f26605g;

    /* renamed from: h, reason: collision with root package name */
    public int f26606h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f26607i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f26608m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f26609n;

    /* renamed from: o, reason: collision with root package name */
    public int f26610o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f26611p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f26612q = new boolean[12];

    static {
        new bw5.ds();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ds parseFrom(byte[] bArr) {
        return (bw5.ds) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ds)) {
            return false;
        }
        bw5.ds dsVar = (bw5.ds) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f26602d), java.lang.Long.valueOf(dsVar.f26602d)) && n51.f.a(this.f26603e, dsVar.f26603e) && n51.f.a(java.lang.Long.valueOf(this.f26604f), java.lang.Long.valueOf(dsVar.f26604f)) && n51.f.a(java.lang.Long.valueOf(this.f26605g), java.lang.Long.valueOf(dsVar.f26605g)) && n51.f.a(java.lang.Integer.valueOf(this.f26606h), java.lang.Integer.valueOf(dsVar.f26606h)) && n51.f.a(this.f26607i, dsVar.f26607i) && n51.f.a(this.f26608m, dsVar.f26608m) && n51.f.a(this.f26609n, dsVar.f26609n) && n51.f.a(java.lang.Integer.valueOf(this.f26610o), java.lang.Integer.valueOf(dsVar.f26610o)) && n51.f.a(this.f26611p, dsVar.f26611p);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ds();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26612q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f26602d);
            }
            java.lang.String str = this.f26603e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.h(3, this.f26604f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f26605g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f26606h);
            }
            java.lang.String str2 = this.f26607i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f26608m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            com.tencent.mm.protobuf.g gVar = this.f26609n;
            if (gVar != null && zArr[8]) {
                fVar.b(8, gVar);
            }
            if (zArr[10]) {
                fVar.e(10, this.f26610o);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f26611p;
            if (gVar2 != null && zArr[11]) {
                fVar.b(11, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f26602d) : 0;
            java.lang.String str4 = this.f26603e;
            if (str4 != null && zArr[2]) {
                h17 += b36.f.j(2, str4);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f26604f);
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f26605g);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f26606h);
            }
            java.lang.String str5 = this.f26607i;
            if (str5 != null && zArr[6]) {
                h17 += b36.f.j(6, str5);
            }
            java.lang.String str6 = this.f26608m;
            if (str6 != null && zArr[7]) {
                h17 += b36.f.j(7, str6);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f26609n;
            if (gVar3 != null && zArr[8]) {
                h17 += b36.f.b(8, gVar3);
            }
            if (zArr[10]) {
                h17 += b36.f.e(10, this.f26610o);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f26611p;
            return (gVar4 == null || !zArr[11]) ? h17 : h17 + b36.f.b(11, gVar4);
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
                this.f26602d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f26603e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26604f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f26605g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f26606h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f26607i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f26608m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f26609n = aVar2.d(intValue);
                zArr[8] = true;
                return 0;
            case 9:
            default:
                return -1;
            case 10:
                this.f26610o = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f26611p = aVar2.d(intValue);
                zArr[11] = true;
                return 0;
        }
    }
}
