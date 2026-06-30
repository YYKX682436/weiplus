package bw5;

/* loaded from: classes2.dex */
public class qk extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public bw5.pj f32141e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f32142f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f32143g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f32140d = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f32144h = new boolean[5];

    static {
        new bw5.qk();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.qk parseFrom(byte[] bArr) {
        return (bw5.qk) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qk)) {
            return false;
        }
        bw5.qk qkVar = (bw5.qk) fVar;
        return n51.f.a(this.f32140d, qkVar.f32140d) && n51.f.a(this.f32141e, qkVar.f32141e) && n51.f.a(this.f32142f, qkVar.f32142f) && n51.f.a(this.f32143g, qkVar.f32143g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.qk();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f32140d;
        boolean[] zArr = this.f32144h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            bw5.pj pjVar = this.f32141e;
            if (pjVar != null && zArr[2]) {
                fVar.i(2, pjVar.computeSize());
                this.f32141e.writeFields(fVar);
            }
            java.lang.String str = this.f32142f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f32143g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            bw5.pj pjVar2 = this.f32141e;
            if (pjVar2 != null && zArr[2]) {
                g17 += b36.f.i(2, pjVar2.computeSize());
            }
            java.lang.String str3 = this.f32142f;
            if (str3 != null && zArr[3]) {
                g17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f32143g;
            return (str4 == null || !zArr[4]) ? g17 : g17 + b36.f.j(4, str4);
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
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.rk rkVar = new bw5.rk();
                if (bArr != null && bArr.length > 0) {
                    rkVar.parseFrom(bArr);
                }
                linkedList.add(rkVar);
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f32142f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f32143g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.pj pjVar3 = new bw5.pj();
            if (bArr2 != null && bArr2.length > 0) {
                pjVar3.parseFrom(bArr2);
            }
            this.f32141e = pjVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
