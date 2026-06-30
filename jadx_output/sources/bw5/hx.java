package bw5;

/* loaded from: classes2.dex */
public class hx extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f28380d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.vy f28381e;

    /* renamed from: f, reason: collision with root package name */
    public int f28382f;

    /* renamed from: g, reason: collision with root package name */
    public long f28383g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f28384h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f28385i = new boolean[6];

    static {
        new bw5.hx();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.hx parseFrom(byte[] bArr) {
        return (bw5.hx) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hx)) {
            return false;
        }
        bw5.hx hxVar = (bw5.hx) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f28380d), java.lang.Integer.valueOf(hxVar.f28380d)) && n51.f.a(this.f28381e, hxVar.f28381e) && n51.f.a(java.lang.Integer.valueOf(this.f28382f), java.lang.Integer.valueOf(hxVar.f28382f)) && n51.f.a(java.lang.Long.valueOf(this.f28383g), java.lang.Long.valueOf(hxVar.f28383g)) && n51.f.a(this.f28384h, hxVar.f28384h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.hx();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28385i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f28380d);
            }
            bw5.vy vyVar = this.f28381e;
            if (vyVar != null && zArr[2]) {
                fVar.i(2, vyVar.computeSize());
                this.f28381e.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f28382f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f28383g);
            }
            java.lang.String str = this.f28384h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f28380d) : 0;
            bw5.vy vyVar2 = this.f28381e;
            if (vyVar2 != null && zArr[2]) {
                e17 += b36.f.i(2, vyVar2.computeSize());
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f28382f);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f28383g);
            }
            java.lang.String str2 = this.f28384h;
            return (str2 == null || !zArr[5]) ? e17 : e17 + b36.f.j(5, str2);
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
            this.f28380d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f28382f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue == 4) {
                this.f28383g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f28384h = aVar2.k(intValue);
            zArr[5] = true;
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
            this.f28381e = vyVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
