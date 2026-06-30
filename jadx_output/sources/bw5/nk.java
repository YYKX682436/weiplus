package bw5;

/* loaded from: classes2.dex */
public class nk extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30706d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30707e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.pj f30708f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f30709g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f30710h = new boolean[6];

    static {
        new bw5.nk();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.nk parseFrom(byte[] bArr) {
        return (bw5.nk) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.nk)) {
            return false;
        }
        bw5.nk nkVar = (bw5.nk) fVar;
        return n51.f.a(this.f30706d, nkVar.f30706d) && n51.f.a(this.f30707e, nkVar.f30707e) && n51.f.a(this.f30708f, nkVar.f30708f) && n51.f.a(this.f30709g, nkVar.f30709g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.nk();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f30709g;
        boolean[] zArr = this.f30710h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f30706d;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f30707e;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            bw5.pj pjVar = this.f30708f;
            if (pjVar != null && zArr[4]) {
                fVar.i(4, pjVar.computeSize());
                this.f30708f.writeFields(fVar);
            }
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f30706d;
            if (str3 != null && zArr[2]) {
                i18 = 0 + b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f30707e;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            bw5.pj pjVar2 = this.f30708f;
            if (pjVar2 != null && zArr[4]) {
                i18 += b36.f.i(4, pjVar2.computeSize());
            }
            return i18 + b36.f.g(5, 8, linkedList);
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
        if (intValue == 2) {
            this.f30706d = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f30707e = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.pj pjVar3 = new bw5.pj();
                if (bArr != null && bArr.length > 0) {
                    pjVar3.parseFrom(bArr);
                }
                this.f30708f = pjVar3;
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.mk mkVar = new bw5.mk();
            if (bArr2 != null && bArr2.length > 0) {
                mkVar.parseFrom(bArr2);
            }
            linkedList.add(mkVar);
        }
        zArr[5] = true;
        return 0;
    }
}
