package bw5;

/* loaded from: classes8.dex */
public class hp0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f28314d;

    /* renamed from: e, reason: collision with root package name */
    public int f28315e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f28316f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f28317g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.xq0 f28318h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.fb0 f28319i;

    /* renamed from: m, reason: collision with root package name */
    public int f28320m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f28321n = new boolean[8];

    static {
        new bw5.hp0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.hp0 parseFrom(byte[] bArr) {
        return (bw5.hp0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hp0)) {
            return false;
        }
        bw5.hp0 hp0Var = (bw5.hp0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f28314d), java.lang.Integer.valueOf(hp0Var.f28314d)) && n51.f.a(java.lang.Integer.valueOf(this.f28315e), java.lang.Integer.valueOf(hp0Var.f28315e)) && n51.f.a(this.f28316f, hp0Var.f28316f) && n51.f.a(this.f28317g, hp0Var.f28317g) && n51.f.a(this.f28318h, hp0Var.f28318h) && n51.f.a(this.f28319i, hp0Var.f28319i) && n51.f.a(java.lang.Integer.valueOf(this.f28320m), java.lang.Integer.valueOf(hp0Var.f28320m));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.hp0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28321n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f28314d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f28315e);
            }
            com.tencent.mm.protobuf.g gVar = this.f28316f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f28317g;
            if (gVar2 != null && zArr[4]) {
                fVar.b(4, gVar2);
            }
            bw5.xq0 xq0Var = this.f28318h;
            if (xq0Var != null && zArr[5]) {
                fVar.i(5, xq0Var.computeSize());
                this.f28318h.writeFields(fVar);
            }
            bw5.fb0 fb0Var = this.f28319i;
            if (fb0Var != null && zArr[6]) {
                fVar.i(6, fb0Var.computeSize());
                this.f28319i.writeFields(fVar);
            }
            if (zArr[7]) {
                fVar.e(7, this.f28320m);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f28314d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f28315e);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f28316f;
            if (gVar3 != null && zArr[3]) {
                e17 += b36.f.b(3, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f28317g;
            if (gVar4 != null && zArr[4]) {
                e17 += b36.f.b(4, gVar4);
            }
            bw5.xq0 xq0Var2 = this.f28318h;
            if (xq0Var2 != null && zArr[5]) {
                e17 += b36.f.i(5, xq0Var2.computeSize());
            }
            bw5.fb0 fb0Var2 = this.f28319i;
            if (fb0Var2 != null && zArr[6]) {
                e17 += b36.f.i(6, fb0Var2.computeSize());
            }
            return zArr[7] ? e17 + b36.f.e(7, this.f28320m) : e17;
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
        switch (intValue) {
            case 1:
                this.f28314d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f28315e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f28316f = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f28317g = aVar2.d(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.xq0 xq0Var3 = new bw5.xq0();
                    if (bArr != null && bArr.length > 0) {
                        xq0Var3.parseFrom(bArr);
                    }
                    this.f28318h = xq0Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.fb0 fb0Var3 = new bw5.fb0();
                    if (bArr2 != null && bArr2.length > 0) {
                        fb0Var3.parseFrom(bArr2);
                    }
                    this.f28319i = fb0Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f28320m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
