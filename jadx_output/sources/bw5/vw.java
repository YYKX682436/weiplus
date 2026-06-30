package bw5;

/* loaded from: classes2.dex */
public class vw extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f34500d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.vy f34501e;

    /* renamed from: f, reason: collision with root package name */
    public int f34502f;

    /* renamed from: g, reason: collision with root package name */
    public long f34503g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f34504h = new boolean[5];

    static {
        new bw5.vw();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.vw parseFrom(byte[] bArr) {
        return (bw5.vw) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vw)) {
            return false;
        }
        bw5.vw vwVar = (bw5.vw) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f34500d), java.lang.Integer.valueOf(vwVar.f34500d)) && n51.f.a(this.f34501e, vwVar.f34501e) && n51.f.a(java.lang.Integer.valueOf(this.f34502f), java.lang.Integer.valueOf(vwVar.f34502f)) && n51.f.a(java.lang.Long.valueOf(this.f34503g), java.lang.Long.valueOf(vwVar.f34503g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.vw();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34504h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f34500d);
            }
            bw5.vy vyVar = this.f34501e;
            if (vyVar != null && zArr[2]) {
                fVar.i(2, vyVar.computeSize());
                this.f34501e.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f34502f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f34503g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f34500d) : 0;
            bw5.vy vyVar2 = this.f34501e;
            if (vyVar2 != null && zArr[2]) {
                e17 += b36.f.i(2, vyVar2.computeSize());
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f34502f);
            }
            return zArr[4] ? e17 + b36.f.h(4, this.f34503g) : e17;
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
            this.f34500d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f34502f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f34503g = aVar2.i(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.vy vyVar3 = new bw5.vy();
            if (bArr != null && bArr.length > 0) {
                vyVar3.parseFrom(bArr);
            }
            this.f34501e = vyVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
