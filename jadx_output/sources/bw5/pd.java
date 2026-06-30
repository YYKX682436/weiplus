package bw5;

/* loaded from: classes2.dex */
public class pd extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f31573d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f31574e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f31575f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.qd f31576g;

    /* renamed from: h, reason: collision with root package name */
    public int f31577h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f31578i = new boolean[7];

    static {
        new bw5.pd();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.pd parseFrom(byte[] bArr) {
        return (bw5.pd) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pd)) {
            return false;
        }
        bw5.pd pdVar = (bw5.pd) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f31573d), java.lang.Integer.valueOf(pdVar.f31573d)) && n51.f.a(this.f31574e, pdVar.f31574e) && n51.f.a(this.f31575f, pdVar.f31575f) && n51.f.a(this.f31576g, pdVar.f31576g) && n51.f.a(java.lang.Integer.valueOf(this.f31577h), java.lang.Integer.valueOf(pdVar.f31577h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.pd();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31578i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f31573d);
            }
            java.lang.String str = this.f31574e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f31575f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            bw5.qd qdVar = this.f31576g;
            if (qdVar != null && zArr[4]) {
                fVar.i(4, qdVar.computeSize());
                this.f31576g.writeFields(fVar);
            }
            if (zArr[6]) {
                fVar.e(6, this.f31577h);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f31573d) : 0;
            java.lang.String str3 = this.f31574e;
            if (str3 != null && zArr[2]) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f31575f;
            if (str4 != null && zArr[3]) {
                e17 += b36.f.j(3, str4);
            }
            bw5.qd qdVar2 = this.f31576g;
            if (qdVar2 != null && zArr[4]) {
                e17 += b36.f.i(4, qdVar2.computeSize());
            }
            return zArr[6] ? e17 + b36.f.e(6, this.f31577h) : e17;
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
            this.f31573d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f31574e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f31575f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 6) {
                return -1;
            }
            this.f31577h = aVar2.g(intValue);
            zArr[6] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.qd qdVar3 = new bw5.qd();
            if (bArr != null && bArr.length > 0) {
                qdVar3.parseFrom(bArr);
            }
            this.f31576g = qdVar3;
        }
        zArr[4] = true;
        return 0;
    }
}
