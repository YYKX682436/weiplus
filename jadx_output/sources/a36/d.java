package a36;

/* loaded from: classes9.dex */
public class d extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f1116d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f1117e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f1118f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f1119g;

    /* renamed from: h, reason: collision with root package name */
    public long f1120h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f1121i;

    /* renamed from: m, reason: collision with root package name */
    public int f1122m;

    /* renamed from: n, reason: collision with root package name */
    public a36.h f1123n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f1124o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f1125p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f1126q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof a36.d)) {
            return false;
        }
        a36.d dVar = (a36.d) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f1116d), java.lang.Integer.valueOf(dVar.f1116d)) && n51.f.a(this.f1117e, dVar.f1117e) && n51.f.a(this.f1118f, dVar.f1118f) && n51.f.a(this.f1119g, dVar.f1119g) && n51.f.a(java.lang.Long.valueOf(this.f1120h), java.lang.Long.valueOf(dVar.f1120h)) && n51.f.a(this.f1121i, dVar.f1121i) && n51.f.a(java.lang.Integer.valueOf(this.f1122m), java.lang.Integer.valueOf(dVar.f1122m)) && n51.f.a(this.f1123n, dVar.f1123n) && n51.f.a(this.f1124o, dVar.f1124o) && n51.f.a(this.f1125p, dVar.f1125p) && n51.f.a(this.f1126q, dVar.f1126q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f1116d);
            java.lang.String str = this.f1117e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f1118f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f1119g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.h(6, this.f1120h);
            java.lang.String str4 = this.f1121i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f1122m);
            a36.h hVar = this.f1123n;
            if (hVar != null) {
                fVar.i(9, hVar.computeSize());
                this.f1123n.writeFields(fVar);
            }
            java.lang.String str5 = this.f1124o;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f1125p;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            java.lang.String str7 = this.f1126q;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f1116d) + 0;
            java.lang.String str8 = this.f1117e;
            if (str8 != null) {
                e17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f1118f;
            if (str9 != null) {
                e17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f1119g;
            if (str10 != null) {
                e17 += b36.f.j(5, str10);
            }
            int h17 = e17 + b36.f.h(6, this.f1120h);
            java.lang.String str11 = this.f1121i;
            if (str11 != null) {
                h17 += b36.f.j(7, str11);
            }
            int e18 = h17 + b36.f.e(8, this.f1122m);
            a36.h hVar2 = this.f1123n;
            if (hVar2 != null) {
                e18 += b36.f.i(9, hVar2.computeSize());
            }
            java.lang.String str12 = this.f1124o;
            if (str12 != null) {
                e18 += b36.f.j(10, str12);
            }
            java.lang.String str13 = this.f1125p;
            if (str13 != null) {
                e18 += b36.f.j(11, str13);
            }
            java.lang.String str14 = this.f1126q;
            return str14 != null ? e18 + b36.f.j(12, str14) : e18;
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
        a36.d dVar = (a36.d) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                dVar.f1116d = aVar2.g(intValue);
                return 0;
            case 2:
                dVar.f1117e = aVar2.k(intValue);
                return 0;
            case 3:
                dVar.f1118f = aVar2.k(intValue);
                return 0;
            case 4:
            default:
                return -1;
            case 5:
                dVar.f1119g = aVar2.k(intValue);
                return 0;
            case 6:
                dVar.f1120h = aVar2.i(intValue);
                return 0;
            case 7:
                dVar.f1121i = aVar2.k(intValue);
                return 0;
            case 8:
                dVar.f1122m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    a36.h hVar3 = new a36.h();
                    if (bArr != null && bArr.length > 0) {
                        hVar3.parseFrom(bArr);
                    }
                    dVar.f1123n = hVar3;
                }
                return 0;
            case 10:
                dVar.f1124o = aVar2.k(intValue);
                return 0;
            case 11:
                dVar.f1125p = aVar2.k(intValue);
                return 0;
            case 12:
                dVar.f1126q = aVar2.k(intValue);
                return 0;
        }
    }
}
