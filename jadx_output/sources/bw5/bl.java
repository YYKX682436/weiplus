package bw5;

/* loaded from: classes2.dex */
public class bl extends com.tencent.mm.protobuf.f {

    /* renamed from: f, reason: collision with root package name */
    public boolean f25723f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f25724g;

    /* renamed from: h, reason: collision with root package name */
    public int f25725h;

    /* renamed from: i, reason: collision with root package name */
    public int f25726i;

    /* renamed from: m, reason: collision with root package name */
    public int f25727m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f25728n;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f25721d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f25722e = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f25729o = new boolean[13];

    static {
        new bw5.bl();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.bl parseFrom(byte[] bArr) {
        return (bw5.bl) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bl)) {
            return false;
        }
        bw5.bl blVar = (bw5.bl) fVar;
        return n51.f.a(this.f25721d, blVar.f25721d) && n51.f.a(this.f25722e, blVar.f25722e) && n51.f.a(java.lang.Boolean.valueOf(this.f25723f), java.lang.Boolean.valueOf(blVar.f25723f)) && n51.f.a(java.lang.Boolean.valueOf(this.f25724g), java.lang.Boolean.valueOf(blVar.f25724g)) && n51.f.a(java.lang.Integer.valueOf(this.f25725h), java.lang.Integer.valueOf(blVar.f25725h)) && n51.f.a(java.lang.Integer.valueOf(this.f25726i), java.lang.Integer.valueOf(blVar.f25726i)) && n51.f.a(java.lang.Integer.valueOf(this.f25727m), java.lang.Integer.valueOf(blVar.f25727m)) && n51.f.a(this.f25728n, blVar.f25728n);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.bl();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f25722e;
        java.util.LinkedList linkedList2 = this.f25721d;
        boolean[] zArr = this.f25729o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(5, 8, linkedList2);
            fVar.g(6, 8, linkedList);
            if (zArr[7]) {
                fVar.a(7, this.f25723f);
            }
            if (zArr[8]) {
                fVar.a(8, this.f25724g);
            }
            if (zArr[9]) {
                fVar.e(9, this.f25725h);
            }
            if (zArr[10]) {
                fVar.e(10, this.f25726i);
            }
            if (zArr[11]) {
                fVar.e(11, this.f25727m);
            }
            java.lang.String str = this.f25728n;
            if (str != null && zArr[12]) {
                fVar.j(12, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(5, 8, linkedList2) + 0 + b36.f.g(6, 8, linkedList);
            if (zArr[7]) {
                g17 += b36.f.a(7, this.f25723f);
            }
            if (zArr[8]) {
                g17 += b36.f.a(8, this.f25724g);
            }
            if (zArr[9]) {
                g17 += b36.f.e(9, this.f25725h);
            }
            if (zArr[10]) {
                g17 += b36.f.e(10, this.f25726i);
            }
            if (zArr[11]) {
                g17 += b36.f.e(11, this.f25727m);
            }
            java.lang.String str2 = this.f25728n;
            return (str2 == null || !zArr[12]) ? g17 : g17 + b36.f.j(12, str2);
        }
        if (i17 == 2) {
            linkedList2.clear();
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
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.dl dlVar = new bw5.dl();
                    if (bArr != null && bArr.length > 0) {
                        dlVar.parseFrom(bArr);
                    }
                    linkedList2.add(dlVar);
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.el elVar = new bw5.el();
                    if (bArr2 != null && bArr2.length > 0) {
                        elVar.parseFrom(bArr2);
                    }
                    linkedList.add(elVar);
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f25723f = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f25724g = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f25725h = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f25726i = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f25727m = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f25728n = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}
