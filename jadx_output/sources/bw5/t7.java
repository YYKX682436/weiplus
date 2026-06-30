package bw5;

/* loaded from: classes8.dex */
public class t7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f33282d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f33283e;

    /* renamed from: f, reason: collision with root package name */
    public double f33284f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f33285g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f33286h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f33287i = new boolean[6];

    static {
        new bw5.t7();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.t7 parseFrom(byte[] bArr) {
        return (bw5.t7) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.t7)) {
            return false;
        }
        bw5.t7 t7Var = (bw5.t7) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f33282d), java.lang.Boolean.valueOf(t7Var.f33282d)) && n51.f.a(java.lang.Boolean.valueOf(this.f33283e), java.lang.Boolean.valueOf(t7Var.f33283e)) && n51.f.a(java.lang.Double.valueOf(this.f33284f), java.lang.Double.valueOf(t7Var.f33284f)) && n51.f.a(java.lang.Boolean.valueOf(this.f33285g), java.lang.Boolean.valueOf(t7Var.f33285g)) && n51.f.a(java.lang.Boolean.valueOf(this.f33286h), java.lang.Boolean.valueOf(t7Var.f33286h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.t7();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33287i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f33282d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f33283e);
            }
            if (zArr[3]) {
                fVar.c(3, this.f33284f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f33285g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f33286h);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f33282d) : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f33283e);
            }
            if (zArr[3]) {
                a17 += b36.f.c(3, this.f33284f);
            }
            if (zArr[4]) {
                a17 += b36.f.a(4, this.f33285g);
            }
            return zArr[5] ? a17 + b36.f.a(5, this.f33286h) : a17;
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
            this.f33282d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f33283e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f33284f = aVar2.e(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f33285g = aVar2.c(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f33286h = aVar2.c(intValue);
        zArr[5] = true;
        return 0;
    }
}
