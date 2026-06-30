package bw5;

/* loaded from: classes15.dex */
public class ei0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f26925d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f26926e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f26927f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f26928g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.fi0 f26929h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f26930i = new boolean[6];

    static {
        new bw5.ei0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ei0)) {
            return false;
        }
        bw5.ei0 ei0Var = (bw5.ei0) fVar;
        return n51.f.a(this.f26925d, ei0Var.f26925d) && n51.f.a(this.f26926e, ei0Var.f26926e) && n51.f.a(this.f26927f, ei0Var.f26927f) && n51.f.a(this.f26928g, ei0Var.f26928g) && n51.f.a(this.f26929h, ei0Var.f26929h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ei0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f26930i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f26925d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f26926e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f26927f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f26928g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            bw5.fi0 fi0Var = this.f26929h;
            if (fi0Var != null && zArr[5]) {
                fVar.e(5, fi0Var.f27303d);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f26925d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f26926e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f26927f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f26928g;
            if (str8 != null && zArr[4]) {
                i18 += b36.f.j(4, str8);
            }
            bw5.fi0 fi0Var2 = this.f26929h;
            return (fi0Var2 == null || !zArr[5]) ? i18 : i18 + b36.f.e(5, fi0Var2.f27303d);
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
            this.f26925d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f26926e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f26927f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f26928g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        int g17 = aVar2.g(intValue);
        this.f26929h = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? null : bw5.fi0.ARCHIVE : bw5.fi0.VIDEO : bw5.fi0.IMAGE : bw5.fi0.DOCUMENT;
        zArr[5] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.ei0) super.parseFrom(bArr);
    }
}
