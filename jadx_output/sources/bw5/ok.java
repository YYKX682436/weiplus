package bw5;

/* loaded from: classes2.dex */
public class ok extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f31132d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f31133e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.pj f31134f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.mk f31135g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f31136h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f31137i = new boolean[7];

    static {
        new bw5.ok();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ok parseFrom(byte[] bArr) {
        return (bw5.ok) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ok)) {
            return false;
        }
        bw5.ok okVar = (bw5.ok) fVar;
        return n51.f.a(this.f31132d, okVar.f31132d) && n51.f.a(this.f31133e, okVar.f31133e) && n51.f.a(this.f31134f, okVar.f31134f) && n51.f.a(this.f31135g, okVar.f31135g) && n51.f.a(this.f31136h, okVar.f31136h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ok();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f31137i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f31132d;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f31133e;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            bw5.pj pjVar = this.f31134f;
            if (pjVar != null && zArr[4]) {
                fVar.i(4, pjVar.computeSize());
                this.f31134f.writeFields(fVar);
            }
            bw5.mk mkVar = this.f31135g;
            if (mkVar != null && zArr[5]) {
                fVar.i(5, mkVar.computeSize());
                this.f31135g.writeFields(fVar);
            }
            java.lang.String str3 = this.f31136h;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f31132d;
            if (str4 != null && zArr[2]) {
                i18 = 0 + b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f31133e;
            if (str5 != null && zArr[3]) {
                i18 += b36.f.j(3, str5);
            }
            bw5.pj pjVar2 = this.f31134f;
            if (pjVar2 != null && zArr[4]) {
                i18 += b36.f.i(4, pjVar2.computeSize());
            }
            bw5.mk mkVar2 = this.f31135g;
            if (mkVar2 != null && zArr[5]) {
                i18 += b36.f.i(5, mkVar2.computeSize());
            }
            java.lang.String str6 = this.f31136h;
            return (str6 == null || !zArr[6]) ? i18 : i18 + b36.f.j(6, str6);
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
        if (intValue == 2) {
            this.f31132d = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f31133e = aVar2.k(intValue);
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
                this.f31134f = pjVar3;
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            if (intValue != 6) {
                return -1;
            }
            this.f31136h = aVar2.k(intValue);
            zArr[6] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.mk mkVar3 = new bw5.mk();
            if (bArr2 != null && bArr2.length > 0) {
                mkVar3.parseFrom(bArr2);
            }
            this.f31135g = mkVar3;
        }
        zArr[5] = true;
        return 0;
    }
}
