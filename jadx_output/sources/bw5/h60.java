package bw5;

/* loaded from: classes2.dex */
public class h60 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f28093d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f28094e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f28095f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.w80 f28096g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f28097h = new boolean[5];

    static {
        new bw5.h60();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.h60 parseFrom(byte[] bArr) {
        return (bw5.h60) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.h60)) {
            return false;
        }
        bw5.h60 h60Var = (bw5.h60) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f28093d), java.lang.Boolean.valueOf(h60Var.f28093d)) && n51.f.a(java.lang.Boolean.valueOf(this.f28094e), java.lang.Boolean.valueOf(h60Var.f28094e)) && n51.f.a(this.f28095f, h60Var.f28095f) && n51.f.a(this.f28096g, h60Var.f28096g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.h60();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28097h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f28093d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f28094e);
            }
            java.lang.String str = this.f28095f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            bw5.w80 w80Var = this.f28096g;
            if (w80Var != null && zArr[4]) {
                fVar.i(4, w80Var.computeSize());
                this.f28096g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f28093d) : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f28094e);
            }
            java.lang.String str2 = this.f28095f;
            if (str2 != null && zArr[3]) {
                a17 += b36.f.j(3, str2);
            }
            bw5.w80 w80Var2 = this.f28096g;
            return (w80Var2 == null || !zArr[4]) ? a17 : a17 + b36.f.i(4, w80Var2.computeSize());
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
            this.f28093d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f28094e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f28095f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.w80 w80Var3 = new bw5.w80();
            if (bArr != null && bArr.length > 0) {
                w80Var3.parseFrom(bArr);
            }
            this.f28096g = w80Var3;
        }
        zArr[4] = true;
        return 0;
    }
}
