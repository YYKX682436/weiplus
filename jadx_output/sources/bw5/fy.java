package bw5;

/* loaded from: classes8.dex */
public class fy extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27559d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.vx f27560e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.yx f27561f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.ux f27562g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f27563h = new boolean[5];

    static {
        new bw5.fy();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fy parseFrom(byte[] bArr) {
        return (bw5.fy) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fy)) {
            return false;
        }
        bw5.fy fyVar = (bw5.fy) fVar;
        return n51.f.a(this.f27559d, fyVar.f27559d) && n51.f.a(this.f27560e, fyVar.f27560e) && n51.f.a(this.f27561f, fyVar.f27561f) && n51.f.a(this.f27562g, fyVar.f27562g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.fy();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27563h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f27559d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.vx vxVar = this.f27560e;
            if (vxVar != null && zArr[2]) {
                fVar.i(2, vxVar.computeSize());
                this.f27560e.writeFields(fVar);
            }
            bw5.yx yxVar = this.f27561f;
            if (yxVar != null && zArr[3]) {
                fVar.i(3, yxVar.computeSize());
                this.f27561f.writeFields(fVar);
            }
            bw5.ux uxVar = this.f27562g;
            if (uxVar != null && zArr[4]) {
                fVar.i(4, uxVar.computeSize());
                this.f27562g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f27559d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            bw5.vx vxVar2 = this.f27560e;
            if (vxVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, vxVar2.computeSize());
            }
            bw5.yx yxVar2 = this.f27561f;
            if (yxVar2 != null && zArr[3]) {
                i18 += b36.f.i(3, yxVar2.computeSize());
            }
            bw5.ux uxVar2 = this.f27562g;
            return (uxVar2 == null || !zArr[4]) ? i18 : i18 + b36.f.i(4, uxVar2.computeSize());
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
            this.f27559d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.vx vxVar3 = new bw5.vx();
                if (bArr != null && bArr.length > 0) {
                    vxVar3.parseFrom(bArr);
                }
                this.f27560e = vxVar3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.yx yxVar3 = new bw5.yx();
                if (bArr2 != null && bArr2.length > 0) {
                    yxVar3.parseFrom(bArr2);
                }
                this.f27561f = yxVar3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.ux uxVar3 = new bw5.ux();
            if (bArr3 != null && bArr3.length > 0) {
                uxVar3.parseFrom(bArr3);
            }
            this.f27562g = uxVar3;
        }
        zArr[4] = true;
        return 0;
    }
}
