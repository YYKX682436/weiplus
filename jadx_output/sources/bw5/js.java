package bw5;

/* loaded from: classes2.dex */
public class js extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f29124d;

    /* renamed from: e, reason: collision with root package name */
    public int f29125e;

    /* renamed from: f, reason: collision with root package name */
    public int f29126f;

    /* renamed from: g, reason: collision with root package name */
    public int f29127g;

    /* renamed from: h, reason: collision with root package name */
    public int f29128h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.st f29129i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f29130m = new boolean[51];

    static {
        new bw5.js();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.js parseFrom(byte[] bArr) {
        return (bw5.js) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.js)) {
            return false;
        }
        bw5.js jsVar = (bw5.js) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f29124d), java.lang.Integer.valueOf(jsVar.f29124d)) && n51.f.a(java.lang.Integer.valueOf(this.f29125e), java.lang.Integer.valueOf(jsVar.f29125e)) && n51.f.a(java.lang.Integer.valueOf(this.f29126f), java.lang.Integer.valueOf(jsVar.f29126f)) && n51.f.a(java.lang.Integer.valueOf(this.f29127g), java.lang.Integer.valueOf(jsVar.f29127g)) && n51.f.a(java.lang.Integer.valueOf(this.f29128h), java.lang.Integer.valueOf(jsVar.f29128h)) && n51.f.a(this.f29129i, jsVar.f29129i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.js();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29130m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f29124d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f29125e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f29126f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f29127g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f29128h);
            }
            bw5.st stVar = this.f29129i;
            if (stVar != null && zArr[50]) {
                fVar.i(50, stVar.computeSize());
                this.f29129i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f29124d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f29125e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f29126f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f29127g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f29128h);
            }
            bw5.st stVar2 = this.f29129i;
            return (stVar2 == null || !zArr[50]) ? e17 : e17 + b36.f.i(50, stVar2.computeSize());
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
            this.f29124d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f29125e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f29126f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f29127g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue == 5) {
            this.f29128h = aVar2.g(intValue);
            zArr[5] = true;
            return 0;
        }
        if (intValue != 50) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.st stVar3 = new bw5.st();
            if (bArr != null && bArr.length > 0) {
                stVar3.parseFrom(bArr);
            }
            this.f29129i = stVar3;
        }
        zArr[50] = true;
        return 0;
    }
}
