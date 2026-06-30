package bw5;

/* loaded from: classes2.dex */
public class ky extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ev f29574d;

    /* renamed from: e, reason: collision with root package name */
    public long f29575e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f29576f;

    /* renamed from: g, reason: collision with root package name */
    public int f29577g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f29578h = new boolean[5];

    static {
        new bw5.ky();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ky parseFrom(byte[] bArr) {
        return (bw5.ky) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ky)) {
            return false;
        }
        bw5.ky kyVar = (bw5.ky) fVar;
        return n51.f.a(this.f29574d, kyVar.f29574d) && n51.f.a(java.lang.Long.valueOf(this.f29575e), java.lang.Long.valueOf(kyVar.f29575e)) && n51.f.a(this.f29576f, kyVar.f29576f) && n51.f.a(java.lang.Integer.valueOf(this.f29577g), java.lang.Integer.valueOf(kyVar.f29577g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ky();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f29578h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ev evVar = this.f29574d;
            if (evVar != null && zArr[1]) {
                fVar.i(1, evVar.computeSize());
                this.f29574d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.h(2, this.f29575e);
            }
            java.lang.String str = this.f29576f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.e(4, this.f29577g);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ev evVar2 = this.f29574d;
            if (evVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, evVar2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f29575e);
            }
            java.lang.String str2 = this.f29576f;
            if (str2 != null && zArr[3]) {
                i18 += b36.f.j(3, str2);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f29577g) : i18;
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
                this.f29575e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue == 3) {
                this.f29576f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f29577g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.ev evVar3 = new bw5.ev();
            if (bArr != null && bArr.length > 0) {
                evVar3.parseFrom(bArr);
            }
            this.f29574d = evVar3;
        }
        zArr[1] = true;
        return 0;
    }
}
