package bw5;

/* loaded from: classes7.dex */
public class wm0 extends com.tencent.mm.protobuf.f {

    /* renamed from: m, reason: collision with root package name */
    public static final bw5.wm0 f34784m = new bw5.wm0();

    /* renamed from: d, reason: collision with root package name */
    public boolean f34785d;

    /* renamed from: e, reason: collision with root package name */
    public int f34786e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f34787f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.js0 f34788g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f34789h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f34790i = new boolean[6];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wm0)) {
            return false;
        }
        bw5.wm0 wm0Var = (bw5.wm0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f34785d), java.lang.Boolean.valueOf(wm0Var.f34785d)) && n51.f.a(java.lang.Integer.valueOf(this.f34786e), java.lang.Integer.valueOf(wm0Var.f34786e)) && n51.f.a(this.f34787f, wm0Var.f34787f) && n51.f.a(this.f34788g, wm0Var.f34788g) && n51.f.a(java.lang.Boolean.valueOf(this.f34789h), java.lang.Boolean.valueOf(wm0Var.f34789h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.wm0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34790i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f34785d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f34786e);
            }
            java.lang.String str = this.f34787f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            bw5.js0 js0Var = this.f34788g;
            if (js0Var != null && zArr[4]) {
                fVar.e(4, js0Var.f29135d);
            }
            if (zArr[5]) {
                fVar.a(5, this.f34789h);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f34785d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f34786e);
            }
            java.lang.String str2 = this.f34787f;
            if (str2 != null && zArr[3]) {
                a17 += b36.f.j(3, str2);
            }
            bw5.js0 js0Var2 = this.f34788g;
            if (js0Var2 != null && zArr[4]) {
                a17 += b36.f.e(4, js0Var2.f29135d);
            }
            return zArr[5] ? a17 + b36.f.a(5, this.f34789h) : a17;
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
            this.f34785d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f34786e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f34787f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            int g17 = aVar2.g(intValue);
            this.f34788g = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : bw5.js0.StatusXml_InteractionDelete : bw5.js0.StatusXml_InteractionUpdate : bw5.js0.StatusXml_InteractionNone;
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f34789h = aVar2.c(intValue);
        zArr[5] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.wm0) super.parseFrom(bArr);
    }
}
