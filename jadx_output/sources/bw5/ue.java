package bw5;

/* loaded from: classes2.dex */
public class ue extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f33856d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33857e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f33858f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f33859g;

    /* renamed from: h, reason: collision with root package name */
    public int f33860h;

    /* renamed from: i, reason: collision with root package name */
    public int f33861i;

    /* renamed from: m, reason: collision with root package name */
    public int f33862m;

    /* renamed from: n, reason: collision with root package name */
    public int f33863n;

    /* renamed from: o, reason: collision with root package name */
    public long f33864o;

    /* renamed from: p, reason: collision with root package name */
    public int f33865p;

    /* renamed from: q, reason: collision with root package name */
    public int f33866q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.ae f33867r;

    /* renamed from: s, reason: collision with root package name */
    public int f33868s;

    /* renamed from: t, reason: collision with root package name */
    public int f33869t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f33870u = new boolean[15];

    static {
        new bw5.ue();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ue parseFrom(byte[] bArr) {
        return (bw5.ue) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ue)) {
            return false;
        }
        bw5.ue ueVar = (bw5.ue) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f33856d), java.lang.Long.valueOf(ueVar.f33856d)) && n51.f.a(this.f33857e, ueVar.f33857e) && n51.f.a(this.f33858f, ueVar.f33858f) && n51.f.a(this.f33859g, ueVar.f33859g) && n51.f.a(java.lang.Integer.valueOf(this.f33860h), java.lang.Integer.valueOf(ueVar.f33860h)) && n51.f.a(java.lang.Integer.valueOf(this.f33861i), java.lang.Integer.valueOf(ueVar.f33861i)) && n51.f.a(java.lang.Integer.valueOf(this.f33862m), java.lang.Integer.valueOf(ueVar.f33862m)) && n51.f.a(java.lang.Integer.valueOf(this.f33863n), java.lang.Integer.valueOf(ueVar.f33863n)) && n51.f.a(java.lang.Long.valueOf(this.f33864o), java.lang.Long.valueOf(ueVar.f33864o)) && n51.f.a(java.lang.Integer.valueOf(this.f33865p), java.lang.Integer.valueOf(ueVar.f33865p)) && n51.f.a(java.lang.Integer.valueOf(this.f33866q), java.lang.Integer.valueOf(ueVar.f33866q)) && n51.f.a(this.f33867r, ueVar.f33867r) && n51.f.a(java.lang.Integer.valueOf(this.f33868s), java.lang.Integer.valueOf(ueVar.f33868s)) && n51.f.a(java.lang.Integer.valueOf(this.f33869t), java.lang.Integer.valueOf(ueVar.f33869t));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ue();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33870u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f33856d);
            }
            java.lang.String str = this.f33857e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f33858f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f33859g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.e(5, this.f33860h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f33861i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f33862m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f33863n);
            }
            if (zArr[9]) {
                fVar.h(9, this.f33864o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f33865p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f33866q);
            }
            bw5.ae aeVar = this.f33867r;
            if (aeVar != null && zArr[12]) {
                fVar.i(12, aeVar.computeSize());
                this.f33867r.writeFields(fVar);
            }
            if (zArr[13]) {
                fVar.e(13, this.f33868s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f33869t);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f33856d) : 0;
            java.lang.String str4 = this.f33857e;
            if (str4 != null && zArr[2]) {
                h17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f33858f;
            if (str5 != null && zArr[3]) {
                h17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f33859g;
            if (str6 != null && zArr[4]) {
                h17 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f33860h);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f33861i);
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f33862m);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f33863n);
            }
            if (zArr[9]) {
                h17 += b36.f.h(9, this.f33864o);
            }
            if (zArr[10]) {
                h17 += b36.f.e(10, this.f33865p);
            }
            if (zArr[11]) {
                h17 += b36.f.e(11, this.f33866q);
            }
            bw5.ae aeVar2 = this.f33867r;
            if (aeVar2 != null && zArr[12]) {
                h17 += b36.f.i(12, aeVar2.computeSize());
            }
            if (zArr[13]) {
                h17 += b36.f.e(13, this.f33868s);
            }
            return zArr[14] ? h17 + b36.f.e(14, this.f33869t) : h17;
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
                this.f33856d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f33857e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f33858f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33859g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33860h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f33861i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f33862m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f33863n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f33864o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f33865p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f33866q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.ae aeVar3 = new bw5.ae();
                    if (bArr != null && bArr.length > 0) {
                        aeVar3.parseFrom(bArr);
                    }
                    this.f33867r = aeVar3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                this.f33868s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f33869t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            default:
                return -1;
        }
    }
}
