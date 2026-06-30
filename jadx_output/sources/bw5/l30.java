package bw5;

/* loaded from: classes2.dex */
public class l30 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f29622d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f29623e;

    /* renamed from: f, reason: collision with root package name */
    public int f29624f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.ui f29625g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f29626h = new boolean[5];

    static {
        new bw5.l30();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.l30 parseFrom(byte[] bArr) {
        return (bw5.l30) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.l30)) {
            return false;
        }
        bw5.l30 l30Var = (bw5.l30) fVar;
        return n51.f.a(this.f29622d, l30Var.f29622d) && n51.f.a(this.f29623e, l30Var.f29623e) && n51.f.a(java.lang.Integer.valueOf(this.f29624f), java.lang.Integer.valueOf(l30Var.f29624f)) && n51.f.a(this.f29625g, l30Var.f29625g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.l30();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f29626h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f29622d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f29623e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f29624f);
            }
            bw5.ui uiVar = this.f29625g;
            if (uiVar != null && zArr[4]) {
                fVar.i(4, uiVar.computeSize());
                this.f29625g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f29622d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f29623e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f29624f);
            }
            bw5.ui uiVar2 = this.f29625g;
            return (uiVar2 == null || !zArr[4]) ? i18 : i18 + b36.f.i(4, uiVar2.computeSize());
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
            this.f29622d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f29623e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f29624f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.ui uiVar3 = new bw5.ui();
            if (bArr != null && bArr.length > 0) {
                uiVar3.parseFrom(bArr);
            }
            this.f29625g = uiVar3;
        }
        zArr[4] = true;
        return 0;
    }
}
