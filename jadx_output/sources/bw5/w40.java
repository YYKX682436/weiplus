package bw5;

/* loaded from: classes2.dex */
public class w40 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f34581d;

    /* renamed from: e, reason: collision with root package name */
    public int f34582e;

    /* renamed from: f, reason: collision with root package name */
    public long f34583f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f34584g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f34585h;

    /* renamed from: i, reason: collision with root package name */
    public long f34586i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f34587m = new boolean[7];

    static {
        new bw5.w40();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.w40 parseFrom(byte[] bArr) {
        return (bw5.w40) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.w40)) {
            return false;
        }
        bw5.w40 w40Var = (bw5.w40) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f34581d), java.lang.Long.valueOf(w40Var.f34581d)) && n51.f.a(java.lang.Integer.valueOf(this.f34582e), java.lang.Integer.valueOf(w40Var.f34582e)) && n51.f.a(java.lang.Long.valueOf(this.f34583f), java.lang.Long.valueOf(w40Var.f34583f)) && n51.f.a(this.f34584g, w40Var.f34584g) && n51.f.a(this.f34585h, w40Var.f34585h) && n51.f.a(java.lang.Long.valueOf(this.f34586i), java.lang.Long.valueOf(w40Var.f34586i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.w40();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34587m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f34581d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f34582e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f34583f);
            }
            java.lang.String str = this.f34584g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f34585h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            if (zArr[6]) {
                fVar.h(6, this.f34586i);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f34581d) : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f34582e);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f34583f);
            }
            java.lang.String str3 = this.f34584g;
            if (str3 != null && zArr[4]) {
                h17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f34585h;
            if (str4 != null && zArr[5]) {
                h17 += b36.f.j(5, str4);
            }
            return zArr[6] ? h17 + b36.f.h(6, this.f34586i) : h17;
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
                this.f34581d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f34582e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f34583f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f34584g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f34585h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f34586i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
