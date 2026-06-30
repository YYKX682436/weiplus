package bw5;

/* loaded from: classes2.dex */
public class wa extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f34623d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.od f34624e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f34625f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.od f34626g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.od f34627h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f34628i = new boolean[6];

    static {
        new bw5.wa();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wa parseFrom(byte[] bArr) {
        return (bw5.wa) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wa)) {
            return false;
        }
        bw5.wa waVar = (bw5.wa) fVar;
        return n51.f.a(this.f34623d, waVar.f34623d) && n51.f.a(this.f34624e, waVar.f34624e) && n51.f.a(this.f34625f, waVar.f34625f) && n51.f.a(this.f34626g, waVar.f34626g) && n51.f.a(this.f34627h, waVar.f34627h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.wa();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f34628i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f34623d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.od odVar = this.f34624e;
            if (odVar != null && zArr[2]) {
                fVar.i(2, odVar.computeSize());
                this.f34624e.writeFields(fVar);
            }
            java.lang.String str2 = this.f34625f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            bw5.od odVar2 = this.f34626g;
            if (odVar2 != null && zArr[4]) {
                fVar.i(4, odVar2.computeSize());
                this.f34626g.writeFields(fVar);
            }
            bw5.od odVar3 = this.f34627h;
            if (odVar3 != null && zArr[5]) {
                fVar.i(5, odVar3.computeSize());
                this.f34627h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f34623d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            bw5.od odVar4 = this.f34624e;
            if (odVar4 != null && zArr[2]) {
                i18 += b36.f.i(2, odVar4.computeSize());
            }
            java.lang.String str4 = this.f34625f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            bw5.od odVar5 = this.f34626g;
            if (odVar5 != null && zArr[4]) {
                i18 += b36.f.i(4, odVar5.computeSize());
            }
            bw5.od odVar6 = this.f34627h;
            return (odVar6 == null || !zArr[5]) ? i18 : i18 + b36.f.i(5, odVar6.computeSize());
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
        if (intValue == 1) {
            this.f34623d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.od odVar7 = new bw5.od();
                if (bArr != null && bArr.length > 0) {
                    odVar7.parseFrom(bArr);
                }
                this.f34624e = odVar7;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f34625f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.od odVar8 = new bw5.od();
                if (bArr2 != null && bArr2.length > 0) {
                    odVar8.parseFrom(bArr2);
                }
                this.f34626g = odVar8;
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.od odVar9 = new bw5.od();
            if (bArr3 != null && bArr3.length > 0) {
                odVar9.parseFrom(bArr3);
            }
            this.f34627h = odVar9;
        }
        zArr[5] = true;
        return 0;
    }
}
