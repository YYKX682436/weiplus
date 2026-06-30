package bw5;

/* loaded from: classes2.dex */
public class n90 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30567d;

    /* renamed from: e, reason: collision with root package name */
    public long f30568e;

    /* renamed from: f, reason: collision with root package name */
    public long f30569f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.mc0 f30570g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f30571h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f30572i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f30573m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f30574n = new boolean[8];

    static {
        new bw5.n90();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.n90 parseFrom(byte[] bArr) {
        return (bw5.n90) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.n90)) {
            return false;
        }
        bw5.n90 n90Var = (bw5.n90) fVar;
        return n51.f.a(this.f30567d, n90Var.f30567d) && n51.f.a(java.lang.Long.valueOf(this.f30568e), java.lang.Long.valueOf(n90Var.f30568e)) && n51.f.a(java.lang.Long.valueOf(this.f30569f), java.lang.Long.valueOf(n90Var.f30569f)) && n51.f.a(this.f30570g, n90Var.f30570g) && n51.f.a(this.f30571h, n90Var.f30571h) && n51.f.a(this.f30572i, n90Var.f30572i) && n51.f.a(this.f30573m, n90Var.f30573m);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.n90();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f30574n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f30567d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f30568e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f30569f);
            }
            bw5.mc0 mc0Var = this.f30570g;
            if (mc0Var != null && zArr[4]) {
                fVar.i(4, mc0Var.computeSize());
                this.f30570g.writeFields(fVar);
            }
            java.lang.String str2 = this.f30571h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f30572i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f30573m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f30567d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f30568e);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f30569f);
            }
            bw5.mc0 mc0Var2 = this.f30570g;
            if (mc0Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, mc0Var2.computeSize());
            }
            java.lang.String str6 = this.f30571h;
            if (str6 != null && zArr[5]) {
                i18 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f30572i;
            if (str7 != null && zArr[6]) {
                i18 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f30573m;
            return (str8 == null || !zArr[7]) ? i18 : i18 + b36.f.j(7, str8);
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
                this.f30567d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30568e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30569f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.mc0 mc0Var3 = new bw5.mc0();
                    if (bArr != null && bArr.length > 0) {
                        mc0Var3.parseFrom(bArr);
                    }
                    this.f30570g = mc0Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f30571h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30572i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f30573m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
