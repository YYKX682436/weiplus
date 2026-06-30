package bw5;

/* loaded from: classes2.dex */
public class ik extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.hk f28618d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.bk f28619e;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f28621g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f28622h;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f28620f = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f28623i = new boolean[6];

    static {
        new bw5.ik();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ik parseFrom(byte[] bArr) {
        return (bw5.ik) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ik)) {
            return false;
        }
        bw5.ik ikVar = (bw5.ik) fVar;
        return n51.f.a(this.f28618d, ikVar.f28618d) && n51.f.a(this.f28619e, ikVar.f28619e) && n51.f.a(this.f28620f, ikVar.f28620f) && n51.f.a(this.f28621g, ikVar.f28621g) && n51.f.a(this.f28622h, ikVar.f28622h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ik();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f28620f;
        boolean[] zArr = this.f28623i;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.hk hkVar = this.f28618d;
            if (hkVar != null && zArr[1]) {
                fVar.i(1, hkVar.computeSize());
                this.f28618d.writeFields(fVar);
            }
            bw5.bk bkVar = this.f28619e;
            if (bkVar != null && zArr[2]) {
                fVar.i(2, bkVar.computeSize());
                this.f28619e.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList);
            com.tencent.mm.protobuf.g gVar = this.f28621g;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            java.lang.String str = this.f28622h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.hk hkVar2 = this.f28618d;
            if (hkVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, hkVar2.computeSize());
            }
            bw5.bk bkVar2 = this.f28619e;
            if (bkVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, bkVar2.computeSize());
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            com.tencent.mm.protobuf.g gVar2 = this.f28621g;
            if (gVar2 != null && zArr[4]) {
                g17 += b36.f.b(4, gVar2);
            }
            java.lang.String str2 = this.f28622h;
            return (str2 == null || !zArr[5]) ? g17 : g17 + b36.f.j(5, str2);
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
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.hk hkVar3 = new bw5.hk();
                if (bArr != null && bArr.length > 0) {
                    hkVar3.parseFrom(bArr);
                }
                this.f28618d = hkVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.bk bkVar3 = new bw5.bk();
                if (bArr2 != null && bArr2.length > 0) {
                    bkVar3.parseFrom(bArr2);
                }
                this.f28619e = bkVar3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                this.f28621g = aVar2.d(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f28622h = aVar2.k(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.hk hkVar4 = new bw5.hk();
            if (bArr3 != null && bArr3.length > 0) {
                hkVar4.parseFrom(bArr3);
            }
            linkedList.add(hkVar4);
        }
        zArr[3] = true;
        return 0;
    }
}
