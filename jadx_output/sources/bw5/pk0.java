package bw5;

/* loaded from: classes4.dex */
public class pk0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f31708d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f31709e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f31710f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f31711g = new boolean[4];

    static {
        new bw5.pk0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.pk0 parseFrom(byte[] bArr) {
        return (bw5.pk0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pk0)) {
            return false;
        }
        bw5.pk0 pk0Var = (bw5.pk0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f31708d), java.lang.Long.valueOf(pk0Var.f31708d)) && n51.f.a(this.f31709e, pk0Var.f31709e) && n51.f.a(this.f31710f, pk0Var.f31710f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.pk0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31711g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f31708d);
            }
            java.lang.String str = this.f31709e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, this.f31710f);
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f31708d) : 0;
            java.lang.String str2 = this.f31709e;
            if (str2 != null && zArr[2]) {
                h17 += b36.f.j(2, str2);
            }
            return h17 + b36.f.g(3, 8, this.f31710f);
        }
        if (i17 == 2) {
            this.f31710f.clear();
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
            this.f31708d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f31709e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.ok0 ok0Var = new bw5.ok0();
            if (bArr != null && bArr.length > 0) {
                ok0Var.parseFrom(bArr);
            }
            this.f31710f.add(ok0Var);
        }
        zArr[3] = true;
        return 0;
    }
}
