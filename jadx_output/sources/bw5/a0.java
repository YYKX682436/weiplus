package bw5;

/* loaded from: classes11.dex */
public class a0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f24952d;

    /* renamed from: e, reason: collision with root package name */
    public int f24953e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f24954f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f24955g;

    /* renamed from: h, reason: collision with root package name */
    public long f24956h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f24957i = new boolean[6];

    static {
        new bw5.a0();
    }

    public bw5.a0 b(int i17) {
        this.f24953e = i17;
        this.f24957i[2] = true;
        return this;
    }

    public bw5.a0 c(long j17) {
        this.f24956h = j17;
        this.f24957i[5] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.a0)) {
            return false;
        }
        bw5.a0 a0Var = (bw5.a0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f24952d), java.lang.Integer.valueOf(a0Var.f24952d)) && n51.f.a(java.lang.Integer.valueOf(this.f24953e), java.lang.Integer.valueOf(a0Var.f24953e)) && n51.f.a(this.f24954f, a0Var.f24954f) && n51.f.a(this.f24955g, a0Var.f24955g) && n51.f.a(java.lang.Long.valueOf(this.f24956h), java.lang.Long.valueOf(a0Var.f24956h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.a0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f24957i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f24952d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f24953e);
            }
            java.lang.String str = this.f24954f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f24955g;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            if (zArr[5]) {
                fVar.h(5, this.f24956h);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f24952d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f24953e);
            }
            java.lang.String str2 = this.f24954f;
            if (str2 != null && zArr[3]) {
                e17 += b36.f.j(3, str2);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f24955g;
            if (gVar2 != null && zArr[4]) {
                e17 += b36.f.b(4, gVar2);
            }
            return zArr[5] ? e17 + b36.f.h(5, this.f24956h) : e17;
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
            this.f24952d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f24953e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f24954f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f24955g = aVar2.d(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f24956h = aVar2.i(intValue);
        zArr[5] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.a0) super.parseFrom(bArr);
    }
}
