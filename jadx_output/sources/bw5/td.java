package bw5;

/* loaded from: classes2.dex */
public class td extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.pj f33393d;

    /* renamed from: e, reason: collision with root package name */
    public long f33394e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f33395f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f33396g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f33397h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.y4 f33398i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.pj f33399m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f33401o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f33402p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.pj f33403q;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f33400n = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f33404r = new boolean[12];

    static {
        new bw5.td();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.td parseFrom(byte[] bArr) {
        return (bw5.td) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.td)) {
            return false;
        }
        bw5.td tdVar = (bw5.td) fVar;
        return n51.f.a(this.f33393d, tdVar.f33393d) && n51.f.a(java.lang.Long.valueOf(this.f33394e), java.lang.Long.valueOf(tdVar.f33394e)) && n51.f.a(this.f33395f, tdVar.f33395f) && n51.f.a(this.f33396g, tdVar.f33396g) && n51.f.a(this.f33397h, tdVar.f33397h) && n51.f.a(this.f33398i, tdVar.f33398i) && n51.f.a(this.f33399m, tdVar.f33399m) && n51.f.a(this.f33400n, tdVar.f33400n) && n51.f.a(this.f33401o, tdVar.f33401o) && n51.f.a(this.f33402p, tdVar.f33402p) && n51.f.a(this.f33403q, tdVar.f33403q);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.td();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f33400n;
        boolean[] zArr = this.f33404r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.pj pjVar = this.f33393d;
            if (pjVar != null && zArr[1]) {
                fVar.i(1, pjVar.computeSize());
                this.f33393d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.h(2, this.f33394e);
            }
            java.lang.String str = this.f33395f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f33396g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f33397h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            bw5.y4 y4Var = this.f33398i;
            if (y4Var != null && zArr[6]) {
                fVar.i(6, y4Var.computeSize());
                this.f33398i.writeFields(fVar);
            }
            bw5.pj pjVar2 = this.f33399m;
            if (pjVar2 != null && zArr[7]) {
                fVar.i(7, pjVar2.computeSize());
                this.f33399m.writeFields(fVar);
            }
            fVar.g(8, 8, linkedList);
            java.lang.String str4 = this.f33401o;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f33402p;
            if (str5 != null && zArr[10]) {
                fVar.j(10, str5);
            }
            bw5.pj pjVar3 = this.f33403q;
            if (pjVar3 == null || !zArr[11]) {
                return 0;
            }
            fVar.i(11, pjVar3.computeSize());
            this.f33403q.writeFields(fVar);
            return 0;
        }
        if (i17 == 1) {
            bw5.pj pjVar4 = this.f33393d;
            int i18 = (pjVar4 == null || !zArr[1]) ? 0 : 0 + b36.f.i(1, pjVar4.computeSize());
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f33394e);
            }
            java.lang.String str6 = this.f33395f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f33396g;
            if (str7 != null && zArr[4]) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f33397h;
            if (str8 != null && zArr[5]) {
                i18 += b36.f.j(5, str8);
            }
            bw5.y4 y4Var2 = this.f33398i;
            if (y4Var2 != null && zArr[6]) {
                i18 += b36.f.i(6, y4Var2.computeSize());
            }
            bw5.pj pjVar5 = this.f33399m;
            if (pjVar5 != null && zArr[7]) {
                i18 += b36.f.i(7, pjVar5.computeSize());
            }
            int g17 = i18 + b36.f.g(8, 8, linkedList);
            java.lang.String str9 = this.f33401o;
            if (str9 != null && zArr[9]) {
                g17 += b36.f.j(9, str9);
            }
            java.lang.String str10 = this.f33402p;
            if (str10 != null && zArr[10]) {
                g17 += b36.f.j(10, str10);
            }
            bw5.pj pjVar6 = this.f33403q;
            return (pjVar6 == null || !zArr[11]) ? g17 : g17 + b36.f.i(11, pjVar6.computeSize());
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
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.pj pjVar7 = new bw5.pj();
                    if (bArr != null && bArr.length > 0) {
                        pjVar7.parseFrom(bArr);
                    }
                    this.f33393d = pjVar7;
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f33394e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f33395f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33396g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33397h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.y4 y4Var3 = new bw5.y4();
                    if (bArr2 != null && bArr2.length > 0) {
                        y4Var3.parseFrom(bArr2);
                    }
                    this.f33398i = y4Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.pj pjVar8 = new bw5.pj();
                    if (bArr3 != null && bArr3.length > 0) {
                        pjVar8.parseFrom(bArr3);
                    }
                    this.f33399m = pjVar8;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.sd sdVar = new bw5.sd();
                    if (bArr4 != null && bArr4.length > 0) {
                        sdVar.parseFrom(bArr4);
                    }
                    linkedList.add(sdVar);
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f33401o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f33402p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.pj pjVar9 = new bw5.pj();
                    if (bArr5 != null && bArr5.length > 0) {
                        pjVar9.parseFrom(bArr5);
                    }
                    this.f33403q = pjVar9;
                }
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
