package bw5;

/* loaded from: classes2.dex */
public class hg extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ae f28205d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f28206e;

    /* renamed from: f, reason: collision with root package name */
    public long f28207f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f28208g = new boolean[4];

    static {
        new bw5.hg();
    }

    public bw5.ae b() {
        return this.f28208g[1] ? this.f28205d : new bw5.ae();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.hg parseFrom(byte[] bArr) {
        return (bw5.hg) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hg)) {
            return false;
        }
        bw5.hg hgVar = (bw5.hg) fVar;
        return n51.f.a(this.f28205d, hgVar.f28205d) && n51.f.a(java.lang.Boolean.valueOf(this.f28206e), java.lang.Boolean.valueOf(hgVar.f28206e)) && n51.f.a(java.lang.Long.valueOf(this.f28207f), java.lang.Long.valueOf(hgVar.f28207f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.hg();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28208g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ae aeVar = this.f28205d;
            if (aeVar != null && zArr[1]) {
                fVar.i(1, aeVar.computeSize());
                this.f28205d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.a(2, this.f28206e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f28207f);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ae aeVar2 = this.f28205d;
            if (aeVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, aeVar2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.a(2, this.f28206e);
            }
            return zArr[3] ? i18 + b36.f.h(3, this.f28207f) : i18;
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
            if (intValue == 2) {
                this.f28206e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f28207f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.ae aeVar3 = new bw5.ae();
            if (bArr != null && bArr.length > 0) {
                aeVar3.parseFrom(bArr);
            }
            this.f28205d = aeVar3;
        }
        zArr[1] = true;
        return 0;
    }
}
