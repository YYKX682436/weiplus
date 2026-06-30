package bw5;

/* loaded from: classes2.dex */
public class c30 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.sc f25899d;

    /* renamed from: e, reason: collision with root package name */
    public float f25900e;

    /* renamed from: f, reason: collision with root package name */
    public float f25901f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.hd f25902g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f25903h = new boolean[5];

    static {
        new bw5.c30();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.c30)) {
            return false;
        }
        bw5.c30 c30Var = (bw5.c30) fVar;
        return n51.f.a(this.f25899d, c30Var.f25899d) && n51.f.a(java.lang.Float.valueOf(this.f25900e), java.lang.Float.valueOf(c30Var.f25900e)) && n51.f.a(java.lang.Float.valueOf(this.f25901f), java.lang.Float.valueOf(c30Var.f25901f)) && n51.f.a(this.f25902g, c30Var.f25902g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.c30();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25903h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.sc scVar = this.f25899d;
            if (scVar != null && zArr[1]) {
                fVar.i(1, scVar.computeSize());
                this.f25899d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.d(2, this.f25900e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f25901f);
            }
            bw5.hd hdVar = this.f25902g;
            if (hdVar != null && zArr[4]) {
                fVar.i(4, hdVar.computeSize());
                this.f25902g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.sc scVar2 = this.f25899d;
            if (scVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, scVar2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.d(2, this.f25900e);
            }
            if (zArr[3]) {
                i18 += b36.f.d(3, this.f25901f);
            }
            bw5.hd hdVar2 = this.f25902g;
            return (hdVar2 == null || !zArr[4]) ? i18 : i18 + b36.f.i(4, hdVar2.computeSize());
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.sc scVar3 = new bw5.sc();
                if (bArr != null && bArr.length > 0) {
                    scVar3.parseFrom(bArr);
                }
                this.f25899d = scVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f25900e = aVar2.f(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f25901f = aVar2.f(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.hd hdVar3 = new bw5.hd();
            if (bArr2 != null && bArr2.length > 0) {
                hdVar3.parseFrom(bArr2);
            }
            this.f25902g = hdVar3;
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.c30) super.parseFrom(bArr);
    }
}
