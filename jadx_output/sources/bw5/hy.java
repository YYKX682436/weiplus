package bw5;

/* loaded from: classes8.dex */
public class hy extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.jx f28386d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.gy f28387e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.ey f28388f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f28389g = new boolean[4];

    static {
        new bw5.hy();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.hy parseFrom(byte[] bArr) {
        return (bw5.hy) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hy)) {
            return false;
        }
        bw5.hy hyVar = (bw5.hy) fVar;
        return n51.f.a(this.f28386d, hyVar.f28386d) && n51.f.a(this.f28387e, hyVar.f28387e) && n51.f.a(this.f28388f, hyVar.f28388f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.hy();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28389g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.jx jxVar = this.f28386d;
            if (jxVar != null && zArr[1]) {
                fVar.e(1, jxVar.f29156d);
            }
            bw5.gy gyVar = this.f28387e;
            if (gyVar != null && zArr[2]) {
                fVar.i(2, gyVar.computeSize());
                this.f28387e.writeFields(fVar);
            }
            bw5.ey eyVar = this.f28388f;
            if (eyVar != null && zArr[3]) {
                fVar.i(3, eyVar.computeSize());
                this.f28388f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.jx jxVar2 = this.f28386d;
            if (jxVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, jxVar2.f29156d);
            }
            bw5.gy gyVar2 = this.f28387e;
            if (gyVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, gyVar2.computeSize());
            }
            bw5.ey eyVar2 = this.f28388f;
            return (eyVar2 == null || !zArr[3]) ? i18 : i18 + b36.f.i(3, eyVar2.computeSize());
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
            this.f28386d = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? null : bw5.jx.FinderTabTipsDSLRenderNodeStyle_Avatar : bw5.jx.FinderTabTipsDSLRenderNodeStyle_Icon : bw5.jx.FinderTabTipsDSLRenderNodeStyle_Text : bw5.jx.FinderTabTipsDSLRenderNodeStyle_Unknown;
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.gy gyVar3 = new bw5.gy();
                if (bArr != null && bArr.length > 0) {
                    gyVar3.parseFrom(bArr);
                }
                this.f28387e = gyVar3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.ey eyVar3 = new bw5.ey();
            if (bArr2 != null && bArr2.length > 0) {
                eyVar3.parseFrom(bArr2);
            }
            this.f28388f = eyVar3;
        }
        zArr[3] = true;
        return 0;
    }
}
