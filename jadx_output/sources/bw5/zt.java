package bw5;

/* loaded from: classes2.dex */
public class zt extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.me f36179d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.ue f36180e;

    /* renamed from: f, reason: collision with root package name */
    public int f36181f;

    /* renamed from: g, reason: collision with root package name */
    public int f36182g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f36183h = new boolean[5];

    static {
        new bw5.zt();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.zt parseFrom(byte[] bArr) {
        return (bw5.zt) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zt)) {
            return false;
        }
        bw5.zt ztVar = (bw5.zt) fVar;
        return n51.f.a(this.f36179d, ztVar.f36179d) && n51.f.a(this.f36180e, ztVar.f36180e) && n51.f.a(java.lang.Integer.valueOf(this.f36181f), java.lang.Integer.valueOf(ztVar.f36181f)) && n51.f.a(java.lang.Integer.valueOf(this.f36182g), java.lang.Integer.valueOf(ztVar.f36182g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.zt();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f36183h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.me meVar = this.f36179d;
            if (meVar != null && zArr[1]) {
                fVar.i(1, meVar.computeSize());
                this.f36179d.writeFields(fVar);
            }
            bw5.ue ueVar = this.f36180e;
            if (ueVar != null && zArr[2]) {
                fVar.i(2, ueVar.computeSize());
                this.f36180e.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f36181f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f36182g);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.me meVar2 = this.f36179d;
            if (meVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, meVar2.computeSize());
            }
            bw5.ue ueVar2 = this.f36180e;
            if (ueVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, ueVar2.computeSize());
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f36181f);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f36182g) : i18;
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
                bw5.me meVar3 = new bw5.me();
                if (bArr != null && bArr.length > 0) {
                    meVar3.parseFrom(bArr);
                }
                this.f36179d = meVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f36181f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f36182g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.ue ueVar3 = new bw5.ue();
            if (bArr2 != null && bArr2.length > 0) {
                ueVar3.parseFrom(bArr2);
            }
            this.f36180e = ueVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
