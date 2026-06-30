package a36;

/* loaded from: classes9.dex */
public class a extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f1091d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f1092e;

    /* renamed from: f, reason: collision with root package name */
    public int f1093f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f1094g;

    /* renamed from: h, reason: collision with root package name */
    public a36.g f1095h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f1096i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof a36.a)) {
            return false;
        }
        a36.a aVar = (a36.a) fVar;
        return n51.f.a(this.f1091d, aVar.f1091d) && n51.f.a(this.f1092e, aVar.f1092e) && n51.f.a(java.lang.Integer.valueOf(this.f1093f), java.lang.Integer.valueOf(aVar.f1093f)) && n51.f.a(this.f1094g, aVar.f1094g) && n51.f.a(this.f1095h, aVar.f1095h) && n51.f.a(this.f1096i, aVar.f1096i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f1091d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f1092e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f1093f);
            java.lang.String str3 = this.f1094g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            a36.g gVar = this.f1095h;
            if (gVar != null) {
                fVar.i(5, gVar.computeSize());
                this.f1095h.writeFields(fVar);
            }
            java.lang.String str4 = this.f1096i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f1091d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f1092e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f1093f);
            java.lang.String str7 = this.f1094g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            a36.g gVar2 = this.f1095h;
            if (gVar2 != null) {
                e17 += b36.f.i(5, gVar2.computeSize());
            }
            java.lang.String str8 = this.f1096i;
            return str8 != null ? e17 + b36.f.j(6, str8) : e17;
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
        a36.a aVar3 = (a36.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                aVar3.f1091d = aVar2.k(intValue);
                return 0;
            case 2:
                aVar3.f1092e = aVar2.k(intValue);
                return 0;
            case 3:
                aVar3.f1093f = aVar2.g(intValue);
                return 0;
            case 4:
                aVar3.f1094g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    a36.g gVar3 = new a36.g();
                    if (bArr != null && bArr.length > 0) {
                        gVar3.parseFrom(bArr);
                    }
                    aVar3.f1095h = gVar3;
                }
                return 0;
            case 6:
                aVar3.f1096i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
