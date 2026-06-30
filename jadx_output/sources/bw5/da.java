package bw5;

/* loaded from: classes4.dex */
public class da extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ca f26401d = bw5.ca.EmoticonBoardPageType_QQEmoji;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f26402e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f26403f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f26404g = 0;

    /* renamed from: h, reason: collision with root package name */
    public bw5.ea f26405h = new bw5.ea();

    /* renamed from: i, reason: collision with root package name */
    public bw5.aa f26406i = new bw5.aa();

    static {
        new bw5.da();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.da parseFrom(byte[] bArr) {
        return (bw5.da) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.da)) {
            return false;
        }
        bw5.da daVar = (bw5.da) fVar;
        return n51.f.a(this.f26401d, daVar.f26401d) && n51.f.a(this.f26402e, daVar.f26402e) && n51.f.a(this.f26403f, daVar.f26403f) && n51.f.a(java.lang.Integer.valueOf(this.f26404g), java.lang.Integer.valueOf(daVar.f26404g)) && n51.f.a(this.f26405h, daVar.f26405h) && n51.f.a(this.f26406i, daVar.f26406i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.da();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        bw5.ca caVar;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ca caVar2 = this.f26401d;
            if (caVar2 != null) {
                fVar.e(1, caVar2.f26005d);
            }
            java.lang.String str = this.f26402e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f26403f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f26404g);
            bw5.ea eaVar = this.f26405h;
            if (eaVar != null) {
                fVar.i(5, eaVar.computeSize());
                this.f26405h.writeFields(fVar);
            }
            bw5.aa aaVar = this.f26406i;
            if (aaVar != null) {
                fVar.i(6, aaVar.computeSize());
                this.f26406i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ca caVar3 = this.f26401d;
            int e17 = caVar3 != null ? 0 + b36.f.e(1, caVar3.f26005d) : 0;
            java.lang.String str3 = this.f26402e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f26403f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            int e18 = e17 + b36.f.e(4, this.f26404g);
            bw5.ea eaVar2 = this.f26405h;
            if (eaVar2 != null) {
                e18 += b36.f.i(5, eaVar2.computeSize());
            }
            bw5.aa aaVar2 = this.f26406i;
            return aaVar2 != null ? e18 + b36.f.i(6, aaVar2.computeSize()) : e18;
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
                switch (aVar2.g(intValue)) {
                    case 0:
                        caVar = bw5.ca.EmoticonBoardPageType_QQEmoji;
                        break;
                    case 1:
                        caVar = bw5.ca.EmoticonBoardPageType_Emoticon;
                        break;
                    case 2:
                        caVar = bw5.ca.EmoticonBoardPageType_Recommend;
                        break;
                    case 3:
                        caVar = bw5.ca.EmoticonBoardPageType_CameraEntry;
                        break;
                    case 4:
                        caVar = bw5.ca.EmoticonBoardPageType_SystemEmoji;
                        break;
                    case 5:
                        caVar = bw5.ca.EmoticonBoardPageType_EmoticonIPSet;
                        break;
                    case 6:
                        caVar = bw5.ca.EmoticonBoardPageType_EmoticonIPTip;
                        break;
                    case 7:
                        caVar = bw5.ca.EmoticonBoardPageTypeRecommendAndAi;
                        break;
                    default:
                        caVar = null;
                        break;
                }
                this.f26401d = caVar;
                return 0;
            case 2:
                this.f26402e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f26403f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f26404g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.ea eaVar3 = new bw5.ea();
                    if (bArr != null && bArr.length > 0) {
                        eaVar3.parseFrom(bArr);
                    }
                    this.f26405h = eaVar3;
                }
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.aa aaVar3 = new bw5.aa();
                    if (bArr2 != null && bArr2.length > 0) {
                        aaVar3.parseFrom(bArr2);
                    }
                    this.f26406i = aaVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
