package bw5;

/* loaded from: classes2.dex */
public class r3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32386d;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f32389g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f32390h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.od f32391i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.od f32392m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.od f32393n;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f32387e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f32388f = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f32394o = new boolean[9];

    static {
        new bw5.r3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.r3 parseFrom(byte[] bArr) {
        return (bw5.r3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.r3)) {
            return false;
        }
        bw5.r3 r3Var = (bw5.r3) fVar;
        return n51.f.a(this.f32386d, r3Var.f32386d) && n51.f.a(this.f32387e, r3Var.f32387e) && n51.f.a(this.f32388f, r3Var.f32388f) && n51.f.a(this.f32389g, r3Var.f32389g) && n51.f.a(this.f32390h, r3Var.f32390h) && n51.f.a(this.f32391i, r3Var.f32391i) && n51.f.a(this.f32392m, r3Var.f32392m) && n51.f.a(this.f32393n, r3Var.f32393n);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.r3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f32388f;
        java.util.LinkedList linkedList2 = this.f32387e;
        int i18 = 0;
        boolean[] zArr = this.f32394o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f32386d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList2);
            fVar.g(3, 8, linkedList);
            java.lang.String str2 = this.f32389g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f32390h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            bw5.od odVar = this.f32391i;
            if (odVar != null && zArr[6]) {
                fVar.i(6, odVar.computeSize());
                this.f32391i.writeFields(fVar);
            }
            bw5.od odVar2 = this.f32392m;
            if (odVar2 != null && zArr[7]) {
                fVar.i(7, odVar2.computeSize());
                this.f32392m.writeFields(fVar);
            }
            bw5.od odVar3 = this.f32393n;
            if (odVar3 != null && zArr[8]) {
                fVar.i(8, odVar3.computeSize());
                this.f32393n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f32386d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList2) + b36.f.g(3, 8, linkedList);
            java.lang.String str5 = this.f32389g;
            if (str5 != null && zArr[4]) {
                g17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f32390h;
            if (str6 != null && zArr[5]) {
                g17 += b36.f.j(5, str6);
            }
            bw5.od odVar4 = this.f32391i;
            if (odVar4 != null && zArr[6]) {
                g17 += b36.f.i(6, odVar4.computeSize());
            }
            bw5.od odVar5 = this.f32392m;
            if (odVar5 != null && zArr[7]) {
                g17 += b36.f.i(7, odVar5.computeSize());
            }
            bw5.od odVar6 = this.f32393n;
            return (odVar6 == null || !zArr[8]) ? g17 : g17 + b36.f.i(8, odVar6.computeSize());
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
            case 1:
                this.f32386d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.u3 u3Var = new bw5.u3();
                    if (bArr != null && bArr.length > 0) {
                        u3Var.parseFrom(bArr);
                    }
                    linkedList2.add(u3Var);
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.c4 c4Var = new bw5.c4();
                    if (bArr2 != null && bArr2.length > 0) {
                        c4Var.parseFrom(bArr2);
                    }
                    linkedList.add(c4Var);
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f32389g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f32390h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.od odVar7 = new bw5.od();
                    if (bArr3 != null && bArr3.length > 0) {
                        odVar7.parseFrom(bArr3);
                    }
                    this.f32391i = odVar7;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.od odVar8 = new bw5.od();
                    if (bArr4 != null && bArr4.length > 0) {
                        odVar8.parseFrom(bArr4);
                    }
                    this.f32392m = odVar8;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.od odVar9 = new bw5.od();
                    if (bArr5 != null && bArr5.length > 0) {
                        odVar9.parseFrom(bArr5);
                    }
                    this.f32393n = odVar9;
                }
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
