package bw5;

/* loaded from: classes9.dex */
public class ne0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f30652d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30653e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f30654f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f30655g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f30656h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f30657i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f30658m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f30659n = new boolean[8];

    static {
        new bw5.ne0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ne0 parseFrom(byte[] bArr) {
        return (bw5.ne0) super.parseFrom(bArr);
    }

    public bw5.ne0 c(java.lang.String str) {
        this.f30653e = str;
        this.f30659n[2] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ne0)) {
            return false;
        }
        bw5.ne0 ne0Var = (bw5.ne0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f30652d), java.lang.Long.valueOf(ne0Var.f30652d)) && n51.f.a(this.f30653e, ne0Var.f30653e) && n51.f.a(this.f30654f, ne0Var.f30654f) && n51.f.a(this.f30655g, ne0Var.f30655g) && n51.f.a(this.f30656h, ne0Var.f30656h) && n51.f.a(this.f30657i, ne0Var.f30657i) && n51.f.a(this.f30658m, ne0Var.f30658m);
    }

    public bw5.ne0 d(long j17) {
        this.f30652d = j17;
        this.f30659n[1] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ne0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30659n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f30652d);
            }
            java.lang.String str = this.f30653e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f30654f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f30655g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f30656h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f30657i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f30658m;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f30652d) : 0;
            java.lang.String str7 = this.f30653e;
            if (str7 != null && zArr[2]) {
                h17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f30654f;
            if (str8 != null && zArr[3]) {
                h17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f30655g;
            if (str9 != null && zArr[4]) {
                h17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f30656h;
            if (str10 != null && zArr[5]) {
                h17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f30657i;
            if (str11 != null && zArr[6]) {
                h17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f30658m;
            return (str12 == null || !zArr[7]) ? h17 : h17 + b36.f.j(7, str12);
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
                this.f30652d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30653e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30654f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30655g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30656h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30657i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f30658m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
