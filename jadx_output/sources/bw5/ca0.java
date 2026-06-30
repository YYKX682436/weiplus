package bw5;

/* loaded from: classes2.dex */
public class ca0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f26006d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f26007e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f26008f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f26009g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f26010h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f26011i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.mc0 f26012m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.ba0 f26013n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f26014o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f26015p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f26016q = new boolean[11];

    static {
        new bw5.ca0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ca0 parseFrom(byte[] bArr) {
        return (bw5.ca0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ca0)) {
            return false;
        }
        bw5.ca0 ca0Var = (bw5.ca0) fVar;
        return n51.f.a(this.f26006d, ca0Var.f26006d) && n51.f.a(this.f26007e, ca0Var.f26007e) && n51.f.a(this.f26008f, ca0Var.f26008f) && n51.f.a(this.f26009g, ca0Var.f26009g) && n51.f.a(this.f26010h, ca0Var.f26010h) && n51.f.a(this.f26011i, ca0Var.f26011i) && n51.f.a(this.f26012m, ca0Var.f26012m) && n51.f.a(this.f26013n, ca0Var.f26013n) && n51.f.a(this.f26014o, ca0Var.f26014o) && n51.f.a(this.f26015p, ca0Var.f26015p);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ca0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f26015p;
        int i18 = 0;
        boolean[] zArr = this.f26016q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f26006d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f26007e;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f26008f;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f26009g;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f26010h;
            if (str5 != null && zArr[2]) {
                fVar.j(2, str5);
            }
            java.lang.String str6 = this.f26011i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            bw5.mc0 mc0Var = this.f26012m;
            if (mc0Var != null && zArr[7]) {
                fVar.i(7, mc0Var.computeSize());
                this.f26012m.writeFields(fVar);
            }
            bw5.ba0 ba0Var = this.f26013n;
            if (ba0Var != null && zArr[8]) {
                fVar.i(8, ba0Var.computeSize());
                this.f26013n.writeFields(fVar);
            }
            java.lang.String str7 = this.f26014o;
            if (str7 != null && zArr[9]) {
                fVar.j(9, str7);
            }
            fVar.g(10, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f26006d;
            if (str8 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str8);
            }
            java.lang.String str9 = this.f26007e;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f26008f;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f26009g;
            if (str11 != null && zArr[5]) {
                i18 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f26010h;
            if (str12 != null && zArr[2]) {
                i18 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f26011i;
            if (str13 != null && zArr[6]) {
                i18 += b36.f.j(6, str13);
            }
            bw5.mc0 mc0Var2 = this.f26012m;
            if (mc0Var2 != null && zArr[7]) {
                i18 += b36.f.i(7, mc0Var2.computeSize());
            }
            bw5.ba0 ba0Var2 = this.f26013n;
            if (ba0Var2 != null && zArr[8]) {
                i18 += b36.f.i(8, ba0Var2.computeSize());
            }
            java.lang.String str14 = this.f26014o;
            if (str14 != null && zArr[9]) {
                i18 += b36.f.j(9, str14);
            }
            return i18 + b36.f.g(10, 8, linkedList);
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
                this.f26006d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f26010h = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26007e = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f26008f = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f26009g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f26011i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.mc0 mc0Var3 = new bw5.mc0();
                    if (bArr != null && bArr.length > 0) {
                        mc0Var3.parseFrom(bArr);
                    }
                    this.f26012m = mc0Var3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.ba0 ba0Var3 = new bw5.ba0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ba0Var3.parseFrom(bArr2);
                    }
                    this.f26013n = ba0Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f26014o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.c70 c70Var = new bw5.c70();
                    if (bArr3 != null && bArr3.length > 0) {
                        c70Var.parseFrom(bArr3);
                    }
                    linkedList.add(c70Var);
                }
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
