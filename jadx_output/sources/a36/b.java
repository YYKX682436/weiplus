package a36;

/* loaded from: classes9.dex */
public class b extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public a36.g f1097d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f1098e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f1099f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f1100g;

    /* renamed from: h, reason: collision with root package name */
    public int f1101h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f1102i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f1103m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof a36.b)) {
            return false;
        }
        a36.b bVar = (a36.b) fVar;
        return n51.f.a(this.f1097d, bVar.f1097d) && n51.f.a(this.f1098e, bVar.f1098e) && n51.f.a(this.f1099f, bVar.f1099f) && n51.f.a(this.f1100g, bVar.f1100g) && n51.f.a(java.lang.Integer.valueOf(this.f1101h), java.lang.Integer.valueOf(bVar.f1101h)) && n51.f.a(this.f1102i, bVar.f1102i) && n51.f.a(this.f1103m, bVar.f1103m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            a36.g gVar = this.f1097d;
            if (gVar != null) {
                fVar.i(1, gVar.computeSize());
                this.f1097d.writeFields(fVar);
            }
            java.lang.String str = this.f1098e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f1099f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f1100g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f1101h);
            java.lang.String str4 = this.f1102i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f1103m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            a36.g gVar2 = this.f1097d;
            int i18 = gVar2 != null ? 0 + b36.f.i(1, gVar2.computeSize()) : 0;
            java.lang.String str6 = this.f1098e;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f1099f;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f1100g;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            int e17 = i18 + b36.f.e(5, this.f1101h);
            java.lang.String str9 = this.f1102i;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f1103m;
            return str10 != null ? e17 + b36.f.j(7, str10) : e17;
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
        a36.b bVar = (a36.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    a36.g gVar3 = new a36.g();
                    if (bArr != null && bArr.length > 0) {
                        gVar3.parseFrom(bArr);
                    }
                    bVar.f1097d = gVar3;
                }
                return 0;
            case 2:
                bVar.f1098e = aVar2.k(intValue);
                return 0;
            case 3:
                bVar.f1099f = aVar2.k(intValue);
                return 0;
            case 4:
                bVar.f1100g = aVar2.k(intValue);
                return 0;
            case 5:
                bVar.f1101h = aVar2.g(intValue);
                return 0;
            case 6:
                bVar.f1102i = aVar2.k(intValue);
                return 0;
            case 7:
                bVar.f1103m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
