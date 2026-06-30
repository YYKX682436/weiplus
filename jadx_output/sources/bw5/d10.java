package bw5;

/* loaded from: classes2.dex */
public class d10 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f26275d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f26276e;

    /* renamed from: f, reason: collision with root package name */
    public int f26277f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.q00 f26278g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f26279h = new boolean[5];

    static {
        new bw5.d10();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.d10 parseFrom(byte[] bArr) {
        return (bw5.d10) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.d10)) {
            return false;
        }
        bw5.d10 d10Var = (bw5.d10) fVar;
        return n51.f.a(this.f26275d, d10Var.f26275d) && n51.f.a(this.f26276e, d10Var.f26276e) && n51.f.a(java.lang.Integer.valueOf(this.f26277f), java.lang.Integer.valueOf(d10Var.f26277f)) && n51.f.a(this.f26278g, d10Var.f26278g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.d10();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f26279h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f26275d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f26276e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f26277f);
            }
            bw5.q00 q00Var = this.f26278g;
            if (q00Var != null && zArr[4]) {
                fVar.i(4, q00Var.computeSize());
                this.f26278g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f26275d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f26276e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f26277f);
            }
            bw5.q00 q00Var2 = this.f26278g;
            return (q00Var2 == null || !zArr[4]) ? i18 : i18 + b36.f.i(4, q00Var2.computeSize());
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
            this.f26275d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f26276e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f26277f = aVar2.g(intValue);
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
            bw5.q00 q00Var3 = new bw5.q00();
            if (bArr != null && bArr.length > 0) {
                q00Var3.parseFrom(bArr);
            }
            this.f26278g = q00Var3;
        }
        zArr[4] = true;
        return 0;
    }
}
