package bw5;

/* loaded from: classes2.dex */
public class yd extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.pj f35439d;

    /* renamed from: f, reason: collision with root package name */
    public bw5.pj f35441f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f35442g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f35443h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.pj f35444i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f35445m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.pj f35446n;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f35440e = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f35447o = new boolean[9];

    static {
        new bw5.yd();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.yd parseFrom(byte[] bArr) {
        return (bw5.yd) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yd)) {
            return false;
        }
        bw5.yd ydVar = (bw5.yd) fVar;
        return n51.f.a(this.f35439d, ydVar.f35439d) && n51.f.a(this.f35440e, ydVar.f35440e) && n51.f.a(this.f35441f, ydVar.f35441f) && n51.f.a(this.f35442g, ydVar.f35442g) && n51.f.a(this.f35443h, ydVar.f35443h) && n51.f.a(this.f35444i, ydVar.f35444i) && n51.f.a(this.f35445m, ydVar.f35445m) && n51.f.a(this.f35446n, ydVar.f35446n);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.yd();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f35440e;
        int i18 = 0;
        boolean[] zArr = this.f35447o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.pj pjVar = this.f35439d;
            if (pjVar != null && zArr[1]) {
                fVar.i(1, pjVar.computeSize());
                this.f35439d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            bw5.pj pjVar2 = this.f35441f;
            if (pjVar2 != null && zArr[3]) {
                fVar.i(3, pjVar2.computeSize());
                this.f35441f.writeFields(fVar);
            }
            java.lang.String str = this.f35442g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f35443h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            bw5.pj pjVar3 = this.f35444i;
            if (pjVar3 != null && zArr[6]) {
                fVar.i(6, pjVar3.computeSize());
                this.f35444i.writeFields(fVar);
            }
            java.lang.String str3 = this.f35445m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            bw5.pj pjVar4 = this.f35446n;
            if (pjVar4 != null && zArr[8]) {
                fVar.i(8, pjVar4.computeSize());
                this.f35446n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.pj pjVar5 = this.f35439d;
            if (pjVar5 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, pjVar5.computeSize());
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            bw5.pj pjVar6 = this.f35441f;
            if (pjVar6 != null && zArr[3]) {
                g17 += b36.f.i(3, pjVar6.computeSize());
            }
            java.lang.String str4 = this.f35442g;
            if (str4 != null && zArr[4]) {
                g17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f35443h;
            if (str5 != null && zArr[5]) {
                g17 += b36.f.j(5, str5);
            }
            bw5.pj pjVar7 = this.f35444i;
            if (pjVar7 != null && zArr[6]) {
                g17 += b36.f.i(6, pjVar7.computeSize());
            }
            java.lang.String str6 = this.f35445m;
            if (str6 != null && zArr[7]) {
                g17 += b36.f.j(7, str6);
            }
            bw5.pj pjVar8 = this.f35446n;
            return (pjVar8 == null || !zArr[8]) ? g17 : g17 + b36.f.i(8, pjVar8.computeSize());
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
                    bw5.pj pjVar9 = new bw5.pj();
                    if (bArr != null && bArr.length > 0) {
                        pjVar9.parseFrom(bArr);
                    }
                    this.f35439d = pjVar9;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.sd sdVar = new bw5.sd();
                    if (bArr2 != null && bArr2.length > 0) {
                        sdVar.parseFrom(bArr2);
                    }
                    linkedList.add(sdVar);
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.pj pjVar10 = new bw5.pj();
                    if (bArr3 != null && bArr3.length > 0) {
                        pjVar10.parseFrom(bArr3);
                    }
                    this.f35441f = pjVar10;
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f35442g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f35443h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.pj pjVar11 = new bw5.pj();
                    if (bArr4 != null && bArr4.length > 0) {
                        pjVar11.parseFrom(bArr4);
                    }
                    this.f35444i = pjVar11;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f35445m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.pj pjVar12 = new bw5.pj();
                    if (bArr5 != null && bArr5.length > 0) {
                        pjVar12.parseFrom(bArr5);
                    }
                    this.f35446n = pjVar12;
                }
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
