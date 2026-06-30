package bw5;

/* loaded from: classes2.dex */
public class wu extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f34855d;

    /* renamed from: e, reason: collision with root package name */
    public int f34856e;

    /* renamed from: f, reason: collision with root package name */
    public int f34857f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f34858g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.pj f34859h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f34860i = new boolean[6];

    static {
        new bw5.wu();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wu parseFrom(byte[] bArr) {
        return (bw5.wu) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wu)) {
            return false;
        }
        bw5.wu wuVar = (bw5.wu) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f34855d), java.lang.Integer.valueOf(wuVar.f34855d)) && n51.f.a(java.lang.Integer.valueOf(this.f34856e), java.lang.Integer.valueOf(wuVar.f34856e)) && n51.f.a(java.lang.Integer.valueOf(this.f34857f), java.lang.Integer.valueOf(wuVar.f34857f)) && n51.f.a(this.f34858g, wuVar.f34858g) && n51.f.a(this.f34859h, wuVar.f34859h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.wu();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34860i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f34855d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f34856e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f34857f);
            }
            java.lang.String str = this.f34858g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            bw5.pj pjVar = this.f34859h;
            if (pjVar != null && zArr[5]) {
                fVar.i(5, pjVar.computeSize());
                this.f34859h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f34855d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f34856e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f34857f);
            }
            java.lang.String str2 = this.f34858g;
            if (str2 != null && zArr[4]) {
                e17 += b36.f.j(4, str2);
            }
            bw5.pj pjVar2 = this.f34859h;
            return (pjVar2 == null || !zArr[5]) ? e17 : e17 + b36.f.i(5, pjVar2.computeSize());
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
            this.f34855d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f34856e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f34857f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f34858g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.pj pjVar3 = new bw5.pj();
            if (bArr != null && bArr.length > 0) {
                pjVar3.parseFrom(bArr);
            }
            this.f34859h = pjVar3;
        }
        zArr[5] = true;
        return 0;
    }
}
