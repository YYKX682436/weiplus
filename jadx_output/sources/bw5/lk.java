package bw5;

/* loaded from: classes2.dex */
public class lk extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f29830d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.ok f29831e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.nk f29832f;

    /* renamed from: g, reason: collision with root package name */
    public int f29833g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f29834h = new boolean[5];

    static {
        new bw5.lk();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.lk parseFrom(byte[] bArr) {
        return (bw5.lk) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lk)) {
            return false;
        }
        bw5.lk lkVar = (bw5.lk) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f29830d), java.lang.Integer.valueOf(lkVar.f29830d)) && n51.f.a(this.f29831e, lkVar.f29831e) && n51.f.a(this.f29832f, lkVar.f29832f) && n51.f.a(java.lang.Integer.valueOf(this.f29833g), java.lang.Integer.valueOf(lkVar.f29833g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.lk();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29834h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f29830d);
            }
            bw5.ok okVar = this.f29831e;
            if (okVar != null && zArr[2]) {
                fVar.i(2, okVar.computeSize());
                this.f29831e.writeFields(fVar);
            }
            bw5.nk nkVar = this.f29832f;
            if (nkVar != null && zArr[3]) {
                fVar.i(3, nkVar.computeSize());
                this.f29832f.writeFields(fVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f29833g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f29830d) : 0;
            bw5.ok okVar2 = this.f29831e;
            if (okVar2 != null && zArr[2]) {
                e17 += b36.f.i(2, okVar2.computeSize());
            }
            bw5.nk nkVar2 = this.f29832f;
            if (nkVar2 != null && zArr[3]) {
                e17 += b36.f.i(3, nkVar2.computeSize());
            }
            return zArr[4] ? e17 + b36.f.e(4, this.f29833g) : e17;
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
            this.f29830d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.ok okVar3 = new bw5.ok();
                if (bArr != null && bArr.length > 0) {
                    okVar3.parseFrom(bArr);
                }
                this.f29831e = okVar3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f29833g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.nk nkVar3 = new bw5.nk();
            if (bArr2 != null && bArr2.length > 0) {
                nkVar3.parseFrom(bArr2);
            }
            this.f29832f = nkVar3;
        }
        zArr[3] = true;
        return 0;
    }
}
