package bw5;

/* loaded from: classes2.dex */
public class bp extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ap f25777d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.ep f25778e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.cp f25779f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.zo f25780g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f25781h = new boolean[5];

    static {
        new bw5.bp();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.bp parseFrom(byte[] bArr) {
        return (bw5.bp) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bp)) {
            return false;
        }
        bw5.bp bpVar = (bw5.bp) fVar;
        return n51.f.a(this.f25777d, bpVar.f25777d) && n51.f.a(this.f25778e, bpVar.f25778e) && n51.f.a(this.f25779f, bpVar.f25779f) && n51.f.a(this.f25780g, bpVar.f25780g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.bp();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25781h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ap apVar = this.f25777d;
            if (apVar != null && zArr[1]) {
                fVar.e(1, apVar.f25298d);
            }
            bw5.ep epVar = this.f25778e;
            if (epVar != null && zArr[2]) {
                fVar.i(2, epVar.computeSize());
                this.f25778e.writeFields(fVar);
            }
            bw5.cp cpVar = this.f25779f;
            if (cpVar != null && zArr[3]) {
                fVar.i(3, cpVar.computeSize());
                this.f25779f.writeFields(fVar);
            }
            bw5.zo zoVar = this.f25780g;
            if (zoVar != null && zArr[4]) {
                fVar.i(4, zoVar.computeSize());
                this.f25780g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ap apVar2 = this.f25777d;
            if (apVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, apVar2.f25298d);
            }
            bw5.ep epVar2 = this.f25778e;
            if (epVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, epVar2.computeSize());
            }
            bw5.cp cpVar2 = this.f25779f;
            if (cpVar2 != null && zArr[3]) {
                i18 += b36.f.i(3, cpVar2.computeSize());
            }
            bw5.zo zoVar2 = this.f25780g;
            return (zoVar2 == null || !zArr[4]) ? i18 : i18 + b36.f.i(4, zoVar2.computeSize());
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
            int g17 = aVar2.g(intValue);
            this.f25777d = g17 != 1 ? g17 != 2 ? g17 != 3 ? g17 != 4 ? null : bw5.ap.KTV : bw5.ap.Game : bw5.ap.VoiceRoom : bw5.ap.PkBattle;
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.ep epVar3 = new bw5.ep();
                if (bArr != null && bArr.length > 0) {
                    epVar3.parseFrom(bArr);
                }
                this.f25778e = epVar3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.cp cpVar3 = new bw5.cp();
                if (bArr2 != null && bArr2.length > 0) {
                    cpVar3.parseFrom(bArr2);
                }
                this.f25779f = cpVar3;
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
            bw5.zo zoVar3 = new bw5.zo();
            if (bArr3 != null && bArr3.length > 0) {
                zoVar3.parseFrom(bArr3);
            }
            this.f25780g = zoVar3;
        }
        zArr[4] = true;
        return 0;
    }
}
