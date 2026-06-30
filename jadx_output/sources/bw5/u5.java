package bw5;

/* loaded from: classes8.dex */
public class u5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f33735d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33736e;

    /* renamed from: f, reason: collision with root package name */
    public int f33737f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.b30 f33738g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f33739h = new boolean[5];

    static {
        new bw5.u5();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.u5 parseFrom(byte[] bArr) {
        return (bw5.u5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.u5)) {
            return false;
        }
        bw5.u5 u5Var = (bw5.u5) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f33735d), java.lang.Long.valueOf(u5Var.f33735d)) && n51.f.a(this.f33736e, u5Var.f33736e) && n51.f.a(java.lang.Integer.valueOf(this.f33737f), java.lang.Integer.valueOf(u5Var.f33737f)) && n51.f.a(this.f33738g, u5Var.f33738g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.u5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33739h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f33735d);
            }
            java.lang.String str = this.f33736e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f33737f);
            }
            bw5.b30 b30Var = this.f33738g;
            if (b30Var != null && zArr[4]) {
                fVar.i(4, b30Var.computeSize());
                this.f33738g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f33735d) : 0;
            java.lang.String str2 = this.f33736e;
            if (str2 != null && zArr[2]) {
                h17 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                h17 += b36.f.e(3, this.f33737f);
            }
            bw5.b30 b30Var2 = this.f33738g;
            return (b30Var2 == null || !zArr[4]) ? h17 : h17 + b36.f.i(4, b30Var2.computeSize());
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
            this.f33735d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f33736e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f33737f = aVar2.g(intValue);
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
            bw5.b30 b30Var3 = new bw5.b30();
            if (bArr != null && bArr.length > 0) {
                b30Var3.parseFrom(bArr);
            }
            this.f33738g = b30Var3;
        }
        zArr[4] = true;
        return 0;
    }
}
