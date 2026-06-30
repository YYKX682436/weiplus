package bw5;

/* loaded from: classes7.dex */
public class yf0 extends com.tencent.mm.protobuf.f {

    /* renamed from: m, reason: collision with root package name */
    public static final bw5.yf0 f35467m = new bw5.yf0();

    /* renamed from: d, reason: collision with root package name */
    public boolean f35468d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f35469e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.wd0 f35470f;

    /* renamed from: g, reason: collision with root package name */
    public int f35471g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f35472h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f35473i = new boolean[6];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yf0)) {
            return false;
        }
        bw5.yf0 yf0Var = (bw5.yf0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f35468d), java.lang.Boolean.valueOf(yf0Var.f35468d)) && n51.f.a(java.lang.Boolean.valueOf(this.f35469e), java.lang.Boolean.valueOf(yf0Var.f35469e)) && n51.f.a(this.f35470f, yf0Var.f35470f) && n51.f.a(java.lang.Integer.valueOf(this.f35471g), java.lang.Integer.valueOf(yf0Var.f35471g)) && n51.f.a(this.f35472h, yf0Var.f35472h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.yf0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35473i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f35468d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f35469e);
            }
            bw5.wd0 wd0Var = this.f35470f;
            if (wd0Var != null && zArr[3]) {
                fVar.i(3, wd0Var.computeSize());
                this.f35470f.writeFields(fVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f35471g);
            }
            java.lang.String str = this.f35472h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f35468d) : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f35469e);
            }
            bw5.wd0 wd0Var2 = this.f35470f;
            if (wd0Var2 != null && zArr[3]) {
                a17 += b36.f.i(3, wd0Var2.computeSize());
            }
            if (zArr[4]) {
                a17 += b36.f.e(4, this.f35471g);
            }
            java.lang.String str2 = this.f35472h;
            return (str2 == null || !zArr[5]) ? a17 : a17 + b36.f.j(5, str2);
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
            this.f35468d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f35469e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                this.f35471g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f35472h = aVar2.k(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.wd0 wd0Var3 = new bw5.wd0();
            if (bArr != null && bArr.length > 0) {
                wd0Var3.parseFrom(bArr);
            }
            this.f35470f = wd0Var3;
        }
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.yf0) super.parseFrom(bArr);
    }
}
