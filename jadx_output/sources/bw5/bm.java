package bw5;

/* loaded from: classes2.dex */
public class bm extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f25743e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f25744f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f25745g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25746h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f25747i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f25742d = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f25748m = new boolean[7];

    static {
        new bw5.bm();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.bm parseFrom(byte[] bArr) {
        return (bw5.bm) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bm)) {
            return false;
        }
        bw5.bm bmVar = (bw5.bm) fVar;
        return n51.f.a(this.f25742d, bmVar.f25742d) && n51.f.a(this.f25743e, bmVar.f25743e) && n51.f.a(this.f25744f, bmVar.f25744f) && n51.f.a(this.f25745g, bmVar.f25745g) && n51.f.a(java.lang.Boolean.valueOf(this.f25746h), java.lang.Boolean.valueOf(bmVar.f25746h)) && n51.f.a(this.f25747i, bmVar.f25747i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.bm();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f25742d;
        boolean[] zArr = this.f25748m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            java.lang.String str = this.f25743e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f25744f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f25745g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.a(5, this.f25746h);
            }
            java.lang.String str4 = this.f25747i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            java.lang.String str5 = this.f25743e;
            if (str5 != null && zArr[2]) {
                g17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f25744f;
            if (str6 != null && zArr[3]) {
                g17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f25745g;
            if (str7 != null && zArr[4]) {
                g17 += b36.f.j(4, str7);
            }
            if (zArr[5]) {
                g17 += b36.f.a(5, this.f25746h);
            }
            java.lang.String str8 = this.f25747i;
            return (str8 == null || !zArr[6]) ? g17 : g17 + b36.f.j(6, str8);
        }
        if (i17 == 2) {
            linkedList.clear();
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.cm cmVar = new bw5.cm();
                    if (bArr != null && bArr.length > 0) {
                        cmVar.parseFrom(bArr);
                    }
                    linkedList.add(cmVar);
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f25743e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f25744f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f25745g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f25746h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f25747i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
