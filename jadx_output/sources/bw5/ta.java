package bw5;

/* loaded from: classes4.dex */
public class ta extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ua f33323d = bw5.ua.EmoticonTabItemType_Unknown;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33324e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f33325f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f33326g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f33327h = "";

    static {
        new bw5.ta();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ta parseFrom(byte[] bArr) {
        return (bw5.ta) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ta)) {
            return false;
        }
        bw5.ta taVar = (bw5.ta) fVar;
        return n51.f.a(this.f33323d, taVar.f33323d) && n51.f.a(this.f33324e, taVar.f33324e) && n51.f.a(this.f33325f, taVar.f33325f) && n51.f.a(this.f33326g, taVar.f33326g) && n51.f.a(this.f33327h, taVar.f33327h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ta();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ua uaVar = this.f33323d;
            if (uaVar != null) {
                fVar.e(1, uaVar.f33824d);
            }
            java.lang.String str = this.f33324e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f33325f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f33326g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f33327h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ua uaVar2 = this.f33323d;
            int e17 = uaVar2 != null ? 0 + b36.f.e(1, uaVar2.f33824d) : 0;
            java.lang.String str5 = this.f33324e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f33325f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f33326g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f33327h;
            return str8 != null ? e17 + b36.f.j(5, str8) : e17;
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
        if (intValue == 1) {
            int g17 = aVar2.g(intValue);
            this.f33323d = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? g17 != 4 ? null : bw5.ua.EmoticonTabItemType_Search : bw5.ua.EmoticonTabItemType_Store : bw5.ua.EmoticonTabItemType_Emoticon : bw5.ua.EmoticonTabItemType_QQEmoji : bw5.ua.EmoticonTabItemType_Unknown;
            return 0;
        }
        if (intValue == 2) {
            this.f33324e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f33325f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.f33326g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f33327h = aVar2.k(intValue);
        return 0;
    }
}
