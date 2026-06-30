package a36;

/* loaded from: classes9.dex */
public class f extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f1133d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f1134e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f1135f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f1136g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f1137h;

    /* renamed from: i, reason: collision with root package name */
    public int f1138i;

    /* renamed from: m, reason: collision with root package name */
    public a36.e f1139m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f1140n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f1141o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof a36.f)) {
            return false;
        }
        a36.f fVar2 = (a36.f) fVar;
        return n51.f.a(this.f1133d, fVar2.f1133d) && n51.f.a(this.f1134e, fVar2.f1134e) && n51.f.a(this.f1135f, fVar2.f1135f) && n51.f.a(this.f1136g, fVar2.f1136g) && n51.f.a(this.f1137h, fVar2.f1137h) && n51.f.a(java.lang.Integer.valueOf(this.f1138i), java.lang.Integer.valueOf(fVar2.f1138i)) && n51.f.a(this.f1139m, fVar2.f1139m) && n51.f.a(this.f1140n, fVar2.f1140n) && n51.f.a(this.f1141o, fVar2.f1141o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f1133d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f1134e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f1135f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f1136g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f1137h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f1138i);
            a36.e eVar = this.f1139m;
            if (eVar != null) {
                fVar.i(7, eVar.computeSize());
                this.f1139m.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f1140n;
            if (gVar != null) {
                fVar.b(8, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f1141o;
            if (gVar2 != null) {
                fVar.b(9, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f1133d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f1134e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f1135f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f1136g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f1137h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            int e17 = j17 + b36.f.e(6, this.f1138i);
            a36.e eVar2 = this.f1139m;
            if (eVar2 != null) {
                e17 += b36.f.i(7, eVar2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar3 = this.f1140n;
            if (gVar3 != null) {
                e17 += b36.f.b(8, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f1141o;
            return gVar4 != null ? e17 + b36.f.b(9, gVar4) : e17;
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
        a36.f fVar2 = (a36.f) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fVar2.f1133d = aVar2.k(intValue);
                return 0;
            case 2:
                fVar2.f1134e = aVar2.k(intValue);
                return 0;
            case 3:
                fVar2.f1135f = aVar2.k(intValue);
                return 0;
            case 4:
                fVar2.f1136g = aVar2.k(intValue);
                return 0;
            case 5:
                fVar2.f1137h = aVar2.k(intValue);
                return 0;
            case 6:
                fVar2.f1138i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    a36.e eVar3 = new a36.e();
                    if (bArr != null && bArr.length > 0) {
                        eVar3.parseFrom(bArr);
                    }
                    fVar2.f1139m = eVar3;
                }
                return 0;
            case 8:
                fVar2.f1140n = aVar2.d(intValue);
                return 0;
            case 9:
                fVar2.f1141o = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
