package bw5;

/* loaded from: classes11.dex */
public class hn0 extends com.tencent.mm.protobuf.f {

    /* renamed from: m, reason: collision with root package name */
    public static final bw5.hn0 f28285m = new bw5.hn0();

    /* renamed from: d, reason: collision with root package name */
    public boolean f28286d;

    /* renamed from: e, reason: collision with root package name */
    public int f28287e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f28288f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.ks0 f28289g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.sm0 f28290h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f28291i = new boolean[6];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hn0)) {
            return false;
        }
        bw5.hn0 hn0Var = (bw5.hn0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f28286d), java.lang.Boolean.valueOf(hn0Var.f28286d)) && n51.f.a(java.lang.Integer.valueOf(this.f28287e), java.lang.Integer.valueOf(hn0Var.f28287e)) && n51.f.a(this.f28288f, hn0Var.f28288f) && n51.f.a(this.f28289g, hn0Var.f28289g) && n51.f.a(this.f28290h, hn0Var.f28290h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.hn0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28291i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f28286d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f28287e);
            }
            java.lang.String str = this.f28288f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            bw5.ks0 ks0Var = this.f28289g;
            if (ks0Var != null && zArr[4]) {
                fVar.e(4, ks0Var.f29542d);
            }
            bw5.sm0 sm0Var = this.f28290h;
            if (sm0Var != null && zArr[5]) {
                fVar.i(5, sm0Var.computeSize());
                this.f28290h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f28286d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f28287e);
            }
            java.lang.String str2 = this.f28288f;
            if (str2 != null && zArr[3]) {
                a17 += b36.f.j(3, str2);
            }
            bw5.ks0 ks0Var2 = this.f28289g;
            if (ks0Var2 != null && zArr[4]) {
                a17 += b36.f.e(4, ks0Var2.f29542d);
            }
            bw5.sm0 sm0Var2 = this.f28290h;
            return (sm0Var2 == null || !zArr[5]) ? a17 : a17 + b36.f.i(5, sm0Var2.computeSize());
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
            this.f28286d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f28287e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f28288f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            int g17 = aVar2.g(intValue);
            this.f28289g = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : bw5.ks0.StatusXmlDelete : bw5.ks0.StatusXmlUpdateExtInfo : bw5.ks0.StatusXmlUpdateNone;
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
            bw5.sm0 sm0Var3 = new bw5.sm0();
            if (bArr != null && bArr.length > 0) {
                sm0Var3.parseFrom(bArr);
            }
            this.f28290h = sm0Var3;
        }
        zArr[5] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.hn0) super.parseFrom(bArr);
    }
}
