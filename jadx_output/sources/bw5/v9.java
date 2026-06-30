package bw5;

/* loaded from: classes9.dex */
public class v9 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f34219d;

    /* renamed from: e, reason: collision with root package name */
    public int f34220e;

    /* renamed from: f, reason: collision with root package name */
    public int f34221f;

    /* renamed from: g, reason: collision with root package name */
    public int f34222g;

    /* renamed from: h, reason: collision with root package name */
    public long f34223h;

    /* renamed from: i, reason: collision with root package name */
    public long f34224i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f34225m = new boolean[7];

    static {
        new bw5.v9();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.v9 parseFrom(byte[] bArr) {
        return (bw5.v9) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.v9)) {
            return false;
        }
        bw5.v9 v9Var = (bw5.v9) fVar;
        return n51.f.a(this.f34219d, v9Var.f34219d) && n51.f.a(java.lang.Integer.valueOf(this.f34220e), java.lang.Integer.valueOf(v9Var.f34220e)) && n51.f.a(java.lang.Integer.valueOf(this.f34221f), java.lang.Integer.valueOf(v9Var.f34221f)) && n51.f.a(java.lang.Integer.valueOf(this.f34222g), java.lang.Integer.valueOf(v9Var.f34222g)) && n51.f.a(java.lang.Long.valueOf(this.f34223h), java.lang.Long.valueOf(v9Var.f34223h)) && n51.f.a(java.lang.Long.valueOf(this.f34224i), java.lang.Long.valueOf(v9Var.f34224i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.v9();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f34225m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f34219d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f34220e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f34221f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f34222g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f34223h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f34224i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f34219d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f34220e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f34221f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f34222g);
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f34223h);
            }
            return zArr[6] ? i18 + b36.f.h(6, this.f34224i) : i18;
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
                this.f34219d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f34220e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f34221f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f34222g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f34223h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f34224i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
