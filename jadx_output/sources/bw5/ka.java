package bw5;

/* loaded from: classes2.dex */
public class ka extends com.tencent.mm.protobuf.f {

    /* renamed from: u, reason: collision with root package name */
    public static final bw5.ka f29305u = new bw5.ka();

    /* renamed from: d, reason: collision with root package name */
    public bw5.la f29306d = bw5.la.EmoticonEasterEggType_Native;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f29307e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f29308f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f29309g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f29310h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f29311i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f29312m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f29313n = 0;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f29314o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f29315p = "";

    /* renamed from: q, reason: collision with root package name */
    public int f29316q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f29317r = 0;

    /* renamed from: s, reason: collision with root package name */
    public bw5.na f29318s = new bw5.na();

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f29319t = "";

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ka)) {
            return false;
        }
        bw5.ka kaVar = (bw5.ka) fVar;
        return n51.f.a(this.f29306d, kaVar.f29306d) && n51.f.a(this.f29307e, kaVar.f29307e) && n51.f.a(this.f29308f, kaVar.f29308f) && n51.f.a(this.f29309g, kaVar.f29309g) && n51.f.a(java.lang.Integer.valueOf(this.f29310h), java.lang.Integer.valueOf(kaVar.f29310h)) && n51.f.a(java.lang.Integer.valueOf(this.f29311i), java.lang.Integer.valueOf(kaVar.f29311i)) && n51.f.a(java.lang.Integer.valueOf(this.f29312m), java.lang.Integer.valueOf(kaVar.f29312m)) && n51.f.a(java.lang.Integer.valueOf(this.f29313n), java.lang.Integer.valueOf(kaVar.f29313n)) && n51.f.a(this.f29314o, kaVar.f29314o) && n51.f.a(this.f29315p, kaVar.f29315p) && n51.f.a(java.lang.Integer.valueOf(this.f29316q), java.lang.Integer.valueOf(kaVar.f29316q)) && n51.f.a(java.lang.Integer.valueOf(this.f29317r), java.lang.Integer.valueOf(kaVar.f29317r)) && n51.f.a(this.f29318s, kaVar.f29318s) && n51.f.a(this.f29319t, kaVar.f29319t);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ka();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.la laVar = this.f29306d;
            if (laVar != null) {
                fVar.e(1, laVar.f29704d);
            }
            java.lang.String str = this.f29307e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f29308f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f29309g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f29310h);
            fVar.e(6, this.f29311i);
            fVar.e(7, this.f29312m);
            fVar.e(8, this.f29313n);
            java.lang.String str4 = this.f29314o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f29315p;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            fVar.e(11, this.f29316q);
            fVar.e(12, this.f29317r);
            bw5.na naVar = this.f29318s;
            if (naVar != null) {
                fVar.i(13, naVar.computeSize());
                this.f29318s.writeFields(fVar);
            }
            java.lang.String str6 = this.f29319t;
            if (str6 != null) {
                fVar.j(14, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.la laVar2 = this.f29306d;
            int e17 = laVar2 != null ? b36.f.e(1, laVar2.f29704d) + 0 : 0;
            java.lang.String str7 = this.f29307e;
            if (str7 != null) {
                e17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f29308f;
            if (str8 != null) {
                e17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f29309g;
            if (str9 != null) {
                e17 += b36.f.j(4, str9);
            }
            int e18 = e17 + b36.f.e(5, this.f29310h) + b36.f.e(6, this.f29311i) + b36.f.e(7, this.f29312m) + b36.f.e(8, this.f29313n);
            java.lang.String str10 = this.f29314o;
            if (str10 != null) {
                e18 += b36.f.j(9, str10);
            }
            java.lang.String str11 = this.f29315p;
            if (str11 != null) {
                e18 += b36.f.j(10, str11);
            }
            int e19 = e18 + b36.f.e(11, this.f29316q) + b36.f.e(12, this.f29317r);
            bw5.na naVar2 = this.f29318s;
            if (naVar2 != null) {
                e19 += b36.f.i(13, naVar2.computeSize());
            }
            java.lang.String str12 = this.f29319t;
            return str12 != null ? e19 + b36.f.j(14, str12) : e19;
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
                int g17 = aVar2.g(intValue);
                this.f29306d = g17 != 0 ? g17 != 1 ? g17 != 999 ? null : bw5.la.EmoticonEasterEggType_None : bw5.la.EmoticonEasterEggType_Magic : bw5.la.EmoticonEasterEggType_Native;
                return 0;
            case 2:
                this.f29307e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f29308f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f29309g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f29310h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f29311i = aVar2.g(intValue);
                return 0;
            case 7:
                this.f29312m = aVar2.g(intValue);
                return 0;
            case 8:
                this.f29313n = aVar2.g(intValue);
                return 0;
            case 9:
                this.f29314o = aVar2.k(intValue);
                return 0;
            case 10:
                this.f29315p = aVar2.k(intValue);
                return 0;
            case 11:
                this.f29316q = aVar2.g(intValue);
                return 0;
            case 12:
                this.f29317r = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.na naVar3 = new bw5.na();
                    if (bArr != null && bArr.length > 0) {
                        naVar3.parseFrom(bArr);
                    }
                    this.f29318s = naVar3;
                }
                return 0;
            case 14:
                this.f29319t = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.ka) super.parseFrom(bArr);
    }
}
