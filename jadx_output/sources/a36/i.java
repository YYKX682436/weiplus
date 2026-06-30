package a36;

/* loaded from: classes9.dex */
public class i extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f1149d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f1150e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f1151f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f1152g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f1153h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f1154i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof a36.i)) {
            return false;
        }
        a36.i iVar = (a36.i) fVar;
        return n51.f.a(this.f1149d, iVar.f1149d) && n51.f.a(this.f1150e, iVar.f1150e) && n51.f.a(this.f1151f, iVar.f1151f) && n51.f.a(this.f1152g, iVar.f1152g) && n51.f.a(this.f1153h, iVar.f1153h) && n51.f.a(this.f1154i, iVar.f1154i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f1149d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f1150e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f1151f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f1152g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f1153h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f1154i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f1149d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f1150e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f1151f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f1152g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f1153h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f1154i;
            return str12 != null ? j17 + b36.f.j(6, str12) : j17;
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
        a36.i iVar = (a36.i) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                iVar.f1149d = aVar2.k(intValue);
                return 0;
            case 2:
                iVar.f1150e = aVar2.k(intValue);
                return 0;
            case 3:
                iVar.f1151f = aVar2.k(intValue);
                return 0;
            case 4:
                iVar.f1152g = aVar2.k(intValue);
                return 0;
            case 5:
                iVar.f1153h = aVar2.k(intValue);
                return 0;
            case 6:
                iVar.f1154i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
