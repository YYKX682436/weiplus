package bw5;

/* loaded from: classes8.dex */
public class yx extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.lx f35724d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.xx f35725e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f35726f = new boolean[3];

    static {
        new bw5.yx();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.yx parseFrom(byte[] bArr) {
        return (bw5.yx) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yx)) {
            return false;
        }
        bw5.yx yxVar = (bw5.yx) fVar;
        return n51.f.a(this.f35724d, yxVar.f35724d) && n51.f.a(this.f35725e, yxVar.f35725e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.yx();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35726f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.lx lxVar = this.f35724d;
            if (lxVar != null && zArr[1]) {
                fVar.e(1, lxVar.f30002d);
            }
            bw5.xx xxVar = this.f35725e;
            if (xxVar != null && zArr[2]) {
                fVar.i(2, xxVar.computeSize());
                this.f35725e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.lx lxVar2 = this.f35724d;
            if (lxVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, lxVar2.f30002d);
            }
            bw5.xx xxVar2 = this.f35725e;
            return (xxVar2 == null || !zArr[2]) ? i18 : i18 + b36.f.i(2, xxVar2.computeSize());
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
            this.f35724d = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : bw5.lx.FinderTabTipsDSLRenderReddotPendantStaticIcon_Hollow : bw5.lx.FinderTabTipsDSLRenderReddotPendantStaticIcon_Solid : bw5.lx.FinderTabTipsDSLRenderReddotPendantStaticIcon_Unknown;
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.xx xxVar3 = new bw5.xx();
            if (bArr != null && bArr.length > 0) {
                xxVar3.parseFrom(bArr);
            }
            this.f35725e = xxVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
