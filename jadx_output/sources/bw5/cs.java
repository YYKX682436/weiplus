package bw5;

/* loaded from: classes2.dex */
public class cs extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.fr f26212d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f26213e;

    /* renamed from: f, reason: collision with root package name */
    public int f26214f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f26215g = new boolean[4];

    static {
        new bw5.cs();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.cs parseFrom(byte[] bArr) {
        return (bw5.cs) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.cs)) {
            return false;
        }
        bw5.cs csVar = (bw5.cs) fVar;
        return n51.f.a(this.f26212d, csVar.f26212d) && n51.f.a(this.f26213e, csVar.f26213e) && n51.f.a(java.lang.Integer.valueOf(this.f26214f), java.lang.Integer.valueOf(csVar.f26214f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.cs();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26215g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.fr frVar = this.f26212d;
            if (frVar != null && zArr[1]) {
                fVar.i(1, frVar.computeSize());
                this.f26212d.writeFields(fVar);
            }
            java.lang.String str = this.f26213e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f26214f);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.fr frVar2 = this.f26212d;
            if (frVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, frVar2.computeSize());
            }
            java.lang.String str2 = this.f26213e;
            if (str2 != null && zArr[2]) {
                i18 += b36.f.j(2, str2);
            }
            return zArr[3] ? i18 + b36.f.e(3, this.f26214f) : i18;
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f26213e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f26214f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.fr frVar3 = new bw5.fr();
            if (bArr != null && bArr.length > 0) {
                frVar3.parseFrom(bArr);
            }
            this.f26212d = frVar3;
        }
        zArr[1] = true;
        return 0;
    }
}
