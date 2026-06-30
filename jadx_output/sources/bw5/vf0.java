package bw5;

/* loaded from: classes15.dex */
public class vf0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.uf0 f34349d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f34350e = new boolean[2];

    static {
        new bw5.vf0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.vf0 parseFrom(byte[] bArr) {
        return (bw5.vf0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof bw5.vf0) && n51.f.a(this.f34349d, ((bw5.vf0) fVar).f34349d);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.vf0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34350e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.uf0 uf0Var = this.f34349d;
            if (uf0Var != null && zArr[1]) {
                fVar.e(1, uf0Var.f33884d);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.uf0 uf0Var2 = this.f34349d;
            if (uf0Var2 == null || !zArr[1]) {
                return 0;
            }
            return 0 + b36.f.e(1, uf0Var2.f33884d);
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
        if (intValue != 1) {
            return -1;
        }
        int g17 = aVar2.g(intValue);
        this.f34349d = g17 != 1 ? g17 != 2 ? g17 != 3 ? g17 != 4 ? null : bw5.uf0.Business_Finder_Live : bw5.uf0.Business_Maas_Image_Editor : bw5.uf0.Business_Status_Publish : bw5.uf0.Business_Default;
        zArr[1] = true;
        return 0;
    }
}
