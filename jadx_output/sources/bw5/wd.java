package bw5;

/* loaded from: classes2.dex */
public class wd extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f34656d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f34657e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.pj f34658f;

    /* renamed from: g, reason: collision with root package name */
    public int f34659g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f34660h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f34661i = new boolean[6];

    static {
        new bw5.wd();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wd parseFrom(byte[] bArr) {
        return (bw5.wd) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wd)) {
            return false;
        }
        bw5.wd wdVar = (bw5.wd) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f34656d), java.lang.Long.valueOf(wdVar.f34656d)) && n51.f.a(this.f34657e, wdVar.f34657e) && n51.f.a(this.f34658f, wdVar.f34658f) && n51.f.a(java.lang.Integer.valueOf(this.f34659g), java.lang.Integer.valueOf(wdVar.f34659g)) && n51.f.a(this.f34660h, wdVar.f34660h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.wd();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34661i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f34656d);
            }
            java.lang.String str = this.f34657e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            bw5.pj pjVar = this.f34658f;
            if (pjVar != null && zArr[3]) {
                fVar.i(3, pjVar.computeSize());
                this.f34658f.writeFields(fVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f34659g);
            }
            java.lang.String str2 = this.f34660h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f34656d) : 0;
            java.lang.String str3 = this.f34657e;
            if (str3 != null && zArr[2]) {
                h17 += b36.f.j(2, str3);
            }
            bw5.pj pjVar2 = this.f34658f;
            if (pjVar2 != null && zArr[3]) {
                h17 += b36.f.i(3, pjVar2.computeSize());
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f34659g);
            }
            java.lang.String str4 = this.f34660h;
            return (str4 == null || !zArr[5]) ? h17 : h17 + b36.f.j(5, str4);
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
            this.f34656d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f34657e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                this.f34659g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f34660h = aVar2.k(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.pj pjVar3 = new bw5.pj();
            if (bArr != null && bArr.length > 0) {
                pjVar3.parseFrom(bArr);
            }
            this.f34658f = pjVar3;
        }
        zArr[3] = true;
        return 0;
    }
}
